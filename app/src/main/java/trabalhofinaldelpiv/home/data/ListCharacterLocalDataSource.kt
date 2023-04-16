package trabalhofinaldelpiv.home.data

import android.content.Context
import trabalhofinaldelpiv.App

class ListCharacterLocalDataSource {

    fun getUserId(): Int {
        val preferences = App.context.getSharedPreferences("bd", Context.MODE_PRIVATE)
        return preferences.getInt("userId", 0)
    }
    fun saveListCharacter(characterResponse: CharacterResponse) {
        val preferences = App.context.getSharedPreferences("bd", Context.MODE_PRIVATE)
        preferences.edit().putInt("userId", characterResponse.id).commit()
        //Apply()
    }
}
