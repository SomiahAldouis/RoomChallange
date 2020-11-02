package somiah.jad.roomchallange

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import java.util.Observer

class MainActivity : AppCompatActivity() {

    private var userViewModel: UserInfoViewModel()

    private lateinit var userName: TextView
    private lateinit var userEmail: TextView
    private lateinit var userNameInput: TextInputEditText
    private lateinit var userEmailInput: TextInputEditText
    private lateinit var userPasswordInput: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {



        userViewModel.usersInfoLiveData.observe(
            this,
           // Observer
        )
        return super.onCreateView(name, context, attrs)
    }

}
