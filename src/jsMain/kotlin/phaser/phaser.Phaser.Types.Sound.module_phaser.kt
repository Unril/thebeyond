@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Sound

import Phaser.Sound.BaseSound
import Phaser.Sound.BaseSoundManager

external interface AudioSpriteSound {
    var spritemap: Any?
}

external interface DecodeAudioConfig {
    var key: String
    var data: dynamic /* ArrayBuffer | String */
        get() = definedExternally
        set(value) = definedExternally
}

typealias EachActiveSoundCallback = (manager: BaseSoundManager, sound: BaseSound, index: Number, sounds: Array<BaseSound>) -> Unit

external interface SoundConfig {
    var mute: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var volume: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var detune: Number?
        get() = definedExternally
        set(value) = definedExternally
    var seek: Number?
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pan: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SoundMarker {
    var name: String
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var config: SoundConfig?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebAudioDecodeEntry {
    var key: String
    var success: Function<*>
    var failure: Function<*>
    var decoding: Boolean
}
