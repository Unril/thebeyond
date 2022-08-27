@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.GameObjects.Mesh

external interface `T$7` {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var frame: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var vertices: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var uvs: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var indicies: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var containsZ: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var normals: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var colors: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var alphas: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
}
