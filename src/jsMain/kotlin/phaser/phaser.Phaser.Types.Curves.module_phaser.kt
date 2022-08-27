@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Curves

external interface EllipseCurveConfig {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var xRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var clockwise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONCurve {
    var type: String
    var points: Array<Number>
}

external interface JSONEllipseCurve {
    var type: String
    var x: Number
    var y: Number
    var xRadius: Number
    var yRadius: Number
    var startAngle: Number
    var endAngle: Number
    var clockwise: Boolean
    var rotation: Number
}

external interface JSONPath {
    var type: String
    var x: Number
    var y: Number
    var autoClose: Boolean
    var curves: Array<JSONCurve>
}
