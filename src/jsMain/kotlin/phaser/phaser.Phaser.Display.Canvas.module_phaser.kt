@file:JsQualifier("Phaser.Display.Canvas")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Display.Canvas

import org.w3c.dom.HTMLCanvasElement

external fun TouchAction(canvas: HTMLCanvasElement, value: String = definedExternally): HTMLCanvasElement

external fun UserSelect(canvas: HTMLCanvasElement, value: String = definedExternally): HTMLCanvasElement
