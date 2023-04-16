package com.fundatec.trabalhofinaldelpiv.login.view

import android.content.Intent
import android.os.Bundle
import android.view.View

import androidx.activity.viewModels

import androidx.annotation.StringRes

import androidx.appcompat.app.AppCompatActivity
import com.fundatec.trabalhofinaldelpiv.R
import com.fundatec.trabalhofinaldelpiv.databinding.ActivityLoginBinding
import com.google.android.material.snackbar.Snackbar
import com.fundatec.trabalhofinaldelpiv.login.presentation.LoginViewModel
import trabalhofinaldelpiv.home.view.HomeActivity

import trabalhofinaldelpiv.login.login.presentation.ViewState

class LoginActivity : AppCompatActivity (){

        private lateinit var binding: ActivityLoginBinding
/* viewModel: uma instãncia da classe LoginViewModel, que é criada usando o método viewModels() da classe AppCompatActivity. Essa classe contém a lógica de negócios e interage com o banco de dados.*/
        private val viewModel: LoginViewModel by viewModels()

        override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)

            binding = ActivityLoginBinding.inflate(layoutInflater)

            setContentView(binding.root)

            configLoginButton()
            configObserver()


        }
    private fun configObserver() {
        viewModel.viewState.observe(this) { state ->
            when (state) {
                is ViewState.ShowHome -> showHome()
                is ViewState.ShowErrorEmptyFileds -> showSnackBarError(R.string.error_empty_fields)
                is ViewState.ShowLoading -> showLoading()
                is ViewState.ShowErrorApiLogin -> showSnackBarError(R.string.error_login)
            }
        }
    }
/*A função configLoginButton() é responsável por configurar o botão de login para chamar a função viewModel.validateUserInput()
* quando for clicado. A função showSnack() cria uma nova intenção para abrir a activity de perfil e a inicia.*/
        private fun configLoginButton() {

            binding.btnLogin.setOnClickListener {

                viewModel.validateUserInput(

                    email = binding.etEmail.text.toString(),

                    password = binding.etPassword.text.toString(),)

            }

        }

    private fun showHome() {
        hideLoging()
        val intent = Intent(this@LoginActivity, HomeActivity::class.java)
        startActivity(intent)
    }

    private fun showSnackBarError(@StringRes messageId: Int) {
        hideLoging()
        Snackbar.make(binding.container, messageId, Snackbar.LENGTH_LONG).show()
    }

    private fun showLoading() {
        binding.pbLoading.visibility = View.VISIBLE
    }

    private fun hideLoging() {
        binding.pbLoading.visibility = View.GONE
    }

}