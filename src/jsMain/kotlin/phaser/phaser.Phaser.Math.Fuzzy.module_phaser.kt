@file:JsQualifier("Phaser.Math.Fuzzy")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Math.Fuzzy

external fun Ceil(value: Number, epsilon: Number = definedExternally): Number

external fun Equal(a: Number, b: Number, epsilon: Number = definedExternally): Boolean

external fun Floor(value: Number, epsilon: Number = definedExternally): Number

external fun GreaterThan(a: Number, b: Number, epsilon: Number = definedExternally): Boolean

external fun LessThan(a: Number, b: Number, epsilon: Number = definedExternally): Boolean
