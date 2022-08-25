package components

import mui.material.Box
import mui.material.Typography
import mui.material.styles.TypographyVariant
import react.FC
import react.Props

val Home = FC<Props> {
    Box {
        Typography {
            variant = TypographyVariant.h4
            +"Hello world!"
        }
    }
}
