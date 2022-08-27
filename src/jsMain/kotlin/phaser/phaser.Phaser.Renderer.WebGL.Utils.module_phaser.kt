@file:JsQualifier("Phaser.Renderer.WebGL.Utils")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Renderer.WebGL.Utils

import org.khronos.webgl.WebGLRenderingContext

external fun getTintFromFloats(r: Number, g: Number, b: Number, a: Number): Number

external fun getTintAppendFloatAlpha(rgb: Number, a: Number): Number

external fun getTintAppendFloatAlphaAndSwap(rgb: Number, a: Number): Number

external fun getFloatsFromUintRGB(rgb: Number): Array<Any>

external fun checkShaderMax(gl: WebGLRenderingContext, maxTextures: Number): Number

external fun parseFragmentShaderMaxTextures(fragmentShaderSource: String, maxTextures: Number): String
