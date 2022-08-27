@file:JsQualifier("Phaser.Textures.Parsers")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Textures.Parsers

import Phaser.Types.Textures.CompressedTextureData
import org.khronos.webgl.ArrayBuffer

external fun KTXParser(data: ArrayBuffer): CompressedTextureData

external fun PVRParser(data: ArrayBuffer): CompressedTextureData
