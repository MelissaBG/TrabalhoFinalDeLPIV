package trabalhofinaldelpiv.home.presentation

sealed class HomeViewState {
        object ShowDeleteMessage: HomeViewState()
        object ShowLoading : HomeViewState()
        object ShowDeleteError: HomeViewState()
        object ShowErrorEmptyFileds : HomeViewState()
        object ShowErrorApiLogin : HomeViewState()

}