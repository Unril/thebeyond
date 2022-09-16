package dev.thebeyond.application

import dev.thebeyond.application.model.User

interface UsersRepository {
    fun addUser(user: User)
}
