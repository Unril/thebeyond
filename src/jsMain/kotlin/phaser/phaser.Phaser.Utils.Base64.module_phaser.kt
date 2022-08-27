@file:JsQualifier("Phaser.Utils.Base64")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Utils.Base64

import org.khronos.webgl.ArrayBuffer

external fun ArrayBufferToBase64(arrayBuffer: ArrayBuffer, mediaType: String = definedExternally): String

external fun Base64ToArrayBuffer(base64: String): ArrayBuffer
