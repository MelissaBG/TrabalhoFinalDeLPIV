package trabalhofinaldelpiv.home.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import trabalhofinaldelpiv.character.newCharacter.data.CharacterRequest
import trabalhofinaldelpiv.home.domain.ErrorModelListCharacter

import trabalhofinaldelpiv.webservice.Result
import trabalhofinaldelpiv.webservice.RetrofitNetworkClient

class ListCharacaterRemoteDataSource {

    private val service = RetrofitNetworkClient.createNetworkClient()
        .create(ListCharacterApi::class.java)
    private val characterResponse: MutableList<CharacterResponse> = mutableListOf()
    //um método suspenso que faz uma chamada à API por meio do objeto service para recuperar
    // uma lista de personagens.
    // Se a chamada for bem-sucedida, o método retorna a lista como um objeto.
    suspend fun saveCharacter(
        characterRequest: CharacterRequest, userId: Int
    ): Result<Unit, ErrorModelListCharacter> {
        return withContext(Dispatchers.IO) {
            val response = service.saveCharacter(userId, characterRequest )
            if (response.isSuccessful) {
                Result.Success(Unit)
            } else {
                Result.Error(ErrorModelListCharacter.ErrorListCharacter)
            }
        }

    }
    suspend fun listCharacter(userId: Int
    ): Result<List<CharacterResponse>, ErrorModelListCharacter> {
        return withContext(Dispatchers.IO) {
            val response = service.getListCharacters(userId)
            if (response.isSuccessful) {
                Result.Success(response.body().orEmpty())
            } else {
                Result.Error(ErrorModelListCharacter.ErrorListCharacter)
            }
        }

    }
    suspend fun deleteCharacter(userId: Int
    ): Result <Unit, ErrorModelListCharacter> {
        return withContext(Dispatchers.IO) {
            val response = service.deleteCharacter(userId)
            if (response.isSuccessful) {
                Result.Success(Unit)
            } else {
                Result.Error(ErrorModelListCharacter.ErrorListCharacter)
            }
        }

    }
}
