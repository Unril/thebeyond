package game.scenes

import Phaser.Scene
import constants.SceneKeys

class Background : Scene(SceneKeys.BACKGROUND) {
    override fun create() {
        scene.sendToBack()
    }
}
