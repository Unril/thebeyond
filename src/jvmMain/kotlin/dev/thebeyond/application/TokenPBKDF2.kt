package dev.thebeyond.application

import io.ktor.util.*
import java.security.SecureRandom
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec
import kotlin.text.toCharArray

/**
 * Token generated using PBKDF2 algorithm.
 *
 * [Hashing a Password in Java](http://www.baeldung.com/java-password-hashing)
 */
@JvmInline
value class TokenPBKDF2(val token: String) {
    companion object {
        private const val PREFIX = "_TB_"
        private const val COST = 1 shl 16
        private const val ALGORITHM = "PBKDF2WithHmacSHA1"
        private const val KEY_SIZE = 256
        private const val SALT_SIZE = 8

        private const val PREFIX_SIZE = PREFIX.length
        private const val KEY_HEX_SIZE = KEY_SIZE / 4
        private const val SALT_HEX_SIZE = SALT_SIZE * 2
        private const val TOKEN_SIZE = PREFIX_SIZE + SALT_HEX_SIZE + 1 + KEY_HEX_SIZE

        private fun randomSalt() = ByteArray(SALT_SIZE).also(SecureRandom()::nextBytes)

        private fun generateToken(salt: ByteArray, password: String): String {
            require(salt.size == SALT_SIZE)
            require(password.isNotEmpty())
            val spec = PBEKeySpec(password.toCharArray(), salt, COST, KEY_SIZE)
            val algorithm = SecretKeyFactory.getInstance(ALGORITHM)
            val hash = algorithm.generateSecret(spec).encoded!!
            return "$PREFIX${hex(salt)}_${hex(hash)}"
        }

        fun fromPassword(password: String) = TokenPBKDF2(generateToken(randomSalt(), password))
    }

    init {
        require(token.length == TOKEN_SIZE) { "Invalid token length" }
        require(token.startsWith(PREFIX)) { "Invalid token format" }
    }

    fun checkPassword(password: String): Boolean {
        require(password.isNotEmpty())
        val salt = token.substring(PREFIX_SIZE, PREFIX_SIZE + SALT_HEX_SIZE)
        val expected = generateToken(hex(salt), password)
        return token == expected
    }

    override fun toString() = "TokenPBKDF2(****)"
}
