package dev.thebeyond.application

import dev.thebeyond.application.model.User

interface UsersRepository {
    suspend fun createUser(user: User)
    suspend fun userByEmail(email: String): User?
}
