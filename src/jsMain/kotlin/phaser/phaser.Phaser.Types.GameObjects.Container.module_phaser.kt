@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.GameObjects.Container

import Phaser.GameObjects.GameObject

external interface `T$5` {
    var children: Array<GameObject>?
        get() = definedExternally
        set(value) = definedExternally
}
