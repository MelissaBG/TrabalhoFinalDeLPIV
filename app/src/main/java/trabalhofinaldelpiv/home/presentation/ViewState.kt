package trabalhofinaldelpiv.home.presentation

sealed class ViewState {
        object ShowLoading : ViewState()
        object ShowErrorEmptyFileds : ViewState()
        object ShowErrorApiLogin : ViewState()
        object ShowMessage : ViewState()

}