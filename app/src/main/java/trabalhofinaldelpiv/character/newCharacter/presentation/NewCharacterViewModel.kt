package trabalhofinaldelpiv.character.newCharacter.presentation

import android.media.Image
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import trabalhofinaldelpiv.character.newCharacter.data.CharacterRequest
import trabalhofinaldelpiv.character.newCharacter.data.NewCharacterRemoteDataSource
import trabalhofinaldelpiv.login.login.data.LoginLocalDataSource
import java.util.*

class NewCharacterViewModel : ViewModel() {
    private val loginLocalDataSource = LoginLocalDataSource()
    private val state = MutableLiveData<ViewState>()
    val viewState: LiveData<ViewState> = state

    fun validateCharacterInput(name: String?, description: String?, image: String?,
                          universeType: String?, characterType: String?, age: String?, date: String?) {
        viewModelScope.launch {
            state.value = ViewState.ShowLoading
            if (name != null && name.isNotEmpty() &&
                description != null && description.isNotEmpty() &&
                image != null &&
                universeType != null && universeType.isNotEmpty() &&
                characterType != null && characterType.isNotEmpty() &&
                age != null && age > 0.toString() &&
                date != null
            ) {
                val newCharacterRegister = NewCharacterRemoteDataSource().newCharacter(
                    CharacterRequest(name, description,image,universeType,
                characterType, age, date), loginLocalDataSource.getUserId())
                if (newCharacterRegister.get() != null) {
                    state.value = ViewState.ShowSuccess
                } else {
                    state.value = ViewState.ShowErrorApiCharacter
                }
            } else {
                state.value = ViewState.ShowErrorEmptyFileds
            }
        }

    }

}