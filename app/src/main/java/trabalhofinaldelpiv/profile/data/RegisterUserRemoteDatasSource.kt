package trabalhofinaldelpiv.profile.data
import android.util.Log
import com.fundatec.trabalhofinaldelpiv.login.presentation.ErrorModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import trabalhofinaldelpiv.database.RegisterResponse
import trabalhofinaldelpiv.database.RegisterUserApi
import trabalhofinaldelpiv.database.UserRegisterRequest
import trabalhofinaldelpiv.webservice.Result
import trabalhofinaldelpiv.webservice.RetrofitNetworkClient

class RegisterUserRemoteDatasSource {
    private val service = RetrofitNetworkClient.createNetworkClient()
        .create(RegisterUserApi::class.java)

   suspend fun register(name: String, email: String, password: String): Result<RegisterResponse, ErrorModel> {
       val registerOk = UserRegisterRequest(name = name, email = email, password = password)
       return withContext(Dispatchers.IO) {

            try {
                val registerResponse = service.register(registerOk)
                Result.Success(registerResponse)
            } catch(exeception: Exception){
                Log.e("RegisterUserDataSource", exeception.message ?: "")
                Result.Error(ErrorModel.ErrorRegister)
            }
        }
    }

}
