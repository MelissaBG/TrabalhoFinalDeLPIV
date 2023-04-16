package trabalhofinaldelpiv.character.newCharacter.data

import okhttp3.Response
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.*

interface NewCharacterApi {
    @GET("api/character/{id}")
    suspend fun characters(
        @Path("id") userId: Int,
        @Body character: CharacterRequest,
    ): Response
}
