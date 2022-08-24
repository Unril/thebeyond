package components

import mui.material.Box
import mui.material.Typography
import react.FC
import react.Props
import react.useEffectOnce

val Home = FC<Props> {
    println("home")
    useEffectOnce {
        println("home start")
        cleanup {
            println("home end")
        }
    }
    Box {
        Typography {
            +"Hello world!"
        }
    }
}
