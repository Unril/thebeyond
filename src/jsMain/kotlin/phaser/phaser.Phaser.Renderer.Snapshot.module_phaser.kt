@file:JsQualifier("Phaser.Renderer.Snapshot")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Renderer.Snapshot

import Phaser.Types.Renderer.Snapshot.SnapshotState
import org.khronos.webgl.WebGLRenderingContext
import org.w3c.dom.HTMLCanvasElement

external fun Canvas(sourceCanvas: HTMLCanvasElement, config: SnapshotState)

external fun WebGL(sourceContext: WebGLRenderingContext, config: SnapshotState)
