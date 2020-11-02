package somiah.jad.roomchallange

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import somiah.jad.roomchallange.DataBase.DaoDataBase
import somiah.jad.roomchallange.DataBase.UserDataBase
import java.util.*

private const val DATABASE_NAME = "User_Database"
class UserRepository private constructor(context: Context){
    private val database : UserDataBase = Room.databaseBuilder(
            context.applicationContext, UserDataBase::class.java,
            DATABASE_NAME
        ).build()
        private val UserDao = database.userDao()

        fun getUserInfo(userId: UUID): LiveData<UserInfo?> = UserDao.getUserInfo(userId)
        fun getUsersInfo():LiveData<List<UserInfo>> = UserDao.getUsersInfo()

        companion object {
            private var INSTANCE: UserRepository? = null
            fun initialize(context: Context) {
                if (INSTANCE == null) {
                    INSTANCE = UserRepository(context)
                }
            }
            fun get(): UserRepository {
                return INSTANCE ?:
                throw IllegalStateException("Repository must be initialized")
            }
        }

    }
