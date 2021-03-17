package ke.co.topup.syeco.data.Repository

import ke.co.topup.syeco.data.User
import ke.co.topup.syeco.data.UserDao

class UserRepository(private val userDao: UserDao) {

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }
}