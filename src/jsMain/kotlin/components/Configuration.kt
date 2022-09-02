package components

import csstype.px
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.await
import kotlinx.coroutines.launch
import mui.material.Box
import mui.material.Stack
import mui.material.TextField
import mui.material.Typography
import mui.material.styles.TypographyVariant
import mui.system.sx
import react.FC
import react.Props
import react.dom.html.ReactHTML.img
import react.useEffectOnce
import react.useState

val Configuration = FC<Props> {
    val (text, setText) = useState("");
    useEffectOnce {
        MainScope().launch {
            val body = window.fetch("assets/spritesheet/space_shooter.xml").await().text().await()
            setText(body)
        }
    }
    Stack {
        Typography {
            variant = TypographyVariant.h4
            +"Configuration!"
        }
        img {
            src = "assets/spritesheet/space_shooter.png"
            width = 128.0
        }
        TextField {
            rows = 12
            multiline = true
            value = text
        }
    }
}
