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
    private lateinit var _player: Phaser.GameObjects.Sprite

    override fun create() {
        _player = add.sprite(100, 100, AtlasKeys.SPACE_SHOOTER, AtlasFrames.SPACE_SHOOTER_PLAYER_SHIP_1_BLUE)
        cameras.main.startFollow(_player, true, 0.05, 0.05)

        _cursors = input.keyboard.createCursorKeys()
        physics.add.existing(_player, false)

        cameras.main.on(FOLLOW_UPDATE, ::onFollowUpdate, this)
    }

    private fun onFollowUpdate(camera: BaseCamera) {
        game.events.emit(EventKeys.MOVE_BACKGROUND, camera.midPoint)
    }

    override fun update(time: Number, delta: Number) {
        val body: Phaser.Physics.Arcade.Body = _player.body
        body.setVelocity(0);

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
}
