package trabalhofinaldelpiv.profile.use
import android.util.Log
import kotlinx.coroutines.Dispatchers

import kotlinx.coroutines.withContext
//import trabalhofinaldelpiv.database.FHDatabase

//class LocalDataSource {
//        private val database: FHDatabase by lazy {
//            FHDatabase.getInstance()
//        }
//
//        suspend fun save() {
//            return withContext(Dispatchers.IO) {
//                database.userDao().insertUser(
//                    UserEntity(
//                        name = "Melissa",
//                        email = "melissabgoulart@gmail.com",
//                        password = "123456"
//                    )
//                )
//
//                Log.e("teste", "${ database.userDao().getUser()}")
//            }
//        }
//}