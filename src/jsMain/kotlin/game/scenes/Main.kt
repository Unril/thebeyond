package game.scenes

import Phaser.GameObjects.Shader
import Phaser.Scene
import constants.AtlasFrames
import constants.AtlasKeys
import constants.SceneKeys
import constants.ShaderKeys

class Main : Scene(SceneKeys.MAIN) {
    private lateinit var _cursors: Phaser.Types.Input.Keyboard.CursorKeys
    private lateinit var _player: Phaser.GameObjects.Sprite

    private lateinit var _stars: Shader

    override fun create() {
        _stars = add.shader(ShaderKeys.STARS, 0, 0, scale.gameSize.width, scale.gameSize.height)
            .setOrigin(0, 0)
            .setScrollFactor(0, 0)

        _player = add.sprite(100, 100, AtlasKeys.SPACE_SHOOTER, AtlasFrames.SPACE_SHOOTER_PLAYER_SHIP_1_BLUE)
        cameras.main.startFollow(_player, false, 0.05, 0.05)

        _cursors = input.keyboard.createCursorKeys()

        physics.add.existing(_player, false)

        scale.on("resize", ::resize, this)
    }

    override fun update(time: Number, delta: Number) {
        val body: Phaser.Physics.Arcade.Body = _player.body
        body.setVelocity(0);

        _stars.setUniform("mouse.value", cameras.main.midPoint)

        val vel = 500
        if (_cursors.left.isDown) {
            _player.setAngle(-90)
            body.setVelocityX(-vel)
        } else if (_cursors.right.isDown) {
            _player.setAngle(90)
            body.setVelocityX(vel);
        }

        if (_cursors.up.isDown) {
            _player.setAngle(0)
            body.setVelocityY(-vel);
        } else if (_cursors.down.isDown) {
            _player.setAngle(180)
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

        cameras.resize(width, height)
        _stars.setDisplaySize(width, height)
    }
}
