package components

import Phaser.Scale.ScaleModes
import csstype.Color
import csstype.FlexDirection
import csstype.Overflow
import csstype.minus
import csstype.px
import csstype.vh
import game.scenes.StartScene
import kotlinx.js.jso
import mui.material.Box
import mui.system.sx
import react.FC
import react.Props
import react.useEffectOnce

class SimpleGame {
    var game: Phaser.Game

    init {
        val config = jso<Phaser.Types.Core.GameConfig> {
            type = Phaser.WEBGL
            backgroundColor = "#000000"
            scale = jso {
                mode = ScaleModes.RESIZE
                parent = "game_element"
                width = "100%"
                height = "100%"
            }
            physics = jso {
                default = "arcade"
                arcade = jso {
                    debug = false
                }
            }
            scene = arrayOf(::StartScene)
        }
        game = Phaser.Game(config)
    }

    fun destroy() {
        game.destroy(true)
    }
}

val Game = FC<Props> {
    useEffectOnce {
        val game = SimpleGame()
        cleanup {
            game.destroy()
        }
    }

    Box {
        sx {
            backgroundColor = Color("red")
            flexDirection = FlexDirection.column
        }
        Box {
            sx {
                overflow = Overflow.hidden
                margin = 0.px
                padding = 0.px
                height = 100.vh - 64.px
                backgroundColor = Color("green")
            }
            id = "game_element"
        }
    }
}
