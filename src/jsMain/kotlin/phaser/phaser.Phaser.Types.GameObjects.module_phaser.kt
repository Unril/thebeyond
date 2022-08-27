@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.GameObjects

import Phaser.GameObjects.Components.TransformMatrix

external interface Face {
    var vertex1: Vertex
    var vertex2: Vertex
    var vertex3: Vertex
    var isCounterClockwise: Boolean
}

external interface GameObjectConfig {
    var x: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flipX: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flipY: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var scrollFactor: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var rotation: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var angle: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var alpha: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var origin: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var scaleMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blendMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var add: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GetCalcMatrixResults {
    var camera: TransformMatrix
    var sprite: TransformMatrix
    var calc: TransformMatrix
}

external interface JSONGameObject {

    var name: String
    var type: String
    var x: Number
    var y: Number
    var scale: Any?
    var origin: Any?
    var flipX: Boolean
    var flipY: Boolean
    var rotation: Number
    var alpha: Number
    var visible: Boolean
    var scaleMode: Number
    var blendMode: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var textureKey: String
    var frameKey: String
    var data: Any?
}


inline operator fun JSONGameObject.get(key: String): Number? = asDynamic()[key]


inline operator fun JSONGameObject.set(key: String, value: Number) {
    asDynamic()[key] = value
}

external interface Vertex {
    var x: Number
    var y: Number
    var z: Number
    var normalX: Number
    var normalY: Number
    var normalZ: Number
    var u: Number
    var v: Number
    var alpha: Number
}
