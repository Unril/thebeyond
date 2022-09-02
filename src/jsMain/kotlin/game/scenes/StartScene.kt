package game.scenes

import Phaser.GameObjects.BitmapText
import Phaser.GameObjects.Shader
import Phaser.GameObjects.Text
import Phaser.Scene
import Phaser.Types.Loader.FileTypes.BitmapFontFileConfig
import constants.SceneKeys
import constants.SpritesheetKeys
import kotlinx.js.jso

class StartScene : Scene(SceneKeys.START) {
    private lateinit var _cursors: Phaser.Types.Input.Keyboard.CursorKeys
    private lateinit var _player: Phaser.GameObjects.Sprite

    private lateinit var _stars: Shader
    private lateinit var _debugText: BitmapText

    override fun preload() {
        load.glsl(
            "stars",
            "assets/shaders/stars.frag"
        )
        load.atlasXML(
            SpritesheetKeys.SPACE_SHOOTER,
            "assets/spritesheet/space_shooter.png",
            "assets/spritesheet/space_shooter.xml"
        )
        load.bitmapFont(jso<BitmapFontFileConfig> {
            key = "font_roboto"
            textureURL = "assets/fonts/bitmap/roboto_white.png"
            fontDataURL = "assets/fonts/bitmap/roboto.xml"
        })
    }

    override fun create() {
        _stars = add.shader("stars", 0, 0, scale.gameSize.width, scale.gameSize.height)
            .setOrigin(0, 0)
            .setScrollFactor(0, 0)

        _debugText = this.add.bitmapText(10, 10, "font_roboto", "0.0", 16)
            .setOrigin(0, 0)
            .setScrollFactor(0, 0)

        _player = add.sprite(100, 100, SpritesheetKeys.SPACE_SHOOTER, "playerShip1_blue.png")
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

        _debugText.setText(game.loop.actualFps.toString())
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
