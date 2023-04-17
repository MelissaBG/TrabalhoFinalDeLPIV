package trabalhofinaldelpiv.home.data



data class CharacterResponse(

    val id : Int,
    val name : String,
    val description: String,
    val image: String,
    val universeType : String,
    val characterType: String ,
    val age:String,
    val date: String?
    //val results: List<Character>
)
