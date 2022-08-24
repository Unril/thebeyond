package components

import mui.material.Typography
import react.FC
import react.Props
import react.useEffectOnce

val Configuration = FC<Props> {
    println("conf")
    useEffectOnce {
        println("conf start")
        cleanup {
            println("conf end")
        }
    }
    Typography {
        +"Configuration!"
    }
}
