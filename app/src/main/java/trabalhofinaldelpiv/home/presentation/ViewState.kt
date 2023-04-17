package trabalhofinaldelpiv.home.presentation

sealed class ViewState {
        object ShowDeleteMessage: ViewState()
        object ShowLoading : ViewState()
        object ShowErrorEmptyFileds : ViewState()
        object ShowErrorApiLogin : ViewState()

}