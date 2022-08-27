@file:JsQualifier("Phaser.Utils.Array.Matrix")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Utils.Array.Matrix

external fun <T> CheckMatrix(matrix: Array<Array<T>> = definedExternally): Boolean

external fun <T> MatrixToString(matrix: Array<Array<T>> = definedExternally): String

external fun <T> ReverseColumns(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> ReverseRows(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> Rotate180(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> RotateLeft(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> RotateMatrix(
    matrix: Array<Array<T>> = definedExternally,
    direction: Number = definedExternally
): Array<Array<T>>

external fun <T> RotateMatrix(): Array<Array<T>>

external fun <T> RotateMatrix(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> RotateMatrix(
    matrix: Array<Array<T>> = definedExternally,
    direction: String = definedExternally
): Array<Array<T>>

external fun <T> RotateRight(matrix: Array<Array<T>> = definedExternally): Array<Array<T>>

external fun <T> Translate(
    matrix: Array<Array<T>> = definedExternally,
    x: Number = definedExternally,
    y: Number = definedExternally
): Array<Array<T>>

external fun <T> TransposeMatrix(array: Array<Array<T>> = definedExternally): Array<Array<T>>
