package com.fundatec.trabalhofinaldelpiv


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.viewModels
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity

import com.fundatec.trabalhofinaldelpiv.databinding.ActivityNewCharacterBinding

import com.google.android.material.snackbar.Snackbar
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import trabalhofinaldelpiv.character.newCharacter.presentation.NewCharacterViewModel
import trabalhofinaldelpiv.character.newCharacter.presentation.ViewState


class NewCharacterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewCharacterBinding

    private val viewModel: NewCharacterViewModel by viewModels()

    private val moshi by lazy {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewCharacterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configCharacterButton()
        configObserver()

    }

    private fun configObserver() {
        viewModel.viewState.observe(this) { state ->
            when (state) {
                is ViewState.ShowSuccess -> showSucess()
                is ViewState.ShowErrorEmptyFileds -> showSnackBarError(R.string.generic_Input)
                is ViewState.ShowLoading -> showLoading()
                is ViewState.ShowErrorApiCharacter -> showSnackBarError(R.string.generic_Error)
            }
        }
    }

    private fun configCharacterButton() {
        binding.btnSaveCharacter.setOnClickListener {
            viewModel.validateCharacterInput(
                name = binding.etName.text.toString(),
                description = binding.etDescription.text.toString(),
                age = binding.etAge.text.toString(),
                date = binding.etDate.text.toString(),
                image = binding.etUrl.text.toString(),
                characterType = binding.characterType.toString(),
                universeType = binding.characterType.toString()
            )
        }
    }

    private fun showSucess() {
        hideLoging()
        val intent = Intent(this@NewCharacterActivity, NewCharacterActivity::class.java)
        startActivity(intent)
    }

    private fun showSnackBarError(@StringRes messageId: Int) {
        hideLoging()
        Snackbar.make(binding.charContainer, messageId, Snackbar.LENGTH_LONG).show()
    }

    private fun showLoading() {
        binding.pbLoading.visibility = View.VISIBLE
    }

    private fun hideLoging() {
        binding.pbLoading.visibility = View.GONE
    }
}




