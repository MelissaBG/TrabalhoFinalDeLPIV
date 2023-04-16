package trabalhofinaldelpiv.login.login.data.repository

import com.fundatec.trabalhofinaldelpiv.login.presentation.ErrorModel
import trabalhofinaldelpiv.login.login.data.LoginLocalDataSource
import trabalhofinaldelpiv.login.login.data.LoginRemoteDataSource
import trabalhofinaldelpiv.login.login.data.LoginResponse
import trabalhofinaldelpiv.webservice.Result


class LoginRepository {

    private val remoteDatasource: LoginRemoteDataSource by lazy {
        LoginRemoteDataSource()
    }
    private val localDatasource: LoginLocalDataSource by lazy {
        LoginLocalDataSource()
    }

    suspend fun saveLogin(email: String, password: String): Result<LoginResponse, ErrorModel> {
       val login = remoteDatasource.remotelogin(email,password)
        if (login is Result.Success){
//            localDatasource.getUserId()
            localDatasource.saveLogin(login.value)
        }
        return login
    }

}