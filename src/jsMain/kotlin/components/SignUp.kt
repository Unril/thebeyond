package components

import common.PATH_SIGN_IN
import common.formData
import common.sm
import common.xs
import csstype.*
import entities.NewUser
import mui.material.*
import mui.material.styles.TypographyVariant
import mui.system.responsive
import mui.system.sx
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ButtonType
import react.dom.html.InputType
import react.dom.html.ReactHTML

private const val ID_FIRST_NAME = "firstName"
private const val ID_LAST_NAME = "lastName"
private const val ID_EMAIL = "email"
private const val ID_PASSWORD = "password"

external interface SignUpProps : Props {
    var onSubmit: (NewUser) -> Unit
}

val SignUp = FC<SignUpProps> { props ->
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
                    +"account_circle_outlined"
                }
            }
            Typography {
                variant = TypographyVariant.h5
                +"Sign up"
            }
            Box {
                component = ReactHTML.form
                onSubmit = { e ->
                    val data = e.formData()
                    props.onSubmit(
                        NewUser(
                            firstName = data[ID_FIRST_NAME],
                            lastName = data[ID_LAST_NAME],
                            email = data[ID_EMAIL],
                            password = data[ID_PASSWORD]
                        )
                    )
                }
                sx {
                    marginTop = 1.px
                }
                Grid {
                    container = true
                    spacing = responsive(2)
                    Grid {
                        item = true
                        xs = 12
                        sm = 6
                        TextField {
                            margin = FormControlMargin.normal
                            required = true
                            fullWidth = true
                            autoFocus = true
                            id = ID_FIRST_NAME
                            name = ID_FIRST_NAME
                            autoComplete = "given-name"
                            label = ReactNode("First Name")
                        }
                    }
                    Grid {
                        item = true
                        xs = 12
                        sm = 6
                        TextField {
                            margin = FormControlMargin.normal
                            required = true
                            fullWidth = true
                            id = ID_LAST_NAME
                            name = ID_LAST_NAME
                            autoComplete = "family-name"
                            label = ReactNode("Last Name")
                        }
                    }
                }
                Grid {
                    item = true
                    xs = 12
                    TextField {
                        margin = FormControlMargin.normal
                        required = true
                        fullWidth = true
                        id = ID_EMAIL
                        name = ID_EMAIL
                        autoComplete = "email"
                        label = ReactNode("Email Address")
                    }
                }
                Grid {
                    item = true
                    xs = 12
                    TextField {
                        margin = FormControlMargin.normal
                        type = InputType.password
                        required = true
                        fullWidth = true
                        id = ID_PASSWORD
                        name = ID_PASSWORD
                        autoComplete = "new-password"
                        label = ReactNode("Password")
                    }
                }
                Button {
                    type = ButtonType.submit
                    fullWidth = true
                    variant = ButtonVariant.contained
                    sx {
                        marginTop = 16.px
                        marginBottom = 16.px
                    }
                    +"Sign Up"
                }
                AlternativeSignLink {
                    to = PATH_SIGN_IN
                    text = "Already have an account? Sign in"
                }
            }
        }
    }
}
