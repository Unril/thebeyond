import common.*
import components.*
import entities.User
import kotlinx.js.jso
import mui.material.Box
import mui.material.CssBaseline
import mui.material.styles.ThemeProvider
import mui.material.styles.createTheme
import react.*
import react.router.Outlet
import react.router.Route
import react.router.Routes
import react.router.dom.HashRouter

data class AuthContextType(var user: User)

val AuthContext = createContext<AuthContextType>()

fun useAuth() = useContext(AuthContext)

val AuthProvider = FC<PropsWithChildren> { props ->
    val user = User("test", "pass")
    val auth = AuthContextType(user = user)
    AuthContext.Provider {
        value = auth
        +props.children
    }
}

val uiTheme = createTheme(
    jso {
        palette = jso {
            primary = jso {
                main = "#356097"
            }
            secondary = jso {
                main = "#cc946f"
            }
        }
    }
)

val Layout = FC<Props> {
    StrictMode { // causes useEffect to fire twice
        ThemeProvider {
            theme = uiTheme
            AuthProvider {
                Box {
                    CssBaseline {}
                    Header {}
                    Outlet {}
                }
            }
        }
    }
}

val App = FC<Props> {
    HashRouter {
        Routes {
            Route {
                path = PATH_HOME
                element = Layout.create()
                Route {
                    index = true
                    element = Home.create()
                }
                Route {
                    path = PATH_SIGN_IN
                    element = SignIn.create()
                }
                Route {
                    path = PATH_SIGN_UP
                    element = SignUp.create()
                }
                Route {
                    path = PATH_GAME
                    element = Game.create()
                }
                Route {
                    path = PATH_CONFIGURATION
                    element = Configuration.create()
                }
            }
        }
    }
}
