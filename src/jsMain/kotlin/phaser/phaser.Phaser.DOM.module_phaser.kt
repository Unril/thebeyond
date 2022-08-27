@file:JsQualifier("Phaser.DOM")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.DOM

import ContentLoadedCallback
import org.w3c.dom.HTMLElement
import tsstdlib.FrameRequestCallback

external fun AddToDOM(element: HTMLElement, parent: String = definedExternally): HTMLElement

external fun AddToDOM(element: HTMLElement): HTMLElement

external fun AddToDOM(element: HTMLElement, parent: HTMLElement = definedExternally): HTMLElement

external fun DOMContentLoaded(callback: ContentLoadedCallback)

external fun GetInnerHeight(iOS: Boolean): Number

external fun GetScreenOrientation(width: Number, height: Number): String

external fun GetTarget(element: HTMLElement)

external fun ParseXML(data: String): dynamic /* DOMParser | ActiveXObject */

external fun RemoveFromDOM(element: HTMLElement)

open external class RequestAnimationFrame {
    open var isRunning: Boolean
    open var callback: FrameRequestCallback
    open var tick: Number
    open var isSetTimeOut: Boolean
    open var timeOutID: Number
    open var lastTime: Number
    open var target: Number
    open var step: FrameRequestCallback
    open var stepTimeout: Function<*>
    open fun start(callback: FrameRequestCallback, forceSetTimeOut: Boolean, targetFPS: Number)
    open fun stop()
    open fun destroy()
}
