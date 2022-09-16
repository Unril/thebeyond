package dev.thebeyond.application

import dev.thebeyond.application.model.User
import io.ktor.server.application.*
import io.r2dbc.spi.ConnectionFactoryOptions
import org.komapper.r2dbc.R2dbcDatabase

private fun Application.configProperty(path: String) = environment.config.property(path).getString()

fun Application.connectToDatabase(): R2dbcDatabase {
    val password = configProperty("db.password")
    val host = configProperty("db.host")
    val port = configProperty("db.port")

    return ConnectionFactoryOptions.builder()
        .option(ConnectionFactoryOptions.DRIVER, "postgresql")
        .option(ConnectionFactoryOptions.HOST, host)
        .option(ConnectionFactoryOptions.PORT, port.toInt())
        .option(ConnectionFactoryOptions.DATABASE, "thebeyond")
        .option(ConnectionFactoryOptions.USER, "thebeyond")
        .option(ConnectionFactoryOptions.PASSWORD, password)
        .build().let { R2dbcDatabase(it) }
}

class DbUsersRepository(private val db_: R2dbcDatabase) : UsersRepository {
    override fun addUser(user: User) {
        TODO("Not yet implemented")
    }

}
