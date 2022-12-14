@file:JsQualifier("Phaser.Display.Masks")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Display.Masks

import Phaser.Cameras.Scene2D.Camera
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Graphics
import Phaser.Renderer.Canvas.CanvasRenderer
import Phaser.Renderer.WebGL.WebGLRenderer
import Phaser.Scene
import org.khronos.webgl.WebGLFramebuffer
import org.khronos.webgl.WebGLTexture

open external class BitmapMask(scene: Scene, renderable: GameObject) {
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var bitmapMask: GameObject
    open var maskTexture: WebGLTexture
    open var mainTexture: WebGLTexture
    open var dirty: Boolean
    open var mainFramebuffer: WebGLFramebuffer
    open var maskFramebuffer: WebGLFramebuffer
    open var invertAlpha: Boolean
    open val isStencil: Boolean
    open var scene: Scene
    open fun createMask()
    open fun clearMask()
    open fun setBitmap(renderable: GameObject)
    open fun preRenderWebGL(renderer: CanvasRenderer, maskedObject: GameObject, camera: Camera)
    open fun preRenderWebGL(renderer: WebGLRenderer, maskedObject: GameObject, camera: Camera)
    open fun postRenderWebGL(renderer: CanvasRenderer)
    open fun postRenderWebGL(renderer: WebGLRenderer)
    open fun preRenderCanvas(renderer: CanvasRenderer, mask: GameObject, camera: Camera)
    open fun preRenderCanvas(renderer: WebGLRenderer, mask: GameObject, camera: Camera)
    open fun postRenderCanvas(renderer: CanvasRenderer)
    open fun postRenderCanvas(renderer: WebGLRenderer)
    open fun destroy()
}

open external class GeometryMask(scene: Scene, graphicsGeometry: Graphics) {
    open var geometryMask: Graphics
    open var invertAlpha: Boolean
    open val isStencil: Boolean
    open fun setShape(graphicsGeometry: Graphics): GeometryMask /* this */
    open fun setInvertAlpha(value: Boolean = definedExternally): GeometryMask /* this */
    open fun preRenderWebGL(renderer: WebGLRenderer, child: GameObject, camera: Camera)
    open fun applyStencil(renderer: WebGLRenderer, camera: Camera, inc: Boolean)
    open fun postRenderWebGL(renderer: WebGLRenderer)
    open fun preRenderCanvas(renderer: CanvasRenderer, mask: GameObject, camera: Camera)
    open fun postRenderCanvas(renderer: CanvasRenderer)
    open fun destroy()
}
