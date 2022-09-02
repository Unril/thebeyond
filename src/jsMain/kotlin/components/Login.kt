package components

import common.formData
import constants.Paths
import csstype.*
import entities.User
import mui.material.*
import mui.material.styles.TypographyVariant
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ButtonType
import react.dom.html.InputType
import react.dom.html.ReactHTML

private const val ID_EMAIL = "email"
private const val ID_PASSWORD = "password"

external interface LoginProps : Props {
    var onSubmit: (User) -> Unit
}

val Login = FC<LoginProps> { props ->
    Box {
        sx {
            display = Display.flex
            flexDirection = FlexDirection.column
            alignItems = AlignItems.center
        }
        Avatar {
            sx {
                margin = 1.px
                backgroundColor = Color("secondary.main")
            }
            Icon {
                +"lock_outlined"
            }
        }
        Typography {
            variant = TypographyVariant.h5
            +"Login"
        }
        Box {
            component = ReactHTML.form
            onSubmit = { e ->
                val data = e.formData()
                props.onSubmit(
                    User(
                        email = data[ID_EMAIL],
                        password = data[ID_PASSWORD]
                    )
                )
            }
            sx {
                marginTop = 1.px
            }
            TextField {
                margin = FormControlMargin.normal
                required = true
                fullWidth = true
                autoFocus = true
                id = ID_EMAIL
                name = ID_EMAIL
                autoComplete = "email"
                label = ReactNode("Email Address")
            }
            TextField {
                margin = FormControlMargin.normal
                type = InputType.password
                required = true
                fullWidth = true
                id = ID_PASSWORD
                name = ID_PASSWORD
                autoComplete = "current-password"
                label = ReactNode("Password")
            }
            Button {
                type = ButtonType.submit
                fullWidth = true
                variant = ButtonVariant.contained
                sx {
                    marginTop = 16.px
                    marginBottom = 16.px
                }
                +"Login"
            }
            AlternativeSignLink {
                to = Paths.REGISTER
                text = "Don't have an account? Register"
            }
        }
    }
}
