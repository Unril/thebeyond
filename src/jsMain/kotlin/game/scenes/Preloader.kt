package game.scenes

import Phaser.Scene
import constants.BitmapFontKeys
import constants.AtlasKeys
import constants.SceneKeys
import constants.ShaderKeys

class Preloader : Scene(SceneKeys.PRELOADER) {
    override fun preload() {
        load.glsl(
            ShaderKeys.STARS,
            "assets/shaders/stars.frag"
        )
        load.atlasXML(
            AtlasKeys.SPACE_SHOOTER,
            "assets/spritesheet/space_shooter.png",
            "assets/spritesheet/space_shooter.xml"
        )
        load.bitmapFont(
            BitmapFontKeys.ROBOTO_WHITE,
            "assets/fonts/bitmap/roboto_white.png",
            "assets/fonts/bitmap/roboto.xml"
        )
    }

    override fun create() {
        scene.run(SceneKeys.BACKGROUND)
        scene.run(SceneKeys.MAIN)
        scene.run(SceneKeys.DEBUG_INFO)
        scene.stop()
    }
}
