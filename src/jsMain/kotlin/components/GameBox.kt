package components

import csstype.FlexDirection
import csstype.Overflow
import csstype.minus
import csstype.px
import csstype.vh
import game.Game
import mui.material.Box
import mui.system.sx
import react.FC
import react.Props
import react.useEffectOnce

val GameBox = FC<Props> {
    useEffectOnce {
        val game = Game()
        cleanup {
            game.destroy()
        }
    }

    Box {
        sx {
            flexDirection = FlexDirection.column
        }
        Box {
            sx {
                overflow = Overflow.hidden
                margin = 0.px
                padding = 0.px
                height = 100.vh - 64.px
            }
            id = Game.PARENT_ELEMENT
        }
    }
}
