package trabalhofinaldelpiv.character.newCharacter.data.repository

import trabalhofinaldelpiv.character.newCharacter.data.CharacterRequest
import trabalhofinaldelpiv.character.newCharacter.data.NewCharacterRemoteDataSource
import trabalhofinaldelpiv.character.newCharacter.domain.ErrorModelCharacter
import trabalhofinaldelpiv.login.login.data.LoginLocalDataSource
import trabalhofinaldelpiv.webservice.Result
//usada para salvar informações de um personagem
class NewCharacterRepository {
    //instância será criada quando for acessada pela primeira vez.
    private val remoteCharacterDatasource: NewCharacterRemoteDataSource by lazy {
        //comunicação com uma API remota
        NewCharacterRemoteDataSource()
    }
   // comunicação com uma fonte de dados local
    private val localDatasource: LoginLocalDataSource by lazy {
        LoginLocalDataSource()
    }
    //uma função que salva as informações do personagem na fonte de dados remota.
    //recebe um parâmetro do tipo CharacterRequest, que provavelmente é uma classe que encapsula
    // as informações do personagem, e retorna um objeto do tipo Result<Unit, ErrorModelCharacter>.
    suspend fun saveCharacter(
        characterRequest: CharacterRequest
    ): Result<Unit, ErrorModelCharacter> {
        val userId = localDatasource.getUserId()
        return remoteCharacterDatasource.newCharacter(characterRequest, userId)

    }
}