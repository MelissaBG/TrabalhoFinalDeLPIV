package trabalhofinaldelpiv.login.login.data

import android.content.Context.MODE_PRIVATE
import trabalhofinaldelpiv.App

class LoginLocalDataSource {

    fun saveLogin(loginResponse: LoginResponse) {
        val preferences = App.context.getSharedPreferences("bd", MODE_PRIVATE)
        preferences.edit().putInt("userId", loginResponse.id).commit()
        //Apply()
    }

    fun getUserId(): Int {
        val preferences = App.context.getSharedPreferences("bd", MODE_PRIVATE)
        return preferences.getInt("userId", 0)
    }

}