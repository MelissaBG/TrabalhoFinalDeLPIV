package trabalhofinaldelpiv.profile.data

import android.content.Context.MODE_PRIVATE
import trabalhofinaldelpiv.App
import trabalhofinaldelpiv.database.RegisterResponse

class RegisterUserLocalDataSource {

    fun saveRegisterUser(registerResponse: RegisterResponse) {
        val preferences = App.context.getSharedPreferences("bd", MODE_PRIVATE)
        preferences.edit().putInt("userId", registerResponse.id).commit()
        //Apply()
    }

    fun getUserId(): Int {
        val preferences = App.context.getSharedPreferences("bd", MODE_PRIVATE)
        return preferences.getInt("userId", 0)
    }

}