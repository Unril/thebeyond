@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Cameras.Controls

import Phaser.Cameras.Scene2D.Camera
import Phaser.Input.Keyboard.Key

external interface FixedKeyControlConfig {
    var camera: Camera?
        get() = definedExternally
        set(value) = definedExternally
    var left: Key?
        get() = definedExternally
        set(value) = definedExternally
    var right: Key?
        get() = definedExternally
        set(value) = definedExternally
    var up: Key?
        get() = definedExternally
        set(value) = definedExternally
    var down: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomIn: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomOut: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomSpeed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var speed: dynamic /* Number? | Object? */
        get() = definedExternally
        set(value) = definedExternally
    var minZoom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxZoom: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SmoothedKeyControlConfig {
    var camera: Camera?
        get() = definedExternally
        set(value) = definedExternally
    var left: Key?
        get() = definedExternally
        set(value) = definedExternally
    var right: Key?
        get() = definedExternally
        set(value) = definedExternally
    var up: Key?
        get() = definedExternally
        set(value) = definedExternally
    var down: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomIn: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomOut: Key?
        get() = definedExternally
        set(value) = definedExternally
    var zoomSpeed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var acceleration: dynamic /* Number? | Object? */
        get() = definedExternally
        set(value) = definedExternally
    var drag: dynamic /* Number? | Object? */
        get() = definedExternally
        set(value) = definedExternally
    var maxSpeed: dynamic /* Number? | Object? */
        get() = definedExternally
        set(value) = definedExternally
    var minZoom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxZoom: Number?
        get() = definedExternally
        set(value) = definedExternally
}
