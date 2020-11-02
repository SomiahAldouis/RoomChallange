package somiah.jad.roomchallange.DataBase

import androidx.room.TypeConverter
import java.util.*

class TypeConvertersDataBase {
    @TypeConverter
    fun toUUID(uuid: String?): UUID? {
        return UUID.fromString(uuid)
    }
    @TypeConverter
    fun fromUUID(uuid: UUID?): String? {
        return uuid?.toString()
    }

}