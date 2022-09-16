package dev.thebeyond.application.model

import dev.thebeyond.application.TokenPBKDF2
import java.time.Instant
import java.util.*

enum class UserRole {
    USER,
    MODERATOR,
    ADMIN,
}

const val USER_ID_STRING_LENGTH = 36;

data class User(
    val id: UUID,
    val email: String,
    val name: String,
    val password: TokenPBKDF2,
    val role: UserRole,
    val createdAt: Instant = Instant.MIN,
    val changedAt: Instant = Instant.MIN,
    val version: Long = 0,
) {
    companion object {
        fun new(email: String, name: String, password: String, role: UserRole = UserRole.USER): User {
            require(email.isNotBlank())
            require(email.contains('@'))
            require(name.isNotBlank())
            require(password.isNotBlank())
            return User(UUID.randomUUID(), email, name, TokenPBKDF2.fromPassword(password), role)
        }
    }
}
