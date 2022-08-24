package components

import common.to
import csstype.JustifyContent
import mui.material.Grid
import mui.material.Link
import mui.material.styles.TypographyVariant
import mui.system.sx
import react.FC
import react.Props

external interface AlternativeSignLinkProps : Props {
    var to: String
    var text: String
}

val AlternativeSignLink = FC<AlternativeSignLinkProps> { props ->
    Grid {
        container = true
        sx {
            justifyContent = JustifyContent.flexEnd
        }
        Grid {
            item = true
            Link {
                component = react.router.dom.Link
                to = props.to
                variant = TypographyVariant.body2
                +props.text
            }
        }
    }
}
