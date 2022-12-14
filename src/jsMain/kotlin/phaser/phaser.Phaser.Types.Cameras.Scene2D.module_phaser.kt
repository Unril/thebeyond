@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Cameras.Scene2D

import Phaser.Cameras.Scene2D.Camera

external interface CameraConfig {

    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var zoom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var roundPixels: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scrollX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scrollY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* Boolean? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var bounds: Any?
        get() = definedExternally
        set(value) = definedExternally
}


inline operator fun CameraConfig.get(key: String): Number? = asDynamic()[key]


inline operator fun CameraConfig.set(key: String, value: Number?) {
    asDynamic()[key] = value
}

typealias CameraFadeCallback = (camera: Camera, progress: Number) -> Unit

typealias CameraFlashCallback = (camera: Camera, progress: Number) -> Unit

typealias CameraPanCallback = (camera: Camera, progress: Number, x: Number, y: Number) -> Unit

typealias CameraShakeCallback = (camera: Camera, progress: Number) -> Unit

typealias CameraZoomCallback = (camera: Camera, progress: Number, zoom: Number) -> Unit

external interface JSONCamera {
    var name: String
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var zoom: Number
    var rotation: Number
    var roundPixels: Boolean
    var scrollX: Number
    var scrollY: Number
    var backgroundColor: String
    var bounds: JSONCameraBounds?
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONCameraBounds {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}
