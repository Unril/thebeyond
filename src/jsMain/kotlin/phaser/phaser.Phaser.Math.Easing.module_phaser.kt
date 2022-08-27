@file:JsQualifier("Phaser.Math.Easing")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Math.Easing

external fun Linear(v: Number): Number

external fun Stepped(v: Number, steps: Number = definedExternally): Number
