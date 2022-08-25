package components

import csstype.AlignItems
import csstype.Display
import csstype.FlexDirection
import csstype.px
import mui.material.Box
import mui.material.Container
import mui.material.Typography
import mui.material.styles.TypographyVariant
import mui.system.sx
import react.FC
import react.Props

val NotFound = FC<Props> {
    Container {
        maxWidth = "xs"
        Box {
            sx {
                marginTop = 32.px
                display = Display.flex
                flexDirection = FlexDirection.column
                alignItems = AlignItems.center
            }
            Typography {
                variant = TypographyVariant.h4
                +"There's nothing here!"
            }
        }
    }
}
