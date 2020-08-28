package mk.pick.server.service

import mk.pick.server.model.User

interface UserServiceInterface {
    fun create(user: User): User
}