package somiah.jad.roomchallange.DataBase
import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import somiah.jad.roomchallange.UserInfo

@Database(entities = [UserInfo::class] , version = 1)
@TypeConverters(TypeConvertersDataBase::class)
abstract class UserDataBase : RoomDatabase() {

    abstract fun userDao(): DaoDataBase
}