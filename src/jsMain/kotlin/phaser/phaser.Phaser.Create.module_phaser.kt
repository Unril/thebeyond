@file:JsQualifier("Phaser.Create")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Create

import Phaser.Types.Create.GenerateTextureConfig
import org.w3c.dom.HTMLCanvasElement

external fun GenerateTexture(config: GenerateTextureConfig): HTMLCanvasElement
