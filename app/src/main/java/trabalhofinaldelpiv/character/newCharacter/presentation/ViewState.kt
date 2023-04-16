package trabalhofinaldelpiv.character.newCharacter.presentation

sealed class ViewState {
    object ShowSuccess: ViewState()
    object ShowLoading : ViewState()
    object ShowErrorEmptyFileds : ViewState()
    object ShowErrorApiCharacter : ViewState()
}