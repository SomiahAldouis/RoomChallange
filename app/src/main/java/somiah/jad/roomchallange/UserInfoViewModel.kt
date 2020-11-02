package somiah.jad.roomchallange

import androidx.lifecycle.ViewModel

class UserInfoViewModel: ViewModel() {

    private val userRepository = UserRepository.get()
    val usersInfoLiveData = userRepository.getUsersInfo()
//    val userInfoLiveData = userRepository.getUserInfo(val id: UUID)

}