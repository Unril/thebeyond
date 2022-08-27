@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.GameObjects.BitmapText

import Phaser.GameObjects.DynamicBitmapText

external interface `T$1` {

}


inline operator fun `T$1`.get(key: String): Number? = asDynamic()[key]


inline operator fun `T$1`.set(key: String, value: Number) {
    asDynamic()[key] = value
}

external interface BitmapFontCharacterData {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var centerX: Number
    var centerY: Number
    var xOffset: Number
    var yOffset: Number
    var u0: Number
    var v0: Number
    var u1: Number
    var v1: Number
    var data: Any?
    var kerning: `T$1`
}

external interface `T$2` {

}


inline operator fun `T$2`.get(key: Number): BitmapFontCharacterData? = asDynamic()[key]


inline operator fun `T$2`.set(key: Number, value: BitmapFontCharacterData) {
    asDynamic()[key] = value
}

external interface BitmapFontData {
    var font: String
    var size: Number
    var lineHeight: Number
    var retroFont: Boolean
    var chars: `T$2`
}

external interface BitmapTextCharacter {
    var i: Number
    var char: String
    var code: Number
    var x: Number
    var y: Number
    var w: Number
    var h: Number
    var t: Number
    var r: Number
    var b: Number
    var line: Number
    var glyph: BitmapFontCharacterData
}

external interface `T$3` {
    var font: String?
        get() = definedExternally
        set(value) = definedExternally
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var size: dynamic /* Number? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface BitmapTextLines {
    var shortest: Number
    var longest: Number
    var height: Number
    var lengths: Array<Number>
}

external interface BitmapTextSize {
    var global: GlobalBitmapTextSize
    var local: LocalBitmapTextSize
    var lines: BitmapTextLines
    var characters: Array<BitmapTextCharacter>
    var words: Array<BitmapTextWord>
    var scale: Number
    var scaleX: Number
    var scaleY: Number
    var wrappedText: String
}

external interface BitmapTextWord {
    var x: Number
    var y: Number
    var w: Number
    var h: Number
    var i: Number
    var word: String
}

external interface DisplayCallbackConfig {
    var parent: DynamicBitmapText
    var tint: TintConfig
    var index: Number
    var charCode: Number
    var x: Number
    var y: Number
    var scale: Number
    var rotation: Number
    var data: Any
}

typealias DisplayCallback = (display: DisplayCallbackConfig) -> Unit

external interface GlobalBitmapTextSize {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface `T$4` {
    var font: String
    var text: String
    var fontSize: Number
    var letterSpacing: Number
    var align: Number
}

external interface LocalBitmapTextSize {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface RetroFontConfig {

    var image: String
    var width: Number
    var height: Number
    var chars: String
    var charsPerRow: Number
    var lineSpacing: Number
}


inline operator fun RetroFontConfig.get(key: String): Number? = asDynamic()[key]


inline operator fun RetroFontConfig.set(key: String, value: Number) {
    asDynamic()[key] = value
}

external interface TintConfig {
    var topLeft: Number
    var topRight: Number
    var bottomLeft: Number
    var bottomRight: Number
}
