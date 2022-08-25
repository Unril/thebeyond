package components

import mui.material.Typography
import mui.material.styles.TypographyVariant
import react.FC
import react.Props

val Configuration = FC<Props> {
    Typography {
        variant = TypographyVariant.h4
        +"Configuration!"
    }
}
