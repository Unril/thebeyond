@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Renderer.WebGL

import Phaser.Game
import tsstdlib.GLenum

external interface RenderTargetConfig {
    var scale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minFilter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var autoClear: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebGLConst {
    var enum: GLenum
    var size: Number
}

external interface WebGLPipelineAttribute {
    var name: String
    var size: Number
    var type: GLenum
    var offset: Number
    var normalized: Boolean
    var enabled: Boolean
    var location: Number
}

external interface WebGLPipelineAttributeConfig {
    var name: String
    var size: Number
    var type: WebGLConst
    var normalized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebGLPipelineConfig {
    var game: Game
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var topology: GLenum?
        get() = definedExternally
        set(value) = definedExternally
    var vertShader: String?
        get() = definedExternally
        set(value) = definedExternally
    var fragShader: String?
        get() = definedExternally
        set(value) = definedExternally
    var batchSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var vertexSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var vertices: dynamic /* Array<Number>? | Float32Array? */
        get() = definedExternally
        set(value) = definedExternally
    var attributes: Array<WebGLPipelineAttributeConfig>?
        get() = definedExternally
        set(value) = definedExternally
    var shaders: Array<WebGLPipelineShaderConfig>?
        get() = definedExternally
        set(value) = definedExternally
    var forceZero: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderTarget: dynamic /* Boolean? | Number? | Array<Phaser.Types.Renderer.WebGL.RenderTargetConfig>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebGLPipelineShaderConfig {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var vertShader: String?
        get() = definedExternally
        set(value) = definedExternally
    var fragShader: String?
        get() = definedExternally
        set(value) = definedExternally
    var attributes: Array<WebGLPipelineAttributeConfig>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebGLPipelineUniformsConfig {
    var name: String
    var location: Number
    var value1: Number?
        get() = definedExternally
        set(value) = definedExternally
    var value2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var value3: Number?
        get() = definedExternally
        set(value) = definedExternally
    var value4: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface WebGLTextureCompression {
    var ASTC: Any?
    var ATC: Any?
    var BPTC: Any?
    var ETC: Any?
    var ETC1: Any?
    var IMG: Any?
    var PVRTC: Any?
    var RGTC: Any?
    var S3TC: Any?
    var S3TCRGB: Any?
}
