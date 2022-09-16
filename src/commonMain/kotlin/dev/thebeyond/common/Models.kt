package dev.thebeyond.common

import kotlinx.serialization.Serializable

@Serializable
data class NewUserRegistration(
    val email: String,
    val name: String,
    val password: String,
)

@Serializable
data class UserToken(
    val token: String,
)
