@file:JsQualifier("Phaser.Math.Snap")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Math.Snap

external fun Ceil(
    value: Number,
    gap: Number,
    start: Number = definedExternally,
    divide: Boolean = definedExternally
): Number

external fun Floor(
    value: Number,
    gap: Number,
    start: Number = definedExternally,
    divide: Boolean = definedExternally
): Number

external fun To(
    value: Number,
    gap: Number,
    start: Number = definedExternally,
    divide: Boolean = definedExternally
): Number
