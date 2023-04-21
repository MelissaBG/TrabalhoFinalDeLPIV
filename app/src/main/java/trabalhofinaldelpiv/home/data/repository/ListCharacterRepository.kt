package trabalhofinaldelpiv.home.data.repository

import trabalhofinaldelpiv.home.data.ListCharacaterRemoteDataSource
import trabalhofinaldelpiv.home.data.ListCharacterLocalDataSource
import trabalhofinaldelpiv.character.newCharacter.data.CharacterRequest
import trabalhofinaldelpiv.home.data.CharacterResponse
import trabalhofinaldelpiv.home.domain.ErrorModelListCharacter
import trabalhofinaldelpiv.webservice.Result

class ListCharacterRepository {
    //inicializa uma instância de ListCharacaterRemoteDataSource,
    // que é uma classe que implementa as operações relacionadas a fonte de dados remota.
    private val remoteListCharacterDatasource: ListCharacaterRemoteDataSource by lazy {
        ListCharacaterRemoteDataSource()
    }
    //inicializa uma instância de ListCharacterLocalDataSource,
    // que é uma classe que implementa as operações relacionadas a fonte de dados local.
    private val localDatasource: ListCharacterLocalDataSource by lazy {
        ListCharacterLocalDataSource()
    }
    //salvar uma lista de personagens na fonte de dados remota.
    //recebe um objeto ListCharacterRequest, que contém as informações necessárias
    // para enviar os personagens para a fonte de dados remota.
    // retorno um objeto do tipo Unit (que geralmente é usado quando não há um valor útil para ser retornado)
    // ou um objeto do tipo ErrorModelListCharacter em caso de erro.

    suspend fun save(characterRequest: CharacterRequest): Result<Unit, ErrorModelListCharacter> {
        val userId = localDatasource.getUserId() //Recupero o Id
        //seguida é chamado o método remoteListCharacterDatasource.listCharacter()
        return remoteListCharacterDatasource.saveCharacter(characterRequest,userId)
    }
    suspend fun list(): Result<List<CharacterResponse>, ErrorModelListCharacter> {
        val userId = localDatasource.getUserId()
        return remoteListCharacterDatasource.listCharacter(userId)
    }
}
