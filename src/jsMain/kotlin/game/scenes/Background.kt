package game.scenes

import Phaser.GameObjects.Shader
import Phaser.Math.Vector2
import Phaser.Scale.Events.RESIZE
import Phaser.Scene
import Phaser.Structs.Size
import constants.EventKeys
import constants.SceneKeys
import constants.ShaderKeys
import game.*

class Background : Scene(SceneKeys.BACKGROUND) {
    private lateinit var _stars: Shader

    override fun create() {
        scene.sendToBack()

        _stars = add.shader(ShaderKeys.STARS, 0, 0, scale.gameSize.width, scale.gameSize.height)
            .setOrigin(0, 0)

        scale.on(RESIZE, { gameSize: Size ->
            val (width, height) = gameSize
            _stars.setDisplaySize(width, height)
        })

        game.events.on(EventKeys.MOVE_BACKGROUND, ::onMoveBackground, this)
    }

    private fun onMoveBackground(position: Vector2) {
        _stars.setUniform("mouse.value", position)
    }
}
