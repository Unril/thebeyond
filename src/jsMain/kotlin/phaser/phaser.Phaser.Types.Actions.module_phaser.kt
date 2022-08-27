@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Actions

import Phaser.GameObjects.GameObject

typealias CallCallback = (item: GameObject) -> Unit

external interface GridAlignConfig {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cellWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cellHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var position: Number?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
}
