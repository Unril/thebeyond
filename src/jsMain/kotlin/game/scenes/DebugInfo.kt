package game.scenes

import Phaser.GameObjects.BitmapText
import Phaser.Scene
import constants.BitmapFontKeys
import constants.SceneKeys

class DebugInfo : Scene(SceneKeys.DEBUG_INFO) {
    private lateinit var _text: BitmapText

    override fun create() {
        _text = add.bitmapText(10, 10, BitmapFontKeys.ROBOTO_WHITE, "", 16)
            .setOrigin(0, 0)
            .setScrollFactor(0, 0)

        scene.bringToTop()
    }

    override fun update(time: Number, delta: Number) {
        val fps = game.loop.actualFps.toInt()
        _text.setText("FPS: $fps")
    }
}
