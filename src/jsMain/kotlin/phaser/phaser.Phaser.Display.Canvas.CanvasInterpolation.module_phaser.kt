@file:JsQualifier("Phaser.Display.Canvas.CanvasInterpolation")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Display.Canvas.CanvasInterpolation

import org.w3c.dom.HTMLCanvasElement

external fun setCrisp(canvas: HTMLCanvasElement): HTMLCanvasElement

external fun setBicubic(canvas: HTMLCanvasElement): HTMLCanvasElement
