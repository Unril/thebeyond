package components

import Phaser.Scale.ScaleModes
import Phaser.Scene
import csstype.*
import emotion.react.css
import kotlinx.browser.document
import kotlinx.js.jso
import mui.material.Box
import mui.system.sx
import org.w3c.dom.HTMLCanvasElement
import react.FC
import react.Props
import react.dom.html.ReactHTML.canvas
import react.useEffectOnce

class SimpleScene : Scene() {
    lateinit var cursors: Phaser.Types.Input.Keyboard.CursorKeys
    lateinit var player: Phaser.GameObjects.Rectangle

    override fun create() {
        player = add.rectangle(100, 100, 64, 64, 0xffffff)
        physics.add.existing(player, false)
        cursors = input.keyboard.createCursorKeys()
        val body: Phaser.Physics.Arcade.Body = player.body
        body.setCollideWorldBounds(true)

        this.scale.on("resize", ::resize, this);
    }

    override fun update(time: Number, delta: Number) {
        val body: Phaser.Physics.Arcade.Body = player.body
        body.setVelocity(0);

        val vel = 500
        if (cursors.left.isDown) {
            body.setVelocityX(-vel);
        } else if (cursors.right.isDown) {
            body.setVelocityX(vel);
        }

        if (cursors.up.isDown) {
            body.setVelocityY(-vel);
        } else if (cursors.down.isDown) {
            body.setVelocityY(vel);
        }
    }

    fun resize(
        gameSize: Phaser.Structs.Size,
        baseSize: Phaser.Structs.Size,
        displaySize: Phaser.Structs.Size,
        resolution: Number
    ) {
        val width = gameSize.width
        val height = gameSize.height
        println("resize $width $height")
        cameras.resize(width, height)
        physics.world.setBounds(0, 0, width, height)
    }
}

class SimpleGame {
    var game: Phaser.Game

    init {
        val config = jso<Phaser.Types.Core.GameConfig> {
            type = Phaser.AUTO
            backgroundColor = "#0072bc"
            scale = jso {
                mode = ScaleModes.RESIZE
                parent = "game_element"
                width = "100%"
                height = "100%"
            }
            physics = jso {
                default = "arcade"
                arcade = jso {
                    debug = true
                }
            }
            scene = ::SimpleScene
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
