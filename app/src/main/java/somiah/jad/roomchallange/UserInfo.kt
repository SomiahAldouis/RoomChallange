package somiah.jad.roomchallange

import android.provider.ContactsContract
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class UserInfo (
    @PrimaryKey
    var userID: UUID = UUID.randomUUID(),
    var userName: String = "",
    var userEmail: String = "",
    var userPassword : String = ""
    )