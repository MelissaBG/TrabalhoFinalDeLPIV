package trabalhofinaldelpiv.profile.data.repository
import com.fundatec.trabalhofinaldelpiv.login.presentation.ErrorModel
import trabalhofinaldelpiv.database.RegisterResponse
import trabalhofinaldelpiv.profile.data.RegisterUserLocalDataSource
import trabalhofinaldelpiv.profile.data.RegisterUserRemoteDatasSource
import trabalhofinaldelpiv.webservice.Result

class RegisterRepository {
    private val remoteDatasource: RegisterUserRemoteDatasSource by lazy {
        RegisterUserRemoteDatasSource()
    }
    private val localDatasource: RegisterUserLocalDataSource by lazy {
        RegisterUserLocalDataSource()
    }

    suspend fun saveLogin(name: String, email: String, password: String): Result<RegisterResponse, ErrorModel> {
        val registerUser = remoteDatasource.register(name, email,password)
        if (registerUser is Result.Success){
//            localDatasource.getUserId()
            localDatasource.saveRegisterUser(registerUser.value)
        }
        return registerUser
    }
}