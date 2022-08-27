@file:JsQualifier("Phaser.Utils.String")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Utils.String

external fun Format(string: String, values: Array<Any>): String

external fun Pad(
    str: String?,
    len: Number = definedExternally,
    pad: String = definedExternally,
    dir: Number = definedExternally
): String

external fun Pad(str: String?): String

external fun Pad(str: String?, len: Number = definedExternally): String

external fun Pad(str: String?, len: Number = definedExternally, pad: String = definedExternally): String

external fun Pad(
    str: Number?,
    len: Number = definedExternally,
    pad: String = definedExternally,
    dir: Number = definedExternally
): String

external fun Pad(str: Number?): String

external fun Pad(str: Number?, len: Number = definedExternally): String

external fun Pad(str: Number?, len: Number = definedExternally, pad: String = definedExternally): String

external fun Pad(
    str: Any?,
    len: Number = definedExternally,
    pad: String = definedExternally,
    dir: Number = definedExternally
): String

external fun Pad(str: Any?): String

external fun Pad(str: Any?, len: Number = definedExternally): String

external fun Pad(str: Any?, len: Number = definedExternally, pad: String = definedExternally): String

external fun RemoveAt(string: String, index: Number): String

external fun Reverse(string: String): String

external fun UppercaseFirst(str: String): String

external fun UUID(): String
