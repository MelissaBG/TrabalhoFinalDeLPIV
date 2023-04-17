package trabalhofinaldelpiv.profile.domain


sealed class ErrorModelRegisterUser{
    object ErrorRegisterUser : ErrorModelRegisterUser()
    object ErrorRegister : ErrorModelRegisterUser()
}