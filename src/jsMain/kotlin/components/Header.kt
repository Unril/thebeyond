package components

import common.*
import csstype.Display
import csstype.number
import csstype.px
import mui.material.*
import mui.material.styles.TypographyVariant
import mui.system.sx
import react.FC
import react.Props
import react.router.dom.Link as RouterLink

external interface HeaderProps : Props {
    var authenticated: Boolean
    var logout: () -> Unit
}

val Header = FC<HeaderProps> { props ->
    AppBar {
        position = AppBarPosition.static
        Toolbar {
            Icon {
                sx {
                    display = Display.flex
                }
                +"rocket_launch_outlined"
            }
            Button {
                component = RouterLink
                to = "/"
                color = ButtonColor.inherit
                Typography {
                    variant = TypographyVariant.h5
                    noWrap = true
                    +"TheBeyond"
                }
            }
            Button {
                component = RouterLink
                to = PATH_GAME
                color = ButtonColor.inherit
                disabled = !props.authenticated
                sx {
                    marginLeft = 8.px
                    marginRight = 8.px
                }
                +"Game"
            }
            Button {
                component = RouterLink
                to = PATH_CONFIGURATION
                color = ButtonColor.inherit
                disabled = !props.authenticated
                sx {
                    marginLeft = 8.px
                    marginRight = 8.px
                }
                +"Configuration"
            }

            Box {
                sx {
                    flexGrow = number(1.0)
                }
            }
            if (props.authenticated) {
                Button {
                    onClick = { props.logout() }
                    color = ButtonColor.inherit
                    +"Logout"
                }
            } else {
                Button {
                    component = RouterLink
                    to = PATH_REGISTER
                    color = ButtonColor.inherit
                    +"Register"
                }
                Button {
                    component = RouterLink
                    to = PATH_LOGIN
                    color = ButtonColor.inherit
                    +"Login"
                }
            }
        }
    }
}
