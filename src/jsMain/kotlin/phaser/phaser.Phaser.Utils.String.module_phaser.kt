@file:JsQualifier("Phaser.Utils.String")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Utils.String

/**
 * Takes a string and replaces instances of markers with values in the given array.
 * The markers take the form of `%1`, `%2`, etc. I.e.:
 *
 * `Format("The %1 is worth %2 gold", [ 'Sword', 500 ])`
 * @param string The string containing the replacement markers.
 * @param values An array containing values that will replace the markers. If no value exists an empty string is inserted instead.
 */
external fun Format(string: String, values: Array<Any>): String

/**
 * Takes the given string and pads it out, to the length required, using the character
 * specified. For example if you need a string to be 6 characters long, you can call:
 *
 * `pad('bob', 6, '-', 2)`
 *
 * This would return: `bob---` as it has padded it out to 6 characters, using the `-` on the right.
 *
 * You can also use it to pad numbers (they are always returned as strings):
 *
 * `pad(512, 6, '0', 1)`
 *
 * Would return: `000512` with the string padded to the left.
 *
 * If you don't specify a direction it'll pad to both sides:
 *
 * `pad('c64', 7, '*')`
 *
 * Would return: `**c64**`
 * @param str The target string. `toString()` will be called on the string, which means you can also pass in common data types like numbers.
 * @param len The number of characters to be added. Default 0.
 * @param pad The string to pad it out with (defaults to a space). Default " ".
 * @param dir The direction dir = 1 (left), 2 (right), 3 (both). Default 3.
 */
external fun Pad(
    str: String,
    len: Number? = definedExternally,
    pad: String? = definedExternally,
    dir: Number? = definedExternally
): String

external fun Pad(
    str: Number,
    len: Number? = definedExternally,
    pad: String? = definedExternally,
    dir: Number? = definedExternally
): String

external fun Pad(
    str: Any,
    len: Number? = definedExternally,
    pad: String? = definedExternally,
    dir: Number? = definedExternally
): String

/**
 * Takes a string and removes the character at the given index.
 * @param string The string to be worked on.
 * @param index The index of the character to be removed.
 */
external fun RemoveAt(string: String, index: Number): String

/**
 * Takes the given string and reverses it, returning the reversed string.
 * For example if given the string `Atari 520ST` it would return `TS025 iratA`.
 * @param string The string to be reversed.
 */
external fun Reverse(string: String): String

/**
 * Capitalizes the first letter of a string if there is one.
 * @param str The string to capitalize.
 */
external fun UppercaseFirst(str: String): String

/**
 * Creates and returns an RFC4122 version 4 compliant UUID.
 *
 * The string is in the form: `xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx` where each `x` is replaced with a random
 * hexadecimal digit from 0 to f, and `y` is replaced with a random hexadecimal digit from 8 to b.
 */
external fun UUID(): String
