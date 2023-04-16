package trabalhofinaldelpiv.character.newCharacter.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import trabalhofinaldelpiv.character.newCharacter.domain.ErrorModelCharacter
import trabalhofinaldelpiv.webservice.Result
import trabalhofinaldelpiv.webservice.RetrofitNetworkClient

class NewCharacterRemoteDataSource {
    private val service = RetrofitNetworkClient.createNetworkClient()
       .create(NewCharacterApi::class.java)

    suspend fun newCharacter(
        characterRequest: CharacterRequest, userId: Int
    ): Result<Unit, ErrorModelCharacter> {
        return withContext(Dispatchers.IO) {
            val newCharacter = service.characters(userId, characterRequest)
            if (newCharacter.isSuccessful) {
                Result.Success(Unit)
            } else {
                Result.Error(ErrorModelCharacter.ErrorNewCharacter)
            }
        }

    }

}
