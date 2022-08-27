@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Input.Keyboard

import Phaser.Input.Keyboard.Key
import org.w3c.dom.events.KeyboardEvent

external interface CursorKeys {
    var up: Key
    var down: Key
    var left: Key
    var right: Key
    var space: Key
    var shift: Key
}

typealias KeyboardKeydownCallback = (event: KeyboardEvent) -> Unit

external interface KeyComboConfig {
    var resetOnWrongKey: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxKeyDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var resetOnMatch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var deleteOnMatch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}
