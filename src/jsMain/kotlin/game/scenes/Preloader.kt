package game.scenes

import Phaser.Scene
import constants.SceneKeys
import constants.SpritesheetKeys
import kotlinx.browser.window

class Preloader : Scene(SceneKeys.PRELOADER) {

    override fun preload() {
        println("Location " + window.location.host)
        println("BaseUrl " + load.baseURL)
        load.setBaseURL("http://localhost:8080/")
//        load.atlasXML(SpritesheetKeys.SPACE_SHOOTER, "assets/spritesheet/space_shooter.png", "assets/spritesheet/space_shooter.xml")
        load.image(SpritesheetKeys.SPACE_SHOOTER, "http://localhost:8080/assets/spritesheet/space_shooter.png")

        scene.run(SceneKeys.START)
    }
}
