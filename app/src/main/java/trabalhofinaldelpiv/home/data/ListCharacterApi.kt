package trabalhofinaldelpiv.home.data

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path



interface ListCharacterApi {
    //chamada HTTP será feita
    @POST("api/character/{userId}")
    suspend fun saveCharacter(
        @Path("userId") userId: Int,
        @Body character : CharacterRequest,
    ): Response<Unit>

    @GET("api/character/{userId}")
    suspend fun getListCharacters(
        @Path("userId") userId: Int
    ): Response <List<CharacterResponse>>
    @DELETE("api/character/{userId}")
    suspend fun deleteCharacter(
        @Path("userId") userId: Int
    ): Response<Int>
}