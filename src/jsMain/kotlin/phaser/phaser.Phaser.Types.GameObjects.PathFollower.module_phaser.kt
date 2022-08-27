@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.GameObjects.PathFollower

external interface PathConfig {
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var from: Number?
        get() = definedExternally
        set(value) = definedExternally
    var to: Number?
        get() = definedExternally
        set(value) = definedExternally
    var positionOnPath: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rotateToPath: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rotationOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAt: Number?
        get() = definedExternally
        set(value) = definedExternally
}
