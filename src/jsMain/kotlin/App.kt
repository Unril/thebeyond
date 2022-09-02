import common.*
import components.*
import constants.Paths
import csstype.px
import kotlinx.js.jso
import mui.material.Box
import mui.material.Container
import mui.material.CssBaseline
import mui.material.styles.ThemeProvider
import mui.material.styles.createTheme
import mui.system.sx
import react.*
import react.router.*
import react.router.dom.HashRouter


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

val ContainerLayout = FC<Props> {
    Container {
        maxWidth = "xs"
        sx {
            marginTop = 32.px
        }
        Outlet {}
    }
}

external interface RequireAuthProps : PropsWithChildren {
    var authenticated: Boolean
}

val RequireAuth = FC<RequireAuthProps> { props ->
    if (props.authenticated) {
        +props.children
    } else {
        Navigate {
            to = Paths.LOGIN
            replace = true
        }
    }
}

val AppRoutes = FC<Props> {
    val navigate = useNavigate()
    val (token, setToken) = useState {
        println("Loading token")
        "test"
    }

    Routes {
        Route {
            path = Paths.HOME
            element = Box.create {
                Header {
                    authenticated = token.isNotEmpty()
                    logout = { setToken("") }
                }
                Outlet {}
            }
            Route {
                element = ContainerLayout.create()
                Route {
                    index = true
                    element = Home.create()
                }
                Route {
                    path = Paths.LOGIN
                    element = Login.create {
                        onSubmit = {
                            setToken("token")
                            navigate.replace(Paths.HOME)
                        }
                    }
                }
                Route {
                    path = Paths.REGISTER
                    element = Register.create {
                        onSubmit = {
                            setToken("token")
                            navigate.replace(Paths.HOME)
                        }
                    }
                }
                Route {
                    path = Paths.CONFIGURATION
                    element = RequireAuth.create {
                        authenticated = token.isNotEmpty()
                        Configuration { }
                    }
                }
            }
            Route {
                path = Paths.GAME
                element = RequireAuth.create {
                    authenticated = token.isNotEmpty()
                    Game {}
                }
            }
            Route {
                path = "*"
                element = NotFound.create()
            }
        }
    }
}

val App = FC<Props> {
    StrictMode { // causes useEffect to fire twice
        ThemeProvider {
            theme = uiTheme
            CssBaseline {}
            HashRouter {
                AppRoutes { }
            }
        }
    }
}
