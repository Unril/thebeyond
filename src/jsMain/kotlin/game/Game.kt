package game

import Phaser.Math.Vector2
import Phaser.Scale.ScaleModes
import Phaser.Types.Core.GameConfig
import Phaser.WEBGL
import game.scenes.Preloader
import game.scenes.Main
import game.scenes.Background
import game.scenes.DebugInfo
import kotlinx.js.jso

class Game {
    companion object {
        const val PARENT_ELEMENT = "game_element"
    }

    var game: Phaser.Game

    init {
        val config = jso<GameConfig> {
            type = WEBGL
            backgroundColor = "#000000"
            scale = jso {
                mode = ScaleModes.RESIZE
                parent = "game_element"
                width = "100%"
                height = "100%"
            }
            physics = jso {
                default = "matter"
                matter = jso {
                    debug = true
                    gravity = Vector2(0, 0)
                    setBounds = false
                }
            }
            scene = arrayOf(::Preloader, ::Background, ::Main, ::DebugInfo)
        }
        game = Phaser.Game(config)
    }

    fun destroy() {
        game.destroy(true)
    }
}
