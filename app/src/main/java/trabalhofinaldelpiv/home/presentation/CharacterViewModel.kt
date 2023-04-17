package com.fundatec.trabalhofinaldelpiv.login.presentation


import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import trabalhofinaldelpiv.App
import trabalhofinaldelpiv.home.data.CharacterResponse
import trabalhofinaldelpiv.home.data.ListCharacaterRemoteDataSource
import trabalhofinaldelpiv.login.login.data.LoginRemoteDataSource
import trabalhofinaldelpiv.login.login.presentation.ViewState

//'LoginViewModel' que é uma subclasse 'ViewModel'. Essa classe gernecia a lógica de negócio e a comunicação entre a camada de vizualização
// e a camada de dados.

class CharacterViewModel : ViewModel() {

    private val state = MutableLiveData<CharacterViewState>()
    val viewState: LiveData<CharacterViewState> = state

    fun fetchList() {
        viewModelScope.launch {
            state.value = CharacterViewState.ShowLoading
            val userId =
                App.context.getSharedPreferences("User", Context.MODE_PRIVATE).getInt("Id", 0)
            val list = ListCharacaterRemoteDataSource().listCharacter(userId)
            if (list.get() != null) {
                state.value = CharacterViewState.ShowList(list.get().orEmpty())
            } else {
                state.value = CharacterViewState.ShowError
            }
        }
    }
}

sealed class CharacterViewState {

    data class ShowList(val list: List<CharacterResponse>) : CharacterViewState()
    object ShowLoading : CharacterViewState()
    object ShowError : CharacterViewState()


}
