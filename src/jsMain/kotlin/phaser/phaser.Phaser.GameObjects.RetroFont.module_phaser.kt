@file:JsQualifier("Phaser.GameObjects.RetroFont")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.GameObjects.RetroFont

import Phaser.Scene
import Phaser.Types.GameObjects.BitmapText.BitmapFontData
import Phaser.Types.GameObjects.BitmapText.RetroFontConfig

external var TEXT_SET1: String

external var TEXT_SET2: String

external var TEXT_SET3: String

external var TEXT_SET4: String

external var TEXT_SET5: String

external var TEXT_SET6: String

external var TEXT_SET7: String

external var TEXT_SET8: String

external var TEXT_SET9: String

external var TEXT_SET10: String

external var TEXT_SET11: String

external fun Parse(scene: Scene, config: RetroFontConfig): BitmapFontData
