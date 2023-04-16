package trabalhofinaldelpiv.character.newCharacter.data.repository

import trabalhofinaldelpiv.character.newCharacter.data.CharacterRequest
import trabalhofinaldelpiv.character.newCharacter.data.NewCharacterRemoteDataSource
import trabalhofinaldelpiv.character.newCharacter.domain.ErrorModelCharacter
import trabalhofinaldelpiv.login.login.data.LoginLocalDataSource
import trabalhofinaldelpiv.webservice.Result

class NewCharacterRepository {

    private val remoteCharacterDatasource: NewCharacterRemoteDataSource by lazy {
        NewCharacterRemoteDataSource()
    }
    private val localDatasource: LoginLocalDataSource by lazy {
        LoginLocalDataSource()
    }

    suspend fun saveCharacter(
        characterRequest: CharacterRequest
    ): Result<Unit, ErrorModelCharacter> {
        val userId = localDatasource.getUserId()
        return remoteCharacterDatasource.newCharacter(characterRequest, userId)

    }
}