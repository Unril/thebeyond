@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Textures

import org.khronos.webgl.Uint8Array
import tsstdlib.GLenum

external interface CompressedTextureData {
    var compressed: Boolean
    var generateMipmap: Boolean
    var width: Number
    var height: Number
    var internalFormat: GLenum
    var mipmaps: Array<MipmapType>
}

external interface MipmapType {
    var width: Number
    var height: Number
    var data: Uint8Array
}

external interface PixelConfig {
    var x: Number
    var y: Number
    var color: Number
    var alpha: Number
}

external interface SpriteSheetConfig {
    var frameWidth: Number
    var frameHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var margin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spacing: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpriteSheetFromAtlasConfig {
    var atlas: String
    var frame: String
    var frameWidth: Number
    var frameHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var margin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spacing: Number?
        get() = definedExternally
        set(value) = definedExternally
}
