package trabalhofinaldelpiv.login.login.data
import android.content.Context.MODE_PRIVATE
import android.util.Log

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import trabalhofinaldelpiv.App
import trabalhofinaldelpiv.login.login.domain.model.ErrorModel
import trabalhofinaldelpiv.webservice.Result
import trabalhofinaldelpiv.webservice.RetrofitNetworkClient

class LoginRemoteDataSource {
    private val service = RetrofitNetworkClient.createNetworkClient()
        .create(LoginApi::class.java)

    suspend fun remotelogin (email: String, password: String): Result<LoginResponse, ErrorModel>{
        return withContext(Dispatchers.IO) {
            try {
                val loginResponse = service.login(email = email, password = password)
                App.context.getSharedPreferences("User" , MODE_PRIVATE).edit().putInt("Id", loginResponse.id).apply()
                Result.Success(loginResponse)
            } catch(exeception: Exception){
                Log.e("LoginDataSource", exeception.message ?: "")
                Result.Error(ErrorModel.ErrorLogin)
            }
        }

    }


}
