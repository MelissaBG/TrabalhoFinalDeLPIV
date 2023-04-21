package trabalhofinaldelpiv.profile.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import com.fundatec.trabalhofinaldelpiv.R
import com.fundatec.trabalhofinaldelpiv.databinding.ActivityRegisterUserBinding
import com.fundatec.trabalhofinaldelpiv.login.presentation.RegisterUserViewModel
import com.fundatec.trabalhofinaldelpiv.login.view.LoginActivity
import com.google.android.material.snackbar.Snackbar
import trabalhofinaldelpiv.profile.presentation.ViewState


/*A classe RegisterUserActivity estende a classe AppCpmpatActivity, que é uma das classe de atividades
* fornecidas pelo Android. Lida com a lógica de negócios da tela de login.*/
class RegisterUserActivity : AppCompatActivity (){

    private lateinit var binding: ActivityRegisterUserBinding

    private val viewModel: RegisterUserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityRegisterUserBinding.inflate(layoutInflater)

        setContentView(binding.root)

        configRegisterButton()
        configObserver()
    }

    private fun configObserver() {
        viewModel.viewState.observe(this) { state ->
            when (state) {
                is ViewState.ShowRegisterUser -> showRegisterUser()
                is ViewState.ShowErrorEmptyFields-> showSnackBarError(R.string.error_empty_fields)
                is ViewState.ShowLoading -> showLoading()
                is ViewState.ShowErrorApiRegisterUser -> showSnackBarError(R.string.error_login)
            }
        }
    }

    private fun configRegisterButton() {
        binding.btnRegister.setOnClickListener {
            viewModel.validateUserInput(
                name = binding.etName.text.toString(),
                email = binding.etEmail.text.toString(),
                password = binding.etPassword.text.toString()
            )
        }
    }

    private fun showRegisterUser() {
        hideLoading()
        val intent = Intent(this@RegisterUserActivity, LoginActivity::class.java)
        startActivity(intent)
    }

    private fun showSnackBarError(@StringRes messageId: Int) {
        hideLoading()
        Snackbar.make(binding.container, messageId, Snackbar.LENGTH_LONG).show()
    }

    private fun showLoading() {
        binding.pbLoading.visibility = View.VISIBLE
    }

    private fun hideLoading() {
        binding.pbLoading.visibility = View.GONE
    }
}
