package somiah.jad.roomchallange

import android.app.Application

class IntentApp: Application() {

    override fun onCreate() {
        super.onCreate()
        UserRepository.initialize(this)
    }

}