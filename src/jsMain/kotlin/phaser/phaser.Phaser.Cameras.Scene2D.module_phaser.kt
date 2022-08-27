@file:JsQualifier("Phaser.Cameras.Scene2D")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Cameras.Scene2D

import CameraRotateCallback
import Phaser.Cameras.Scene2D.Effects.*
import Phaser.Display.Color
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.Events.EventEmitter
import Phaser.GameObjects.Components.Alpha
import Phaser.GameObjects.Components.Pipeline
import Phaser.GameObjects.Components.Visible
import Phaser.GameObjects.DisplayList
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Group
import Phaser.Geom.Rectangle
import Phaser.Input.Pointer
import Phaser.Math.Vector2
import Phaser.Renderer.Canvas.CanvasRenderer
import Phaser.Renderer.WebGL.Pipelines.PostFXPipeline
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Renderer.WebGL.WebGLRenderer
import Phaser.Scale.ScaleManager
import Phaser.Scene
import Phaser.Scenes.SceneManager
import Phaser.Scenes.Systems
import Phaser.Structs.Size
import Phaser.Types.Cameras.Scene2D.CameraConfig
import Phaser.Types.Cameras.Scene2D.CameraPanCallback
import Phaser.Types.Cameras.Scene2D.JSONCamera
import Phaser.Types.Display.InputColorObject

open external class BaseCamera(x: Number, y: Number, width: Number, height: Number) : EventEmitter, Alpha, Visible {
    open var scene: Scene
    open var sceneManager: SceneManager
    open var scaleManager: ScaleManager
    open var cameraManager: CameraManager
    open val id: Number
    open var name: String
    open var roundPixels: Boolean
    override var visible: Boolean
    open var useBounds: Boolean
    open val worldView: Rectangle
    open var dirty: Boolean
    open var transparent: Boolean
    open var backgroundColor: Color
    override var alpha: Number
    open var disableCull: Boolean
    open val midPoint: Vector2
    open var originX: Number
    open var originY: Number
    open var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    open var renderList: Array<GameObject>
    open fun addToRenderList(child: GameObject)
    open fun setAlpha(value: Number = definedExternally): BaseCamera /* this */
    open fun setOrigin(x: Number = definedExternally, y: Number = definedExternally): BaseCamera /* this */
    open fun getScroll(x: Number, y: Number, out: Vector2 = definedExternally): Vector2
    open fun centerOnX(x: Number): BaseCamera /* this */
    open fun centerOnY(y: Number): BaseCamera /* this */
    open fun centerOn(x: Number, y: Number): BaseCamera /* this */
    open fun centerToBounds(): BaseCamera /* this */
    open fun centerToSize(): BaseCamera /* this */
    open fun <G : Array<GameObject>> cull(renderableObjects: G): G
    open fun <O : Vector2> getWorldPoint(x: Number, y: Number, output: O = definedExternally): O
    open fun ignore(entries: GameObject): BaseCamera /* this */
    open fun ignore(entries: Array<GameObject>): BaseCamera /* this */
    open fun ignore(entries: Group): BaseCamera /* this */
    open fun preRender()
    open fun clampX(x: Number): Number
    open fun clampY(y: Number): Number
    open fun removeBounds(): BaseCamera /* this */
    open fun setAngle(value: Number = definedExternally): BaseCamera /* this */
    open fun setBackgroundColor(color: String = definedExternally): BaseCamera /* this */
    open fun setBackgroundColor(): BaseCamera /* this */
    open fun setBackgroundColor(color: Number = definedExternally): BaseCamera /* this */
    open fun setBackgroundColor(color: InputColorObject = definedExternally): BaseCamera /* this */
    open fun setBounds(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        centerOn: Boolean = definedExternally
    ): BaseCamera /* this */

    open fun getBounds(out: Rectangle = definedExternally): Rectangle
    open fun setName(value: String = definedExternally): BaseCamera /* this */
    open fun setPosition(x: Number, y: Number = definedExternally): BaseCamera /* this */
    open fun setRotation(value: Number = definedExternally): BaseCamera /* this */
    open fun setRoundPixels(value: Boolean): BaseCamera /* this */
    open fun setScene(scene: Scene): BaseCamera /* this */
    open fun setScroll(x: Number, y: Number = definedExternally): BaseCamera /* this */
    open fun setSize(width: Number, height: Number = definedExternally): BaseCamera /* this */
    open fun setViewport(x: Number, y: Number, width: Number, height: Number = definedExternally): BaseCamera /* this */
    open fun setZoom(x: Number = definedExternally, y: Number = definedExternally): BaseCamera /* this */
    open fun setMask(mask: BitmapMask, fixedPosition: Boolean = definedExternally): BaseCamera /* this */
    open fun setMask(mask: BitmapMask): BaseCamera /* this */
    open fun setMask(mask: GeometryMask, fixedPosition: Boolean = definedExternally): BaseCamera /* this */
    open fun setMask(mask: GeometryMask): BaseCamera /* this */
    open fun clearMask(destroyMask: Boolean = definedExternally): BaseCamera /* this */
    override fun setVisible(value: Boolean): BaseCamera /* this */
    open fun toJSON(): JSONCamera
    open fun update(time: Number, delta: Number)
    override fun destroy()
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var scrollX: Number
    open var scrollY: Number
    open var zoom: Number
    open var zoomX: Number
    open var zoomY: Number
    open val centerX: Number
    open val centerY: Number
    open val displayWidth: Number
    open val displayHeight: Number
    override fun clearAlpha(): BaseCamera /* this */
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number

    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Alpha /* this */
}

open external class Camera(x: Number, y: Number, width: Number, height: Number) : BaseCamera, Pipeline {
    open var inputEnabled: Boolean
    open var fadeEffect: Fade
    open var flashEffect: Flash
    open var shakeEffect: Shake
    open var panEffect: Pan
    open var rotateToEffect: RotateTo
    open var zoomEffect: Zoom
    open var lerp: Vector2
    open var followOffset: Vector2
    open var deadzone: Rectangle
    open fun setDeadzone(width: Number = definedExternally, height: Number = definedExternally): Camera /* this */
    open fun fadeIn(
        duration: Number = definedExternally,
        red: Number = definedExternally,
        green: Number = definedExternally,
        blue: Number = definedExternally,
        callback: Function<*> = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun fadeOut(
        duration: Number = definedExternally,
        red: Number = definedExternally,
        green: Number = definedExternally,
        blue: Number = definedExternally,
        callback: Function<*> = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun fadeFrom(
        duration: Number = definedExternally,
        red: Number = definedExternally,
        green: Number = definedExternally,
        blue: Number = definedExternally,
        force: Boolean = definedExternally,
        callback: Function<*> = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun fade(
        duration: Number = definedExternally,
        red: Number = definedExternally,
        green: Number = definedExternally,
        blue: Number = definedExternally,
        force: Boolean = definedExternally,
        callback: Function<*> = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun flash(
        duration: Number = definedExternally,
        red: Number = definedExternally,
        green: Number = definedExternally,
        blue: Number = definedExternally,
        force: Boolean = definedExternally,
        callback: Function<*> = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun shake(
        duration: Number = definedExternally,
        intensity: Number = definedExternally,
        force: Boolean = definedExternally,
        callback: Function<*> = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun shake(): Camera /* this */
    open fun shake(duration: Number = definedExternally): Camera /* this */
    open fun shake(duration: Number = definedExternally, intensity: Number = definedExternally): Camera /* this */
    open fun shake(
        duration: Number = definedExternally,
        intensity: Number = definedExternally,
        force: Boolean = definedExternally
    ): Camera /* this */

    open fun shake(
        duration: Number = definedExternally,
        intensity: Number = definedExternally,
        force: Boolean = definedExternally,
        callback: Function<*> = definedExternally
    ): Camera /* this */

    open fun shake(
        duration: Number = definedExternally,
        intensity: Vector2 = definedExternally,
        force: Boolean = definedExternally,
        callback: Function<*> = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun shake(duration: Number = definedExternally, intensity: Vector2 = definedExternally): Camera /* this */
    open fun shake(
        duration: Number = definedExternally,
        intensity: Vector2 = definedExternally,
        force: Boolean = definedExternally
    ): Camera /* this */

    open fun shake(
        duration: Number = definedExternally,
        intensity: Vector2 = definedExternally,
        force: Boolean = definedExternally,
        callback: Function<*> = definedExternally
    ): Camera /* this */

    open fun pan(
        x: Number,
        y: Number,
        duration: Number = definedExternally,
        ease: String = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraPanCallback = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun pan(x: Number, y: Number): Camera /* this */
    open fun pan(x: Number, y: Number, duration: Number = definedExternally): Camera /* this */
    open fun pan(
        x: Number,
        y: Number,
        duration: Number = definedExternally,
        ease: String = definedExternally
    ): Camera /* this */

    open fun pan(
        x: Number,
        y: Number,
        duration: Number = definedExternally,
        ease: String = definedExternally,
        force: Boolean = definedExternally
    ): Camera /* this */

    open fun pan(
        x: Number,
        y: Number,
        duration: Number = definedExternally,
        ease: String = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraPanCallback = definedExternally
    ): Camera /* this */

    open fun pan(
        x: Number,
        y: Number,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraPanCallback = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun pan(
        x: Number,
        y: Number,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally
    ): Camera /* this */

    open fun pan(
        x: Number,
        y: Number,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally,
        force: Boolean = definedExternally
    ): Camera /* this */

    open fun pan(
        x: Number,
        y: Number,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraPanCallback = definedExternally
    ): Camera /* this */

    open fun rotateTo(
        radians: Number,
        shortestPath: Boolean = definedExternally,
        duration: Number = definedExternally,
        ease: String = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraRotateCallback = definedExternally,
        context: Any = definedExternally
    ): Camera

    open fun rotateTo(radians: Number): Camera
    open fun rotateTo(radians: Number, shortestPath: Boolean = definedExternally): Camera
    open fun rotateTo(
        radians: Number,
        shortestPath: Boolean = definedExternally,
        duration: Number = definedExternally
    ): Camera

    open fun rotateTo(
        radians: Number,
        shortestPath: Boolean = definedExternally,
        duration: Number = definedExternally,
        ease: String = definedExternally
    ): Camera

    open fun rotateTo(
        radians: Number,
        shortestPath: Boolean = definedExternally,
        duration: Number = definedExternally,
        ease: String = definedExternally,
        force: Boolean = definedExternally
    ): Camera

    open fun rotateTo(
        radians: Number,
        shortestPath: Boolean = definedExternally,
        duration: Number = definedExternally,
        ease: String = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraRotateCallback = definedExternally
    ): Camera

    open fun rotateTo(
        radians: Number,
        shortestPath: Boolean = definedExternally,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraRotateCallback = definedExternally,
        context: Any = definedExternally
    ): Camera

    open fun rotateTo(
        radians: Number,
        shortestPath: Boolean = definedExternally,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally
    ): Camera

    open fun rotateTo(
        radians: Number,
        shortestPath: Boolean = definedExternally,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally,
        force: Boolean = definedExternally
    ): Camera

    open fun rotateTo(
        radians: Number,
        shortestPath: Boolean = definedExternally,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraRotateCallback = definedExternally
    ): Camera

    open fun zoomTo(
        zoom: Number,
        duration: Number = definedExternally,
        ease: String = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraPanCallback = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun zoomTo(zoom: Number): Camera /* this */
    open fun zoomTo(zoom: Number, duration: Number = definedExternally): Camera /* this */
    open fun zoomTo(
        zoom: Number,
        duration: Number = definedExternally,
        ease: String = definedExternally
    ): Camera /* this */

    open fun zoomTo(
        zoom: Number,
        duration: Number = definedExternally,
        ease: String = definedExternally,
        force: Boolean = definedExternally
    ): Camera /* this */

    open fun zoomTo(
        zoom: Number,
        duration: Number = definedExternally,
        ease: String = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraPanCallback = definedExternally
    ): Camera /* this */

    open fun zoomTo(
        zoom: Number,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraPanCallback = definedExternally,
        context: Any = definedExternally
    ): Camera /* this */

    open fun zoomTo(
        zoom: Number,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally
    ): Camera /* this */

    open fun zoomTo(
        zoom: Number,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally,
        force: Boolean = definedExternally
    ): Camera /* this */

    open fun zoomTo(
        zoom: Number,
        duration: Number = definedExternally,
        ease: Function<*> = definedExternally,
        force: Boolean = definedExternally,
        callback: CameraPanCallback = definedExternally
    ): Camera /* this */

    override fun preRender()
    open fun setLerp(x: Number = definedExternally, y: Number = definedExternally): Camera /* this */
    open fun setFollowOffset(x: Number = definedExternally, y: Number = definedExternally): Camera /* this */
    open fun startFollow(
        target: GameObject?,
        roundPixels: Boolean = definedExternally,
        lerpX: Number = definedExternally,
        lerpY: Number = definedExternally,
        offsetX: Number = definedExternally,
        offsetY: Number = definedExternally
    ): Camera /* this */

    open fun startFollow(target: GameObject?): Camera /* this */
    open fun startFollow(target: GameObject?, roundPixels: Boolean = definedExternally): Camera /* this */
    open fun startFollow(
        target: GameObject?,
        roundPixels: Boolean = definedExternally,
        lerpX: Number = definedExternally
    ): Camera /* this */

    open fun startFollow(
        target: GameObject?,
        roundPixels: Boolean = definedExternally,
        lerpX: Number = definedExternally,
        lerpY: Number = definedExternally
    ): Camera /* this */

    open fun startFollow(
        target: GameObject?,
        roundPixels: Boolean = definedExternally,
        lerpX: Number = definedExternally,
        lerpY: Number = definedExternally,
        offsetX: Number = definedExternally
    ): Camera /* this */

    open fun startFollow(
        target: Any?,
        roundPixels: Boolean = definedExternally,
        lerpX: Number = definedExternally,
        lerpY: Number = definedExternally,
        offsetX: Number = definedExternally,
        offsetY: Number = definedExternally
    ): Camera /* this */

    open fun startFollow(target: Any?): Camera /* this */
    open fun startFollow(target: Any?, roundPixels: Boolean = definedExternally): Camera /* this */
    open fun startFollow(
        target: Any?,
        roundPixels: Boolean = definedExternally,
        lerpX: Number = definedExternally
    ): Camera /* this */

    open fun startFollow(
        target: Any?,
        roundPixels: Boolean = definedExternally,
        lerpX: Number = definedExternally,
        lerpY: Number = definedExternally
    ): Camera /* this */

    open fun startFollow(
        target: Any?,
        roundPixels: Boolean = definedExternally,
        lerpX: Number = definedExternally,
        lerpY: Number = definedExternally,
        offsetX: Number = definedExternally
    ): Camera /* this */

    open fun stopFollow(): Camera /* this */
    open fun resetFX(): Camera /* this */
    override fun update(time: Number, delta: Number)
    override fun destroy()
    override fun clearAlpha(): Camera /* this */
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Camera | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Camera | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Camera | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Camera | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Camera | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Camera | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Camera | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Camera | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Camera | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Camera | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Camera | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Camera | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Camera | Pipeline */
    override fun setPipelineData(key: String, value: Any): Camera /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Camera | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Camera | Pipeline */
    override fun getPipelineName(): String
}

open external class CameraManager(scene: Scene) {
    open var scene: Scene
    open var systems: Systems
    open var roundPixels: Boolean
    open var cameras: Array<Camera>
    open var main: Camera
    open var default: Camera
    open fun add(
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        makeMain: Boolean = definedExternally,
        name: String = definedExternally
    ): Camera

    open fun addExisting(camera: Camera, makeMain: Boolean = definedExternally): Camera
    open fun getTotal(isVisible: Boolean = definedExternally): Number
    open fun fromJSON(config: CameraConfig): CameraManager /* this */
    open fun fromJSON(config: Array<CameraConfig>): CameraManager /* this */
    open fun getCamera(name: String): Camera
    open fun getCamerasBelowPointer(pointer: Pointer): Array<Camera>
    open fun remove(camera: Camera, runDestroy: Boolean = definedExternally): Number
    open fun remove(camera: Camera): Number
    open fun remove(camera: Array<Camera>, runDestroy: Boolean = definedExternally): Number
    open fun remove(camera: Array<Camera>): Number
    open fun render(renderer: CanvasRenderer, displayList: DisplayList)
    open fun render(renderer: WebGLRenderer, displayList: DisplayList)
    open fun getVisibleChildren(children: Array<GameObject>, camera: Camera): Array<GameObject>
    open fun resetAll(): Camera
    open fun update(time: Number, delta: Number)
    open fun onResize(gameSize: Size, baseSize: Size)
    open fun resize(width: Number, height: Number)
}
