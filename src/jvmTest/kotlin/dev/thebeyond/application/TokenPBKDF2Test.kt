package dev.thebeyond.application

import org.junit.jupiter.api.Test
import strikt.api.*
import strikt.assertions.*

internal class TokenPBKDF2Should {
    companion object {
        const val TOKEN = "_TB_3ca1c6e43ac96736_92a7634dd09f02c5077ced0f5b5c8c2c6c2ce889cb8a04db0b92d3f3d81b140c"
        const val PASSWORD = "TEST_PASSWORD"
    }

    @Test
    fun checkPassword() {
        val token = TokenPBKDF2(TOKEN)
        expectThat(token.checkPassword(PASSWORD)) {
            isTrue()
        }
        expectThat(token.checkPassword("something")) {
            isFalse()
        }
    }

    @Test
    fun generateTokenFromPassword() {
        val token = TokenPBKDF2.fromPassword(PASSWORD)
        println(token)
        expectThat(token.token) {
            hasLength(TOKEN.length)
            startsWith("_TB_")
            matches(Regex("""^_TB_\p{XDigit}{16}_\p{XDigit}{64}$"""))
        }

    }
}
