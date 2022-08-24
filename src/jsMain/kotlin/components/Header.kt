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

val Header = FC<Props> {
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
            Button {
                component = RouterLink
                to = PATH_SIGN_IN
                color = ButtonColor.inherit
                +"Sign in"
            }
        }
    }
}
