package trabalhofinaldelpiv.character.newCharacter.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import trabalhofinaldelpiv.character.newCharacter.domain.ErrorModelCharacter
import trabalhofinaldelpiv.webservice.Result
import trabalhofinaldelpiv.webservice.RetrofitNetworkClient

class NewCharacterRemoteDataSource {
    private val service = RetrofitNetworkClient.createNetworkClient()
       .create(NewCharacterApi::class.java)

//    suspend fun newListCharacter(userId: Int
//    ): Result<Unit, ErrorModelCharacter> {
//        return withContext(Dispatchers.IO) {
//            val newCharacter = service.listCharacters(userId)
//            if (newCharacter.isSuccessful) {
//                Result.Success(Unit)
//            } else {
//                Result.Error(ErrorModelCharacter.ErrorNewCharacter)
//            }
//        }

//    }
    suspend fun newSaveCharacter(
        characterRequest: CharacterRequest, userId: Int
    ): Result<Unit, ErrorModelCharacter> {
        return withContext(Dispatchers.IO) {
            val newSaveCharacter = service.saveNewCharacter(userId, characterRequest)
            if (newSaveCharacter.isSuccessful) {
                Result.Success(Unit)
            } else {
                Result.Error(ErrorModelCharacter.ErrorNewCharacter)
            }
        }

    }

}
