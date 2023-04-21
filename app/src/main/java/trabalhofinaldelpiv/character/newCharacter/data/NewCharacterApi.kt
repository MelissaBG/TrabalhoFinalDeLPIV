package trabalhofinaldelpiv.character.newCharacter.data

import retrofit2.http.*
import java.util.*

interface NewCharacterApi {
//    @GET("api/character/{id}")
//    suspend fun characters(
//        @Path("id") userId: Int
//    ): Response
    @POST("api/character/{userId}")
    suspend fun saveNewCharacter(
    @Path("userId") userId: Int,
    @Body character : CharacterRequest,
    ): retrofit2.Response<Unit>

}
