@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.GameObjects.Graphics

external interface FillStyle {
    var color: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineStyle {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$6` {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RoundedRectRadius {
    var tl: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tr: Number?
        get() = definedExternally
        set(value) = definedExternally
    var br: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bl: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Styles {
    var lineStyle: LineStyle?
        get() = definedExternally
        set(value) = definedExternally
    var fillStyle: FillStyle?
        get() = definedExternally
        set(value) = definedExternally
}
