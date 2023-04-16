package trabalhofinaldelpiv.character.newCharacter.data

import android.content.Context
import trabalhofinaldelpiv.App
import trabalhofinaldelpiv.login.login.data.LoginResponse

class NewCharacterLocalDataSource {
    fun saveCharacter(newCharacterResponse: NewCharacterResponse) {
        val preferences = App.context.getSharedPreferences("bd", Context.MODE_PRIVATE)
        preferences.edit().putInt("userId", newCharacterResponse.id).commit()
        //Apply()
    }
}