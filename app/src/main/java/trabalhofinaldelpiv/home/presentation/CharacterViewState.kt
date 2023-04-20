package trabalhofinaldelpiv.home.presentation

import trabalhofinaldelpiv.home.data.CharacterResponse

sealed class CharacterViewState {
    data class ShowList(val list: List<CharacterResponse>) : CharacterViewState()
    object ShowLoading : CharacterViewState()
    object ShowError : CharacterViewState()
    object ShowDeleteOk : CharacterViewState()
    object ShowDeleteError: CharacterViewState()
    object ShowDeleteMessage: CharacterViewState()
}