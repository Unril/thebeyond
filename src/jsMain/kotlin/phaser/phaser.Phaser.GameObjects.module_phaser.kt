@file:JsQualifier("Phaser.GameObjects")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.GameObjects

import CreateCallback
import Phaser.Animations.Animation
import Phaser.Animations.AnimationFrame
import Phaser.Animations.AnimationState
import Phaser.BlendModes
import Phaser.Cache.BaseCache
import Phaser.Cameras.Scene2D.BaseCamera
import Phaser.Cameras.Scene2D.Camera
import Phaser.Curves.Path
import Phaser.Data.DataManager
import Phaser.Display.BaseShader
import Phaser.Display.Color
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.Display.RGB
import Phaser.Events.EventEmitter
import Phaser.GameObjects.Components.*
import Phaser.GameObjects.Particles.ParticleEmitterManager
import Phaser.Geom.Circle
import Phaser.Geom.Mesh.Face
import Phaser.Geom.Mesh.Vertex
import Phaser.Geom.Point
import Phaser.Input.Pointer
import Phaser.Math.Matrix4
import Phaser.Math.Vector2
import Phaser.Math.Vector3
import Phaser.Math.Vector4
import Phaser.Renderer.WebGL.Pipelines.PostFXPipeline
import Phaser.Renderer.WebGL.Pipelines.SpriteFXPipeline
import Phaser.Renderer.WebGL.RenderTarget
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Structs.List
import Phaser.Structs.ProcessQueue
import Phaser.Structs.Set
import Phaser.Textures.CanvasTexture
import Phaser.Textures.Frame
import Phaser.Textures.Texture
import Phaser.Textures.TextureManager
import Phaser.Textures.TextureSource
import Phaser.Tilemaps.Tilemap
import Phaser.Tweens.Tween
import Phaser.Types.Animations.PlayAnimationConfig
import Phaser.Types.GameObjects.BitmapText.*
import Phaser.Types.GameObjects.GameObjectConfig
import Phaser.Types.GameObjects.GetCalcMatrixResults
import Phaser.Types.GameObjects.Graphics.RoundedRectRadius
import Phaser.Types.GameObjects.Graphics.Styles
import Phaser.Types.GameObjects.Group.*
import Phaser.Types.GameObjects.JSONGameObject
import Phaser.Types.GameObjects.Particles.ParticleEmitterConfig
import Phaser.Types.GameObjects.Particles.ParticleEmitterManagerConfig
import Phaser.Types.GameObjects.PathFollower.PathConfig
import Phaser.Types.GameObjects.RenderTexture.RenderTextureConfig
import Phaser.Types.GameObjects.Text.GetTextSizeObject
import Phaser.Types.GameObjects.Text.TextMetrics
import Phaser.Types.GameObjects.Text.TextPadding
import Phaser.Types.Input.HitAreaCallback
import Phaser.Types.Input.InputConfiguration
import Phaser.Types.Input.InteractiveObject
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Math.Vector3Like
import Phaser.Types.Math.Vector4Like
import Phaser.Types.Renderer.Snapshot.SnapshotCallback
import Phaser.Types.Tilemaps.TilemapConfig
import Phaser.Types.Tweens.NumberTweenBuilderConfig
import Phaser.Types.Tweens.TweenBuilderConfig
import TextStyleWordWrapCallback
import org.khronos.webgl.*
import org.w3c.dom.*
import Phaser.GameObjects.Components.Texture as _Phaser_GameObjects_Components_Texture

open external class DynamicBitmapText : BitmapText {
    constructor(
        scene: Scene,
        x: Number,
        y: Number,
        font: String,
        text: String = definedExternally,
        size: Number = definedExternally,
        align: Number = definedExternally
    )

    constructor(scene: Scene, x: Number, y: Number, font: String)
    constructor(scene: Scene, x: Number, y: Number, font: String, text: String = definedExternally)
    constructor(
        scene: Scene,
        x: Number,
        y: Number,
        font: String,
        text: String = definedExternally,
        size: Number = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number,
        y: Number,
        font: String,
        text: Array<String> = definedExternally,
        size: Number = definedExternally,
        align: Number = definedExternally
    )

    constructor(scene: Scene, x: Number, y: Number, font: String, text: Array<String> = definedExternally)
    constructor(
        scene: Scene,
        x: Number,
        y: Number,
        font: String,
        text: Array<String> = definedExternally,
        size: Number = definedExternally
    )

    open var scrollX: Number
    open var scrollY: Number
    open var cropWidth: Number
    open var cropHeight: Number
    open var displayCallback: DisplayCallback
    open var callbackData: DisplayCallbackConfig
    open fun setSize(width: Number, height: Number): DynamicBitmapText /* this */
    open fun setDisplayCallback(callback: DisplayCallback): DynamicBitmapText /* this */
    open fun setScrollX(value: Number): DynamicBitmapText /* this */
    open fun setScrollY(value: Number): DynamicBitmapText /* this */
    override fun clearAlpha(): DynamicBitmapText /* this */
    override fun setAlpha(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): DynamicBitmapText /* this */

    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): DynamicBitmapText /* this */
    override fun setBlendMode(value: BlendModes): DynamicBitmapText /* this */
    override var depth: Number
    override fun setDepth(value: Number): DynamicBitmapText /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): DynamicBitmapText /* this */
    override fun setMask(mask: GeometryMask): DynamicBitmapText /* this */
    override fun clearMask(destroyMask: Boolean): DynamicBitmapText /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): DynamicBitmapText /* this */
    override fun setOriginFromFrame(): DynamicBitmapText /* this */
    override fun setDisplayOrigin(x: Number, y: Number): DynamicBitmapText /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): DynamicBitmapText /* this */
    override fun setPipeline(pipeline: String): DynamicBitmapText /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): DynamicBitmapText /* this */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): DynamicBitmapText /* this */

    override fun setPipeline(pipeline: WebGLPipeline): DynamicBitmapText /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): DynamicBitmapText /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): DynamicBitmapText /* this */
    override fun setPostPipeline(pipelines: String): DynamicBitmapText /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): DynamicBitmapText /* this */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): DynamicBitmapText /* this */

    override fun setPostPipeline(pipelines: Array<String>): DynamicBitmapText /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): DynamicBitmapText /* this */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): DynamicBitmapText /* this */

    override fun setPostPipeline(pipelines: Function<*>): DynamicBitmapText /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): DynamicBitmapText /* this */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): DynamicBitmapText /* this */

    override fun setPostPipeline(pipelines: Array<Function<*>>): DynamicBitmapText /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): DynamicBitmapText /* this */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): DynamicBitmapText /* this */

    override fun setPostPipeline(pipelines: PostFXPipeline): DynamicBitmapText /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): DynamicBitmapText /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): DynamicBitmapText /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): DynamicBitmapText /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): DynamicBitmapText /* this */
    override fun setPipelineData(key: String, value: Any): DynamicBitmapText /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): DynamicBitmapText /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): DynamicBitmapText /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): DynamicBitmapText /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): DynamicBitmapText /* this */
    override fun setTexture(key: String): DynamicBitmapText /* this */
    override fun setTexture(key: String, frame: Number): DynamicBitmapText /* this */
    override fun setTexture(key: Texture, frame: String): DynamicBitmapText /* this */
    override fun setTexture(key: Texture): DynamicBitmapText /* this */
    override fun setTexture(key: Texture, frame: Number): DynamicBitmapText /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): DynamicBitmapText /* this */
    override fun setFrame(frame: String): DynamicBitmapText /* this */
    override fun setFrame(frame: String, updateSize: Boolean): DynamicBitmapText /* this */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): DynamicBitmapText /* this */
    override fun setFrame(frame: Number): DynamicBitmapText /* this */
    override fun setFrame(frame: Number, updateSize: Boolean): DynamicBitmapText /* this */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): DynamicBitmapText /* this */
    override fun setTint(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): DynamicBitmapText /* this */

    override fun setTintFill(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): DynamicBitmapText /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): DynamicBitmapText /* this */
    override fun copyPosition(source: Vector2Like): DynamicBitmapText /* this */
    override fun copyPosition(source: Vector3Like): DynamicBitmapText /* this */
    override fun copyPosition(source: Vector4Like): DynamicBitmapText /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): DynamicBitmapText /* this */
    override fun setRotation(radians: Number): DynamicBitmapText /* this */
    override fun setAngle(degrees: Number): DynamicBitmapText /* this */
    override fun setScale(x: Number, y: Number): DynamicBitmapText /* this */
    override fun setX(value: Number): DynamicBitmapText /* this */
    override fun setY(value: Number): DynamicBitmapText /* this */
    override fun setZ(value: Number): DynamicBitmapText /* this */
    override fun setW(value: Number): DynamicBitmapText /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): DynamicBitmapText /* this */
}

open external class BitmapText : GameObject, Alpha, BlendMode, Depth, Mask, Origin, Pipeline, ScrollFactor,
    _Phaser_GameObjects_Components_Texture, Tint, Transform, Visible {
    constructor(
        scene: Scene,
        x: Number,
        y: Number,
        font: String,
        text: String = definedExternally,
        size: Number = definedExternally,
        align: Number = definedExternally
    )

    constructor(scene: Scene, x: Number, y: Number, font: String)
    constructor(scene: Scene, x: Number, y: Number, font: String, text: String = definedExternally)
    constructor(
        scene: Scene,
        x: Number,
        y: Number,
        font: String,
        text: String = definedExternally,
        size: Number = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number,
        y: Number,
        font: String,
        text: Array<String> = definedExternally,
        size: Number = definedExternally,
        align: Number = definedExternally
    )

    constructor(scene: Scene, x: Number, y: Number, font: String, text: Array<String> = definedExternally)
    constructor(
        scene: Scene,
        x: Number,
        y: Number,
        font: String,
        text: Array<String> = definedExternally,
        size: Number = definedExternally
    )

    open val font: String
    open val fontData: BitmapFontData
    open var wordWrapCharCode: Number
    open var dropShadowX: Number
    open var dropShadowY: Number
    open var dropShadowColor: Number
    open var dropShadowAlpha: Number
    open val fromAtlas: Boolean
    open fun setLeftAlign(): BitmapText /* this */
    open fun setCenterAlign(): BitmapText /* this */
    open fun setRightAlign(): BitmapText /* this */
    open fun setFontSize(size: Number): BitmapText /* this */
    open fun setLetterSpacing(spacing: Number = definedExternally): BitmapText /* this */
    open fun setText(value: String): BitmapText /* this */
    open fun setText(value: Array<String>): BitmapText /* this */
    open fun setDropShadow(
        x: Number = definedExternally,
        y: Number = definedExternally,
        color: Number = definedExternally,
        alpha: Number = definedExternally
    ): BitmapText /* this */

    open fun setCharacterTint(
        start: Number = definedExternally,
        length: Number = definedExternally,
        tintFill: Boolean = definedExternally,
        topLeft: Number = definedExternally,
        topRight: Number = definedExternally,
        bottomLeft: Number = definedExternally,
        bottomRight: Number = definedExternally
    ): BitmapText /* this */

    open fun setWordTint(
        word: String,
        count: Number = definedExternally,
        tintFill: Boolean = definedExternally,
        topLeft: Number = definedExternally,
        topRight: Number = definedExternally,
        bottomLeft: Number = definedExternally,
        bottomRight: Number = definedExternally
    ): BitmapText /* this */

    open fun setWordTint(word: String): BitmapText /* this */
    open fun setWordTint(word: String, count: Number = definedExternally): BitmapText /* this */
    open fun setWordTint(
        word: String,
        count: Number = definedExternally,
        tintFill: Boolean = definedExternally
    ): BitmapText /* this */

    open fun setWordTint(
        word: String,
        count: Number = definedExternally,
        tintFill: Boolean = definedExternally,
        topLeft: Number = definedExternally
    ): BitmapText /* this */

    open fun setWordTint(
        word: String,
        count: Number = definedExternally,
        tintFill: Boolean = definedExternally,
        topLeft: Number = definedExternally,
        topRight: Number = definedExternally
    ): BitmapText /* this */

    open fun setWordTint(
        word: String,
        count: Number = definedExternally,
        tintFill: Boolean = definedExternally,
        topLeft: Number = definedExternally,
        topRight: Number = definedExternally,
        bottomLeft: Number = definedExternally
    ): BitmapText /* this */

    open fun setWordTint(
        word: Number,
        count: Number = definedExternally,
        tintFill: Boolean = definedExternally,
        topLeft: Number = definedExternally,
        topRight: Number = definedExternally,
        bottomLeft: Number = definedExternally,
        bottomRight: Number = definedExternally
    ): BitmapText /* this */

    open fun setWordTint(word: Number): BitmapText /* this */
    open fun setWordTint(word: Number, count: Number = definedExternally): BitmapText /* this */
    open fun setWordTint(
        word: Number,
        count: Number = definedExternally,
        tintFill: Boolean = definedExternally
    ): BitmapText /* this */

    open fun setWordTint(
        word: Number,
        count: Number = definedExternally,
        tintFill: Boolean = definedExternally,
        topLeft: Number = definedExternally
    ): BitmapText /* this */

    open fun setWordTint(
        word: Number,
        count: Number = definedExternally,
        tintFill: Boolean = definedExternally,
        topLeft: Number = definedExternally,
        topRight: Number = definedExternally
    ): BitmapText /* this */

    open fun setWordTint(
        word: Number,
        count: Number = definedExternally,
        tintFill: Boolean = definedExternally,
        topLeft: Number = definedExternally,
        topRight: Number = definedExternally,
        bottomLeft: Number = definedExternally
    ): BitmapText /* this */

    open fun getTextBounds(round: Boolean = definedExternally): BitmapTextSize
    open fun getCharacterAt(x: Number, y: Number, camera: Camera = definedExternally): BitmapTextCharacter
    override fun updateDisplayOrigin(): BitmapText /* this */
    open fun setFont(
        font: String,
        size: Number = definedExternally,
        align: Number = definedExternally
    ): BitmapText /* this */

    open fun setMaxWidth(value: Number, wordWrapCharCode: Number = definedExternally): BitmapText /* this */
    open var align: Number
    open var text: String
    open var fontSize: Number
    open var letterSpacing: Number
    open var maxWidth: Number
    open val width: Number
    open val height: Number
    override fun toJSON(): JSONGameObject /* Phaser.Types.GameObjects.JSONGameObject & `T$4` */
    open fun preDestroy()
    override fun clearAlpha(): BitmapText /* this */
    override fun setAlpha(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): BitmapText /* this */

    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* BitmapText | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* BitmapText | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): BitmapText /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* BitmapText | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* BitmapText | Mask */
    override fun clearMask(destroyMask: Boolean): BitmapText /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): BitmapText /* this */
    override fun setOriginFromFrame(): BitmapText /* this */
    override fun setDisplayOrigin(x: Number, y: Number): BitmapText /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(
        pipeline: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* BitmapText | Pipeline */

    override fun setPipeline(pipeline: String): dynamic /* BitmapText | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* BitmapText | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* BitmapText | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* BitmapText | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* BitmapText | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* BitmapText | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* BitmapText | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* BitmapText | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* BitmapText | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* BitmapText | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* BitmapText | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?
    ): dynamic /* BitmapText | Pipeline */

    override fun setPipelineData(key: String, value: Any): BitmapText /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* BitmapText | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* BitmapText | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): BitmapText /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): dynamic /* BitmapText | Texture */
    override fun setTexture(key: String): dynamic /* Texture */
    override fun setTexture(key: String, frame: Number): dynamic /* BitmapText | Texture */
    override fun setTexture(key: Texture, frame: String): dynamic /* BitmapText | Texture */
    override fun setTexture(key: Texture): dynamic /* Texture */
    override fun setTexture(key: Texture, frame: Number): dynamic /* BitmapText | Texture */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* BitmapText | Texture */
    override fun setFrame(frame: String): dynamic /* BitmapText | Texture */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* BitmapText | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* BitmapText | Texture */
    override fun setFrame(frame: Number): dynamic /* BitmapText | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* BitmapText | Texture */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): BitmapText /* this */
    override fun setTint(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): BitmapText /* this */

    override fun setTintFill(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): BitmapText /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): BitmapText /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* BitmapText | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* BitmapText | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* BitmapText | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): BitmapText /* this */
    override fun setRotation(radians: Number): BitmapText /* this */
    override fun setAngle(degrees: Number): BitmapText /* this */
    override fun setScale(x: Number, y: Number): BitmapText /* this */
    override fun setX(value: Number): BitmapText /* this */
    override fun setY(value: Number): BitmapText /* this */
    override fun setZ(value: Number): BitmapText /* this */
    override fun setW(value: Number): BitmapText /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): BitmapText /* this */

    companion object {
        var ALIGN_LEFT: Number
        var ALIGN_CENTER: Number
        var ALIGN_RIGHT: Number
        fun ParseFromAtlas(
            scene: Scene,
            fontName: String,
            textureKey: String,
            frameKey: String,
            xmlKey: String,
            xSpacing: Number = definedExternally,
            ySpacing: Number = definedExternally
        ): Boolean

        fun ParseXMLBitmapFont(
            xml: XMLDocument,
            frame: Frame,
            xSpacing: Number = definedExternally,
            ySpacing: Number = definedExternally
        ): BitmapFontData
    }
}

open external class Blitter : GameObject, Alpha, BlendMode, Depth, Mask, Pipeline, ScrollFactor, Size,
    _Phaser_GameObjects_Components_Texture, Transform, Visible {
    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally
    )

    constructor(scene: Scene)
    constructor(scene: Scene, x: Number = definedExternally)
    constructor(scene: Scene, x: Number = definedExternally, y: Number = definedExternally)
    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally
    )

    open var children: List<Bob>
    open var dirty: Boolean
    open fun create(
        x: Number,
        y: Number,
        frame: String = definedExternally,
        visible: Boolean = definedExternally,
        index: Number = definedExternally
    ): Bob

    open fun create(x: Number, y: Number): Bob
    open fun create(x: Number, y: Number, frame: String = definedExternally): Bob
    open fun create(x: Number, y: Number, frame: String = definedExternally, visible: Boolean = definedExternally): Bob
    open fun create(
        x: Number,
        y: Number,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally,
        index: Number = definedExternally
    ): Bob

    open fun create(x: Number, y: Number, frame: Number = definedExternally): Bob
    open fun create(x: Number, y: Number, frame: Number = definedExternally, visible: Boolean = definedExternally): Bob
    open fun create(
        x: Number,
        y: Number,
        frame: Frame = definedExternally,
        visible: Boolean = definedExternally,
        index: Number = definedExternally
    ): Bob

    open fun create(x: Number, y: Number, frame: Frame = definedExternally): Bob
    open fun create(x: Number, y: Number, frame: Frame = definedExternally, visible: Boolean = definedExternally): Bob
    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: String = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createFromCallback(callback: CreateCallback, quantity: Number): Array<Bob>
    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: String = definedExternally
    ): Array<Bob>

    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: Number = definedExternally
    ): Array<Bob>

    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: Frame = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: Frame = definedExternally
    ): Array<Bob>

    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: Array<String> = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: Array<String> = definedExternally
    ): Array<Bob>

    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: Array<Number> = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: Array<Number> = definedExternally
    ): Array<Bob>

    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: Array<Frame> = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createFromCallback(
        callback: CreateCallback,
        quantity: Number,
        frame: Array<Frame> = definedExternally
    ): Array<Bob>

    open fun createMultiple(
        quantity: Number,
        frame: String = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createMultiple(quantity: Number): Array<Bob>
    open fun createMultiple(quantity: Number, frame: String = definedExternally): Array<Bob>
    open fun createMultiple(
        quantity: Number,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createMultiple(quantity: Number, frame: Number = definedExternally): Array<Bob>
    open fun createMultiple(
        quantity: Number,
        frame: Frame = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createMultiple(quantity: Number, frame: Frame = definedExternally): Array<Bob>
    open fun createMultiple(
        quantity: Number,
        frame: Array<String> = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createMultiple(quantity: Number, frame: Array<String> = definedExternally): Array<Bob>
    open fun createMultiple(
        quantity: Number,
        frame: Array<Number> = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createMultiple(quantity: Number, frame: Array<Number> = definedExternally): Array<Bob>
    open fun createMultiple(
        quantity: Number,
        frame: Array<Frame> = definedExternally,
        visible: Boolean = definedExternally
    ): Array<Bob>

    open fun createMultiple(quantity: Number, frame: Array<Frame> = definedExternally): Array<Bob>
    open fun childCanRender(child: Bob): Boolean
    open fun getRenderList(): Array<Bob>
    open fun clear()
    open fun preDestroy()
    override fun clearAlpha(): Blitter /* this */
    override fun setAlpha(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): Blitter /* this */

    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Blitter | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Blitter | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Blitter /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Blitter | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Blitter | Mask */
    override fun clearMask(destroyMask: Boolean): Blitter /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Blitter | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Blitter | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Blitter | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Blitter | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Blitter | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Blitter | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Blitter | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Blitter | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Blitter | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Blitter | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Blitter | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Blitter | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Blitter | Pipeline */
    override fun setPipelineData(key: String, value: Any): Blitter /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Blitter | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Blitter | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Blitter /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Blitter /* this */
    override fun setSize(width: Number, height: Number): Blitter /* this */
    override fun setDisplaySize(width: Number, height: Number): Blitter /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): dynamic /* Blitter | Texture */
    override fun setTexture(key: String): dynamic /* Texture */
    override fun setTexture(key: String, frame: Number): dynamic /* Blitter | Texture */
    override fun setTexture(key: Texture, frame: String): dynamic /* Blitter | Texture */
    override fun setTexture(key: Texture): dynamic /* Texture */
    override fun setTexture(key: Texture, frame: Number): dynamic /* Blitter | Texture */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Blitter | Texture */
    override fun setFrame(frame: String): dynamic /* Blitter | Texture */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Blitter | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Blitter | Texture */
    override fun setFrame(frame: Number): dynamic /* Blitter | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Blitter | Texture */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Blitter /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Blitter | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Blitter | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Blitter | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Blitter /* this */
    override fun setRotation(radians: Number): Blitter /* this */
    override fun setAngle(degrees: Number): Blitter /* this */
    override fun setScale(x: Number, y: Number): Blitter /* this */
    override fun setX(value: Number): Blitter /* this */
    override fun setY(value: Number): Blitter /* this */
    override fun setZ(value: Number): Blitter /* this */
    override fun setW(value: Number): Blitter /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Blitter /* this */
}

open external class Bob {
    constructor(blitter: Blitter, x: Number, y: Number, frame: String, visible: Boolean)
    constructor(blitter: Blitter, x: Number, y: Number, frame: Number, visible: Boolean)

    open var parent: Blitter
    open var x: Number
    open var y: Number
    open var frame: Frame
    open var data: Any?
    open var tint: Number
    open var flipX: Boolean
    open var flipY: Boolean
    open fun setFrame(frame: String = definedExternally): Bob /* this */
    open fun setFrame(): Bob /* this */
    open fun setFrame(frame: Number = definedExternally): Bob /* this */
    open fun setFrame(frame: Frame = definedExternally): Bob /* this */
    open fun resetFlip(): Bob /* this */
    open fun reset(x: Number, y: Number, frame: String = definedExternally): Bob /* this */
    open fun reset(x: Number, y: Number): Bob /* this */
    open fun reset(x: Number, y: Number, frame: Number = definedExternally): Bob /* this */
    open fun reset(x: Number, y: Number, frame: Frame = definedExternally): Bob /* this */
    open fun setPosition(x: Number, y: Number): Bob /* this */
    open fun setFlipX(value: Boolean): Bob /* this */
    open fun setFlipY(value: Boolean): Bob /* this */
    open fun setFlip(x: Boolean, y: Boolean): Bob /* this */
    open fun setVisible(value: Boolean): Bob /* this */
    open fun setAlpha(value: Number): Bob /* this */
    open fun setTint(value: Number): Bob /* this */
    open fun destroy()
    open var visible: Boolean
    open var alpha: Number
}

external fun BuildGameObject(scene: Scene, gameObject: GameObject, config: GameObjectConfig): GameObject

external fun BuildGameObjectAnimation(sprite: Sprite, config: Any?): Sprite

open external class Container(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    children: Array<GameObject> = definedExternally
) : GameObject, AlphaSingle, BlendMode, ComputedSize, Depth, Mask, Pipeline, Transform, Visible {
    open var list: Array<GameObject>
    open var exclusive: Boolean
    open var maxSize: Number
    open var position: Number
    open var localTransform: TransformMatrix
    open var scrollFactorX: Number
    open var scrollFactorY: Number
    open val originX: Number
    open val originY: Number
    open val displayOriginX: Number
    open val displayOriginY: Number
    open fun setExclusive(value: Boolean = definedExternally): Container /* this */
    open fun getBounds(output: Phaser.Geom.Rectangle = definedExternally): Phaser.Geom.Rectangle
    open fun pointToContainer(
        source: Any?,
        output: Any? = definedExternally
    ): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */

    open fun pointToContainer(source: Any?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    open fun pointToContainer(
        source: Any?,
        output: Point? = definedExternally
    ): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */

    open fun pointToContainer(
        source: Any?,
        output: Vector2? = definedExternally
    ): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */

    open fun pointToContainer(
        source: Point?,
        output: Any? = definedExternally
    ): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */

    open fun pointToContainer(source: Point?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    open fun pointToContainer(
        source: Point?,
        output: Point? = definedExternally
    ): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */

    open fun pointToContainer(
        source: Point?,
        output: Vector2? = definedExternally
    ): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */

    open fun pointToContainer(
        source: Vector2?,
        output: Any? = definedExternally
    ): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */

    open fun pointToContainer(source: Vector2?): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */
    open fun pointToContainer(
        source: Vector2?,
        output: Point? = definedExternally
    ): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */

    open fun pointToContainer(
        source: Vector2?,
        output: Vector2? = definedExternally
    ): dynamic /* Any? | Phaser.Geom.Point? | Phaser.Math.Vector2? */

    open fun getBoundsTransformMatrix(): TransformMatrix
    open fun add(child: GameObject): Container /* this */
    open fun add(child: Array<GameObject>): Container /* this */
    open fun addAt(child: GameObject, index: Number = definedExternally): Container /* this */
    open fun addAt(child: GameObject): Container /* this */
    open fun addAt(child: Array<GameObject>, index: Number = definedExternally): Container /* this */
    open fun addAt(child: Array<GameObject>): Container /* this */
    open fun getAt(index: Number): GameObject
    open fun getIndex(child: GameObject): Number
    open fun sort(property: String, handler: Function<*> = definedExternally): Container /* this */
    open fun getByName(name: String): GameObject
    open fun getRandom(startIndex: Number = definedExternally, length: Number = definedExternally): GameObject
    open fun getFirst(
        property: String,
        value: Any,
        startIndex: Number = definedExternally,
        endIndex: Number = definedExternally
    ): GameObject

    open fun getAll(
        property: String = definedExternally,
        value: Any = definedExternally,
        startIndex: Number = definedExternally,
        endIndex: Number = definedExternally
    ): Array<GameObject>

    open fun count(
        property: String,
        value: Any,
        startIndex: Number = definedExternally,
        endIndex: Number = definedExternally
    ): Number

    open fun swap(child1: GameObject, child2: GameObject): Container /* this */
    open fun moveTo(child: GameObject, index: Number): Container /* this */
    open fun moveAbove(child1: GameObject, child2: GameObject): Container /* this */
    open fun moveBelow(child1: GameObject, child2: GameObject): Container /* this */
    open fun remove(child: GameObject, destroyChild: Boolean = definedExternally): Container /* this */
    open fun remove(child: GameObject): Container /* this */
    open fun remove(child: Array<GameObject>, destroyChild: Boolean = definedExternally): Container /* this */
    open fun remove(child: Array<GameObject>): Container /* this */
    open fun removeAt(index: Number, destroyChild: Boolean = definedExternally): Container /* this */
    open fun removeBetween(
        startIndex: Number = definedExternally,
        endIndex: Number = definedExternally,
        destroyChild: Boolean = definedExternally
    ): Container /* this */

    open fun removeAll(destroyChild: Boolean = definedExternally): Container /* this */
    open fun bringToTop(child: GameObject): Container /* this */
    open fun sendToBack(child: GameObject): Container /* this */
    open fun moveUp(child: GameObject): Container /* this */
    open fun moveDown(child: GameObject): Container /* this */
    open fun reverse(): Container /* this */
    open fun shuffle(): Container /* this */
    open fun replace(
        oldChild: GameObject,
        newChild: GameObject,
        destroyChild: Boolean = definedExternally
    ): Container /* this */

    open fun exists(child: GameObject): Boolean
    open fun setAll(
        property: String,
        value: Any,
        startIndex: Number = definedExternally,
        endIndex: Number = definedExternally
    ): Container /* this */

    open fun each(callback: Function<*>, context: Any? = definedExternally, vararg args: Any): Container /* this */
    open fun iterate(callback: Function<*>, context: Any? = definedExternally, vararg args: Any): Container /* this */
    open fun setScrollFactor(
        x: Number,
        y: Number = definedExternally,
        updateChildren: Boolean = definedExternally
    ): Container /* this */

    open val length: Number
    open val first: GameObject
    open val last: GameObject
    open val next: GameObject
    open val previous: GameObject
    open fun preDestroy()
    override fun clearAlpha(): Container /* this */
    override fun setAlpha(value: Number): Container /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Container | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Container | BlendMode */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Container /* this */
    override fun setDisplaySize(width: Number, height: Number): Container /* this */
    override var depth: Number
    override fun setDepth(value: Number): Container /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Container | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Container | Mask */
    override fun clearMask(destroyMask: Boolean): Container /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(
        pipeline: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Container | Pipeline */

    override fun setPipeline(pipeline: String): dynamic /* Container | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Container | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Container | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Container | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Container | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Container | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Container | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Container | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Container | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Container | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Container | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Container | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Container | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Container | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Container | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Container | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Container | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Container | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Container | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Container | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Container | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Container | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?
    ): dynamic /* Container | Pipeline */

    override fun setPipelineData(key: String, value: Any): Container /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Container | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Container | Pipeline */
    override fun getPipelineName(): String
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Container /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Container | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Container | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Container | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Container /* this */
    override fun setRotation(radians: Number): Container /* this */
    override fun setAngle(degrees: Number): Container /* this */
    override fun setScale(x: Number, y: Number): Container /* this */
    override fun setX(value: Number): Container /* this */
    override fun setY(value: Number): Container /* this */
    override fun setZ(value: Number): Container /* this */
    override fun setW(value: Number): Container /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Container /* this */
}

open external class DisplayList(scene: Scene) : List<GameObject> {
    open var sortChildrenFlag: Boolean
    open var scene: Scene
    open var systems: Systems
    open var events: EventEmitter
    open fun queueDepthSort()
    open fun depthSort()
    open fun sortByDepth(childA: GameObject, childB: GameObject): Number
    open fun getChildren(): Array<GameObject>
}

open external class DOMElement : GameObject, AlphaSingle, BlendMode, Depth, Origin, ScrollFactor, Transform, Visible {
    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        element: Element = definedExternally,
        style: String = definedExternally,
        innerText: String = definedExternally
    )

    constructor(scene: Scene)
    constructor(scene: Scene, x: Number = definedExternally)
    constructor(scene: Scene, x: Number = definedExternally, y: Number = definedExternally)
    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        element: Element = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        element: Element = definedExternally,
        style: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        element: Element = definedExternally,
        style: Any = definedExternally,
        innerText: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        element: Element = definedExternally,
        style: Any = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        element: String = definedExternally,
        style: String = definedExternally,
        innerText: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        element: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        element: String = definedExternally,
        style: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        element: String = definedExternally,
        style: Any = definedExternally,
        innerText: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        element: String = definedExternally,
        style: Any = definedExternally
    )

    open var parent: Element
    open var cache: BaseCache
    open var node: Element
    open var transformOnly: Boolean
    open var skewX: Number
    open var skewY: Number
    open var rotate3d: Vector4
    open var rotate3dAngle: String
    open var pointerEvents: String
    open val width: Number
    open val height: Number
    open val displayWidth: Number
    open val displayHeight: Number
    open fun setSkew(x: Number = definedExternally, y: Number = definedExternally): DOMElement /* this */
    open fun setPerspective(value: Number): DOMElement /* this */
    open var perspective: Number
    open fun addListener(events: String): DOMElement /* this */
    override fun removeListener(event: String): DOMElement /* this */
    open fun createElement(
        tagName: String,
        style: String = definedExternally,
        innerText: String = definedExternally
    ): DOMElement /* this */

    open fun createElement(tagName: String): DOMElement /* this */
    open fun createElement(tagName: String, style: String = definedExternally): DOMElement /* this */
    open fun createElement(
        tagName: String,
        style: Any = definedExternally,
        innerText: String = definedExternally
    ): DOMElement /* this */

    open fun createElement(tagName: String, style: Any = definedExternally): DOMElement /* this */
    open fun setElement(
        element: String,
        style: String = definedExternally,
        innerText: String = definedExternally
    ): DOMElement /* this */

    open fun setElement(element: String): DOMElement /* this */
    open fun setElement(element: String, style: String = definedExternally): DOMElement /* this */
    open fun setElement(
        element: String,
        style: Any = definedExternally,
        innerText: String = definedExternally
    ): DOMElement /* this */

    open fun setElement(element: String, style: Any = definedExternally): DOMElement /* this */
    open fun setElement(
        element: Element,
        style: String = definedExternally,
        innerText: String = definedExternally
    ): DOMElement /* this */

    open fun setElement(element: Element): DOMElement /* this */
    open fun setElement(element: Element, style: String = definedExternally): DOMElement /* this */
    open fun setElement(
        element: Element,
        style: Any = definedExternally,
        innerText: String = definedExternally
    ): DOMElement /* this */

    open fun setElement(element: Element, style: Any = definedExternally): DOMElement /* this */
    open fun createFromCache(The: String, tagName: String = definedExternally): DOMElement /* this */
    open fun createFromHTML(html: String, tagName: String = definedExternally): DOMElement /* this */
    open fun removeElement(): DOMElement /* this */
    open fun updateSize(): DOMElement /* this */
    open fun getChildByProperty(property: String, value: String): Element
    open fun getChildByID(id: String): Element
    open fun getChildByName(name: String): Element
    open fun setClassName(className: String): DOMElement /* this */
    open fun setText(text: String): DOMElement /* this */
    open fun setHTML(html: String): DOMElement /* this */
    open fun willRender(): Boolean
    override fun clearAlpha(): DOMElement /* this */
    override fun setAlpha(value: Number): DOMElement /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* DOMElement | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* DOMElement | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): DOMElement /* this */
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): DOMElement /* this */
    override fun setOriginFromFrame(): DOMElement /* this */
    override fun setDisplayOrigin(x: Number, y: Number): DOMElement /* this */
    override fun updateDisplayOrigin(): DOMElement /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): DOMElement /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): DOMElement /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* DOMElement | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* DOMElement | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* DOMElement | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): DOMElement /* this */
    override fun setRotation(radians: Number): DOMElement /* this */
    override fun setAngle(degrees: Number): DOMElement /* this */
    override fun setScale(x: Number, y: Number): DOMElement /* this */
    override fun setX(value: Number): DOMElement /* this */
    override fun setY(value: Number): DOMElement /* this */
    override fun setZ(value: Number): DOMElement /* this */
    override fun setW(value: Number): DOMElement /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): DOMElement /* this */
}

open external class Extern(scene: Scene) : GameObject, Alpha, BlendMode, Depth, Flip, Origin, ScrollFactor, Size,
    _Phaser_GameObjects_Components_Texture, Tint, Transform, Visible {
    override fun clearAlpha(): Extern /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Extern /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Extern | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Extern | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Extern /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Extern /* this */
    override fun toggleFlipY(): Extern /* this */
    override fun setFlipX(value: Boolean): Extern /* this */
    override fun setFlipY(value: Boolean): Extern /* this */
    override fun setFlip(x: Boolean, y: Boolean): Extern /* this */
    override fun resetFlip(): Extern /* this */
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Extern /* this */
    override fun setOriginFromFrame(): Extern /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Extern /* this */
    override fun updateDisplayOrigin(): Extern /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Extern /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Extern /* this */
    override fun setSize(width: Number, height: Number): Extern /* this */
    override fun setDisplaySize(width: Number, height: Number): Extern /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): dynamic /* Extern | Texture */
    override fun setTexture(key: String): dynamic /* Texture */
    override fun setTexture(key: String, frame: Number): dynamic /* Extern | Texture */
    override fun setTexture(key: Texture, frame: String): dynamic /* Extern | Texture */
    override fun setTexture(key: Texture): dynamic /* Texture */
    override fun setTexture(key: Texture, frame: Number): dynamic /* Extern | Texture */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Extern | Texture */
    override fun setFrame(frame: String): dynamic /* Extern | Texture */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Extern | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Extern | Texture */
    override fun setFrame(frame: Number): dynamic /* Extern | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Extern | Texture */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): Extern /* this */
    override fun setTint(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Extern /* this */
    override fun setTintFill(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): Extern /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Extern /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Extern | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Extern | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Extern | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Extern /* this */
    override fun setRotation(radians: Number): Extern /* this */
    override fun setAngle(degrees: Number): Extern /* this */
    override fun setScale(x: Number, y: Number): Extern /* this */
    override fun setX(value: Number): Extern /* this */
    override fun setY(value: Number): Extern /* this */
    override fun setZ(value: Number): Extern /* this */
    override fun setW(value: Number): Extern /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Extern /* this */
}

open external class GameObject(scene: Scene, type: String) : EventEmitter {
    open var scene: Scene
    open var displayList: dynamic /* Phaser.GameObjects.DisplayList | Phaser.GameObjects.Layer */
    open var type: String
    open var state: dynamic /* Number | String */
    open var parentContainer: Container
    open var name: String
    open var active: Boolean
    open var tabIndex: Number
    open var data: DataManager
    open var renderFlags: Number
    open var cameraFilter: Number
    open var input: InteractiveObject
    open var body: dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | MatterJS.BodyType */
    open var ignoreDestroy: Boolean
    open fun setActive(value: Boolean): GameObject /* this */
    open fun setName(value: String): GameObject /* this */
    open fun setState(value: Number): GameObject /* this */
    open fun setState(value: String): GameObject /* this */
    open fun setDataEnabled(): GameObject /* this */
    open fun setData(key: String?, data: Any = definedExternally): GameObject /* this */
    open fun setData(key: String?): GameObject /* this */
    open fun setData(key: Any?, data: Any = definedExternally): GameObject /* this */
    open fun setData(key: Any?): GameObject /* this */
    open fun incData(key: String?, data: Any = definedExternally): GameObject /* this */
    open fun incData(key: String?): GameObject /* this */
    open fun incData(key: Any?, data: Any = definedExternally): GameObject /* this */
    open fun incData(key: Any?): GameObject /* this */
    open fun toggleData(key: String?): GameObject /* this */
    open fun toggleData(key: Any?): GameObject /* this */
    open fun getData(key: String): Any
    open fun getData(key: Array<String>): Any
    open fun setInteractive(
        hitArea: InputConfiguration = definedExternally,
        callback: HitAreaCallback = definedExternally,
        dropZone: Boolean = definedExternally
    ): GameObject /* this */

    open fun setInteractive(): GameObject /* this */
    open fun setInteractive(hitArea: InputConfiguration = definedExternally): GameObject /* this */
    open fun setInteractive(
        hitArea: InputConfiguration = definedExternally,
        callback: HitAreaCallback = definedExternally
    ): GameObject /* this */

    open fun setInteractive(
        hitArea: Any = definedExternally,
        callback: HitAreaCallback = definedExternally,
        dropZone: Boolean = definedExternally
    ): GameObject /* this */

    open fun setInteractive(hitArea: Any = definedExternally): GameObject /* this */
    open fun setInteractive(
        hitArea: Any = definedExternally,
        callback: HitAreaCallback = definedExternally
    ): GameObject /* this */

    open fun disableInteractive(): GameObject /* this */
    open fun removeInteractive(): GameObject /* this */
    open fun addedToScene()
    open fun removedFromScene()
    open fun update(vararg args: Any)
    open fun toJSON(): JSONGameObject
    open fun willRender(camera: Camera): Boolean
    open fun getIndexList(): Array<Number>
    open fun addToDisplayList(displayList: DisplayList = definedExternally): GameObject /* this */
    open fun addToDisplayList(): GameObject /* this */
    open fun addToDisplayList(displayList: Layer = definedExternally): GameObject /* this */
    open fun addToUpdateList(): GameObject /* this */
    open fun removeFromDisplayList(): GameObject /* this */
    open fun removeFromUpdateList(): GameObject /* this */
    open fun destroy(fromScene: Boolean = definedExternally)

    companion object {
        val RENDER_MASK: Number
    }
}

open external class GameObjectCreator(scene: Scene) {
    open fun dynamicBitmapText(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$3` */,
        addToScene: Boolean = definedExternally
    ): DynamicBitmapText

    open fun bitmapText(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$3` */,
        addToScene: Boolean = definedExternally
    ): BitmapText

    open fun blitter(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        addToScene: Boolean = definedExternally
    ): Blitter

    open fun container(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$5` */,
        addToScene: Boolean = definedExternally
    ): Container

    open var scene: Scene
    open var systems: Systems
    open var events: EventEmitter
    open var displayList: DisplayList
    open var updateList: UpdateList
    open fun graphics(
        config: Styles /* Phaser.Types.GameObjects.Graphics.Styles & `T$6` */,
        addToScene: Boolean = definedExternally
    ): Graphics

    open fun group(config: GroupConfig): Group
    open fun group(config: GroupCreateConfig): Group
    open fun image(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        addToScene: Boolean = definedExternally
    ): Image

    open fun layer(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        addToScene: Boolean = definedExternally
    ): Layer

    open fun mesh(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$7` */,
        addToScene: Boolean = definedExternally
    ): Mesh

    open fun particles(
        config: ParticleEmitterManagerConfig,
        addToScene: Boolean = definedExternally
    ): ParticleEmitterManager

    open fun pointlight(config: Any?, addToScene: Boolean = definedExternally): PointLight
    open fun renderTexture(config: RenderTextureConfig, addToScene: Boolean = definedExternally): RenderTexture
    open fun rope(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$8` */,
        addToScene: Boolean = definedExternally
    ): Rope

    open fun shader(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$9` */,
        addToScene: Boolean = definedExternally
    ): Shader

    open fun sprite(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        addToScene: Boolean = definedExternally
    ): Sprite

    open fun text(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$11` */,
        addToScene: Boolean = definedExternally
    ): Text

    open fun tileSprite(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$12` */,
        addToScene: Boolean = definedExternally
    ): TileSprite

    open fun video(
        config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$13` */,
        addToScene: Boolean = definedExternally
    ): Video

    open fun zone(config: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$14` */): Zone
    open fun tilemap(config: TilemapConfig = definedExternally): Tilemap
    open fun tween(config: TweenBuilderConfig?): Tween
    open fun tween(config: Any?): Tween

    companion object {
        fun register(factoryType: String, factoryFunction: Function<*>)
        fun remove(factoryType: String)
    }
}

open external class GameObjectFactory(scene: Scene) {
    open fun path(x: Number, y: Number): Path
    open fun dynamicBitmapText(
        x: Number,
        y: Number,
        font: String,
        text: String = definedExternally,
        size: Number = definedExternally
    ): DynamicBitmapText

    open fun dynamicBitmapText(x: Number, y: Number, font: String): DynamicBitmapText
    open fun dynamicBitmapText(x: Number, y: Number, font: String, text: String = definedExternally): DynamicBitmapText
    open fun dynamicBitmapText(
        x: Number,
        y: Number,
        font: String,
        text: Array<String> = definedExternally,
        size: Number = definedExternally
    ): DynamicBitmapText

    open fun dynamicBitmapText(
        x: Number,
        y: Number,
        font: String,
        text: Array<String> = definedExternally
    ): DynamicBitmapText

    open fun bitmapText(
        x: Number,
        y: Number,
        font: String,
        text: String = definedExternally,
        size: Number = definedExternally,
        align: Number = definedExternally
    ): BitmapText

    open fun bitmapText(x: Number, y: Number, font: String): BitmapText
    open fun bitmapText(x: Number, y: Number, font: String, text: String = definedExternally): BitmapText
    open fun bitmapText(
        x: Number,
        y: Number,
        font: String,
        text: String = definedExternally,
        size: Number = definedExternally
    ): BitmapText

    open fun bitmapText(
        x: Number,
        y: Number,
        font: String,
        text: Array<String> = definedExternally,
        size: Number = definedExternally,
        align: Number = definedExternally
    ): BitmapText

    open fun bitmapText(x: Number, y: Number, font: String, text: Array<String> = definedExternally): BitmapText
    open fun bitmapText(
        x: Number,
        y: Number,
        font: String,
        text: Array<String> = definedExternally,
        size: Number = definedExternally
    ): BitmapText

    open fun blitter(x: Number, y: Number, key: String, frame: String = definedExternally): Blitter
    open fun blitter(x: Number, y: Number, key: String): Blitter
    open fun blitter(x: Number, y: Number, key: String, frame: Number = definedExternally): Blitter
    open fun container(
        x: Number = definedExternally,
        y: Number = definedExternally,
        children: GameObject = definedExternally
    ): Container

    open fun container(): Container
    open fun container(x: Number = definedExternally): Container
    open fun container(x: Number = definedExternally, y: Number = definedExternally): Container
    open fun container(
        x: Number = definedExternally,
        y: Number = definedExternally,
        children: Array<GameObject> = definedExternally
    ): Container

    open fun dom(
        x: Number,
        y: Number,
        element: HTMLElement = definedExternally,
        style: String = definedExternally,
        innerText: String = definedExternally
    ): DOMElement

    open fun dom(x: Number, y: Number): DOMElement
    open fun dom(x: Number, y: Number, element: HTMLElement = definedExternally): DOMElement
    open fun dom(
        x: Number,
        y: Number,
        element: HTMLElement = definedExternally,
        style: String = definedExternally
    ): DOMElement

    open fun dom(
        x: Number,
        y: Number,
        element: HTMLElement = definedExternally,
        style: Any = definedExternally,
        innerText: String = definedExternally
    ): DOMElement

    open fun dom(
        x: Number,
        y: Number,
        element: HTMLElement = definedExternally,
        style: Any = definedExternally
    ): DOMElement

    open fun dom(
        x: Number,
        y: Number,
        element: String = definedExternally,
        style: String = definedExternally,
        innerText: String = definedExternally
    ): DOMElement

    open fun dom(x: Number, y: Number, element: String = definedExternally): DOMElement
    open fun dom(
        x: Number,
        y: Number,
        element: String = definedExternally,
        style: String = definedExternally
    ): DOMElement

    open fun dom(
        x: Number,
        y: Number,
        element: String = definedExternally,
        style: Any = definedExternally,
        innerText: String = definedExternally
    ): DOMElement

    open fun dom(x: Number, y: Number, element: String = definedExternally, style: Any = definedExternally): DOMElement
    open fun extern(): Extern
    open var scene: Scene
    open var systems: Systems
    open var events: EventEmitter
    open var displayList: DisplayList
    open var updateList: UpdateList
    open fun <G> existing(child: G): G
    open fun graphics(config: Styles /* Phaser.Types.GameObjects.Graphics.Styles & `T$6` */ = definedExternally): Graphics
    open fun group(children: Array<GameObject> = definedExternally, config: GroupConfig = definedExternally): Group
    open fun group(): Group
    open fun group(children: Array<GameObject> = definedExternally): Group
    open fun group(
        children: Array<GameObject> = definedExternally,
        config: GroupCreateConfig = definedExternally
    ): Group

    open fun group(children: GroupConfig = definedExternally, config: GroupConfig = definedExternally): Group
    open fun group(children: GroupConfig = definedExternally): Group
    open fun group(children: GroupConfig = definedExternally, config: GroupCreateConfig = definedExternally): Group
    open fun group(children: Array<GroupConfig> = definedExternally, config: GroupConfig = definedExternally): Group
    open fun group(children: Array<GroupConfig> = definedExternally): Group
    open fun group(
        children: Array<GroupConfig> = definedExternally,
        config: GroupCreateConfig = definedExternally
    ): Group

    open fun image(x: Number, y: Number, texture: String, frame: String = definedExternally): Image
    open fun image(x: Number, y: Number, texture: String): Image
    open fun image(x: Number, y: Number, texture: String, frame: Number = definedExternally): Image
    open fun image(x: Number, y: Number, texture: Texture, frame: String = definedExternally): Image
    open fun image(x: Number, y: Number, texture: Texture): Image
    open fun image(x: Number, y: Number, texture: Texture, frame: Number = definedExternally): Image
    open fun layer(children: GameObject = definedExternally): Layer
    open fun layer(): Layer
    open fun layer(children: Array<GameObject> = definedExternally): Layer
    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally,
        alphas: Any /* Number | Array<Number> */ = definedExternally
    ): Mesh

    open fun mesh(): Mesh
    open fun mesh(x: Number = definedExternally): Mesh
    open fun mesh(x: Number = definedExternally, y: Number = definedExternally): Mesh
    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Any /* Number | Array<Number> */ = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally,
        alphas: Any /* Number | Array<Number> */ = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Any /* Number | Array<Number> */ = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally,
        alphas: Any /* Number | Array<Number> */ = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Any /* Number | Array<Number> */ = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally,
        alphas: Any /* Number | Array<Number> */ = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Any /* Number | Array<Number> */ = definedExternally
    ): Mesh

    open fun mesh(
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally
    ): Mesh

    open fun particles(
        texture: String,
        frame: String? = definedExternally,
        emitters: ParticleEmitterConfig = definedExternally
    ): ParticleEmitterManager

    open fun particles(texture: String): ParticleEmitterManager
    open fun particles(texture: String, frame: String? = definedExternally): ParticleEmitterManager
    open fun particles(
        texture: String,
        frame: String? = definedExternally,
        emitters: Array<ParticleEmitterConfig> = definedExternally
    ): ParticleEmitterManager

    open fun particles(
        texture: String,
        frame: Number? = definedExternally,
        emitters: ParticleEmitterConfig = definedExternally
    ): ParticleEmitterManager

    open fun particles(texture: String, frame: Number? = definedExternally): ParticleEmitterManager
    open fun particles(
        texture: String,
        frame: Number? = definedExternally,
        emitters: Array<ParticleEmitterConfig> = definedExternally
    ): ParticleEmitterManager

    open fun particles(
        texture: String,
        frame: Any? = definedExternally,
        emitters: ParticleEmitterConfig = definedExternally
    ): ParticleEmitterManager

    open fun particles(texture: String, frame: Any? = definedExternally): ParticleEmitterManager
    open fun particles(
        texture: String,
        frame: Any? = definedExternally,
        emitters: Array<ParticleEmitterConfig> = definedExternally
    ): ParticleEmitterManager

    open fun particles(
        texture: Texture,
        frame: String? = definedExternally,
        emitters: ParticleEmitterConfig = definedExternally
    ): ParticleEmitterManager

    open fun particles(texture: Texture): ParticleEmitterManager
    open fun particles(texture: Texture, frame: String? = definedExternally): ParticleEmitterManager
    open fun particles(
        texture: Texture,
        frame: String? = definedExternally,
        emitters: Array<ParticleEmitterConfig> = definedExternally
    ): ParticleEmitterManager

    open fun particles(
        texture: Texture,
        frame: Number? = definedExternally,
        emitters: ParticleEmitterConfig = definedExternally
    ): ParticleEmitterManager

    open fun particles(texture: Texture, frame: Number? = definedExternally): ParticleEmitterManager
    open fun particles(
        texture: Texture,
        frame: Number? = definedExternally,
        emitters: Array<ParticleEmitterConfig> = definedExternally
    ): ParticleEmitterManager

    open fun particles(
        texture: Texture,
        frame: Any? = definedExternally,
        emitters: ParticleEmitterConfig = definedExternally
    ): ParticleEmitterManager

    open fun particles(texture: Texture, frame: Any? = definedExternally): ParticleEmitterManager
    open fun particles(
        texture: Texture,
        frame: Any? = definedExternally,
        emitters: Array<ParticleEmitterConfig> = definedExternally
    ): ParticleEmitterManager

    open fun follower(
        path: Path,
        x: Number,
        y: Number,
        texture: String,
        frame: String = definedExternally
    ): PathFollower

    open fun follower(path: Path, x: Number, y: Number, texture: String): PathFollower
    open fun follower(
        path: Path,
        x: Number,
        y: Number,
        texture: String,
        frame: Number = definedExternally
    ): PathFollower

    open fun follower(
        path: Path,
        x: Number,
        y: Number,
        texture: Texture,
        frame: String = definedExternally
    ): PathFollower

    open fun follower(path: Path, x: Number, y: Number, texture: Texture): PathFollower
    open fun follower(
        path: Path,
        x: Number,
        y: Number,
        texture: Texture,
        frame: Number = definedExternally
    ): PathFollower

    open fun pointlight(
        x: Number,
        y: Number,
        color: Number = definedExternally,
        radius: Number = definedExternally,
        intensity: Number = definedExternally,
        attenuation: Number = definedExternally
    ): PointLight

    open fun renderTexture(
        x: Number,
        y: Number,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): RenderTexture

    open fun rope(
        x: Number,
        y: Number,
        texture: String,
        frame: String = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope

    open fun rope(x: Number, y: Number, texture: String): Rope
    open fun rope(x: Number, y: Number, texture: String, frame: String = definedExternally): Rope
    open fun rope(
        x: Number,
        y: Number,
        texture: String,
        frame: String = definedExternally,
        points: Array<Vector2Like> = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: String,
        frame: String = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: String,
        frame: String = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: String,
        frame: Number = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope

    open fun rope(x: Number, y: Number, texture: String, frame: Number = definedExternally): Rope
    open fun rope(
        x: Number,
        y: Number,
        texture: String,
        frame: Number = definedExternally,
        points: Array<Vector2Like> = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: String,
        frame: Number = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: String,
        frame: Number = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: Texture,
        frame: String = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope

    open fun rope(x: Number, y: Number, texture: Texture): Rope
    open fun rope(x: Number, y: Number, texture: Texture, frame: String = definedExternally): Rope
    open fun rope(
        x: Number,
        y: Number,
        texture: Texture,
        frame: String = definedExternally,
        points: Array<Vector2Like> = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: Texture,
        frame: String = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: Texture,
        frame: String = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: Texture,
        frame: Number = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope

    open fun rope(x: Number, y: Number, texture: Texture, frame: Number = definedExternally): Rope
    open fun rope(
        x: Number,
        y: Number,
        texture: Texture,
        frame: Number = definedExternally,
        points: Array<Vector2Like> = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: Texture,
        frame: Number = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally
    ): Rope

    open fun rope(
        x: Number,
        y: Number,
        texture: Texture,
        frame: Number = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally
    ): Rope

    open fun shader(
        key: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        textures: Array<String> = definedExternally,
        textureData: Any? = definedExternally
    ): Shader

    open fun shader(key: String): Shader
    open fun shader(key: String, x: Number = definedExternally): Shader
    open fun shader(key: String, x: Number = definedExternally, y: Number = definedExternally): Shader
    open fun shader(
        key: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally
    ): Shader

    open fun shader(
        key: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Shader

    open fun shader(
        key: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        textures: Array<String> = definedExternally
    ): Shader

    open fun shader(
        key: BaseShader,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        textures: Array<String> = definedExternally,
        textureData: Any? = definedExternally
    ): Shader

    open fun shader(key: BaseShader): Shader
    open fun shader(key: BaseShader, x: Number = definedExternally): Shader
    open fun shader(key: BaseShader, x: Number = definedExternally, y: Number = definedExternally): Shader
    open fun shader(
        key: BaseShader,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally
    ): Shader

    open fun shader(
        key: BaseShader,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Shader

    open fun shader(
        key: BaseShader,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        textures: Array<String> = definedExternally
    ): Shader

    open fun arc(
        x: Number = definedExternally,
        y: Number = definedExternally,
        radius: Number = definedExternally,
        startAngle: Number = definedExternally,
        endAngle: Number = definedExternally,
        anticlockwise: Boolean = definedExternally,
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally
    ): Arc

    open fun circle(
        x: Number = definedExternally,
        y: Number = definedExternally,
        radius: Number = definedExternally,
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally
    ): Arc

    open fun curve(
        x: Number = definedExternally,
        y: Number = definedExternally,
        curve: Phaser.Curves.Curve = definedExternally,
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally
    ): Curve

    open fun ellipse(
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally
    ): Ellipse

    open fun grid(
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        cellWidth: Number = definedExternally,
        cellHeight: Number = definedExternally,
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally,
        outlineFillColor: Number = definedExternally,
        outlineFillAlpha: Number = definedExternally
    ): Grid

    open fun isobox(
        x: Number = definedExternally,
        y: Number = definedExternally,
        size: Number = definedExternally,
        height: Number = definedExternally,
        fillTop: Number = definedExternally,
        fillLeft: Number = definedExternally,
        fillRight: Number = definedExternally
    ): IsoBox

    open fun isotriangle(
        x: Number = definedExternally,
        y: Number = definedExternally,
        size: Number = definedExternally,
        height: Number = definedExternally,
        reversed: Boolean = definedExternally,
        fillTop: Number = definedExternally,
        fillLeft: Number = definedExternally,
        fillRight: Number = definedExternally
    ): IsoTriangle

    open fun line(
        x: Number = definedExternally,
        y: Number = definedExternally,
        x1: Number = definedExternally,
        y1: Number = definedExternally,
        x2: Number = definedExternally,
        y2: Number = definedExternally,
        strokeColor: Number = definedExternally,
        strokeAlpha: Number = definedExternally
    ): Line

    open fun polygon(
        x: Number = definedExternally,
        y: Number = definedExternally,
        points: Any = definedExternally,
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally
    ): Polygon

    open fun rectangle(
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally
    ): Rectangle

    open fun star(
        x: Number = definedExternally,
        y: Number = definedExternally,
        points: Number = definedExternally,
        innerRadius: Number = definedExternally,
        outerRadius: Number = definedExternally,
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally
    ): Star

    open fun triangle(
        x: Number = definedExternally,
        y: Number = definedExternally,
        x1: Number = definedExternally,
        y1: Number = definedExternally,
        x2: Number = definedExternally,
        y2: Number = definedExternally,
        x3: Number = definedExternally,
        y3: Number = definedExternally,
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally
    ): Triangle

    open fun sprite(x: Number, y: Number, texture: String, frame: String = definedExternally): Sprite
    open fun sprite(x: Number, y: Number, texture: String): Sprite
    open fun sprite(x: Number, y: Number, texture: String, frame: Number = definedExternally): Sprite
    open fun sprite(x: Number, y: Number, texture: Texture, frame: String = definedExternally): Sprite
    open fun sprite(x: Number, y: Number, texture: Texture): Sprite
    open fun sprite(x: Number, y: Number, texture: Texture, frame: Number = definedExternally): Sprite
    open fun text(
        x: Number,
        y: Number,
        text: String,
        style: Phaser.Types.GameObjects.Text.TextStyle = definedExternally
    ): Text

    open fun text(x: Number, y: Number, text: String): Text
    open fun text(
        x: Number,
        y: Number,
        text: Array<String>,
        style: Phaser.Types.GameObjects.Text.TextStyle = definedExternally
    ): Text

    open fun text(x: Number, y: Number, text: Array<String>): Text
    open fun tileSprite(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        texture: String,
        frame: String = definedExternally
    ): TileSprite

    open fun tileSprite(x: Number, y: Number, width: Number, height: Number, texture: String): TileSprite
    open fun tileSprite(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        texture: String,
        frame: Number = definedExternally
    ): TileSprite

    open fun tileSprite(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        texture: Texture,
        frame: String = definedExternally
    ): TileSprite

    open fun tileSprite(x: Number, y: Number, width: Number, height: Number, texture: Texture): TileSprite
    open fun tileSprite(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        texture: Texture,
        frame: Number = definedExternally
    ): TileSprite

    open fun video(x: Number, y: Number, key: String = definedExternally): Video
    open fun zone(x: Number, y: Number, width: Number, height: Number): Zone
    open fun tilemap(
        key: String = definedExternally,
        tileWidth: Number = definedExternally,
        tileHeight: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        data: Array<Array<Number>> = definedExternally,
        insertNull: Boolean = definedExternally
    ): Tilemap

    open fun tween(config: TweenBuilderConfig?): Tween
    open fun tween(config: Any?): Tween

    companion object {
        fun register(factoryType: String, factoryFunction: Function<*>)
        fun remove(factoryType: String)
    }
}

external fun GetCalcMatrix(
    src: GameObject,
    camera: Camera,
    parentMatrix: TransformMatrix = definedExternally
): GetCalcMatrixResults

open external class Graphics(
    scene: Scene,
    options: Styles /* Phaser.Types.GameObjects.Graphics.Styles & `T$6` */ = definedExternally
) : GameObject, AlphaSingle, BlendMode, Depth, Mask, Pipeline, Transform, Visible, ScrollFactor {
    open var displayOriginX: Number
    open var displayOriginY: Number
    open var commandBuffer: Array<Any>
    open var defaultFillColor: Number
    open var defaultFillAlpha: Number
    open var defaultStrokeWidth: Number
    open var defaultStrokeColor: Number
    open var defaultStrokeAlpha: Number
    open fun setDefaultStyles(options: Styles): Graphics /* this */
    open fun lineStyle(lineWidth: Number, color: Number, alpha: Number = definedExternally): Graphics /* this */
    open fun fillStyle(color: Number, alpha: Number = definedExternally): Graphics /* this */
    open fun fillGradientStyle(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number,
        alphaTopLeft: Number = definedExternally,
        alphaTopRight: Number = definedExternally,
        alphaBottomLeft: Number = definedExternally,
        alphaBottomRight: Number = definedExternally
    ): Graphics /* this */

    open fun lineGradientStyle(
        lineWidth: Number,
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number,
        alpha: Number = definedExternally
    ): Graphics /* this */

    open fun beginPath(): Graphics /* this */
    open fun closePath(): Graphics /* this */
    open fun fillPath(): Graphics /* this */
    open fun fill(): Graphics /* this */
    open fun strokePath(): Graphics /* this */
    open fun stroke(): Graphics /* this */
    open fun fillCircleShape(circle: Circle): Graphics /* this */
    open fun strokeCircleShape(circle: Circle): Graphics /* this */
    open fun fillCircle(x: Number, y: Number, radius: Number): Graphics /* this */
    open fun strokeCircle(x: Number, y: Number, radius: Number): Graphics /* this */
    open fun fillRectShape(rect: Phaser.Geom.Rectangle): Graphics /* this */
    open fun strokeRectShape(rect: Phaser.Geom.Rectangle): Graphics /* this */
    open fun fillRect(x: Number, y: Number, width: Number, height: Number): Graphics /* this */
    open fun strokeRect(x: Number, y: Number, width: Number, height: Number): Graphics /* this */
    open fun fillRoundedRect(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        radius: RoundedRectRadius = definedExternally
    ): Graphics /* this */

    open fun fillRoundedRect(x: Number, y: Number, width: Number, height: Number): Graphics /* this */
    open fun fillRoundedRect(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        radius: Number = definedExternally
    ): Graphics /* this */

    open fun strokeRoundedRect(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        radius: RoundedRectRadius = definedExternally
    ): Graphics /* this */

    open fun strokeRoundedRect(x: Number, y: Number, width: Number, height: Number): Graphics /* this */
    open fun strokeRoundedRect(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        radius: Number = definedExternally
    ): Graphics /* this */

    open fun fillPointShape(point: Point?, size: Number = definedExternally): Graphics /* this */
    open fun fillPointShape(point: Point?): Graphics /* this */
    open fun fillPointShape(point: Vector2?, size: Number = definedExternally): Graphics /* this */
    open fun fillPointShape(point: Vector2?): Graphics /* this */
    open fun fillPointShape(point: Any?, size: Number = definedExternally): Graphics /* this */
    open fun fillPointShape(point: Any?): Graphics /* this */
    open fun fillPoint(x: Number, y: Number, size: Number = definedExternally): Graphics /* this */
    open fun fillTriangleShape(triangle: Phaser.Geom.Triangle): Graphics /* this */
    open fun strokeTriangleShape(triangle: Phaser.Geom.Triangle): Graphics /* this */
    open fun fillTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number): Graphics /* this */
    open fun strokeTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number): Graphics /* this */
    open fun strokeLineShape(line: Phaser.Geom.Line): Graphics /* this */
    open fun lineBetween(x1: Number, y1: Number, x2: Number, y2: Number): Graphics /* this */
    open fun lineTo(x: Number, y: Number): Graphics /* this */
    open fun moveTo(x: Number, y: Number): Graphics /* this */
    open fun strokePoints(
        points: Array<Any>,
        closeShape: Boolean = definedExternally,
        closePath: Boolean = definedExternally,
        endIndex: Number = definedExternally
    ): Graphics /* this */

    open fun strokePoints(points: Array<Any>): Graphics /* this */
    open fun strokePoints(points: Array<Any>, closeShape: Boolean = definedExternally): Graphics /* this */
    open fun strokePoints(
        points: Array<Any>,
        closeShape: Boolean = definedExternally,
        closePath: Boolean = definedExternally
    ): Graphics /* this */

    open fun strokePoints(
        points: Array<Point>,
        closeShape: Boolean = definedExternally,
        closePath: Boolean = definedExternally,
        endIndex: Number = definedExternally
    ): Graphics /* this */

    open fun strokePoints(points: Array<Point>): Graphics /* this */
    open fun strokePoints(points: Array<Point>, closeShape: Boolean = definedExternally): Graphics /* this */
    open fun strokePoints(
        points: Array<Point>,
        closeShape: Boolean = definedExternally,
        closePath: Boolean = definedExternally
    ): Graphics /* this */

    open fun fillPoints(
        points: Array<Any>,
        closeShape: Boolean = definedExternally,
        closePath: Boolean = definedExternally,
        endIndex: Number = definedExternally
    ): Graphics /* this */

    open fun fillPoints(points: Array<Any>): Graphics /* this */
    open fun fillPoints(points: Array<Any>, closeShape: Boolean = definedExternally): Graphics /* this */
    open fun fillPoints(
        points: Array<Any>,
        closeShape: Boolean = definedExternally,
        closePath: Boolean = definedExternally
    ): Graphics /* this */

    open fun fillPoints(
        points: Array<Point>,
        closeShape: Boolean = definedExternally,
        closePath: Boolean = definedExternally,
        endIndex: Number = definedExternally
    ): Graphics /* this */

    open fun fillPoints(points: Array<Point>): Graphics /* this */
    open fun fillPoints(points: Array<Point>, closeShape: Boolean = definedExternally): Graphics /* this */
    open fun fillPoints(
        points: Array<Point>,
        closeShape: Boolean = definedExternally,
        closePath: Boolean = definedExternally
    ): Graphics /* this */

    open fun strokeEllipseShape(
        ellipse: Phaser.Geom.Ellipse,
        smoothness: Number = definedExternally
    ): Graphics /* this */

    open fun strokeEllipse(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        smoothness: Number = definedExternally
    ): Graphics /* this */

    open fun fillEllipseShape(ellipse: Phaser.Geom.Ellipse, smoothness: Number = definedExternally): Graphics /* this */
    open fun fillEllipse(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        smoothness: Number = definedExternally
    ): Graphics /* this */

    open fun arc(
        x: Number,
        y: Number,
        radius: Number,
        startAngle: Number,
        endAngle: Number,
        anticlockwise: Boolean = definedExternally,
        overshoot: Number = definedExternally
    ): Graphics /* this */

    open fun slice(
        x: Number,
        y: Number,
        radius: Number,
        startAngle: Number,
        endAngle: Number,
        anticlockwise: Boolean = definedExternally,
        overshoot: Number = definedExternally
    ): Graphics /* this */

    open fun save(): Graphics /* this */
    open fun restore(): Graphics /* this */
    open fun translateCanvas(x: Number, y: Number): Graphics /* this */
    open fun scaleCanvas(x: Number, y: Number): Graphics /* this */
    open fun rotateCanvas(radians: Number): Graphics /* this */
    open fun clear(): Graphics /* this */
    open fun generateTexture(
        key: String,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Graphics /* this */

    open fun generateTexture(key: String): Graphics /* this */
    open fun generateTexture(key: String, width: Number = definedExternally): Graphics /* this */
    open fun generateTexture(
        key: HTMLCanvasElement,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Graphics /* this */

    open fun generateTexture(key: HTMLCanvasElement): Graphics /* this */
    open fun generateTexture(key: HTMLCanvasElement, width: Number = definedExternally): Graphics /* this */
    open fun preDestroy()
    override fun clearAlpha(): Graphics /* this */
    override fun setAlpha(value: Number): Graphics /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Graphics | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Graphics | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Graphics /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Graphics | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Graphics | Mask */
    override fun clearMask(destroyMask: Boolean): Graphics /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Graphics | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Graphics | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Graphics | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Graphics | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Graphics | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Graphics | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Graphics | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Graphics | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Graphics | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Graphics | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Graphics | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Graphics | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?
    ): dynamic /* Graphics | Pipeline */

    override fun setPipelineData(key: String, value: Any): Graphics /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Graphics | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Graphics | Pipeline */
    override fun getPipelineName(): String
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Graphics /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Graphics | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Graphics | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Graphics | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Graphics /* this */
    override fun setRotation(radians: Number): Graphics /* this */
    override fun setAngle(degrees: Number): Graphics /* this */
    override fun setScale(x: Number, y: Number): Graphics /* this */
    override fun setX(value: Number): Graphics /* this */
    override fun setY(value: Number): Graphics /* this */
    override fun setZ(value: Number): Graphics /* this */
    override fun setW(value: Number): Graphics /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Graphics /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Graphics /* this */

    companion object {
        var TargetCamera: Camera
    }
}

open external class Group : EventEmitter {
    constructor(scene: Scene, children: Array<GameObject> = definedExternally, config: GroupConfig = definedExternally)
    constructor(scene: Scene)
    constructor(scene: Scene, children: Array<GameObject> = definedExternally)
    constructor(
        scene: Scene,
        children: Array<GameObject> = definedExternally,
        config: GroupCreateConfig = definedExternally
    )

    constructor(scene: Scene, children: GroupConfig = definedExternally, config: GroupConfig = definedExternally)
    constructor(scene: Scene, children: GroupConfig = definedExternally)
    constructor(scene: Scene, children: GroupConfig = definedExternally, config: GroupCreateConfig = definedExternally)
    constructor(scene: Scene, children: GroupCreateConfig = definedExternally, config: GroupConfig = definedExternally)
    constructor(scene: Scene, children: GroupCreateConfig = definedExternally)
    constructor(
        scene: Scene,
        children: GroupCreateConfig = definedExternally,
        config: GroupCreateConfig = definedExternally
    )

    open var scene: Scene
    open var children: Set<GameObject>
    open var isParent: Boolean
    open var type: String
    open var classType: GroupClassTypeConstructor
    open var name: String
    open var active: Boolean
    open var maxSize: Number
    open var defaultKey: String
    open var defaultFrame: dynamic /* String | Number */
    open var runChildUpdate: Boolean
    open var createCallback: GroupCallback
    open var removeCallback: GroupCallback
    open var createMultipleCallback: GroupMultipleCreateCallback
    open fun create(
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally,
        visible: Boolean = definedExternally,
        active: Boolean = definedExternally
    ): Any

    open fun create(): Any
    open fun create(x: Number = definedExternally): Any
    open fun create(x: Number = definedExternally, y: Number = definedExternally): Any
    open fun create(x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally): Any
    open fun create(
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally
    ): Any

    open fun create(
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun create(
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally,
        active: Boolean = definedExternally
    ): Any

    open fun create(
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally
    ): Any

    open fun create(
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun createMultiple(config: GroupCreateConfig): Array<Any>
    open fun createMultiple(config: Array<GroupCreateConfig>): Array<Any>
    open fun createFromConfig(options: GroupCreateConfig): Array<Any>
    open fun preUpdate(time: Number, delta: Number)
    open fun add(child: GameObject, addToScene: Boolean = definedExternally): Group /* this */
    open fun addMultiple(children: Array<GameObject>, addToScene: Boolean = definedExternally): Group /* this */
    open fun remove(
        child: GameObject,
        removeFromScene: Boolean = definedExternally,
        destroyChild: Boolean = definedExternally
    ): Group /* this */

    open fun clear(
        removeFromScene: Boolean = definedExternally,
        destroyChild: Boolean = definedExternally
    ): Group /* this */

    open fun contains(child: GameObject): Boolean
    open fun getChildren(): Array<GameObject>
    open fun getLength(): Number
    open fun getMatching(
        property: String = definedExternally,
        value: Any = definedExternally,
        startIndex: Number = definedExternally,
        endIndex: Number = definedExternally
    ): Array<Any>

    open fun getFirst(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getFirst(): Any
    open fun getFirst(state: Boolean = definedExternally): Any
    open fun getFirst(state: Boolean = definedExternally, createIfNull: Boolean = definedExternally): Any
    open fun getFirst(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally
    ): Any

    open fun getFirst(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): Any

    open fun getFirst(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally
    ): Any

    open fun getFirst(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally
    ): Any

    open fun getFirst(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getFirst(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally
    ): Any

    open fun getFirstNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getFirstNth(nth: Number): Any
    open fun getFirstNth(nth: Number, state: Boolean = definedExternally): Any
    open fun getFirstNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally
    ): Any

    open fun getFirstNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally
    ): Any

    open fun getFirstNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): Any

    open fun getFirstNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally
    ): Any

    open fun getFirstNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally
    ): Any

    open fun getFirstNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getFirstNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally
    ): Any

    open fun getLast(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getLast(): Any
    open fun getLast(state: Boolean = definedExternally): Any
    open fun getLast(state: Boolean = definedExternally, createIfNull: Boolean = definedExternally): Any
    open fun getLast(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally
    ): Any

    open fun getLast(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): Any

    open fun getLast(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally
    ): Any

    open fun getLast(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally
    ): Any

    open fun getLast(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getLast(
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally
    ): Any

    open fun getLastNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getLastNth(nth: Number): Any
    open fun getLastNth(nth: Number, state: Boolean = definedExternally): Any
    open fun getLastNth(nth: Number, state: Boolean = definedExternally, createIfNull: Boolean = definedExternally): Any
    open fun getLastNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally
    ): Any

    open fun getLastNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): Any

    open fun getLastNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally
    ): Any

    open fun getLastNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally
    ): Any

    open fun getLastNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getLastNth(
        nth: Number,
        state: Boolean = definedExternally,
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally
    ): Any

    open fun get(
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun get(): Any
    open fun get(x: Number = definedExternally): Any
    open fun get(x: Number = definedExternally, y: Number = definedExternally): Any
    open fun get(x: Number = definedExternally, y: Number = definedExternally, key: String = definedExternally): Any
    open fun get(
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally
    ): Any

    open fun get(
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun get(
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally
    ): Any

    open fun getFirstAlive(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getFirstAlive(): Any
    open fun getFirstAlive(createIfNull: Boolean = definedExternally): Any
    open fun getFirstAlive(createIfNull: Boolean = definedExternally, x: Number = definedExternally): Any
    open fun getFirstAlive(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): Any

    open fun getFirstAlive(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally
    ): Any

    open fun getFirstAlive(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally
    ): Any

    open fun getFirstAlive(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getFirstAlive(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally
    ): Any

    open fun getFirstDead(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getFirstDead(): Any
    open fun getFirstDead(createIfNull: Boolean = definedExternally): Any
    open fun getFirstDead(createIfNull: Boolean = definedExternally, x: Number = definedExternally): Any
    open fun getFirstDead(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): Any

    open fun getFirstDead(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally
    ): Any

    open fun getFirstDead(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: String = definedExternally
    ): Any

    open fun getFirstDead(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally,
        visible: Boolean = definedExternally
    ): Any

    open fun getFirstDead(
        createIfNull: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        key: String = definedExternally,
        frame: Number = definedExternally
    ): Any

    open fun playAnimation(key: String, startFrame: String = definedExternally): Group /* this */
    open fun isFull(): Boolean
    open fun countActive(value: Boolean = definedExternally): Number
    open fun getTotalUsed(): Number
    open fun getTotalFree(): Number
    open fun setActive(value: Boolean): Group /* this */
    open fun setName(value: String): Group /* this */
    open fun propertyValueSet(
        key: String,
        value: Number,
        step: Number = definedExternally,
        index: Number = definedExternally,
        direction: Number = definedExternally
    ): Group /* this */

    open fun propertyValueInc(
        key: String,
        value: Number,
        step: Number = definedExternally,
        index: Number = definedExternally,
        direction: Number = definedExternally
    ): Group /* this */

    open fun setX(value: Number, step: Number = definedExternally): Group /* this */
    open fun setY(value: Number, step: Number = definedExternally): Group /* this */
    open fun setXY(
        x: Number,
        y: Number = definedExternally,
        stepX: Number = definedExternally,
        stepY: Number = definedExternally
    ): Group /* this */

    open fun incX(value: Number, step: Number = definedExternally): Group /* this */
    open fun incY(value: Number, step: Number = definedExternally): Group /* this */
    open fun incXY(
        x: Number,
        y: Number = definedExternally,
        stepX: Number = definedExternally,
        stepY: Number = definedExternally
    ): Group /* this */

    open fun shiftPosition(x: Number, y: Number, direction: Number = definedExternally): Group /* this */
    open fun angle(value: Number, step: Number = definedExternally): Group /* this */
    open fun rotate(value: Number, step: Number = definedExternally): Group /* this */
    open fun rotateAround(point: Vector2Like, angle: Number): Group /* this */
    open fun rotateAroundDistance(point: Vector2Like, angle: Number, distance: Number): Group /* this */
    open fun setAlpha(value: Number, step: Number = definedExternally): Group /* this */
    open fun setTint(
        topLeft: Number,
        topRight: Number = definedExternally,
        bottomLeft: Number = definedExternally,
        bottomRight: Number = definedExternally
    ): Group /* this */

    open fun setOrigin(
        originX: Number,
        originY: Number = definedExternally,
        stepX: Number = definedExternally,
        stepY: Number = definedExternally
    ): Group /* this */

    open fun scaleX(value: Number, step: Number = definedExternally): Group /* this */
    open fun scaleY(value: Number, step: Number = definedExternally): Group /* this */
    open fun scaleXY(
        scaleX: Number,
        scaleY: Number = definedExternally,
        stepX: Number = definedExternally,
        stepY: Number = definedExternally
    ): Group /* this */

    open fun setDepth(value: Number, step: Number = definedExternally): Group /* this */
    open fun setBlendMode(value: Number): Group /* this */
    open fun setHitArea(hitArea: Any, hitAreaCallback: HitAreaCallback): Group /* this */
    open fun shuffle(): Group /* this */
    open fun kill(gameObject: GameObject)
    open fun killAndHide(gameObject: GameObject)
    open fun setVisible(
        value: Boolean,
        index: Number = definedExternally,
        direction: Number = definedExternally
    ): Group /* this */

    open fun toggleVisible(): Group /* this */
    open fun destroy(destroyChildren: Boolean = definedExternally, removeFromScene: Boolean = definedExternally)
}

open external class Image : GameObject, Alpha, BlendMode, Depth, Flip, FX, GetBounds, Mask, Origin, Pipeline,
    ScrollFactor, Size, TextureCrop, Tint, Transform, Visible {
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: String)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Number = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture, frame: String = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture, frame: Number = definedExternally)

    override fun clearAlpha(): Image /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Image /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Image | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Image | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Image /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Image /* this */
    override fun toggleFlipY(): Image /* this */
    override fun setFlipX(value: Boolean): Image /* this */
    override fun setFlipY(value: Boolean): Image /* this */
    override fun setFlip(x: Boolean, y: Boolean): Image /* this */
    override fun resetFlip(): Image /* this */
    override var fxPadding: Number
    override fun setFXPadding(padding: Number): Image /* this */
    override fun onFXCopy(pipeline: SpriteFXPipeline)
    override fun onFX(pipeline: SpriteFXPipeline)
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Image | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Image | Mask */
    override fun clearMask(destroyMask: Boolean): Image /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Image /* this */
    override fun setOriginFromFrame(): Image /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Image /* this */
    override fun updateDisplayOrigin(): Image /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Image | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Image | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Image | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPipelineData(key: String, value: Any): Image /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Image | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Image | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Image /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Image /* this */
    override fun setSize(width: Number, height: Number): Image /* this */
    override fun setDisplaySize(width: Number, height: Number): Image /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): dynamic /* Image | TextureCrop */
    override fun setCrop(): dynamic /* TextureCrop */
    override fun setCrop(x: Number): dynamic /* Image | TextureCrop */
    override fun setCrop(x: Number, y: Number): dynamic /* Image | TextureCrop */
    override fun setCrop(x: Number, y: Number, width: Number): dynamic /* Image | TextureCrop */
    override fun setCrop(
        x: Phaser.Geom.Rectangle,
        y: Number,
        width: Number,
        height: Number
    ): dynamic /* Image | TextureCrop */

    override fun setCrop(x: Phaser.Geom.Rectangle): dynamic /* Image | TextureCrop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number): dynamic /* Image | TextureCrop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number): dynamic /* Image | TextureCrop */
    override fun setTexture(key: String, frame: String): dynamic /* Image | TextureCrop */
    override fun setTexture(key: String): dynamic /* TextureCrop */
    override fun setTexture(key: String, frame: Number): dynamic /* Image | TextureCrop */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Image | TextureCrop */
    override fun setFrame(frame: String): dynamic /* Image | TextureCrop */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Image | TextureCrop */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Image | TextureCrop */
    override fun setFrame(frame: Number): dynamic /* Image | TextureCrop */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Image | TextureCrop */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): Image /* this */
    override fun setTint(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Image /* this */
    override fun setTintFill(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): Image /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Image /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Image | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Image | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Image | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Image /* this */
    override fun setRotation(radians: Number): Image /* this */
    override fun setAngle(degrees: Number): Image /* this */
    override fun setScale(x: Number, y: Number): Image /* this */
    override fun setX(value: Number): Image /* this */
    override fun setY(value: Number): Image /* this */
    override fun setZ(value: Number): Image /* this */
    override fun setW(value: Number): Image /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Image /* this */
}

open external class Layer(scene: Scene, children: Array<GameObject> = definedExternally) : List<GameObject>,
    AlphaSingle, BlendMode, Depth, Mask, Pipeline, Visible {
    open var scene: Scene
    open var displayList: dynamic /* Phaser.GameObjects.DisplayList | Phaser.GameObjects.Layer */
    open var type: String
    open var state: dynamic /* Number | String */
    open var parentContainer: Container
    open var name: String
    open var active: Boolean
    open var tabIndex: Number
    open var data: DataManager
    open var renderFlags: Number
    open var cameraFilter: Number
    open var input: InteractiveObject
    open var body: dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | MatterJS.BodyType */
    open var ignoreDestroy: Boolean
    open var systems: Systems
    open var events: EventEmitter
    open var sortChildrenFlag: Boolean
    open fun setActive(value: Boolean): Layer /* this */
    open fun setName(value: String): Layer /* this */
    open fun setState(value: Number): Layer /* this */
    open fun setState(value: String): Layer /* this */
    open fun setDataEnabled(): Layer /* this */
    open fun setData(key: String?, data: Any = definedExternally): Layer /* this */
    open fun setData(key: String?): Layer /* this */
    open fun setData(key: Any?, data: Any = definedExternally): Layer /* this */
    open fun setData(key: Any?): Layer /* this */
    open fun incData(key: String?, data: Any = definedExternally): Layer /* this */
    open fun incData(key: String?): Layer /* this */
    open fun incData(key: Any?, data: Any = definedExternally): Layer /* this */
    open fun incData(key: Any?): Layer /* this */
    open fun toggleData(key: String?): Layer /* this */
    open fun toggleData(key: Any?): Layer /* this */
    open fun getData(key: String): Any
    open fun getData(key: Array<String>): Any
    open fun setInteractive(): Layer /* this */
    open fun disableInteractive(): Layer /* this */
    open fun removeInteractive(): Layer /* this */
    open fun addedToScene()
    open fun removedFromScene()
    open fun update(vararg args: Any)
    open fun toJSON(): JSONGameObject
    open fun willRender(camera: Camera): Boolean
    open fun getIndexList(): Array<Number>
    open fun queueDepthSort()
    open fun depthSort()
    open fun sortByDepth(childA: GameObject, childB: GameObject): Number
    open fun getChildren(): Array<GameObject>
    open fun addToDisplayList(displayList: DisplayList = definedExternally): Layer /* this */
    open fun addToDisplayList(): Layer /* this */
    open fun addToDisplayList(displayList: Layer = definedExternally): Layer /* this */
    open fun removeFromDisplayList(): Layer /* this */
    open fun destroy(fromScene: Boolean = definedExternally)
    override fun clearAlpha(): Layer /* this */
    override fun setAlpha(value: Number): Layer /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Layer | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Layer | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Layer /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Layer | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Layer | Mask */
    override fun clearMask(destroyMask: Boolean): Layer /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Layer | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Layer | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Layer | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Layer | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Layer | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Layer | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Layer | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Layer | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Layer | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Layer | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Layer | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Layer | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Layer | Pipeline */
    override fun setPipelineData(key: String, value: Any): Layer /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Layer | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Layer | Pipeline */
    override fun getPipelineName(): String
    override var visible: Boolean
    override fun setVisible(value: Boolean): Layer /* this */
}

open external class Light(x: Number, y: Number, radius: Number, r: Number, g: Number, b: Number, intensity: Number) :
    Circle, Origin, ScrollFactor, Transform, Visible {
    open var color: RGB
    open var intensity: Number
    open var renderFlags: Number
    open var cameraFilter: Number
    open var displayWidth: Number
    open var displayHeight: Number
    open var width: Number
    open var height: Number
    open fun willRender(camera: Camera): Boolean
    open fun setColor(rgb: Number): Light /* this */
    open fun setIntensity(intensity: Number): Light /* this */
    open fun setRadius(radius: Number): Light /* this */
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Light /* this */
    override fun setOriginFromFrame(): Light /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Light /* this */
    override fun updateDisplayOrigin(): Light /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Light /* this */
    override val hasTransformComponent: Boolean
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun copyPosition(source: Vector2Like): dynamic /* Light | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Light | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Light | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Light /* this */
    override fun setRotation(radians: Number): Light /* this */
    override fun setAngle(degrees: Number): Light /* this */
    override fun setScale(x: Number, y: Number): Light /* this */
    override fun setX(value: Number): Light /* this */
    override fun setY(value: Number): Light /* this */
    override fun setZ(value: Number): Light /* this */
    override fun setW(value: Number): Light /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Light /* this */

    companion object {
        val RENDER_MASK: Number
    }

    override fun setPosition(x: Number, y: Number): Circle /* this */
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Circle /* this */
}

open external class LightsManager {
    open var lights: Array<Light>
    open var ambientColor: RGB
    open var active: Boolean
    open val maxLights: Number
    open val visibleLights: Number
    open fun addPointLight(
        x: Number,
        y: Number,
        color: Number = definedExternally,
        radius: Number = definedExternally,
        intensity: Number = definedExternally,
        attenuation: Number = definedExternally
    ): PointLight

    open fun enable(): LightsManager /* this */
    open fun disable(): LightsManager /* this */
    open fun getLights(camera: Camera): Array<Light>
    open fun setAmbientColor(rgb: Number): LightsManager /* this */
    open fun getMaxVisibleLights(): Number
    open fun getLightCount(): Number
    open fun addLight(
        x: Number = definedExternally,
        y: Number = definedExternally,
        radius: Number = definedExternally,
        rgb: Number = definedExternally,
        intensity: Number = definedExternally
    ): Light

    open fun removeLight(light: Light): LightsManager /* this */
    open fun shutdown()
    open fun destroy()
}

open external class LightsPlugin(scene: Scene) : LightsManager {
    open var scene: Scene
    open var systems: Systems
    open fun boot()
    override fun destroy()
}

open external class Mesh : GameObject, AlphaSingle, BlendMode, Depth, Mask, Pipeline, Size,
    _Phaser_GameObjects_Components_Texture, Transform, Visible, ScrollFactor {
    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally,
        alphas: Any = definedExternally
    )

    constructor(scene: Scene)
    constructor(scene: Scene, x: Number = definedExternally)
    constructor(scene: Scene, x: Number = definedExternally, y: Number = definedExternally)
    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Any = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally,
        alphas: Any = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Any = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally,
        alphas: Any = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Any = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: String = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally,
        alphas: Any = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Any = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: Texture = definedExternally,
        frame: Number = definedExternally,
        vertices: Array<Number> = definedExternally,
        uvs: Array<Number> = definedExternally,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally
    )

    open var faces: Array<Face>
    open var vertices: Array<Vertex>
    open var tintFill: Boolean
    open var debugCallback: Function<*>
    open var debugGraphic: Graphics
    open var hideCCW: Boolean
    open var modelPosition: Vector3
    open var modelScale: Vector3
    open var modelRotation: Vector3
    open var transformMatrix: Matrix4
    open var viewPosition: Vector3
    open var viewMatrix: Matrix4
    open var projectionMatrix: Matrix4
    open val totalRendered: Number
    open var ignoreDirtyCache: Boolean
    open fun panX(v: Number)
    open fun panY(v: Number)
    open fun panZ(v: Number)
    open fun setPerspective(
        width: Number,
        height: Number,
        fov: Number = definedExternally,
        near: Number = definedExternally,
        far: Number = definedExternally
    )

    open fun setOrtho(
        scaleX: Number = definedExternally,
        scaleY: Number = definedExternally,
        near: Number = definedExternally,
        far: Number = definedExternally
    )

    open fun clear(): Mesh /* this */
    open fun addVerticesFromObj(
        key: String,
        scale: Number = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        rotateX: Number = definedExternally,
        rotateY: Number = definedExternally,
        rotateZ: Number = definedExternally,
        zIsUp: Boolean = definedExternally
    ): Mesh /* this */

    open fun sortByDepth(faceA: Face, faceB: Face): Number
    open fun depthSort(): Mesh /* this */
    open fun addVertex(
        x: Number,
        y: Number,
        z: Number,
        u: Number,
        v: Number,
        color: Number = definedExternally,
        alpha: Number = definedExternally
    ): Mesh /* this */

    open fun addFace(vertex1: Vertex, vertex2: Vertex, vertex3: Vertex): Mesh /* this */
    open fun addVertices(
        vertices: Array<Number>,
        uvs: Array<Number>,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally,
        alphas: Number = definedExternally
    ): Mesh /* this */

    open fun addVertices(vertices: Array<Number>, uvs: Array<Number>): Mesh /* this */
    open fun addVertices(
        vertices: Array<Number>,
        uvs: Array<Number>,
        indicies: Array<Number> = definedExternally
    ): Mesh /* this */

    open fun addVertices(
        vertices: Array<Number>,
        uvs: Array<Number>,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally
    ): Mesh /* this */

    open fun addVertices(
        vertices: Array<Number>,
        uvs: Array<Number>,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally
    ): Mesh /* this */

    open fun addVertices(
        vertices: Array<Number>,
        uvs: Array<Number>,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally
    ): Mesh /* this */

    open fun addVertices(
        vertices: Array<Number>,
        uvs: Array<Number>,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Number = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Mesh /* this */

    open fun addVertices(
        vertices: Array<Number>,
        uvs: Array<Number>,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Number = definedExternally
    ): Mesh /* this */

    open fun addVertices(
        vertices: Array<Number>,
        uvs: Array<Number>,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally
    ): Mesh /* this */

    open fun addVertices(
        vertices: Array<Number>,
        uvs: Array<Number>,
        indicies: Array<Number> = definedExternally,
        containsZ: Boolean = definedExternally,
        normals: Array<Number> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Mesh /* this */

    open fun getFaceCount(): Number
    open fun getVertexCount(): Number
    open fun getFace(index: Number): Face
    open fun getFaceAt(x: Number, y: Number, camera: Camera = definedExternally): Array<Face>
    open fun setDebug(graphic: Graphics = definedExternally, callback: Function<*> = definedExternally): Mesh /* this */
    open fun isDirty(): Boolean
    open fun preUpdate(time: Number, delta: Number)
    open fun renderDebug(src: Mesh, faces: Array<Face>)
    open fun clearTint(): Mesh /* this */
    open fun setTint(tint: Number = definedExternally): Mesh /* this */
    open fun tint(): Number
    override fun clearAlpha(): Mesh /* this */
    override fun setAlpha(value: Number): Mesh /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Mesh | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Mesh | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Mesh /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Mesh | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Mesh | Mask */
    override fun clearMask(destroyMask: Boolean): Mesh /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Mesh | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Mesh | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Mesh | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Mesh | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Mesh | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Mesh | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Mesh | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Mesh | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Mesh | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Mesh | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Mesh | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Mesh | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Mesh | Pipeline */
    override fun setPipelineData(key: String, value: Any): Mesh /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Mesh | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Mesh | Pipeline */
    override fun getPipelineName(): String
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Mesh /* this */
    override fun setSize(width: Number, height: Number): Mesh /* this */
    override fun setDisplaySize(width: Number, height: Number): Mesh /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): dynamic /* Mesh | Texture */
    override fun setTexture(key: String): dynamic /* Texture */
    override fun setTexture(key: String, frame: Number): dynamic /* Mesh | Texture */
    override fun setTexture(key: Texture, frame: String): dynamic /* Mesh | Texture */
    override fun setTexture(key: Texture): dynamic /* Texture */
    override fun setTexture(key: Texture, frame: Number): dynamic /* Mesh | Texture */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Mesh | Texture */
    override fun setFrame(frame: String): dynamic /* Mesh | Texture */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Mesh | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Mesh | Texture */
    override fun setFrame(frame: Number): dynamic /* Mesh | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Mesh | Texture */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Mesh /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Mesh | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Mesh | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Mesh | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Mesh /* this */
    override fun setRotation(radians: Number): Mesh /* this */
    override fun setAngle(degrees: Number): Mesh /* this */
    override fun setScale(x: Number, y: Number): Mesh /* this */
    override fun setX(value: Number): Mesh /* this */
    override fun setY(value: Number): Mesh /* this */
    override fun setZ(value: Number): Mesh /* this */
    override fun setW(value: Number): Mesh /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Mesh /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Mesh /* this */
}

open external class PathFollower : Sprite, Phaser.GameObjects.Components.PathFollower {
    constructor(scene: Scene, path: Path, x: Number, y: Number, texture: String, frame: String = definedExternally)
    constructor(scene: Scene, path: Path, x: Number, y: Number, texture: String)
    constructor(scene: Scene, path: Path, x: Number, y: Number, texture: String, frame: Number = definedExternally)
    constructor(scene: Scene, path: Path, x: Number, y: Number, texture: Texture, frame: String = definedExternally)
    constructor(scene: Scene, path: Path, x: Number, y: Number, texture: Texture)
    constructor(scene: Scene, path: Path, x: Number, y: Number, texture: Texture, frame: Number = definedExternally)

    open var pathRotationOffset: Number
    open var pathOffset: Vector2
    open var pathVector: Vector2
    open var pathDelta: Vector2
    open var pathTween: Tween
    open var pathConfig: PathConfig
    override fun preUpdate(time: Number, delta: Number)
    override fun clearAlpha(): PathFollower /* this */
    override fun setAlpha(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): PathFollower /* this */

    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): PathFollower /* this */
    override fun setBlendMode(value: BlendModes): PathFollower /* this */
    override var depth: Number
    override fun setDepth(value: Number): PathFollower /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): PathFollower /* this */
    override fun toggleFlipY(): PathFollower /* this */
    override fun setFlipX(value: Boolean): PathFollower /* this */
    override fun setFlipY(value: Boolean): PathFollower /* this */
    override fun setFlip(x: Boolean, y: Boolean): PathFollower /* this */
    override fun resetFlip(): PathFollower /* this */
    override var fxPadding: Number
    override fun setFXPadding(padding: Number): PathFollower /* this */
    override fun onFXCopy(pipeline: SpriteFXPipeline)
    override fun onFX(pipeline: SpriteFXPipeline)
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): PathFollower /* this */
    override fun setMask(mask: GeometryMask): PathFollower /* this */
    override fun clearMask(destroyMask: Boolean): PathFollower /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): PathFollower /* this */
    override fun setOriginFromFrame(): PathFollower /* this */
    override fun setDisplayOrigin(x: Number, y: Number): PathFollower /* this */
    override fun updateDisplayOrigin(): PathFollower /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): PathFollower /* this */
    override fun setPipeline(pipeline: String): PathFollower /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): PathFollower /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): PathFollower /* this */
    override fun setPipeline(pipeline: WebGLPipeline): PathFollower /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): PathFollower /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): PathFollower /* this */
    override fun setPostPipeline(pipelines: String): PathFollower /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): PathFollower /* this */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): PathFollower /* this */

    override fun setPostPipeline(pipelines: Array<String>): PathFollower /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): PathFollower /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): PathFollower /* this */
    override fun setPostPipeline(pipelines: Function<*>): PathFollower /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): PathFollower /* this */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): PathFollower /* this */

    override fun setPostPipeline(pipelines: Array<Function<*>>): PathFollower /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): PathFollower /* this */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): PathFollower /* this */

    override fun setPostPipeline(pipelines: PostFXPipeline): PathFollower /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): PathFollower /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): PathFollower /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): PathFollower /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): PathFollower /* this */
    override fun setPipelineData(key: String, value: Any): PathFollower /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): PathFollower /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): PathFollower /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): PathFollower /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): PathFollower /* this */
    override fun setSize(width: Number, height: Number): PathFollower /* this */
    override fun setDisplaySize(width: Number, height: Number): PathFollower /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): PathFollower /* this */
    override fun setCrop(): PathFollower /* this */
    override fun setCrop(x: Number): PathFollower /* this */
    override fun setCrop(x: Number, y: Number): PathFollower /* this */
    override fun setCrop(x: Number, y: Number, width: Number): PathFollower /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number, height: Number): PathFollower /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle): PathFollower /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number): PathFollower /* this */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number): PathFollower /* this */
    override fun setTexture(key: String, frame: String): PathFollower /* this */
    override fun setTexture(key: String): PathFollower /* this */
    override fun setTexture(key: String, frame: Number): PathFollower /* this */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): PathFollower /* this */
    override fun setFrame(frame: String): PathFollower /* this */
    override fun setFrame(frame: String, updateSize: Boolean): PathFollower /* this */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): PathFollower /* this */
    override fun setFrame(frame: Number): PathFollower /* this */
    override fun setFrame(frame: Number, updateSize: Boolean): PathFollower /* this */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): PathFollower /* this */
    override fun setTint(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): PathFollower /* this */

    override fun setTintFill(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): PathFollower /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): PathFollower /* this */
    override fun copyPosition(source: Vector2Like): PathFollower /* this */
    override fun copyPosition(source: Vector3Like): PathFollower /* this */
    override fun copyPosition(source: Vector4Like): PathFollower /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): PathFollower /* this */
    override fun setRotation(radians: Number): PathFollower /* this */
    override fun setAngle(degrees: Number): PathFollower /* this */
    override fun setScale(x: Number, y: Number): PathFollower /* this */
    override fun setX(value: Number): PathFollower /* this */
    override fun setY(value: Number): PathFollower /* this */
    override fun setZ(value: Number): PathFollower /* this */
    override fun setW(value: Number): PathFollower /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): PathFollower /* this */
    override var path: Path
    override var rotateToPath: Boolean
    override fun setPath(path: Path, config: Number): dynamic /* PathFollower | PathFollower */
    override fun setPath(path: Path): dynamic /* PathFollower */
    override fun setPath(path: Path, config: PathConfig): dynamic /* PathFollower | PathFollower */
    override fun setPath(path: Path, config: NumberTweenBuilderConfig): dynamic /* PathFollower | PathFollower */
    override fun setRotateToPath(value: Boolean, offset: Number): PathFollower /* this */
    override fun isFollowing(): Boolean
    override fun startFollow(config: Number, startAt: Number): dynamic /* PathFollower | PathFollower */
    override fun startFollow(): dynamic /* PathFollower */
    override fun startFollow(config: Number): dynamic /* PathFollower | PathFollower */
    override fun startFollow(config: PathConfig, startAt: Number): dynamic /* PathFollower | PathFollower */
    override fun startFollow(config: PathConfig): dynamic /* PathFollower | PathFollower */
    override fun startFollow(
        config: NumberTweenBuilderConfig,
        startAt: Number
    ): dynamic /* PathFollower | PathFollower */

    override fun startFollow(config: NumberTweenBuilderConfig): dynamic /* PathFollower | PathFollower */
    override fun pauseFollow(): PathFollower /* this */
    override fun resumeFollow(): PathFollower /* this */
    override fun stopFollow(): PathFollower /* this */
    override fun pathUpdate()
}

open external class PointLight(
    scene: Scene,
    x: Number,
    y: Number,
    color: Number = definedExternally,
    radius: Number = definedExternally,
    intensity: Number = definedExternally,
    attenuation: Number = definedExternally
) : GameObject, AlphaSingle, BlendMode, Depth, GetBounds, Mask, Pipeline, ScrollFactor, Transform, Visible {
    open var color: Color
    open var intensity: Number
    open var attenuation: Number
    open var radius: Number
    override fun clearAlpha(): PointLight /* this */
    override fun setAlpha(value: Number): PointLight /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* PointLight | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* PointLight | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): PointLight /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* PointLight | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* PointLight | Mask */
    override fun clearMask(destroyMask: Boolean): PointLight /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(
        pipeline: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* PointLight | Pipeline */

    override fun setPipeline(pipeline: String): dynamic /* PointLight | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* PointLight | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* PointLight | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* PointLight | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* PointLight | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* PointLight | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* PointLight | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* PointLight | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* PointLight | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* PointLight | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* PointLight | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?
    ): dynamic /* PointLight | Pipeline */

    override fun setPipelineData(key: String, value: Any): PointLight /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* PointLight | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* PointLight | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): PointLight /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): PointLight /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* PointLight | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* PointLight | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* PointLight | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): PointLight /* this */
    override fun setRotation(radians: Number): PointLight /* this */
    override fun setAngle(degrees: Number): PointLight /* this */
    override fun setScale(x: Number, y: Number): PointLight /* this */
    override fun setX(value: Number): PointLight /* this */
    override fun setY(value: Number): PointLight /* this */
    override fun setZ(value: Number): PointLight /* this */
    override fun setW(value: Number): PointLight /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): PointLight /* this */
}

open external class RenderTexture(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    width: Number = definedExternally,
    height: Number = definedExternally,
    key: String = definedExternally,
    frame: String = definedExternally
) : GameObject, Alpha, BlendMode, ComputedSize, Crop, Depth, Flip, FX, GetBounds, Mask, Origin, Pipeline, ScrollFactor,
    Tint, Transform, Visible {
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var textureManager: TextureManager
    open var globalTint: Number
    open var globalAlpha: Number
    open var canvas: HTMLCanvasElement
    open var dirty: Boolean
    override var texture: Texture
    override var frame: Frame
    open var isSpriteTexture: Boolean
    open var context: CanvasRenderingContext2D
    open var camera: BaseCamera
    open var renderTarget: RenderTarget
    override fun setSize(width: Number, height: Number): RenderTexture /* this */
    open fun setIsSpriteTexture(value: Boolean): RenderTexture /* this */
    open fun resize(width: Number, height: Number = definedExternally): RenderTexture /* this */
    open fun setGlobalTint(tint: Number): RenderTexture /* this */
    open fun setGlobalAlpha(alpha: Number): RenderTexture /* this */
    open fun saveTexture(key: String): Texture
    open fun fill(
        rgb: Number,
        alpha: Number = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): RenderTexture /* this */

    open fun clear(): RenderTexture /* this */
    open fun erase(entries: Any, x: Number = definedExternally, y: Number = definedExternally): RenderTexture /* this */
    open fun draw(
        entries: Any,
        x: Number = definedExternally,
        y: Number = definedExternally,
        alpha: Number = definedExternally,
        tint: Number = definedExternally
    ): RenderTexture /* this */

    open fun drawFrame(
        key: String,
        frame: String = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        alpha: Number = definedExternally,
        tint: Number = definedExternally
    ): RenderTexture /* this */

    open fun drawFrame(key: String): RenderTexture /* this */
    open fun drawFrame(key: String, frame: String = definedExternally): RenderTexture /* this */
    open fun drawFrame(
        key: String,
        frame: String = definedExternally,
        x: Number = definedExternally
    ): RenderTexture /* this */

    open fun drawFrame(
        key: String,
        frame: String = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): RenderTexture /* this */

    open fun drawFrame(
        key: String,
        frame: String = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        alpha: Number = definedExternally
    ): RenderTexture /* this */

    open fun drawFrame(
        key: String,
        frame: Number = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        alpha: Number = definedExternally,
        tint: Number = definedExternally
    ): RenderTexture /* this */

    open fun drawFrame(key: String, frame: Number = definedExternally): RenderTexture /* this */
    open fun drawFrame(
        key: String,
        frame: Number = definedExternally,
        x: Number = definedExternally
    ): RenderTexture /* this */

    open fun drawFrame(
        key: String,
        frame: Number = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): RenderTexture /* this */

    open fun drawFrame(
        key: String,
        frame: Number = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        alpha: Number = definedExternally
    ): RenderTexture /* this */

    open fun beginDraw(): RenderTexture /* this */
    open fun batchDraw(
        entries: Any,
        x: Number = definedExternally,
        y: Number = definedExternally,
        alpha: Number = definedExternally,
        tint: Number = definedExternally
    ): RenderTexture /* this */

    open fun batchDrawFrame(
        key: String,
        frame: String = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        alpha: Number = definedExternally,
        tint: Number = definedExternally
    ): RenderTexture /* this */

    open fun batchDrawFrame(key: String): RenderTexture /* this */
    open fun batchDrawFrame(key: String, frame: String = definedExternally): RenderTexture /* this */
    open fun batchDrawFrame(
        key: String,
        frame: String = definedExternally,
        x: Number = definedExternally
    ): RenderTexture /* this */

    open fun batchDrawFrame(
        key: String,
        frame: String = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): RenderTexture /* this */

    open fun batchDrawFrame(
        key: String,
        frame: String = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        alpha: Number = definedExternally
    ): RenderTexture /* this */

    open fun batchDrawFrame(
        key: String,
        frame: Number = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        alpha: Number = definedExternally,
        tint: Number = definedExternally
    ): RenderTexture /* this */

    open fun batchDrawFrame(key: String, frame: Number = definedExternally): RenderTexture /* this */
    open fun batchDrawFrame(
        key: String,
        frame: Number = definedExternally,
        x: Number = definedExternally
    ): RenderTexture /* this */

    open fun batchDrawFrame(
        key: String,
        frame: Number = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): RenderTexture /* this */

    open fun batchDrawFrame(
        key: String,
        frame: Number = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        alpha: Number = definedExternally
    ): RenderTexture /* this */

    open fun endDraw(erase: Boolean = definedExternally): RenderTexture /* this */
    open fun snapshotArea(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        callback: SnapshotCallback,
        type: String = definedExternally,
        encoderOptions: Number = definedExternally
    ): RenderTexture /* this */

    open fun snapshot(
        callback: SnapshotCallback,
        type: String = definedExternally,
        encoderOptions: Number = definedExternally
    ): RenderTexture /* this */

    open fun snapshotPixel(x: Number, y: Number, callback: SnapshotCallback): RenderTexture /* this */
    open fun preDestroy()
    override fun clearAlpha(): RenderTexture /* this */
    override fun setAlpha(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): RenderTexture /* this */

    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* RenderTexture | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* RenderTexture | BlendMode */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setDisplaySize(width: Number, height: Number): RenderTexture /* this */
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): dynamic /* RenderTexture | Crop */
    override fun setCrop(): dynamic /* Crop */
    override fun setCrop(x: Number): dynamic /* RenderTexture | Crop */
    override fun setCrop(x: Number, y: Number): dynamic /* RenderTexture | Crop */
    override fun setCrop(x: Number, y: Number, width: Number): dynamic /* RenderTexture | Crop */
    override fun setCrop(
        x: Phaser.Geom.Rectangle,
        y: Number,
        width: Number,
        height: Number
    ): dynamic /* RenderTexture | Crop */

    override fun setCrop(x: Phaser.Geom.Rectangle): dynamic /* RenderTexture | Crop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number): dynamic /* RenderTexture | Crop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number): dynamic /* RenderTexture | Crop */
    override var depth: Number
    override fun setDepth(value: Number): RenderTexture /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): RenderTexture /* this */
    override fun toggleFlipY(): RenderTexture /* this */
    override fun setFlipX(value: Boolean): RenderTexture /* this */
    override fun setFlipY(value: Boolean): RenderTexture /* this */
    override fun setFlip(x: Boolean, y: Boolean): RenderTexture /* this */
    override fun resetFlip(): RenderTexture /* this */
    override var fxPadding: Number
    override fun setFXPadding(padding: Number): RenderTexture /* this */
    override fun onFXCopy(pipeline: SpriteFXPipeline)
    override fun onFX(pipeline: SpriteFXPipeline)
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* RenderTexture | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* RenderTexture | Mask */
    override fun clearMask(destroyMask: Boolean): RenderTexture /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): RenderTexture /* this */
    override fun setOriginFromFrame(): RenderTexture /* this */
    override fun setDisplayOrigin(x: Number, y: Number): RenderTexture /* this */
    override fun updateDisplayOrigin(): RenderTexture /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(
        pipeline: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* RenderTexture | Pipeline */

    override fun setPipeline(pipeline: String): dynamic /* RenderTexture | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* RenderTexture | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* RenderTexture | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* RenderTexture | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* RenderTexture | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* RenderTexture | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* RenderTexture | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* RenderTexture | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?
    ): dynamic /* RenderTexture | Pipeline */

    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* RenderTexture | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* RenderTexture | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* RenderTexture | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?
    ): dynamic /* RenderTexture | Pipeline */

    override fun setPipelineData(key: String, value: Any): RenderTexture /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* RenderTexture | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* RenderTexture | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): RenderTexture /* this */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): RenderTexture /* this */
    override fun setTint(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): RenderTexture /* this */

    override fun setTintFill(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): RenderTexture /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): RenderTexture /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* RenderTexture | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* RenderTexture | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* RenderTexture | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): RenderTexture /* this */
    override fun setRotation(radians: Number): RenderTexture /* this */
    override fun setAngle(degrees: Number): RenderTexture /* this */
    override fun setScale(x: Number, y: Number): RenderTexture /* this */
    override fun setX(value: Number): RenderTexture /* this */
    override fun setY(value: Number): RenderTexture /* this */
    override fun setZ(value: Number): RenderTexture /* this */
    override fun setW(value: Number): RenderTexture /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): RenderTexture /* this */
}

open external class Rope : GameObject, AlphaSingle, BlendMode, Depth, Flip, Mask, Pipeline, Size,
    _Phaser_GameObjects_Components_Texture, Transform, Visible, ScrollFactor {
    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String? = definedExternally,
        points: Number = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    )

    constructor(scene: Scene)
    constructor(scene: Scene, x: Number = definedExternally)
    constructor(scene: Scene, x: Number = definedExternally, y: Number = definedExternally)
    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String? = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String? = definedExternally,
        points: Number = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String? = definedExternally,
        points: Number = definedExternally,
        horizontal: Boolean = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String? = definedExternally,
        points: Number = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String? = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String? = definedExternally,
        points: Array<Vector2Like> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String? = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: String? = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number? = definedExternally,
        points: Number = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number? = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number? = definedExternally,
        points: Number = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number? = definedExternally,
        points: Number = definedExternally,
        horizontal: Boolean = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number? = definedExternally,
        points: Number = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number? = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number? = definedExternally,
        points: Array<Vector2Like> = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number? = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally
    )

    constructor(
        scene: Scene,
        x: Number = definedExternally,
        y: Number = definedExternally,
        texture: String = definedExternally,
        frame: Number? = definedExternally,
        points: Array<Vector2Like> = definedExternally,
        horizontal: Boolean = definedExternally,
        colors: Array<Number> = definedExternally
    )

    open var anims: AnimationState
    open var points: Array<Vector2Like>
    open var vertices: Float32Array
    open var uv: Float32Array
    open var colors: Uint32Array
    open var alphas: Float32Array
    open var tintFill: Boolean
    open var dirty: Boolean
    open val horizontal: Boolean
    open var debugCallback: Function<*>
    open var debugGraphic: Graphics
    open fun preUpdate(time: Number, delta: Number)
    open fun play(
        key: String,
        ignoreIfPlaying: Boolean = definedExternally,
        startFrame: Number = definedExternally
    ): Rope /* this */

    open fun setDirty(): Rope /* this */
    open fun setHorizontal(
        points: Number = definedExternally,
        colors: Number = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setHorizontal(): Rope /* this */
    open fun setHorizontal(points: Number = definedExternally): Rope /* this */
    open fun setHorizontal(points: Number = definedExternally, colors: Number = definedExternally): Rope /* this */
    open fun setHorizontal(
        points: Number = definedExternally,
        colors: Number = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setHorizontal(
        points: Number = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setHorizontal(
        points: Number = definedExternally,
        colors: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setHorizontal(
        points: Number = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setHorizontal(
        points: Array<Vector2Like> = definedExternally,
        colors: Number = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setHorizontal(points: Array<Vector2Like> = definedExternally): Rope /* this */
    open fun setHorizontal(
        points: Array<Vector2Like> = definedExternally,
        colors: Number = definedExternally
    ): Rope /* this */

    open fun setHorizontal(
        points: Array<Vector2Like> = definedExternally,
        colors: Number = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setHorizontal(
        points: Array<Vector2Like> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setHorizontal(
        points: Array<Vector2Like> = definedExternally,
        colors: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setHorizontal(
        points: Array<Vector2Like> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setVertical(
        points: Number = definedExternally,
        colors: Number = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setVertical(): Rope /* this */
    open fun setVertical(points: Number = definedExternally): Rope /* this */
    open fun setVertical(points: Number = definedExternally, colors: Number = definedExternally): Rope /* this */
    open fun setVertical(
        points: Number = definedExternally,
        colors: Number = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setVertical(
        points: Number = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setVertical(points: Number = definedExternally, colors: Array<Number> = definedExternally): Rope /* this */
    open fun setVertical(
        points: Number = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setVertical(
        points: Array<Vector2Like> = definedExternally,
        colors: Number = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setVertical(points: Array<Vector2Like> = definedExternally): Rope /* this */
    open fun setVertical(
        points: Array<Vector2Like> = definedExternally,
        colors: Number = definedExternally
    ): Rope /* this */

    open fun setVertical(
        points: Array<Vector2Like> = definedExternally,
        colors: Number = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setVertical(
        points: Array<Vector2Like> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setVertical(
        points: Array<Vector2Like> = definedExternally,
        colors: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setVertical(
        points: Array<Vector2Like> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setTintFill(value: Boolean = definedExternally): Rope /* this */
    open fun setAlphas(alphas: Number = definedExternally, bottomAlpha: Number = definedExternally): Rope /* this */
    open fun setAlphas(): Rope /* this */
    open fun setAlphas(alphas: Number = definedExternally): Rope /* this */
    open fun setAlphas(
        alphas: Array<Number> = definedExternally,
        bottomAlpha: Number = definedExternally
    ): Rope /* this */

    open fun setAlphas(alphas: Array<Number> = definedExternally): Rope /* this */
    open fun setColors(colors: Number = definedExternally): Rope /* this */
    open fun setColors(): Rope /* this */
    open fun setColors(colors: Array<Number> = definedExternally): Rope /* this */
    open fun setPoints(
        points: Number = definedExternally,
        colors: Number = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setPoints(): Rope /* this */
    open fun setPoints(points: Number = definedExternally): Rope /* this */
    open fun setPoints(points: Number = definedExternally, colors: Number = definedExternally): Rope /* this */
    open fun setPoints(
        points: Number = definedExternally,
        colors: Number = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setPoints(
        points: Number = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setPoints(points: Number = definedExternally, colors: Array<Number> = definedExternally): Rope /* this */
    open fun setPoints(
        points: Number = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setPoints(
        points: Array<Vector2Like> = definedExternally,
        colors: Number = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setPoints(points: Array<Vector2Like> = definedExternally): Rope /* this */
    open fun setPoints(
        points: Array<Vector2Like> = definedExternally,
        colors: Number = definedExternally
    ): Rope /* this */

    open fun setPoints(
        points: Array<Vector2Like> = definedExternally,
        colors: Number = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setPoints(
        points: Array<Vector2Like> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Number = definedExternally
    ): Rope /* this */

    open fun setPoints(
        points: Array<Vector2Like> = definedExternally,
        colors: Array<Number> = definedExternally
    ): Rope /* this */

    open fun setPoints(
        points: Array<Vector2Like> = definedExternally,
        colors: Array<Number> = definedExternally,
        alphas: Array<Number> = definedExternally
    ): Rope /* this */

    open fun updateUVs(): Rope /* this */
    open fun resizeArrays(newSize: Number): Rope /* this */
    open fun updateVertices(): Rope /* this */
    open fun setDebug(graphic: Graphics = definedExternally, callback: Function<*> = definedExternally): Rope /* this */
    open fun renderDebugVerts(src: Rope, meshLength: Number, verts: Array<Number>)
    override var flipX: Boolean
    override var flipY: Boolean
    override fun clearAlpha(): Rope /* this */
    override fun setAlpha(value: Number): Rope /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Rope | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Rope | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Rope /* this */
    override fun toggleFlipX(): Rope /* this */
    override fun toggleFlipY(): Rope /* this */
    override fun setFlipX(value: Boolean): Rope /* this */
    override fun setFlipY(value: Boolean): Rope /* this */
    override fun setFlip(x: Boolean, y: Boolean): Rope /* this */
    override fun resetFlip(): Rope /* this */
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Rope | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Rope | Mask */
    override fun clearMask(destroyMask: Boolean): Rope /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Rope | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Rope | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Rope | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Rope | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Rope | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Rope | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Rope | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Rope | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Rope | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Rope | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Rope | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Rope | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Rope | Pipeline */
    override fun setPipelineData(key: String, value: Any): Rope /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Rope | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Rope | Pipeline */
    override fun getPipelineName(): String
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Rope /* this */
    override fun setSize(width: Number, height: Number): Rope /* this */
    override fun setDisplaySize(width: Number, height: Number): Rope /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override fun setTexture(key: String, frame: String): dynamic /* Rope | Texture */
    override fun setTexture(key: String): dynamic /* Texture */
    override fun setTexture(key: String, frame: Number): dynamic /* Rope | Texture */
    override fun setTexture(key: Texture, frame: String): dynamic /* Rope | Texture */
    override fun setTexture(key: Texture): dynamic /* Texture */
    override fun setTexture(key: Texture, frame: Number): dynamic /* Rope | Texture */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Rope | Texture */
    override fun setFrame(frame: String): dynamic /* Rope | Texture */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Rope | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Rope | Texture */
    override fun setFrame(frame: Number): dynamic /* Rope | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Rope | Texture */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Rope /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Rope | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Rope | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Rope | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Rope /* this */
    override fun setRotation(radians: Number): Rope /* this */
    override fun setAngle(degrees: Number): Rope /* this */
    override fun setScale(x: Number, y: Number): Rope /* this */
    override fun setX(value: Number): Rope /* this */
    override fun setY(value: Number): Rope /* this */
    override fun setZ(value: Number): Rope /* this */
    override fun setW(value: Number): Rope /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Rope /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Rope /* this */
}

open external class Shader : GameObject, ComputedSize, Depth, GetBounds, Mask, Origin, ScrollFactor, Transform,
    Visible {
    constructor(
        scene: Scene,
        key: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        textures: Array<String> = definedExternally,
        textureData: Any = definedExternally
    )

    constructor(scene: Scene, key: String)
    constructor(scene: Scene, key: String, x: Number = definedExternally)
    constructor(scene: Scene, key: String, x: Number = definedExternally, y: Number = definedExternally)
    constructor(
        scene: Scene,
        key: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally
    )

    constructor(
        scene: Scene,
        key: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(
        scene: Scene,
        key: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        textures: Array<String> = definedExternally
    )

    constructor(
        scene: Scene,
        key: BaseShader,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        textures: Array<String> = definedExternally,
        textureData: Any = definedExternally
    )

    constructor(scene: Scene, key: BaseShader)
    constructor(scene: Scene, key: BaseShader, x: Number = definedExternally)
    constructor(scene: Scene, key: BaseShader, x: Number = definedExternally, y: Number = definedExternally)
    constructor(
        scene: Scene,
        key: BaseShader,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally
    )

    constructor(
        scene: Scene,
        key: BaseShader,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(
        scene: Scene,
        key: BaseShader,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        textures: Array<String> = definedExternally
    )

    open var shader: BaseShader
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var gl: WebGLRenderingContext
    open var vertexData: ArrayBuffer
    open var vertexBuffer: WebGLBuffer
    open var program: WebGLProgram
    open var bytes: Uint8Array
    open var vertexViewF32: Float32Array
    open val viewMatrix: Float32Array
    open val projectionMatrix: Float32Array
    open var uniforms: Any
    open var pointer: Pointer
    open var framebuffer: WebGLFramebuffer
    open var glTexture: WebGLTexture
    open val renderToTexture: Boolean
    open var texture: Texture
    override fun willRender(camera: Camera): Boolean
    open fun setRenderToTexture(key: String = definedExternally, flipY: Boolean = definedExternally): Shader /* this */
    open fun setShader(
        key: String,
        textures: Array<String> = definedExternally,
        textureData: Any = definedExternally
    ): Shader /* this */

    open fun setShader(key: String): Shader /* this */
    open fun setShader(key: String, textures: Array<String> = definedExternally): Shader /* this */
    open fun setShader(
        key: BaseShader,
        textures: Array<String> = definedExternally,
        textureData: Any = definedExternally
    ): Shader /* this */

    open fun setShader(key: BaseShader): Shader /* this */
    open fun setShader(key: BaseShader, textures: Array<String> = definedExternally): Shader /* this */
    open fun setPointer(pointer: Pointer = definedExternally): Shader /* this */
    open fun projOrtho(left: Number, right: Number, bottom: Number, top: Number)
    open fun setSampler2DBuffer(
        uniformKey: String,
        texture: WebGLTexture,
        width: Number,
        height: Number,
        textureIndex: Number = definedExternally,
        textureData: Any = definedExternally
    ): Shader /* this */

    open fun setSampler2D(
        uniformKey: String,
        textureKey: String,
        textureIndex: Number = definedExternally,
        textureData: Any = definedExternally
    ): Shader /* this */

    open fun setUniform(key: String, value: Any): Shader /* this */
    open fun getUniform(key: String): Any
    open fun setChannel0(textureKey: String, textureData: Any = definedExternally): Shader /* this */
    open fun setChannel1(textureKey: String, textureData: Any = definedExternally): Shader /* this */
    open fun setChannel2(textureKey: String, textureData: Any = definedExternally): Shader /* this */
    open fun setChannel3(textureKey: String, textureData: Any = definedExternally): Shader /* this */
    open fun load(matrix2D: TransformMatrix = definedExternally)
    open fun flush()
    open fun preDestroy()
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Shader /* this */
    override fun setDisplaySize(width: Number, height: Number): Shader /* this */
    override var depth: Number
    override fun setDepth(value: Number): Shader /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Shader | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Shader | Mask */
    override fun clearMask(destroyMask: Boolean): Shader /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Shader /* this */
    override fun setOriginFromFrame(): Shader /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Shader /* this */
    override fun updateDisplayOrigin(): Shader /* this */
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Shader /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Shader /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Shader | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Shader | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Shader | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Shader /* this */
    override fun setRotation(radians: Number): Shader /* this */
    override fun setAngle(degrees: Number): Shader /* this */
    override fun setScale(x: Number, y: Number): Shader /* this */
    override fun setX(value: Number): Shader /* this */
    override fun setY(value: Number): Shader /* this */
    override fun setZ(value: Number): Shader /* this */
    override fun setW(value: Number): Shader /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Shader /* this */
}

open external class Arc(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    radius: Number = definedExternally,
    startAngle: Number = definedExternally,
    endAngle: Number = definedExternally,
    anticlockwise: Boolean = definedExternally,
    fillColor: Number = definedExternally,
    fillAlpha: Number = definedExternally
) : Shape {
    open var iterations: Number
    open var radius: Number
    open var startAngle: Number
    open var endAngle: Number
    open var anticlockwise: Boolean
    open fun setRadius(value: Number): Arc /* this */
    open fun setIterations(value: Number): Arc /* this */
    open fun setStartAngle(value: Number): Arc /* this */
    open fun setEndAngle(value: Number): Arc /* this */
    override fun clearAlpha(): Arc /* this */
    override fun setAlpha(value: Number): Arc /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Arc /* this */
    override fun setBlendMode(value: BlendModes): Arc /* this */
    override var depth: Number
    override fun setDepth(value: Number): Arc /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Arc /* this */
    override fun setMask(mask: GeometryMask): Arc /* this */
    override fun clearMask(destroyMask: Boolean): Arc /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Arc /* this */
    override fun setOriginFromFrame(): Arc /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Arc /* this */
    override fun updateDisplayOrigin(): Arc /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): Arc /* this */
    override fun setPipeline(pipeline: String): Arc /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): Arc /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): Arc /* this */
    override fun setPipeline(pipeline: WebGLPipeline): Arc /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): Arc /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): Arc /* this */
    override fun setPostPipeline(pipelines: String): Arc /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): Arc /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?, copyData: Boolean): Arc /* this */
    override fun setPostPipeline(pipelines: Array<String>): Arc /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): Arc /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): Arc /* this */
    override fun setPostPipeline(pipelines: Function<*>): Arc /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): Arc /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?, copyData: Boolean): Arc /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>): Arc /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): Arc /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?, copyData: Boolean): Arc /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline): Arc /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): Arc /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): Arc /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): Arc /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): Arc /* this */
    override fun setPipelineData(key: String, value: Any): Arc /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): Arc /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): Arc /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Arc /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Arc /* this */
    override fun copyPosition(source: Vector2Like): Arc /* this */
    override fun copyPosition(source: Vector3Like): Arc /* this */
    override fun copyPosition(source: Vector4Like): Arc /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Arc /* this */
    override fun setRotation(radians: Number): Arc /* this */
    override fun setAngle(degrees: Number): Arc /* this */
    override fun setScale(x: Number, y: Number): Arc /* this */
    override fun setX(value: Number): Arc /* this */
    override fun setY(value: Number): Arc /* this */
    override fun setZ(value: Number): Arc /* this */
    override fun setW(value: Number): Arc /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Arc /* this */
}

open external class Curve(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    curve: Phaser.Curves.Curve = definedExternally,
    fillColor: Number = definedExternally,
    fillAlpha: Number = definedExternally
) : Shape {
    open var smoothness: Number
    open fun setSmoothness(value: Number): Curve /* this */
    override fun clearAlpha(): Curve /* this */
    override fun setAlpha(value: Number): Curve /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Curve /* this */
    override fun setBlendMode(value: BlendModes): Curve /* this */
    override var depth: Number
    override fun setDepth(value: Number): Curve /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Curve /* this */
    override fun setMask(mask: GeometryMask): Curve /* this */
    override fun clearMask(destroyMask: Boolean): Curve /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Curve /* this */
    override fun setOriginFromFrame(): Curve /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Curve /* this */
    override fun updateDisplayOrigin(): Curve /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): Curve /* this */
    override fun setPipeline(pipeline: String): Curve /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): Curve /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): Curve /* this */
    override fun setPipeline(pipeline: WebGLPipeline): Curve /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): Curve /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): Curve /* this */
    override fun setPostPipeline(pipelines: String): Curve /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): Curve /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?, copyData: Boolean): Curve /* this */
    override fun setPostPipeline(pipelines: Array<String>): Curve /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): Curve /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): Curve /* this */
    override fun setPostPipeline(pipelines: Function<*>): Curve /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): Curve /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?, copyData: Boolean): Curve /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>): Curve /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): Curve /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?, copyData: Boolean): Curve /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline): Curve /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): Curve /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): Curve /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): Curve /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): Curve /* this */
    override fun setPipelineData(key: String, value: Any): Curve /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): Curve /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): Curve /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Curve /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Curve /* this */
    override fun copyPosition(source: Vector2Like): Curve /* this */
    override fun copyPosition(source: Vector3Like): Curve /* this */
    override fun copyPosition(source: Vector4Like): Curve /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Curve /* this */
    override fun setRotation(radians: Number): Curve /* this */
    override fun setAngle(degrees: Number): Curve /* this */
    override fun setScale(x: Number, y: Number): Curve /* this */
    override fun setX(value: Number): Curve /* this */
    override fun setY(value: Number): Curve /* this */
    override fun setZ(value: Number): Curve /* this */
    override fun setW(value: Number): Curve /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Curve /* this */
}

open external class Ellipse(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    width: Number = definedExternally,
    height: Number = definedExternally,
    fillColor: Number = definedExternally,
    fillAlpha: Number = definedExternally
) : Shape {
    open var smoothness: Number
    open fun setSize(width: Number, height: Number): Ellipse /* this */
    open fun setSmoothness(value: Number): Ellipse /* this */
    override fun clearAlpha(): Ellipse /* this */
    override fun setAlpha(value: Number): Ellipse /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Ellipse /* this */
    override fun setBlendMode(value: BlendModes): Ellipse /* this */
    override var depth: Number
    override fun setDepth(value: Number): Ellipse /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Ellipse /* this */
    override fun setMask(mask: GeometryMask): Ellipse /* this */
    override fun clearMask(destroyMask: Boolean): Ellipse /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Ellipse /* this */
    override fun setOriginFromFrame(): Ellipse /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Ellipse /* this */
    override fun updateDisplayOrigin(): Ellipse /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): Ellipse /* this */
    override fun setPipeline(pipeline: String): Ellipse /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): Ellipse /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): Ellipse /* this */
    override fun setPipeline(pipeline: WebGLPipeline): Ellipse /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): Ellipse /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): Ellipse /* this */
    override fun setPostPipeline(pipelines: String): Ellipse /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): Ellipse /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?, copyData: Boolean): Ellipse /* this */
    override fun setPostPipeline(pipelines: Array<String>): Ellipse /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): Ellipse /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): Ellipse /* this */
    override fun setPostPipeline(pipelines: Function<*>): Ellipse /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): Ellipse /* this */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): Ellipse /* this */

    override fun setPostPipeline(pipelines: Array<Function<*>>): Ellipse /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): Ellipse /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?, copyData: Boolean): Ellipse /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline): Ellipse /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): Ellipse /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): Ellipse /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): Ellipse /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): Ellipse /* this */
    override fun setPipelineData(key: String, value: Any): Ellipse /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): Ellipse /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): Ellipse /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Ellipse /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Ellipse /* this */
    override fun copyPosition(source: Vector2Like): Ellipse /* this */
    override fun copyPosition(source: Vector3Like): Ellipse /* this */
    override fun copyPosition(source: Vector4Like): Ellipse /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Ellipse /* this */
    override fun setRotation(radians: Number): Ellipse /* this */
    override fun setAngle(degrees: Number): Ellipse /* this */
    override fun setScale(x: Number, y: Number): Ellipse /* this */
    override fun setX(value: Number): Ellipse /* this */
    override fun setY(value: Number): Ellipse /* this */
    override fun setZ(value: Number): Ellipse /* this */
    override fun setW(value: Number): Ellipse /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Ellipse /* this */
}

open external class Grid(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    width: Number = definedExternally,
    height: Number = definedExternally,
    cellWidth: Number = definedExternally,
    cellHeight: Number = definedExternally,
    fillColor: Number = definedExternally,
    fillAlpha: Number = definedExternally,
    outlineFillColor: Number = definedExternally,
    outlineFillAlpha: Number = definedExternally
) : Shape {
    open var cellWidth: Number
    open var cellHeight: Number
    open var showCells: Boolean
    open var outlineFillColor: Number
    open var outlineFillAlpha: Number
    open var showOutline: Boolean
    open var showAltCells: Boolean
    open var altFillColor: Number
    open var altFillAlpha: Number
    override fun setFillStyle(color: Number, alpha: Number): Grid /* this */
    open fun setAltFillStyle(
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally
    ): Grid /* this */

    open fun setOutlineStyle(
        fillColor: Number = definedExternally,
        fillAlpha: Number = definedExternally
    ): Grid /* this */

    override fun clearAlpha(): Grid /* this */
    override fun setAlpha(value: Number): Grid /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Grid /* this */
    override fun setBlendMode(value: BlendModes): Grid /* this */
    override var depth: Number
    override fun setDepth(value: Number): Grid /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Grid /* this */
    override fun setMask(mask: GeometryMask): Grid /* this */
    override fun clearMask(destroyMask: Boolean): Grid /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Grid /* this */
    override fun setOriginFromFrame(): Grid /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Grid /* this */
    override fun updateDisplayOrigin(): Grid /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): Grid /* this */
    override fun setPipeline(pipeline: String): Grid /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): Grid /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): Grid /* this */
    override fun setPipeline(pipeline: WebGLPipeline): Grid /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): Grid /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): Grid /* this */
    override fun setPostPipeline(pipelines: String): Grid /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): Grid /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?, copyData: Boolean): Grid /* this */
    override fun setPostPipeline(pipelines: Array<String>): Grid /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): Grid /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): Grid /* this */
    override fun setPostPipeline(pipelines: Function<*>): Grid /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): Grid /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?, copyData: Boolean): Grid /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>): Grid /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): Grid /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?, copyData: Boolean): Grid /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline): Grid /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): Grid /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): Grid /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): Grid /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): Grid /* this */
    override fun setPipelineData(key: String, value: Any): Grid /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): Grid /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): Grid /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Grid /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Grid /* this */
    override fun copyPosition(source: Vector2Like): Grid /* this */
    override fun copyPosition(source: Vector3Like): Grid /* this */
    override fun copyPosition(source: Vector4Like): Grid /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Grid /* this */
    override fun setRotation(radians: Number): Grid /* this */
    override fun setAngle(degrees: Number): Grid /* this */
    override fun setScale(x: Number, y: Number): Grid /* this */
    override fun setX(value: Number): Grid /* this */
    override fun setY(value: Number): Grid /* this */
    override fun setZ(value: Number): Grid /* this */
    override fun setW(value: Number): Grid /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Grid /* this */
}

open external class IsoBox(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    size: Number = definedExternally,
    height: Number = definedExternally,
    fillTop: Number = definedExternally,
    fillLeft: Number = definedExternally,
    fillRight: Number = definedExternally
) : Shape {
    open var projection: Number
    open var fillTop: Number
    open var fillLeft: Number
    open var fillRight: Number
    open var showTop: Boolean
    open var showLeft: Boolean
    open var showRight: Boolean
    open fun setProjection(value: Number): IsoBox /* this */
    open fun setFaces(
        showTop: Boolean = definedExternally,
        showLeft: Boolean = definedExternally,
        showRight: Boolean = definedExternally
    ): IsoBox /* this */

    open fun setFillStyle(
        fillTop: Number = definedExternally,
        fillLeft: Number = definedExternally,
        fillRight: Number = definedExternally
    ): IsoBox /* this */

    override fun clearAlpha(): IsoBox /* this */
    override fun setAlpha(value: Number): IsoBox /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): IsoBox /* this */
    override fun setBlendMode(value: BlendModes): IsoBox /* this */
    override var depth: Number
    override fun setDepth(value: Number): IsoBox /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): IsoBox /* this */
    override fun setMask(mask: GeometryMask): IsoBox /* this */
    override fun clearMask(destroyMask: Boolean): IsoBox /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): IsoBox /* this */
    override fun setOriginFromFrame(): IsoBox /* this */
    override fun setDisplayOrigin(x: Number, y: Number): IsoBox /* this */
    override fun updateDisplayOrigin(): IsoBox /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): IsoBox /* this */
    override fun setPipeline(pipeline: String): IsoBox /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): IsoBox /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): IsoBox /* this */
    override fun setPipeline(pipeline: WebGLPipeline): IsoBox /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): IsoBox /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): IsoBox /* this */
    override fun setPostPipeline(pipelines: String): IsoBox /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): IsoBox /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?, copyData: Boolean): IsoBox /* this */
    override fun setPostPipeline(pipelines: Array<String>): IsoBox /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): IsoBox /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): IsoBox /* this */
    override fun setPostPipeline(pipelines: Function<*>): IsoBox /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): IsoBox /* this */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): IsoBox /* this */

    override fun setPostPipeline(pipelines: Array<Function<*>>): IsoBox /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): IsoBox /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?, copyData: Boolean): IsoBox /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline): IsoBox /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): IsoBox /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): IsoBox /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): IsoBox /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): IsoBox /* this */
    override fun setPipelineData(key: String, value: Any): IsoBox /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): IsoBox /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): IsoBox /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): IsoBox /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): IsoBox /* this */
    override fun copyPosition(source: Vector2Like): IsoBox /* this */
    override fun copyPosition(source: Vector3Like): IsoBox /* this */
    override fun copyPosition(source: Vector4Like): IsoBox /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): IsoBox /* this */
    override fun setRotation(radians: Number): IsoBox /* this */
    override fun setAngle(degrees: Number): IsoBox /* this */
    override fun setScale(x: Number, y: Number): IsoBox /* this */
    override fun setX(value: Number): IsoBox /* this */
    override fun setY(value: Number): IsoBox /* this */
    override fun setZ(value: Number): IsoBox /* this */
    override fun setW(value: Number): IsoBox /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): IsoBox /* this */
}

open external class IsoTriangle(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    size: Number = definedExternally,
    height: Number = definedExternally,
    reversed: Boolean = definedExternally,
    fillTop: Number = definedExternally,
    fillLeft: Number = definedExternally,
    fillRight: Number = definedExternally
) : Shape {
    open var projection: Number
    open var fillTop: Number
    open var fillLeft: Number
    open var fillRight: Number
    open var showTop: Boolean
    open var showLeft: Boolean
    open var showRight: Boolean
    open var isReversed: Boolean
    open fun setProjection(value: Number): IsoTriangle /* this */
    open fun setReversed(reversed: Boolean): IsoTriangle /* this */
    open fun setFaces(
        showTop: Boolean = definedExternally,
        showLeft: Boolean = definedExternally,
        showRight: Boolean = definedExternally
    ): IsoTriangle /* this */

    open fun setFillStyle(
        fillTop: Number = definedExternally,
        fillLeft: Number = definedExternally,
        fillRight: Number = definedExternally
    ): IsoTriangle /* this */

    override fun clearAlpha(): IsoTriangle /* this */
    override fun setAlpha(value: Number): IsoTriangle /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): IsoTriangle /* this */
    override fun setBlendMode(value: BlendModes): IsoTriangle /* this */
    override var depth: Number
    override fun setDepth(value: Number): IsoTriangle /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): IsoTriangle /* this */
    override fun setMask(mask: GeometryMask): IsoTriangle /* this */
    override fun clearMask(destroyMask: Boolean): IsoTriangle /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): IsoTriangle /* this */
    override fun setOriginFromFrame(): IsoTriangle /* this */
    override fun setDisplayOrigin(x: Number, y: Number): IsoTriangle /* this */
    override fun updateDisplayOrigin(): IsoTriangle /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): IsoTriangle /* this */
    override fun setPipeline(pipeline: String): IsoTriangle /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): IsoTriangle /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): IsoTriangle /* this */
    override fun setPipeline(pipeline: WebGLPipeline): IsoTriangle /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): IsoTriangle /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): IsoTriangle /* this */
    override fun setPostPipeline(pipelines: String): IsoTriangle /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): IsoTriangle /* this */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): IsoTriangle /* this */

    override fun setPostPipeline(pipelines: Array<String>): IsoTriangle /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): IsoTriangle /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): IsoTriangle /* this */
    override fun setPostPipeline(pipelines: Function<*>): IsoTriangle /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): IsoTriangle /* this */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): IsoTriangle /* this */

    override fun setPostPipeline(pipelines: Array<Function<*>>): IsoTriangle /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): IsoTriangle /* this */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): IsoTriangle /* this */

    override fun setPostPipeline(pipelines: PostFXPipeline): IsoTriangle /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): IsoTriangle /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): IsoTriangle /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): IsoTriangle /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): IsoTriangle /* this */
    override fun setPipelineData(key: String, value: Any): IsoTriangle /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): IsoTriangle /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): IsoTriangle /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): IsoTriangle /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): IsoTriangle /* this */
    override fun copyPosition(source: Vector2Like): IsoTriangle /* this */
    override fun copyPosition(source: Vector3Like): IsoTriangle /* this */
    override fun copyPosition(source: Vector4Like): IsoTriangle /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): IsoTriangle /* this */
    override fun setRotation(radians: Number): IsoTriangle /* this */
    override fun setAngle(degrees: Number): IsoTriangle /* this */
    override fun setScale(x: Number, y: Number): IsoTriangle /* this */
    override fun setX(value: Number): IsoTriangle /* this */
    override fun setY(value: Number): IsoTriangle /* this */
    override fun setZ(value: Number): IsoTriangle /* this */
    override fun setW(value: Number): IsoTriangle /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): IsoTriangle /* this */
}

open external class Line(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    x1: Number = definedExternally,
    y1: Number = definedExternally,
    x2: Number = definedExternally,
    y2: Number = definedExternally,
    strokeColor: Number = definedExternally,
    strokeAlpha: Number = definedExternally
) : Shape {
    override var lineWidth: Number
    open fun setLineWidth(startWidth: Number, endWidth: Number = definedExternally): Line /* this */
    open fun setTo(
        x1: Number = definedExternally,
        y1: Number = definedExternally,
        x2: Number = definedExternally,
        y2: Number = definedExternally
    ): Line /* this */

    override fun clearAlpha(): Line /* this */
    override fun setAlpha(value: Number): Line /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Line /* this */
    override fun setBlendMode(value: BlendModes): Line /* this */
    override var depth: Number
    override fun setDepth(value: Number): Line /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Line /* this */
    override fun setMask(mask: GeometryMask): Line /* this */
    override fun clearMask(destroyMask: Boolean): Line /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Line /* this */
    override fun setOriginFromFrame(): Line /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Line /* this */
    override fun updateDisplayOrigin(): Line /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): Line /* this */
    override fun setPipeline(pipeline: String): Line /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): Line /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): Line /* this */
    override fun setPipeline(pipeline: WebGLPipeline): Line /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): Line /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): Line /* this */
    override fun setPostPipeline(pipelines: String): Line /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): Line /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?, copyData: Boolean): Line /* this */
    override fun setPostPipeline(pipelines: Array<String>): Line /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): Line /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): Line /* this */
    override fun setPostPipeline(pipelines: Function<*>): Line /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): Line /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?, copyData: Boolean): Line /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>): Line /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): Line /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?, copyData: Boolean): Line /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline): Line /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): Line /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): Line /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): Line /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): Line /* this */
    override fun setPipelineData(key: String, value: Any): Line /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): Line /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): Line /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Line /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Line /* this */
    override fun copyPosition(source: Vector2Like): Line /* this */
    override fun copyPosition(source: Vector3Like): Line /* this */
    override fun copyPosition(source: Vector4Like): Line /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Line /* this */
    override fun setRotation(radians: Number): Line /* this */
    override fun setAngle(degrees: Number): Line /* this */
    override fun setScale(x: Number, y: Number): Line /* this */
    override fun setX(value: Number): Line /* this */
    override fun setY(value: Number): Line /* this */
    override fun setZ(value: Number): Line /* this */
    override fun setW(value: Number): Line /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Line /* this */
}

open external class Polygon(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    points: Any = definedExternally,
    fillColor: Number = definedExternally,
    fillAlpha: Number = definedExternally
) : Shape {
    open fun smooth(iterations: Number = definedExternally): Polygon /* this */
    override fun clearAlpha(): Polygon /* this */
    override fun setAlpha(value: Number): Polygon /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Polygon /* this */
    override fun setBlendMode(value: BlendModes): Polygon /* this */
    override var depth: Number
    override fun setDepth(value: Number): Polygon /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Polygon /* this */
    override fun setMask(mask: GeometryMask): Polygon /* this */
    override fun clearMask(destroyMask: Boolean): Polygon /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Polygon /* this */
    override fun setOriginFromFrame(): Polygon /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Polygon /* this */
    override fun updateDisplayOrigin(): Polygon /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): Polygon /* this */
    override fun setPipeline(pipeline: String): Polygon /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): Polygon /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): Polygon /* this */
    override fun setPipeline(pipeline: WebGLPipeline): Polygon /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): Polygon /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): Polygon /* this */
    override fun setPostPipeline(pipelines: String): Polygon /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): Polygon /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?, copyData: Boolean): Polygon /* this */
    override fun setPostPipeline(pipelines: Array<String>): Polygon /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): Polygon /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): Polygon /* this */
    override fun setPostPipeline(pipelines: Function<*>): Polygon /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): Polygon /* this */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): Polygon /* this */

    override fun setPostPipeline(pipelines: Array<Function<*>>): Polygon /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): Polygon /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?, copyData: Boolean): Polygon /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline): Polygon /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): Polygon /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): Polygon /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): Polygon /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): Polygon /* this */
    override fun setPipelineData(key: String, value: Any): Polygon /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): Polygon /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): Polygon /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Polygon /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Polygon /* this */
    override fun copyPosition(source: Vector2Like): Polygon /* this */
    override fun copyPosition(source: Vector3Like): Polygon /* this */
    override fun copyPosition(source: Vector4Like): Polygon /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Polygon /* this */
    override fun setRotation(radians: Number): Polygon /* this */
    override fun setAngle(degrees: Number): Polygon /* this */
    override fun setScale(x: Number, y: Number): Polygon /* this */
    override fun setX(value: Number): Polygon /* this */
    override fun setY(value: Number): Polygon /* this */
    override fun setZ(value: Number): Polygon /* this */
    override fun setW(value: Number): Polygon /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Polygon /* this */
}

open external class Rectangle(
    scene: Scene,
    x: Number,
    y: Number,
    width: Number = definedExternally,
    height: Number = definedExternally,
    fillColor: Number = definedExternally,
    fillAlpha: Number = definedExternally
) : Shape {
    open fun setSize(width: Number, height: Number): Rectangle /* this */
    override fun clearAlpha(): Rectangle /* this */
    override fun setAlpha(value: Number): Rectangle /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Rectangle /* this */
    override fun setBlendMode(value: BlendModes): Rectangle /* this */
    override var depth: Number
    override fun setDepth(value: Number): Rectangle /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Rectangle /* this */
    override fun setMask(mask: GeometryMask): Rectangle /* this */
    override fun clearMask(destroyMask: Boolean): Rectangle /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Rectangle /* this */
    override fun setOriginFromFrame(): Rectangle /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Rectangle /* this */
    override fun updateDisplayOrigin(): Rectangle /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): Rectangle /* this */
    override fun setPipeline(pipeline: String): Rectangle /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): Rectangle /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): Rectangle /* this */
    override fun setPipeline(pipeline: WebGLPipeline): Rectangle /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): Rectangle /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): Rectangle /* this */
    override fun setPostPipeline(pipelines: String): Rectangle /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): Rectangle /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?, copyData: Boolean): Rectangle /* this */
    override fun setPostPipeline(pipelines: Array<String>): Rectangle /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): Rectangle /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): Rectangle /* this */
    override fun setPostPipeline(pipelines: Function<*>): Rectangle /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): Rectangle /* this */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): Rectangle /* this */

    override fun setPostPipeline(pipelines: Array<Function<*>>): Rectangle /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): Rectangle /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?, copyData: Boolean): Rectangle /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline): Rectangle /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): Rectangle /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): Rectangle /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): Rectangle /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): Rectangle /* this */
    override fun setPipelineData(key: String, value: Any): Rectangle /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): Rectangle /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): Rectangle /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Rectangle /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Rectangle /* this */
    override fun copyPosition(source: Vector2Like): Rectangle /* this */
    override fun copyPosition(source: Vector3Like): Rectangle /* this */
    override fun copyPosition(source: Vector4Like): Rectangle /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Rectangle /* this */
    override fun setRotation(radians: Number): Rectangle /* this */
    override fun setAngle(degrees: Number): Rectangle /* this */
    override fun setScale(x: Number, y: Number): Rectangle /* this */
    override fun setX(value: Number): Rectangle /* this */
    override fun setY(value: Number): Rectangle /* this */
    override fun setZ(value: Number): Rectangle /* this */
    override fun setW(value: Number): Rectangle /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Rectangle /* this */
}

open external class Shape(scene: Scene, type: String = definedExternally, data: Any = definedExternally) : GameObject,
    AlphaSingle, BlendMode, Depth, GetBounds, Mask, Origin, Pipeline, ScrollFactor, Transform, Visible {
    open val geom: Any
    open val pathData: Array<Number>
    open val pathIndexes: Array<Number>
    open var fillColor: Number
    open var fillAlpha: Number
    open var strokeColor: Number
    open var strokeAlpha: Number
    open var lineWidth: Number
    open var isFilled: Boolean
    open var isStroked: Boolean
    open var closePath: Boolean
    open var width: Number
    open var height: Number
    open fun setFillStyle(color: Number = definedExternally, alpha: Number = definedExternally): Shape /* this */
    open fun setStrokeStyle(
        lineWidth: Number = definedExternally,
        color: Number = definedExternally,
        alpha: Number = definedExternally
    ): Shape /* this */

    open fun setClosePath(value: Boolean): Shape /* this */
    open fun setDisplaySize(width: Number, height: Number): Shape /* this */
    open fun preDestroy()
    open var displayWidth: Number
    open var displayHeight: Number
    override fun clearAlpha(): Shape /* this */
    override fun setAlpha(value: Number): Shape /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Shape | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Shape | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Shape /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Shape | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Shape | Mask */
    override fun clearMask(destroyMask: Boolean): Shape /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Shape /* this */
    override fun setOriginFromFrame(): Shape /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Shape /* this */
    override fun updateDisplayOrigin(): Shape /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Shape | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Shape | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Shape | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Shape | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Shape | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Shape | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Shape | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Shape | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Shape | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Shape | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Shape | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Shape | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Shape | Pipeline */
    override fun setPipelineData(key: String, value: Any): Shape /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Shape | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Shape | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Shape /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Shape /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Shape | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Shape | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Shape | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Shape /* this */
    override fun setRotation(radians: Number): Shape /* this */
    override fun setAngle(degrees: Number): Shape /* this */
    override fun setScale(x: Number, y: Number): Shape /* this */
    override fun setX(value: Number): Shape /* this */
    override fun setY(value: Number): Shape /* this */
    override fun setZ(value: Number): Shape /* this */
    override fun setW(value: Number): Shape /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Shape /* this */
}

open external class Star(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    points: Number = definedExternally,
    innerRadius: Number = definedExternally,
    outerRadius: Number = definedExternally,
    fillColor: Number = definedExternally,
    fillAlpha: Number = definedExternally
) : Shape {
    open fun setPoints(value: Number): Star /* this */
    open fun setInnerRadius(value: Number): Star /* this */
    open fun setOuterRadius(value: Number): Star /* this */
    open var points: Number
    open var innerRadius: Number
    open var outerRadius: Number
    override fun clearAlpha(): Star /* this */
    override fun setAlpha(value: Number): Star /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Star /* this */
    override fun setBlendMode(value: BlendModes): Star /* this */
    override var depth: Number
    override fun setDepth(value: Number): Star /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Star /* this */
    override fun setMask(mask: GeometryMask): Star /* this */
    override fun clearMask(destroyMask: Boolean): Star /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Star /* this */
    override fun setOriginFromFrame(): Star /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Star /* this */
    override fun updateDisplayOrigin(): Star /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): Star /* this */
    override fun setPipeline(pipeline: String): Star /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): Star /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): Star /* this */
    override fun setPipeline(pipeline: WebGLPipeline): Star /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): Star /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): Star /* this */
    override fun setPostPipeline(pipelines: String): Star /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): Star /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?, copyData: Boolean): Star /* this */
    override fun setPostPipeline(pipelines: Array<String>): Star /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): Star /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): Star /* this */
    override fun setPostPipeline(pipelines: Function<*>): Star /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): Star /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?, copyData: Boolean): Star /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>): Star /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): Star /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?, copyData: Boolean): Star /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline): Star /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): Star /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): Star /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): Star /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): Star /* this */
    override fun setPipelineData(key: String, value: Any): Star /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): Star /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): Star /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Star /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Star /* this */
    override fun copyPosition(source: Vector2Like): Star /* this */
    override fun copyPosition(source: Vector3Like): Star /* this */
    override fun copyPosition(source: Vector4Like): Star /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Star /* this */
    override fun setRotation(radians: Number): Star /* this */
    override fun setAngle(degrees: Number): Star /* this */
    override fun setScale(x: Number, y: Number): Star /* this */
    override fun setX(value: Number): Star /* this */
    override fun setY(value: Number): Star /* this */
    override fun setZ(value: Number): Star /* this */
    override fun setW(value: Number): Star /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Star /* this */
}

open external class Triangle(
    scene: Scene,
    x: Number = definedExternally,
    y: Number = definedExternally,
    x1: Number = definedExternally,
    y1: Number = definedExternally,
    x2: Number = definedExternally,
    y2: Number = definedExternally,
    x3: Number = definedExternally,
    y3: Number = definedExternally,
    fillColor: Number = definedExternally,
    fillAlpha: Number = definedExternally
) : Shape {
    open fun setTo(
        x1: Number = definedExternally,
        y1: Number = definedExternally,
        x2: Number = definedExternally,
        y2: Number = definedExternally,
        x3: Number = definedExternally,
        y3: Number = definedExternally
    ): Triangle /* this */

    override fun clearAlpha(): Triangle /* this */
    override fun setAlpha(value: Number): Triangle /* this */
    override var alpha: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): Triangle /* this */
    override fun setBlendMode(value: BlendModes): Triangle /* this */
    override var depth: Number
    override fun setDepth(value: Number): Triangle /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Triangle /* this */
    override fun setMask(mask: GeometryMask): Triangle /* this */
    override fun clearMask(destroyMask: Boolean): Triangle /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Triangle /* this */
    override fun setOriginFromFrame(): Triangle /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Triangle /* this */
    override fun updateDisplayOrigin(): Triangle /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): Triangle /* this */
    override fun setPipeline(pipeline: String): Triangle /* this */
    override fun setPipeline(pipeline: String, pipelineData: Any?): Triangle /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?, copyData: Boolean): Triangle /* this */
    override fun setPipeline(pipeline: WebGLPipeline): Triangle /* this */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): Triangle /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?, copyData: Boolean): Triangle /* this */
    override fun setPostPipeline(pipelines: String): Triangle /* this */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): Triangle /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?, copyData: Boolean): Triangle /* this */
    override fun setPostPipeline(pipelines: Array<String>): Triangle /* this */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): Triangle /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?, copyData: Boolean): Triangle /* this */
    override fun setPostPipeline(pipelines: Function<*>): Triangle /* this */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): Triangle /* this */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): Triangle /* this */

    override fun setPostPipeline(pipelines: Array<Function<*>>): Triangle /* this */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): Triangle /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?, copyData: Boolean): Triangle /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline): Triangle /* this */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): Triangle /* this */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): Triangle /* this */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): Triangle /* this */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): Triangle /* this */
    override fun setPipelineData(key: String, value: Any): Triangle /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): Triangle /* this */
    override fun removePostPipeline(pipeline: PostFXPipeline): Triangle /* this */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Triangle /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Triangle /* this */
    override fun copyPosition(source: Vector2Like): Triangle /* this */
    override fun copyPosition(source: Vector3Like): Triangle /* this */
    override fun copyPosition(source: Vector4Like): Triangle /* this */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Triangle /* this */
    override fun setRotation(radians: Number): Triangle /* this */
    override fun setAngle(degrees: Number): Triangle /* this */
    override fun setScale(x: Number, y: Number): Triangle /* this */
    override fun setX(value: Number): Triangle /* this */
    override fun setY(value: Number): Triangle /* this */
    override fun setZ(value: Number): Triangle /* this */
    override fun setW(value: Number): Triangle /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Triangle /* this */
}

open external class Sprite : GameObject, Alpha, BlendMode, Depth, Flip, FX, GetBounds, Mask, Origin, Pipeline,
    ScrollFactor, Size, TextureCrop, Tint, Transform, Visible {
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: String)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Number = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture, frame: String = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture, frame: Number = definedExternally)

    open var anims: AnimationState
    open fun preUpdate(time: Number, delta: Number)
    open fun play(key: String, ignoreIfPlaying: Boolean = definedExternally): Sprite /* this */
    open fun play(key: String): Sprite /* this */
    open fun play(key: Animation, ignoreIfPlaying: Boolean = definedExternally): Sprite /* this */
    open fun play(key: Animation): Sprite /* this */
    open fun play(key: PlayAnimationConfig, ignoreIfPlaying: Boolean = definedExternally): Sprite /* this */
    open fun play(key: PlayAnimationConfig): Sprite /* this */
    open fun playReverse(key: String, ignoreIfPlaying: Boolean = definedExternally): Sprite /* this */
    open fun playReverse(key: String): Sprite /* this */
    open fun playReverse(key: Animation, ignoreIfPlaying: Boolean = definedExternally): Sprite /* this */
    open fun playReverse(key: Animation): Sprite /* this */
    open fun playReverse(key: PlayAnimationConfig, ignoreIfPlaying: Boolean = definedExternally): Sprite /* this */
    open fun playReverse(key: PlayAnimationConfig): Sprite /* this */
    open fun playAfterDelay(key: String, delay: Number): Sprite /* this */
    open fun playAfterDelay(key: Animation, delay: Number): Sprite /* this */
    open fun playAfterDelay(key: PlayAnimationConfig, delay: Number): Sprite /* this */
    open fun playAfterRepeat(key: String, repeatCount: Number = definedExternally): Sprite /* this */
    open fun playAfterRepeat(key: String): Sprite /* this */
    open fun playAfterRepeat(key: Animation, repeatCount: Number = definedExternally): Sprite /* this */
    open fun playAfterRepeat(key: Animation): Sprite /* this */
    open fun playAfterRepeat(key: PlayAnimationConfig, repeatCount: Number = definedExternally): Sprite /* this */
    open fun playAfterRepeat(key: PlayAnimationConfig): Sprite /* this */
    open fun chain(key: String = definedExternally): Sprite /* this */
    open fun chain(): Sprite /* this */
    open fun chain(key: Animation = definedExternally): Sprite /* this */
    open fun chain(key: PlayAnimationConfig = definedExternally): Sprite /* this */
    open fun chain(key: Array<String> = definedExternally): Sprite /* this */
    open fun chain(key: Array<Animation> = definedExternally): Sprite /* this */
    open fun chain(key: Array<PlayAnimationConfig> = definedExternally): Sprite /* this */
    open fun stop(): Sprite /* this */
    open fun stopAfterDelay(delay: Number): Sprite /* this */
    open fun stopAfterRepeat(repeatCount: Number = definedExternally): Sprite /* this */
    open fun stopOnFrame(frame: AnimationFrame): Sprite /* this */
    override fun toJSON(): JSONGameObject
    override fun clearAlpha(): Sprite /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Sprite /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Sprite | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Sprite | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Sprite /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Sprite /* this */
    override fun toggleFlipY(): Sprite /* this */
    override fun setFlipX(value: Boolean): Sprite /* this */
    override fun setFlipY(value: Boolean): Sprite /* this */
    override fun setFlip(x: Boolean, y: Boolean): Sprite /* this */
    override fun resetFlip(): Sprite /* this */
    override var fxPadding: Number
    override fun setFXPadding(padding: Number): Sprite /* this */
    override fun onFXCopy(pipeline: SpriteFXPipeline)
    override fun onFX(pipeline: SpriteFXPipeline)
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Sprite | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Sprite | Mask */
    override fun clearMask(destroyMask: Boolean): Sprite /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Sprite /* this */
    override fun setOriginFromFrame(): Sprite /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Sprite /* this */
    override fun updateDisplayOrigin(): Sprite /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Sprite | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Sprite | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Sprite | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPipelineData(key: String, value: Any): Sprite /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Sprite | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Sprite | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Sprite /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Sprite /* this */
    override fun setSize(width: Number, height: Number): Sprite /* this */
    override fun setDisplaySize(width: Number, height: Number): Sprite /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): dynamic /* Sprite | TextureCrop */
    override fun setCrop(): dynamic /* TextureCrop */
    override fun setCrop(x: Number): dynamic /* Sprite | TextureCrop */
    override fun setCrop(x: Number, y: Number): dynamic /* Sprite | TextureCrop */
    override fun setCrop(x: Number, y: Number, width: Number): dynamic /* Sprite | TextureCrop */
    override fun setCrop(
        x: Phaser.Geom.Rectangle,
        y: Number,
        width: Number,
        height: Number
    ): dynamic /* Sprite | TextureCrop */

    override fun setCrop(x: Phaser.Geom.Rectangle): dynamic /* Sprite | TextureCrop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number): dynamic /* Sprite | TextureCrop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number): dynamic /* Sprite | TextureCrop */
    override fun setTexture(key: String, frame: String): dynamic /* Sprite | TextureCrop */
    override fun setTexture(key: String): dynamic /* TextureCrop */
    override fun setTexture(key: String, frame: Number): dynamic /* Sprite | TextureCrop */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Sprite | TextureCrop */
    override fun setFrame(frame: String): dynamic /* Sprite | TextureCrop */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Sprite | TextureCrop */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Sprite | TextureCrop */
    override fun setFrame(frame: Number): dynamic /* Sprite | TextureCrop */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Sprite | TextureCrop */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): Sprite /* this */
    override fun setTint(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Sprite /* this */
    override fun setTintFill(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): Sprite /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Sprite /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Sprite | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Sprite | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Sprite | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setRotation(radians: Number): Sprite /* this */
    override fun setAngle(degrees: Number): Sprite /* this */
    override fun setScale(x: Number, y: Number): Sprite /* this */
    override fun setX(value: Number): Sprite /* this */
    override fun setY(value: Number): Sprite /* this */
    override fun setZ(value: Number): Sprite /* this */
    override fun setW(value: Number): Sprite /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Sprite /* this */
}

external fun GetTextSize(text: Text, size: TextMetrics, lines: Array<String>): GetTextSizeObject

external fun MeasureText(textStyle: TextStyle): TextMetrics

open external class Text : GameObject, Alpha, BlendMode, ComputedSize, Crop, Depth, Flip, FX, GetBounds, Mask, Origin,
    Pipeline, ScrollFactor, Tint, Transform, Visible {
    constructor(scene: Scene, x: Number, y: Number, text: String, style: Phaser.Types.GameObjects.Text.TextStyle)
    constructor(scene: Scene, x: Number, y: Number, text: Array<String>, style: Phaser.Types.GameObjects.Text.TextStyle)

    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    open var style: TextStyle
    open var autoRound: Boolean
    open var splitRegExp: Any?
    open var padding: TextPadding
    override var width: Number
    override var height: Number
    open var lineSpacing: Number
    open var dirty: Boolean
    open fun initRTL()
    open fun runWordWrap(text: String): String
    open fun advancedWordWrap(text: String, context: CanvasRenderingContext2D, wordWrapWidth: Number): String
    open fun basicWordWrap(text: String, context: CanvasRenderingContext2D, wordWrapWidth: Number): String
    open fun getWrappedText(text: String): Array<String>
    open fun setText(value: String): Text /* this */
    open fun setText(value: Array<String>): Text /* this */
    open fun setStyle(style: Any?): Text /* this */
    open fun setFont(font: String): Text /* this */
    open fun setFontFamily(family: String): Text /* this */
    open fun setFontSize(size: Number): Text /* this */
    open fun setFontStyle(style: String): Text /* this */
    open fun setFixedSize(width: Number, height: Number): Text /* this */
    open fun setBackgroundColor(color: String): Text /* this */
    open fun setFill(color: String): Text /* this */
    open fun setFill(color: Any): Text /* this */
    open fun setColor(color: String): Text /* this */
    open fun setStroke(color: String, thickness: Number): Text /* this */
    open fun setShadow(
        x: Number = definedExternally,
        y: Number = definedExternally,
        color: String = definedExternally,
        blur: Number = definedExternally,
        shadowStroke: Boolean = definedExternally,
        shadowFill: Boolean = definedExternally
    ): Text /* this */

    open fun setShadowOffset(x: Number, y: Number): Text /* this */
    open fun setShadowColor(color: String): Text /* this */
    open fun setShadowBlur(blur: Number): Text /* this */
    open fun setShadowStroke(enabled: Boolean): Text /* this */
    open fun setShadowFill(enabled: Boolean): Text /* this */
    open fun setWordWrapWidth(width: Number, useAdvancedWrap: Boolean = definedExternally): Text /* this */
    open fun setWordWrapCallback(callback: TextStyleWordWrapCallback, scope: Any? = definedExternally): Text /* this */
    open fun setAlign(align: String = definedExternally): Text /* this */
    open fun setResolution(value: Number): Text /* this */
    open fun setLineSpacing(value: Number): Text /* this */
    open fun setPadding(
        left: Number,
        top: Number = definedExternally,
        right: Number = definedExternally,
        bottom: Number = definedExternally
    ): Text /* this */

    open fun setPadding(left: Number): Text /* this */
    open fun setPadding(left: Number, top: Number = definedExternally): Text /* this */
    open fun setPadding(
        left: Number,
        top: Number = definedExternally,
        right: Number = definedExternally
    ): Text /* this */

    open fun setPadding(
        left: TextPadding,
        top: Number = definedExternally,
        right: Number = definedExternally,
        bottom: Number = definedExternally
    ): Text /* this */

    open fun setPadding(left: TextPadding): Text /* this */
    open fun setPadding(left: TextPadding, top: Number = definedExternally): Text /* this */
    open fun setPadding(
        left: TextPadding,
        top: Number = definedExternally,
        right: Number = definedExternally
    ): Text /* this */

    open fun setMaxLines(max: Number = definedExternally): Text /* this */
    open fun updateText(): Text /* this */
    open fun getTextMetrics(): TextMetrics
    open var text: String
    override fun toJSON(): JSONGameObject
    open fun onContextRestored()
    open fun preDestroy()
    override fun clearAlpha(): Text /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Text /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Text | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Text | BlendMode */
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): Text /* this */
    override fun setDisplaySize(width: Number, height: Number): Text /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): dynamic /* Text | Crop */
    override fun setCrop(): dynamic /* Crop */
    override fun setCrop(x: Number): dynamic /* Text | Crop */
    override fun setCrop(x: Number, y: Number): dynamic /* Text | Crop */
    override fun setCrop(x: Number, y: Number, width: Number): dynamic /* Text | Crop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number, height: Number): dynamic /* Text | Crop */
    override fun setCrop(x: Phaser.Geom.Rectangle): dynamic /* Text | Crop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number): dynamic /* Text | Crop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number): dynamic /* Text | Crop */
    override var depth: Number
    override fun setDepth(value: Number): Text /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Text /* this */
    override fun toggleFlipY(): Text /* this */
    override fun setFlipX(value: Boolean): Text /* this */
    override fun setFlipY(value: Boolean): Text /* this */
    override fun setFlip(x: Boolean, y: Boolean): Text /* this */
    override fun resetFlip(): Text /* this */
    override var fxPadding: Number
    override fun setFXPadding(padding: Number): Text /* this */
    override fun onFXCopy(pipeline: SpriteFXPipeline)
    override fun onFX(pipeline: SpriteFXPipeline)
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Text | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Text | Mask */
    override fun clearMask(destroyMask: Boolean): Text /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Text /* this */
    override fun setOriginFromFrame(): Text /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Text /* this */
    override fun updateDisplayOrigin(): Text /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Text | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Text | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Text | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Text | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Text | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Text | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Text | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Text | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Text | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Text | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Text | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Text | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Text | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Text | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Text | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Text | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Text | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Text | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Text | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Text | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Text | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Text | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Text | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Text | Pipeline */
    override fun setPipelineData(key: String, value: Any): Text /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Text | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Text | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Text /* this */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): Text /* this */
    override fun setTint(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Text /* this */
    override fun setTintFill(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): Text /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Text /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Text | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Text | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Text | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Text /* this */
    override fun setRotation(radians: Number): Text /* this */
    override fun setAngle(degrees: Number): Text /* this */
    override fun setScale(x: Number, y: Number): Text /* this */
    override fun setX(value: Number): Text /* this */
    override fun setY(value: Number): Text /* this */
    override fun setZ(value: Number): Text /* this */
    override fun setW(value: Number): Text /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Text /* this */
}

open external class TextStyle(text: Text, style: Phaser.Types.GameObjects.Text.TextStyle) {
    open var parent: Text
    open var fontFamily: String
    open var fontSize: String
    open var fontStyle: String
    open var backgroundColor: String
    open var color: String
    open var stroke: String
    open var strokeThickness: Number
    open var shadowOffsetX: Number
    open var shadowOffsetY: Number
    open var shadowColor: String
    open var shadowBlur: Number
    open var shadowStroke: Boolean
    open var shadowFill: Boolean
    open var align: String
    open var maxLines: Number
    open var fixedWidth: Number
    open var fixedHeight: Number
    open var resolution: Number
    open var rtl: Boolean
    open var testString: String
    open var baselineX: Number
    open var baselineY: Number
    open var wordWrapWidth: Number?
    open var wordWrapCallback: TextStyleWordWrapCallback?
    open var wordWrapCallbackScope: Any?
    open var wordWrapUseAdvanced: Boolean
    open fun setStyle(
        style: Phaser.Types.GameObjects.Text.TextStyle,
        updateText: Boolean = definedExternally,
        setDefaults: Boolean = definedExternally
    ): Text

    open fun syncFont(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D)
    open fun syncStyle(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D)
    open fun syncShadow(context: CanvasRenderingContext2D, enabled: Boolean)
    open fun update(recalculateMetrics: Boolean): Text
    open fun setFont(font: String?, updateText: Boolean = definedExternally): Text
    open fun setFont(font: String?): Text
    open fun setFont(font: Any?, updateText: Boolean = definedExternally): Text
    open fun setFont(font: Any?): Text
    open fun setFontFamily(family: String): Text
    open fun setFontStyle(style: String): Text
    open fun setFontSize(size: Number): Text
    open fun setFontSize(size: String): Text
    open fun setTestString(string: String): Text
    open fun setFixedSize(width: Number, height: Number): Text
    open fun setBackgroundColor(color: String): Text
    open fun setFill(color: String): Text
    open fun setColor(color: String): Text
    open fun setResolution(value: Number): Text
    open fun setStroke(color: String, thickness: Number): Text
    open fun setShadow(
        x: Number = definedExternally,
        y: Number = definedExternally,
        color: String = definedExternally,
        blur: Number = definedExternally,
        shadowStroke: Boolean = definedExternally,
        shadowFill: Boolean = definedExternally
    ): Text

    open fun setShadowOffset(x: Number = definedExternally, y: Number = definedExternally): Text
    open fun setShadowColor(color: String = definedExternally): Text
    open fun setShadowBlur(blur: Number = definedExternally): Text
    open fun setShadowStroke(enabled: Boolean): Text
    open fun setShadowFill(enabled: Boolean): Text
    open fun setWordWrapWidth(width: Number, useAdvancedWrap: Boolean = definedExternally): Text
    open fun setWordWrapCallback(callback: TextStyleWordWrapCallback, scope: Any? = definedExternally): Text
    open fun setAlign(align: String = definedExternally): Text
    open fun setMaxLines(max: Number = definedExternally): Text
    open fun getTextMetrics(): TextMetrics
    open fun toJSON(): Any?
    open fun destroy()
}

open external class TileSprite : GameObject, Alpha, BlendMode, ComputedSize, Crop, Depth, Flip, FX, GetBounds, Mask,
    Origin, Pipeline, ScrollFactor, Tint, Transform, Visible {
    constructor(
        scene: Scene,
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        textureKey: String,
        frameKey: String = definedExternally
    )

    constructor(scene: Scene, x: Number, y: Number, width: Number, height: Number, textureKey: String)
    constructor(
        scene: Scene,
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        textureKey: String,
        frameKey: Number = definedExternally
    )

    open var dirty: Boolean
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    open var potWidth: Number
    open var potHeight: Number
    open var fillCanvas: HTMLCanvasElement
    open var fillContext: CanvasRenderingContext2D
    open var fillPattern: dynamic /* WebGLTexture | CanvasPattern */
    open fun setTexture(key: String, frame: String = definedExternally): TileSprite /* this */
    open fun setTexture(key: String): TileSprite /* this */
    open fun setTexture(key: String, frame: Number = definedExternally): TileSprite /* this */
    open fun setFrame(frame: String): TileSprite /* this */
    open fun setFrame(frame: Number): TileSprite /* this */
    open fun setTilePosition(x: Number = definedExternally, y: Number = definedExternally): TileSprite /* this */
    open fun setTileScale(x: Number = definedExternally, y: Number = definedExternally): TileSprite /* this */
    open fun onContextRestored()
    open fun preDestroy()
    open var tilePositionX: Number
    open var tilePositionY: Number
    open var tileScaleX: Number
    open var tileScaleY: Number
    override fun clearAlpha(): TileSprite /* this */
    override fun setAlpha(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): TileSprite /* this */

    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* TileSprite | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* TileSprite | BlendMode */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): TileSprite /* this */
    override fun setDisplaySize(width: Number, height: Number): TileSprite /* this */
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): dynamic /* TileSprite | Crop */
    override fun setCrop(): dynamic /* Crop */
    override fun setCrop(x: Number): dynamic /* TileSprite | Crop */
    override fun setCrop(x: Number, y: Number): dynamic /* TileSprite | Crop */
    override fun setCrop(x: Number, y: Number, width: Number): dynamic /* TileSprite | Crop */
    override fun setCrop(
        x: Phaser.Geom.Rectangle,
        y: Number,
        width: Number,
        height: Number
    ): dynamic /* TileSprite | Crop */

    override fun setCrop(x: Phaser.Geom.Rectangle): dynamic /* TileSprite | Crop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number): dynamic /* TileSprite | Crop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number): dynamic /* TileSprite | Crop */
    override var depth: Number
    override fun setDepth(value: Number): TileSprite /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): TileSprite /* this */
    override fun toggleFlipY(): TileSprite /* this */
    override fun setFlipX(value: Boolean): TileSprite /* this */
    override fun setFlipY(value: Boolean): TileSprite /* this */
    override fun setFlip(x: Boolean, y: Boolean): TileSprite /* this */
    override fun resetFlip(): TileSprite /* this */
    override var fxPadding: Number
    override fun setFXPadding(padding: Number): TileSprite /* this */
    override fun onFXCopy(pipeline: SpriteFXPipeline)
    override fun onFX(pipeline: SpriteFXPipeline)
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* TileSprite | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* TileSprite | Mask */
    override fun clearMask(destroyMask: Boolean): TileSprite /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): TileSprite /* this */
    override fun setOriginFromFrame(): TileSprite /* this */
    override fun setDisplayOrigin(x: Number, y: Number): TileSprite /* this */
    override fun updateDisplayOrigin(): TileSprite /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(
        pipeline: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TileSprite | Pipeline */

    override fun setPipeline(pipeline: String): dynamic /* TileSprite | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* TileSprite | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TileSprite | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* TileSprite | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TileSprite | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TileSprite | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TileSprite | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TileSprite | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TileSprite | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TileSprite | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* TileSprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?
    ): dynamic /* TileSprite | Pipeline */

    override fun setPipelineData(key: String, value: Any): TileSprite /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* TileSprite | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* TileSprite | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): TileSprite /* this */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): TileSprite /* this */
    override fun setTint(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): TileSprite /* this */

    override fun setTintFill(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): TileSprite /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): TileSprite /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* TileSprite | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* TileSprite | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* TileSprite | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): TileSprite /* this */
    override fun setRotation(radians: Number): TileSprite /* this */
    override fun setAngle(degrees: Number): TileSprite /* this */
    override fun setScale(x: Number, y: Number): TileSprite /* this */
    override fun setX(value: Number): TileSprite /* this */
    override fun setY(value: Number): TileSprite /* this */
    override fun setZ(value: Number): TileSprite /* this */
    override fun setW(value: Number): TileSprite /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): TileSprite /* this */
}

open external class UpdateList(scene: Scene) : ProcessQueue<GameObject> {
    open var scene: Scene
    open var systems: Systems
    open fun sceneUpdate(time: Number, delta: Number)
    override fun shutdown()
    override fun destroy()
}

open external class Video(scene: Scene, x: Number, y: Number, key: String = definedExternally) : GameObject, Alpha,
    BlendMode, Depth, Flip, FX, GetBounds, Mask, Origin, Pipeline, ScrollFactor, Size, TextureCrop, Tint, Transform,
    Visible {
    open var video: HTMLVideoElement
    open var videoTexture: Texture
    open var videoTextureSource: TextureSource
    open var snapshotTexture: CanvasTexture
    override var flipY: Boolean
    open var touchLocked: Boolean
    open var playWhenUnlocked: Boolean
    open var retryLimit: Number
    open var retry: Number
    open var retryInterval: Number
    open var markers: Any
    open var removeVideoElementOnDestroy: Boolean
    open fun play(
        loop: Boolean = definedExternally,
        markerIn: Number = definedExternally,
        markerOut: Number = definedExternally
    ): Video /* this */

    open fun changeSource(
        key: String,
        autoplay: Boolean = definedExternally,
        loop: Boolean = definedExternally,
        markerIn: Number = definedExternally,
        markerOut: Number = definedExternally
    ): Video /* this */

    open fun addMarker(key: String, markerIn: Number, markerOut: Number): Video /* this */
    open fun playMarker(key: String, loop: Boolean = definedExternally): Video /* this */
    open fun removeMarker(key: String): Video /* this */
    open fun snapshot(width: Number = definedExternally, height: Number = definedExternally): CanvasTexture
    open fun snapshotArea(
        x: Number = definedExternally,
        y: Number = definedExternally,
        srcWidth: Number = definedExternally,
        srcHeight: Number = definedExternally,
        destWidth: Number = definedExternally,
        destHeight: Number = definedExternally
    ): CanvasTexture

    open fun saveSnapshotTexture(key: String): CanvasTexture
    open fun loadURL(
        url: String,
        loadEvent: String = definedExternally,
        noAudio: Boolean = definedExternally,
        crossOrigin: String = definedExternally
    ): Video /* this */

    open fun loadMediaStream(
        stream: String,
        loadEvent: String = definedExternally,
        noAudio: Boolean = definedExternally
    ): Video /* this */

    open fun playHandler()
    open fun completeHandler()
    open fun timeUpdateHandler()
    open fun updateTexture()
    open fun getVideoKey(): String
    open fun seekTo(value: Number): Video /* this */
    open fun getCurrentTime(): Number
    open fun setCurrentTime(value: String): Video /* this */
    open fun setCurrentTime(value: Number): Video /* this */
    open fun isSeeking(): Boolean
    open fun getProgress(): Number
    open fun getDuration(): Number
    open fun setMute(value: Boolean = definedExternally): Video /* this */
    open fun isMuted(): Boolean
    open fun setPaused(value: Boolean = definedExternally): Video /* this */
    open fun getVolume(): Number
    open fun setVolume(value: Number = definedExternally): Video /* this */
    open fun getPlaybackRate(): Number
    open fun setPlaybackRate(rate: Number = definedExternally): Video /* this */
    open fun getLoop(): Boolean
    open fun setLoop(value: Boolean = definedExternally): Video /* this */
    open fun isPlaying(): Boolean
    open fun isPaused(): Boolean
    open fun saveTexture(key: String, flipY: Boolean = definedExternally): Texture
    open fun stop(): Video /* this */
    open fun removeVideoElement()
    override fun clearAlpha(): Video /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Video /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Video | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Video | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Video /* this */
    override var flipX: Boolean
    override fun toggleFlipX(): Video /* this */
    override fun toggleFlipY(): Video /* this */
    override fun setFlipX(value: Boolean): Video /* this */
    override fun setFlipY(value: Boolean): Video /* this */
    override fun setFlip(x: Boolean, y: Boolean): Video /* this */
    override fun resetFlip(): Video /* this */
    override var fxPadding: Number
    override fun setFXPadding(padding: Number): Video /* this */
    override fun onFXCopy(pipeline: SpriteFXPipeline)
    override fun onFX(pipeline: SpriteFXPipeline)
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): dynamic /* Video | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* Video | Mask */
    override fun clearMask(destroyMask: Boolean): Video /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Video /* this */
    override fun setOriginFromFrame(): Video /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Video /* this */
    override fun updateDisplayOrigin(): Video /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Video | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Video | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Video | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Video | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Video | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Video | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Video | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Video | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Video | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Video | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Video | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Video | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Video | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Video | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Video | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Video | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Video | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Video | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Video | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Video | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Video | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Video | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Video | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Video | Pipeline */
    override fun setPipelineData(key: String, value: Any): Video /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Video | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Video | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Video /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Video /* this */
    override fun setSize(width: Number, height: Number): Video /* this */
    override fun setDisplaySize(width: Number, height: Number): Video /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): dynamic /* Video | TextureCrop */
    override fun setCrop(): dynamic /* TextureCrop */
    override fun setCrop(x: Number): dynamic /* Video | TextureCrop */
    override fun setCrop(x: Number, y: Number): dynamic /* Video | TextureCrop */
    override fun setCrop(x: Number, y: Number, width: Number): dynamic /* Video | TextureCrop */
    override fun setCrop(
        x: Phaser.Geom.Rectangle,
        y: Number,
        width: Number,
        height: Number
    ): dynamic /* Video | TextureCrop */

    override fun setCrop(x: Phaser.Geom.Rectangle): dynamic /* Video | TextureCrop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number): dynamic /* Video | TextureCrop */
    override fun setCrop(x: Phaser.Geom.Rectangle, y: Number, width: Number): dynamic /* Video | TextureCrop */
    override fun setTexture(key: String, frame: String): dynamic /* Video | TextureCrop */
    override fun setTexture(key: String): dynamic /* TextureCrop */
    override fun setTexture(key: String, frame: Number): dynamic /* Video | TextureCrop */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Video | TextureCrop */
    override fun setFrame(frame: String): dynamic /* Video | TextureCrop */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Video | TextureCrop */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Video | TextureCrop */
    override fun setFrame(frame: Number): dynamic /* Video | TextureCrop */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Video | TextureCrop */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): Video /* this */
    override fun setTint(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Video /* this */
    override fun setTintFill(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): Video /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Video /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Video | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Video | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Video | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Video /* this */
    override fun setRotation(radians: Number): Video /* this */
    override fun setAngle(degrees: Number): Video /* this */
    override fun setScale(x: Number, y: Number): Video /* this */
    override fun setX(value: Number): Video /* this */
    override fun setY(value: Number): Video /* this */
    override fun setZ(value: Number): Video /* this */
    override fun setW(value: Number): Video /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Video /* this */
}

open external class Zone(
    scene: Scene,
    x: Number,
    y: Number,
    width: Number = definedExternally,
    height: Number = definedExternally
) : GameObject, Depth, GetBounds, Origin, Transform, ScrollFactor, Visible {
    open var width: Number
    open var height: Number
    open var blendMode: Number
    open var displayWidth: Number
    open var displayHeight: Number
    open fun setSize(width: Number, height: Number, resizeInput: Boolean = definedExternally): Zone /* this */
    open fun setDisplaySize(width: Number, height: Number): Zone /* this */
    open fun setCircleDropZone(radius: Number): Zone /* this */
    open fun setRectangleDropZone(width: Number, height: Number): Zone /* this */
    open fun setDropZone(
        hitArea: Any? = definedExternally,
        hitAreaCallback: HitAreaCallback = definedExternally
    ): Zone /* this */

    override var depth: Number
    override fun setDepth(value: Number): Zone /* this */
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O): O
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Zone /* this */
    override fun setOriginFromFrame(): Zone /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Zone /* this */
    override fun updateDisplayOrigin(): Zone /* this */
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Zone /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Zone | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Zone | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Zone | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Zone /* this */
    override fun setRotation(radians: Number): Zone /* this */
    override fun setAngle(degrees: Number): Zone /* this */
    override fun setScale(x: Number, y: Number): Zone /* this */
    override fun setX(value: Number): Zone /* this */
    override fun setY(value: Number): Zone /* this */
    override fun setZ(value: Number): Zone /* this */
    override fun setW(value: Number): Zone /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Zone /* this */
    override var visible: Boolean
    override fun setVisible(value: Boolean): Zone /* this */
}
