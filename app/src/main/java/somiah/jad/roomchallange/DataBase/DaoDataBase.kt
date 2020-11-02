package somiah.jad.roomchallange.DataBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import somiah.jad.roomchallange.UserInfo
import java.util.*

@Dao
interface DaoDataBase {

    @Query("SELECT * FROM UserInfo")
    fun getUsersInfo(): LiveData<List<UserInfo>>

    @Query("SELECT * FROM UserInfo WHERE userID=(:id)")
    fun getUserInfo(id: UUID): LiveData<UserInfo?>


}