package trabalhofinaldelpiv.profile.presentation

sealed class ViewState {
    object ShowRegisterUser : ViewState()
    object ShowLoading : ViewState()
    object ShowErrorEmptyFields : ViewState()
    object ShowErrorApiRegisterUser : ViewState()
}