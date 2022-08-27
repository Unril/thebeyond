@file:JsQualifier("Phaser.Display.Canvas.CanvasPool")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Display.Canvas.CanvasPool

import org.w3c.dom.HTMLCanvasElement

external fun create(
    parent: Any,
    width: Number = definedExternally,
    height: Number = definedExternally,
    canvasType: Number = definedExternally,
    selfParent: Boolean = definedExternally
): HTMLCanvasElement

external fun create2D(
    parent: Any,
    width: Number = definedExternally,
    height: Number = definedExternally
): HTMLCanvasElement

external fun createWebGL(
    parent: Any,
    width: Number = definedExternally,
    height: Number = definedExternally
): HTMLCanvasElement

external fun first(canvasType: Number = definedExternally): HTMLCanvasElement

external fun remove(parent: Any)

external fun total(): Number

external fun free(): Number

external fun disableSmoothing()

external fun enableSmoothing()
