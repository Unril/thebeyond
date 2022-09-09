package game.scenes

import Phaser.Cameras.Scene2D.BaseCamera
import Phaser.Cameras.Scene2D.Events.FOLLOW_UPDATE
import Phaser.Scene
import constants.AtlasFrames
import constants.AtlasKeys
import constants.EventKeys
import constants.SceneKeys

class Main : Scene(SceneKeys.MAIN) {
    private lateinit var _cursors: Phaser.Types.Input.Keyboard.CursorKeys
    private lateinit var _player: Phaser.Physics.Matter.Image

    override fun create() {
        _player = matter.add.image(
            scale.width.toDouble() / 2,
            scale.height.toDouble() / 2,
            AtlasKeys.SPACE_SHOOTER,
            AtlasFrames.SPACE_SHOOTER_PLAYER_SHIP_1_BLUE
        )
        _player.setMass(1)
        _player.setFriction(0)
        _player.setDataEnabled()
        _player.setData("avel", 0.0)

        cameras.main.startFollow(_player, true, 0.05, 0.05)

        _cursors = input.keyboard.createCursorKeys()

        cameras.main.on(FOLLOW_UPDATE, ::onFollowUpdate, this)
    }

    private fun onFollowUpdate(camera: BaseCamera) {
        game.events.emit(EventKeys.MOVE_BACKGROUND, camera.midPoint)
    }

    override fun update(time: Number, delta: Number) {
        val linAcc = 0.001
        val angAcc = 0.001

        var avel = _player.getData("avel").unsafeCast<Double>()
        if (_cursors.left.isDown) {
            avel += angAcc
        } else if (_cursors.right.isDown) {
            avel -= angAcc
        }
        _player.setData("avel", avel)
        _player.setAngularVelocity(avel)

        if (_cursors.up.isDown) {
            _player.thrustLeft(linAcc)
        } else {
            _player.thrustLeft(0)
        }
    }
}
