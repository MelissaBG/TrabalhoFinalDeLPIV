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
import trabalhofinaldelpiv.home.presentation.CharacterViewState
import trabalhofinaldelpiv.profile.presentation.ViewState

//'LoginViewModel' que é uma subclasse 'ViewModel'. Essa classe gernecia a lógica de negócio e a comunicação entre a camada de vizualização
// e a camada de dados.

class CharacterViewModel : ViewModel() {

    private val state = MutableLiveData<CharacterViewState>()
    val viewState: LiveData<CharacterViewState> = state

    fun fetchList(characterType: String) {
        viewModelScope.launch {
            state.value = CharacterViewState.ShowLoading
            val userId =
                App.context.getSharedPreferences("User", Context.MODE_PRIVATE).getInt("Id", 0)
            val listResult = ListCharacaterRemoteDataSource().listCharacter(userId)

            if (listResult.get() != null) {
                val list = listResult.get()?.filter {
                    it.characterType == characterType;
                }
                state.value = CharacterViewState.ShowList(list.orEmpty())

            } else {
                state.value = CharacterViewState.ShowError
            }
        }
    }

    fun removeItem(itemId: Int) {
        state.value = CharacterViewState.ShowLoading
        viewModelScope.launch {
            val delete = ListCharacaterRemoteDataSource().deleteCharacter(itemId)
            if (delete.get() != null) {
                state.value = CharacterViewState.ShowDeleteOk
            } else {
                state.value = CharacterViewState.ShowError
            }
        }
    }
}

