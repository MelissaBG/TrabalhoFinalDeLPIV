package trabalhofinaldelpiv.database

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/*Essa classe contém um método chamado 'login' que usa o método HTTP GET para enviar uma solicitação
* para a rota 'api/login' e espera receber uma resposta assincrona.
* O método login espera receber duas strings como parâmetros 'email' e 'password' e envia esses parâmetros
* como consulta (query) na URL da solicitação usando as antotações @Query. ele retorna um objeto 'Response'
* que contém um objeto de resposta 'LoginResponse'. A resposta pode ser nula, indicando que não houve resposta
* válida do servidor. LoginApi é uma abstração para definir o contrato de comunicação com o servidor e é
* implementada em outro lugar do código(Retrofit) que se encarrega defazer a comunicação real com servidor.*/


    interface RegisterUserApi {

        @POST("api/login/")
        suspend fun register(
            @Body userRequest : UserRegisterRequest

        ): RegisterResponse

    }
    data class UserRegisterRequest(
        val email: String,
        val name: String,
        val password: String

    )