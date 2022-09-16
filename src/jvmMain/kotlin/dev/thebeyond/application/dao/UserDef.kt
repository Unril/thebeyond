package dev.thebeyond.application.dao

import dev.thebeyond.application.model.User
import org.komapper.annotation.*

@KomapperEntityDef(User::class, ["users"])
@KomapperTable("users")
data class UserDef(
    @KomapperId
    val id: Nothing,
    val email: Nothing,
    val name: Nothing,
    @KomapperColumn(masking = true)
    val password: Nothing,
    val role: Nothing,
    @KomapperCreatedAt
    val createdAt: Nothing,
    @KomapperUpdatedAt
    val changedAt: Nothing,
    @KomapperVersion
    val version: Nothing,
)
