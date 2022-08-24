package components

import common.PATH_SIGN_UP
import common.formData
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

external interface SignInProps : Props {
    var onSubmit: (User) -> Unit
}

val SignIn = FC<SignInProps> { props ->
    Container {
        maxWidth = "common.getXs"
        Box {
            sx {
                marginTop = 32.px
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
                +"Sign in"
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
                    +"Sign In"
                }
                AlternativeSignLink {
                    to = PATH_SIGN_UP
                    text = "Don't have an account? Sign Up"
                }
            }
        }
    }
}
