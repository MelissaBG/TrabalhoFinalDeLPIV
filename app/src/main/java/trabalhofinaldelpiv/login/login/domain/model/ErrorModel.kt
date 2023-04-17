package trabalhofinaldelpiv.login.login.domain.model

sealed class ErrorModel{
    object ErrorLogin : ErrorModel()
    object ErrorRegister : ErrorModel()
}