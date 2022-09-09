@file:JsQualifier("Phaser.Physics.Arcade")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Physics.Arcade

import Phaser.BlendModes
import Phaser.Cameras.Scene2D.Camera
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.Events.EventEmitter
import Phaser.GameObjects.Components.*
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Shape
import Phaser.Geom.Rectangle
import Phaser.Math.Vector2
import Phaser.Physics.Arcade.Components.*
import Phaser.Physics.Arcade.Components.Size
import Phaser.Renderer.WebGL.Pipelines.PostFXPipeline
import Phaser.Renderer.WebGL.Pipelines.SpriteFXPipeline
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Structs.ProcessQueue
import Phaser.Structs.RTree
import Phaser.Structs.Set
import Phaser.Textures.Frame
import Phaser.Textures.Texture
import Phaser.Tilemaps.Tile
import Phaser.Tilemaps.TilemapLayer
import Phaser.Types.GameObjects.Group.GroupClassTypeConstructor
import Phaser.Types.GameObjects.Group.GroupConfig
import Phaser.Types.GameObjects.Group.GroupCreateConfig
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Math.Vector3Like
import Phaser.Types.Math.Vector4Like
import Phaser.Types.Physics.Arcade.*
import Phaser.Types.Tilemaps.FilteringOptions
import Phaser.GameObjects.Components.Size as _Phaser_GameObjects_Components_Size
import Phaser.GameObjects.Components.Texture as _Phaser_GameObjects_Components_Texture

open external class Image : Phaser.GameObjects.Image, Acceleration, Angular, Bounce, Debug, Drag, Enable, Friction,
    Gravity, Immovable, Mass, Pushable, Size, Velocity, Alpha, BlendMode, Depth, Flip, GetBounds, Origin, Pipeline,
    ScrollFactor, _Phaser_GameObjects_Components_Size, _Phaser_GameObjects_Components_Texture, Tint, Transform,
    Visible {
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: String)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Number = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture, frame: String = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture, frame: Number = definedExternally)

    override var body: dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody */
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
    override fun <O : Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Image /* this */
    override fun setMask(mask: GeometryMask): Image /* this */
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
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): Image /* this */
    override fun setCrop(): Image /* this */
    override fun setCrop(x: Number): Image /* this */
    override fun setCrop(x: Number, y: Number): Image /* this */
    override fun setCrop(x: Number, y: Number, width: Number): Image /* this */
    override fun setCrop(x: Rectangle, y: Number, width: Number, height: Number): Image /* this */
    override fun setCrop(x: Rectangle): Image /* this */
    override fun setCrop(x: Rectangle, y: Number): Image /* this */
    override fun setCrop(x: Rectangle, y: Number, width: Number): Image /* this */
    override fun setTexture(key: String, frame: String): dynamic /* Image | Texture */
    override fun setTexture(key: String): dynamic /* Texture */
    override fun setTexture(key: String, frame: Number): dynamic /* Image | Texture */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Image | Texture */
    override fun setFrame(frame: String): dynamic /* Image | Texture */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Image | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Image | Texture */
    override fun setFrame(frame: Number): dynamic /* Image | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Image | Texture */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): Image /* this */
    override fun setTint(
        topLeft: Number?,
        topRight: Number?,
        bottomLeft: Number?,
        bottomRight: Number?
    ): Image /* this */

    override fun setTintFill(
        topLeft: Number?,
        topRight: Number?,
        bottomLeft: Number?,
        bottomRight: Number?
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
    override fun setAcceleration(x: Number, y: Number): Image /* this */
    override fun setAccelerationX(value: Number): Image /* this */
    override fun setAccelerationY(value: Number): Image /* this */
    override fun setAngularVelocity(value: Number): Image /* this */
    override fun setAngularAcceleration(value: Number): Image /* this */
    override fun setAngularDrag(value: Number): Image /* this */
    override fun setBounce(x: Number, y: Number): Image /* this */
    override fun setBounceX(value: Number): Image /* this */
    override fun setBounceY(value: Number): Image /* this */
    override fun setCollideWorldBounds(
        value: Boolean,
        bounceX: Number,
        bounceY: Number,
        onWorldBounds: Boolean
    ): Image /* this */

    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Image /* this */
    override fun setDebugBodyColor(value: Number): Image /* this */
    override var debugShowBody: Boolean
    override var debugShowVelocity: Boolean
    override var debugBodyColor: Number
    override fun setDrag(x: Number, y: Number): Image /* this */
    override fun setDragX(value: Number): Image /* this */
    override fun setDragY(value: Number): Image /* this */
    override fun setDamping(value: Boolean): Image /* this */
    override fun enableBody(
        reset: Boolean,
        x: Number,
        y: Number,
        enableGameObject: Boolean,
        showGameObject: Boolean
    ): Image /* this */

    override fun disableBody(disableGameObject: Boolean, hideGameObject: Boolean): Image /* this */
    override fun refreshBody(): Image /* this */
    override fun setFriction(x: Number, y: Number): Image /* this */
    override fun setFrictionX(x: Number): Image /* this */
    override fun setFrictionY(y: Number): Image /* this */
    override fun setGravity(x: Number, y: Number): Image /* this */
    override fun setGravityX(x: Number): Image /* this */
    override fun setGravityY(y: Number): Image /* this */
    override fun setImmovable(value: Boolean): Image /* this */
    override fun setMass(value: Number): Image /* this */
    override fun setPushable(value: Boolean): Image /* this */
    override fun setOffset(x: Number, y: Number): Image /* this */
    override fun setBodySize(width: Number, height: Number, center: Boolean): Image /* this */
    override fun setCircle(radius: Number, offsetX: Number, offsetY: Number): Image /* this */
    override fun setVelocity(x: Number, y: Number): Image /* this */
    override fun setVelocityX(x: Number): Image /* this */
    override fun setVelocityY(y: Number): Image /* this */
    override fun setMaxVelocity(x: Number, y: Number): Image /* this */
    override fun setTexture(key: Texture, frame: String): _Phaser_GameObjects_Components_Texture /* this */
    override fun setTexture(key: Texture): _Phaser_GameObjects_Components_Texture /* this */
    override fun setTexture(key: Texture, frame: Number): _Phaser_GameObjects_Components_Texture /* this */

    override fun setSize(width: Number, height: Number, center: Boolean): Size /* this */
}

open external class ArcadePhysics(scene: Scene) {
    open var scene: Scene
    open var systems: Systems
    open var config: ArcadeWorldConfig
    open var world: World
    open var add: Factory
    open fun enableUpdate()
    open fun disableUpdate()
    open fun getConfig(): ArcadeWorldConfig
    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: GameObject): Boolean
    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Phaser.GameObjects.Group): Boolean
    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Sprite): Boolean
    open fun overlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Image): Boolean
    open fun overlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: StaticGroup): Boolean
    open fun overlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Group): Boolean
    open fun overlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: TilemapLayer): Boolean
    open fun overlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<GameObject>): Boolean
    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<Sprite>): Boolean
    open fun overlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<Image>): Boolean
    open fun overlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<StaticGroup>): Boolean
    open fun overlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<Group>): Boolean
    open fun overlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<TilemapLayer>): Boolean
    open fun overlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: GameObject): Boolean
    open fun collide(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Phaser.GameObjects.Group): Boolean
    open fun collide(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Sprite): Boolean
    open fun collide(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Image): Boolean
    open fun collide(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: StaticGroup): Boolean
    open fun collide(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Group): Boolean
    open fun collide(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: TilemapLayer): Boolean
    open fun collide(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<GameObject>): Boolean
    open fun collide(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<Sprite>): Boolean
    open fun collide(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<Image>): Boolean
    open fun collide(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<StaticGroup>): Boolean
    open fun collide(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<Group>): Boolean
    open fun collide(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<TilemapLayer>): Boolean
    open fun collide(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collideTiles(
        sprite: GameObject,
        tiles: Array<Tile>,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlapTiles(
        sprite: GameObject,
        tiles: Array<Tile>,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun pause(): World
    open fun resume(): World
    open fun accelerateTo(
        gameObject: GameObject,
        x: Number,
        y: Number,
        speed: Number = definedExternally,
        xSpeedMax: Number = definedExternally,
        ySpeedMax: Number = definedExternally
    ): Number

    open fun accelerateToObject(
        gameObject: GameObject,
        destination: GameObject,
        speed: Number = definedExternally,
        xSpeedMax: Number = definedExternally,
        ySpeedMax: Number = definedExternally
    ): Number

    open fun closest(
        source: Any,
        targets: Array<Body> = definedExternally
    ): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */

    open fun closest(source: Any): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */
    open fun closest(
        source: Any,
        targets: Array<StaticBody> = definedExternally
    ): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */

    open fun closest(
        source: Any,
        targets: Array<GameObject> = definedExternally
    ): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */

    open fun furthest(
        source: Any,
        targets: Array<Body> = definedExternally
    ): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */

    open fun furthest(source: Any): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */
    open fun furthest(
        source: Any,
        targets: Array<StaticBody> = definedExternally
    ): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */

    open fun furthest(
        source: Any,
        targets: Array<GameObject> = definedExternally
    ): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody | Phaser.GameObjects.GameObject */

    open fun moveTo(
        gameObject: GameObject,
        x: Number,
        y: Number,
        speed: Number = definedExternally,
        maxTime: Number = definedExternally
    ): Number

    open fun moveToObject(
        gameObject: GameObject,
        destination: Any?,
        speed: Number = definedExternally,
        maxTime: Number = definedExternally
    ): Number

    /**
     * Given the angle (in degrees) and speed calculate the velocity and return it as a vector, or set it to the given vector object.
     * One way to use this is: velocityFromAngle(angle, 200, sprite.body.velocity) which will set the values directly to the sprite's velocity and not create a new vector object.
     * @param angle The angle in degrees calculated in clockwise positive direction (down = 90 degrees positive, right = 0 degrees positive, up = 90 degrees negative)
     * @param speed The speed it will move, in pixels per second squared. Default 60.
     * @param vec2 The Vector2 in which the x and y properties will be set to the calculated velocity.
     */
    open fun velocityFromAngle(
        angle: Number,
        speed: Number = definedExternally,
        vec2: Vector2 = definedExternally
    ): Vector2

    /**
     * Given the rotation (in radians) and speed calculate the velocity and return it as a vector, or set it to the given vector object.
     * One way to use this is: velocityFromRotation(rotation, 200, sprite.body.velocity) which will set the values directly to the sprite's velocity and not create a new vector object.
     * @param rotation The angle in radians.
     * @param speed The speed it will move, in pixels per second squared Default 60.
     * @param vec2 The Vector2 in which the x and y properties will be set to the calculated velocity.
     */
    open fun velocityFromRotation(
        rotation: Number,
        speed: Number = definedExternally,
        vec2: Vector2 = definedExternally
    ): Vector2

    open fun overlapRect(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        includeDynamic: Boolean = definedExternally,
        includeStatic: Boolean = definedExternally
    ): dynamic /* Array<Phaser.Physics.Arcade.Body> | Array<Phaser.Physics.Arcade.StaticBody> */

    open fun overlapCirc(
        x: Number,
        y: Number,
        radius: Number,
        includeDynamic: Boolean = definedExternally,
        includeStatic: Boolean = definedExternally
    ): dynamic /* Array<Phaser.Physics.Arcade.Body> | Array<Phaser.Physics.Arcade.StaticBody> */

    open fun shutdown()
    open fun destroy()
}

open external class Sprite : Phaser.GameObjects.Sprite, Acceleration, Angular, Bounce, Debug, Drag, Enable, Friction,
    Gravity, Immovable, Mass, Pushable, Size, Velocity, Alpha, BlendMode, Depth, Flip, GetBounds, Origin, Pipeline,
    ScrollFactor, _Phaser_GameObjects_Components_Size, _Phaser_GameObjects_Components_Texture, Tint, Transform,
    Visible {
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: String = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: String)
    constructor(scene: Scene, x: Number, y: Number, texture: String, frame: Number = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture, frame: String = definedExternally)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture)
    constructor(scene: Scene, x: Number, y: Number, texture: Texture, frame: Number = definedExternally)

    override var body: dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody */
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
    override fun <O : Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Sprite /* this */
    override fun setMask(mask: GeometryMask): Sprite /* this */
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
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setCrop(): Sprite /* this */
    override fun setCrop(x: Number): Sprite /* this */
    override fun setCrop(x: Number, y: Number): Sprite /* this */
    override fun setCrop(x: Number, y: Number, width: Number): Sprite /* this */
    override fun setCrop(x: Rectangle, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setCrop(x: Rectangle): Sprite /* this */
    override fun setCrop(x: Rectangle, y: Number): Sprite /* this */
    override fun setCrop(x: Rectangle, y: Number, width: Number): Sprite /* this */
    override fun setTexture(key: String, frame: String): dynamic /* Sprite | Texture */
    override fun setTexture(key: String): dynamic /* Texture */
    override fun setTexture(key: String, frame: Number): dynamic /* Sprite | Texture */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Sprite | Texture */
    override fun setFrame(frame: String): dynamic /* Sprite | Texture */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Sprite | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Sprite | Texture */
    override fun setFrame(frame: Number): dynamic /* Sprite | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Sprite | Texture */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): Sprite /* this */
    override fun setTint(
        topLeft: Number?,
        topRight: Number?,
        bottomLeft: Number?,
        bottomRight: Number?
    ): Sprite /* this */

    override fun setTintFill(
        topLeft: Number?,
        topRight: Number?,
        bottomLeft: Number?,
        bottomRight: Number?
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
    override fun setAcceleration(x: Number, y: Number): Sprite /* this */
    override fun setAccelerationX(value: Number): Sprite /* this */
    override fun setAccelerationY(value: Number): Sprite /* this */
    override fun setAngularVelocity(value: Number): Sprite /* this */
    override fun setAngularAcceleration(value: Number): Sprite /* this */
    override fun setAngularDrag(value: Number): Sprite /* this */
    override fun setBounce(x: Number, y: Number): Sprite /* this */
    override fun setBounceX(value: Number): Sprite /* this */
    override fun setBounceY(value: Number): Sprite /* this */
    override fun setCollideWorldBounds(
        value: Boolean,
        bounceX: Number,
        bounceY: Number,
        onWorldBounds: Boolean
    ): Sprite /* this */

    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Sprite /* this */
    override fun setDebugBodyColor(value: Number): Sprite /* this */
    override var debugShowBody: Boolean
    override var debugShowVelocity: Boolean
    override var debugBodyColor: Number
    override fun setDrag(x: Number, y: Number): Sprite /* this */
    override fun setDragX(value: Number): Sprite /* this */
    override fun setDragY(value: Number): Sprite /* this */
    override fun setDamping(value: Boolean): Sprite /* this */
    override fun enableBody(
        reset: Boolean,
        x: Number,
        y: Number,
        enableGameObject: Boolean,
        showGameObject: Boolean
    ): Sprite /* this */

    override fun disableBody(disableGameObject: Boolean, hideGameObject: Boolean): Sprite /* this */
    override fun refreshBody(): Sprite /* this */
    override fun setFriction(x: Number, y: Number): Sprite /* this */
    override fun setFrictionX(x: Number): Sprite /* this */
    override fun setFrictionY(y: Number): Sprite /* this */
    override fun setGravity(x: Number, y: Number): Sprite /* this */
    override fun setGravityX(x: Number): Sprite /* this */
    override fun setGravityY(y: Number): Sprite /* this */
    override fun setImmovable(value: Boolean): Sprite /* this */
    override fun setMass(value: Number): Sprite /* this */
    override fun setPushable(value: Boolean): Sprite /* this */
    override fun setOffset(x: Number, y: Number): Sprite /* this */
    override fun setBodySize(width: Number, height: Number, center: Boolean): Sprite /* this */
    override fun setCircle(radius: Number, offsetX: Number, offsetY: Number): Sprite /* this */
    override fun setVelocity(x: Number, y: Number): Sprite /* this */
    override fun setVelocityX(x: Number): Sprite /* this */
    override fun setVelocityY(y: Number): Sprite /* this */
    override fun setMaxVelocity(x: Number, y: Number): Sprite /* this */
    override fun setTexture(key: Texture, frame: String): _Phaser_GameObjects_Components_Texture /* this */
    override fun setTexture(key: Texture): _Phaser_GameObjects_Components_Texture /* this */
    override fun setTexture(key: Texture, frame: Number): _Phaser_GameObjects_Components_Texture /* this */

    override fun setSize(width: Number, height: Number, center: Boolean): Size /* this */
}

/**
 * A Dynamic Arcade Body.
 *
 * Its static counterpart is {@link Phaser.Physics.Arcade.StaticBody}.
 */
open external class Body(world: World, gameObject: GameObject) {
    /**
     * The Arcade Physics simulation this Body belongs to.
     */
    open var world: World

    /**
     * The Game Object this Body belongs to.
     */
    open var gameObject: GameObject

    /**
     * Transformations applied to this Body.
     */
    open var transform: Any?

    /**
     * Whether the Body is drawn to the debug display.
     */
    open var debugShowBody: Boolean

    /**
     * Whether the Body's velocity is drawn to the debug display.
     */
    open var debugShowVelocity: Boolean

    /**
     * The color of this Body on the debug display.
     */
    open var debugBodyColor: Number

    /**
     * Whether this Body is updated by the physics simulation.
     */
    open var enable: Boolean

    /**
     * Whether this Body is circular (true) or rectangular (false).
     */
    open var isCircle: Boolean

    /**
     * If this Body is circular, this is the unscaled radius of the Body, as set by setCircle(), in source pixels.
     * The true radius is equal to `halfWidth`.
     */
    open var radius: Number

    /**
     * The offset of this Body's position from its Game Object's position, in source pixels.
     */
    open var offset: Vector2

    /**
     * The position of this Body within the simulation.
     */
    open var position: Vector2

    /**
     * The position of this Body during the previous step.
     */
    open var prev: Vector2

    /**
     * The position of this Body during the previous frame.
     */
    open var prevFrame: Vector2

    /**
     * Whether this Body's `rotation` is affected by its angular acceleration and angular velocity.
     */
    open var allowRotation: Boolean

    /**
     * This body's rotation, in degrees, based on its angular acceleration and angular velocity.
     * The Body's rotation controls the `angle` of its Game Object.
     * It doesn't rotate the Body's own geometry, which is always an axis-aligned rectangle or a circle.
     */
    open var rotation: Number

    /**
     * The Body rotation, in degrees, during the previous step.
     */
    open var preRotation: Number

    /**
     * The width of the Body, in pixels.
     * If the Body is circular, this is also the diameter.
     * If you wish to change the width use the `Body.setSize` method.
     */
    open val width: Number

    /**
     * The height of the Body, in pixels.
     * If the Body is circular, this is also the diameter.
     * If you wish to change the height use the `Body.setSize` method.
     */
    open val height: Number

    /**
     * The unscaled width of the Body, in source pixels, as set by setSize().
     * The default is the width of the Body's Game Object's texture frame.
     */
    open var sourceWidth: Number

    /**
     * The unscaled height of the Body, in source pixels, as set by setSize().
     * The default is the height of the Body's Game Object's texture frame.
     */
    open var sourceHeight: Number

    /**
     * Half the Body's width, in pixels.
     */
    open var halfWidth: Number

    /**
     * Half the Body's height, in pixels.
     */
    open var halfHeight: Number

    /**
     * The center of the Body.
     * The midpoint of its `position` (top-left corner) and its bottom-right corner.
     */
    open var center: Vector2

    /**
     * The Body's velocity, in pixels per second.
     */
    open var velocity: Vector2

    /**
     * The Body's change in position (due to velocity) at the last step, in pixels.
     *
     * The size of this value depends on the simulation's step rate.
     */
    open val newVelocity: Vector2

    /**
     * The Body's absolute maximum change in position, in pixels per step.
     */
    open var deltaMax: Vector2

    /**
     * The Body's change in velocity, in pixels per second squared.
     */
    open var acceleration: Vector2

    /**
     * Whether this Body's velocity is affected by its `drag`.
     */
    open var allowDrag: Boolean

    /**
     * When `useDamping` is false (the default), this is absolute loss of velocity due to movement, in pixels per second squared.
     *
     * When `useDamping` is true, this is a damping multiplier between 0 and 1.
     * A value of 0 means the Body stops instantly.
     * A value of 0.01 mean the Body keeps 1% of its velocity per second, losing 99%.
     * A value of 0.1 means the Body keeps 10% of its velocity per second, losing 90%.
     * A value of 1 means the Body loses no velocity.
     * You can use very small values (e.g., 0.001) to stop the Body quickly.
     *
     * The x and y components are applied separately.
     *
     * Drag is applied only when `acceleration` is zero.
     */
    open var drag: Vector2

    /**
     * Whether this Body's position is affected by gravity (local or world).
     */
    open var allowGravity: Boolean

    /**
     * Acceleration due to gravity (specific to this Body), in pixels per second squared.
     * Total gravity is the sum of this vector and the simulation's `gravity`.
     */
    open var gravity: Vector2

    /**
     * Rebound following a collision, relative to 1.
     */
    open var bounce: Vector2

    /**
     * Rebound following a collision with the world boundary, relative to 1.
     * If null, `bounce` is used instead.
     */
    open var worldBounce: Vector2

    /**
     * The rectangle used for world boundary collisions.
     *
     * By default it is set to the world boundary rectangle. Or, if this Body was
     * created by a Physics Group, then whatever rectangle that Group defined.
     *
     * You can also change it by using the `Body.setBoundsRectangle` method.
     */
    open var customBoundsRectangle: Rectangle

    /**
     * Whether the simulation emits a `worldbounds` event when this Body collides with the world boundary (and `collideWorldBounds` is also true).
     */
    open var onWorldBounds: Boolean

    /**
     * Whether the simulation emits a `collide` event when this Body collides with another.
     */
    open var onCollide: Boolean

    /**
     * Whether the simulation emits an `overlap` event when this Body overlaps with another.
     */
    open var onOverlap: Boolean

    /**
     * The Body's absolute maximum velocity, in pixels per second.
     * The horizontal and vertical components are applied separately.
     */
    open var maxVelocity: Vector2

    /**
     * The maximum speed this Body is allowed to reach, in pixels per second.
     *
     * If not negative it limits the scalar value of speed.
     *
     * Any negative value means no maximum is being applied (the default).
     */
    open var maxSpeed: Number

    /**
     * If this Body is `immovable` and in motion, `friction` is the proportion of this Body's motion received by the riding Body on each axis, relative to 1.
     * The horizontal component (x) is applied only when two colliding Bodies are separated vertically.
     * The vertical component (y) is applied only when two colliding Bodies are separated horizontally.
     * The default value (1, 0) moves the riding Body horizontally in equal proportion to this Body and vertically not at all.
     */
    open var friction: Vector2

    /**
     * If this Body is using `drag` for deceleration this property controls how the drag is applied.
     * If set to `true` drag will use a damping effect rather than a linear approach. If you are
     * creating a game where the Body moves freely at any angle (i.e. like the way the ship moves in
     * the game Asteroids) then you will get a far smoother and more visually correct deceleration
     * by using damping, avoiding the axis-drift that is prone with linear deceleration.
     *
     * If you enable this property then you should use far smaller `drag` values than with linear, as
     * they are used as a multiplier on the velocity. Values such as 0.05 will give a nice slow
     * deceleration.
     */
    open var useDamping: Boolean

    /**
     * The rate of change of this Body's `rotation`, in degrees per second.
     */
    open var angularVelocity: Number

    /**
     * The Body's angular acceleration (change in angular velocity), in degrees per second squared.
     */
    open var angularAcceleration: Number

    /**
     * Loss of angular velocity due to angular movement, in degrees per second.
     *
     * Angular drag is applied only when angular acceleration is zero.
     */
    open var angularDrag: Number

    /**
     * The Body's maximum angular velocity, in degrees per second.
     */
    open var maxAngular: Number

    /**
     * The Body's inertia, relative to a default unit (1).
     * With `bounce`, this affects the exchange of momentum (velocities) during collisions.
     */
    open var mass: Number

    /**
     * The calculated angle of this Body's velocity vector, in radians, during the last step.
     */
    open var angle: Number

    /**
     * The calculated magnitude of the Body's velocity, in pixels per second, during the last step.
     */
    open var speed: Number

    /**
     * The direction of the Body's velocity, as calculated during the last step.
     * This is a numeric constant value (FACING_UP, FACING_DOWN, FACING_LEFT, FACING_RIGHT).
     * If the Body is moving on both axes, this describes motion on the vertical axis only.
     */
    open var facing: Number

    /**
     * Whether this Body can be moved by collisions with another Body.
     */
    open var immovable: Boolean

    /**
     * Sets if this Body can be pushed by another Body.
     *
     * A body that cannot be pushed will reflect back all of the velocity it is given to the
     * colliding body. If that body is also not pushable, then the separation will be split
     * between them evenly.
     *
     * If you want your body to never move or seperate at all, see the `setImmovable` method.
     *
     * By default, Dynamic Bodies are always pushable.
     */
    open var pushable: Boolean

    /**
     * Whether the Body's position and rotation are affected by its velocity, acceleration, drag, and gravity.
     */
    open var moves: Boolean

    /**
     * A flag disabling the default horizontal separation of colliding bodies.
     * Pass your own `collideCallback` to the collider.
     */
    open var customSeparateX: Boolean

    /**
     * A flag disabling the default vertical separation of colliding bodies.
     * Pass your own `collideCallback` to the collider.
     */
    open var customSeparateY: Boolean

    /**
     * The amount of horizontal overlap (before separation), if this Body is colliding with another.
     */
    open var overlapX: Number

    /**
     * The amount of vertical overlap (before separation), if this Body is colliding with another.
     */
    open var overlapY: Number

    /**
     * The amount of overlap (before separation), if this Body is circular and colliding with another circular body.
     */
    open var overlapR: Number

    /**
     * Whether this Body is overlapped with another and both are not moving, on at least one axis.
     */
    open var embedded: Boolean

    /**
     * Whether this Body interacts with the world boundary.
     */
    open var collideWorldBounds: Boolean

    /**
     * Whether this Body is checked for collisions and for which directions.
     * You can set `checkCollision.none = true` to disable collision checks.
     */
    open var checkCollision: ArcadeBodyCollision

    /**
     * Whether this Body is colliding with a Body or Static Body and in which direction.
     * In a collision where both bodies have zero velocity, `embedded` will be set instead.
     */
    open var touching: ArcadeBodyCollision

    /**
     * This Body's `touching` value during the previous step.
     */
    open var wasTouching: ArcadeBodyCollision

    /**
     * Whether this Body is colliding with a Static Body, a tile, or the world boundary.
     * In a collision with a Static Body, if this Body has zero velocity then `embedded` will be set instead.
     */
    open var blocked: ArcadeBodyCollision

    /**
     * Whether to automatically synchronize this Body's dimensions to the dimensions of its Game Object's visual bounds.
     */
    open var syncBounds: Boolean

    /**
     * The Body's physics type (dynamic or static).
     */
    open val physicsType: Number

    /**
     * Updates the Body's `transform`, `width`, `height`, and `center` from its Game Object.
     * The Body's `position` isn't changed.
     */
    open fun updateBounds()

    /**
     * Updates the Body's `center` from its `position`, `width`, and `height`.
     */
    open fun updateCenter()

    /**
     * Updates the Body's `position`, `width`, `height`, and `center` from its Game Object and `offset`.
     *
     * You don't need to call this for Dynamic Bodies, as it happens automatically during the physics step.
     * But you could use it if you have modified the Body offset or Game Object transform and need to immediately
     * read the Body's new `position` or `center`.
     *
     * To resynchronize the Body with its Game Object, use `reset()` instead.
     */
    open fun updateFromGameObject()

    /**
     * Prepares the Body for a physics step by resetting the `wasTouching`, `touching` and `blocked` states.
     *
     * This method is only called if the physics world is going to run a step this frame.
     * @param clear Set the `wasTouching` values to their defaults. Default false.
     */
    open fun resetFlags(clear: Boolean = definedExternally)

    /**
     * Syncs the position body position with the parent Game Object.
     *
     * This method is called every game frame, regardless if the world steps or not.
     * @param willStep Will this Body run an update as well?
     * @param delta The delta time, in seconds, elapsed since the last frame.
     */
    open fun preUpdate(willStep: Boolean, delta: Number)

    /**
     * Performs a single physics step and updates the body velocity, angle, speed and other properties.
     *
     * This method can be called multiple times per game frame, depending on the physics step rate.
     *
     * The results are synced back to the Game Object in `postUpdate`.
     * @param delta The delta time, in seconds, elapsed since the last frame.
     */
    open fun update(delta: Number)

    /**
     * Feeds the Body results back into the parent Game Object.
     *
     * This method is called every game frame, regardless if the world steps or not.
     */
    open fun postUpdate()

    /**
     * Sets a custom collision boundary rectangle. Use if you want to have a custom
     * boundary instead of the world boundaries.
     * @param bounds The new boundary rectangle. Pass `null` to use the World bounds.
     */
    open fun setBoundsRectangle(bounds: Rectangle = definedExternally): Body /* this */

    /**
     * Checks for collisions between this Body and the world boundary and separates them.
     */
    open fun checkWorldBounds(): Boolean

    /**
     * Sets the offset of the Body's position from its Game Object's position.
     * The Body's `position` isn't changed until the next `preUpdate`.
     * @param x The horizontal offset, in source pixels.
     * @param y The vertical offset, in source pixels. Default x.
     */
    open fun setOffset(x: Number, y: Number = definedExternally): Body

    /**
     * Sizes and positions this Body, as a rectangle.
     * Modifies the Body `offset` if `center` is true (the default).
     * Resets the width and height to match current frame, if no width and height provided and a frame is found.
     * @param width The width of the Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame width.
     * @param height The height of the Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame height.
     * @param center Modify the Body's `offset`, placing the Body's center on its Game Object's center. Only works if the Game Object has the `getCenter` method. Default true.
     */
    open fun setSize(
        width: Number = definedExternally,
        height: Number = definedExternally,
        center: Boolean = definedExternally
    ): Body

    /**
     * Sizes and positions this Body, as a circle.
     * @param radius The radius of the Body, in source pixels.
     * @param offsetX The horizontal offset of the Body from its Game Object, in source pixels.
     * @param offsetY The vertical offset of the Body from its Game Object, in source pixels.
     */
    open fun setCircle(radius: Number, offsetX: Number = definedExternally, offsetY: Number = definedExternally): Body

    /**
     * Sets this Body's parent Game Object to the given coordinates and resets this Body at the new coordinates.
     * If the Body had any velocity or acceleration it is lost as a result of calling this.
     * @param x The horizontal position to place the Game Object.
     * @param y The vertical position to place the Game Object.
     */
    open fun reset(x: Number, y: Number)

    /**
     * Sets acceleration, velocity, and speed to zero.
     */
    open fun stop(): Body

    /**
     * Copies the coordinates of this Body's edges into an object.
     * @param obj An object to copy the values into.
     */
    open fun getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds

    /**
     * Tests if the coordinates are within this Body.
     * @param x The horizontal coordinate.
     * @param y The vertical coordinate.
     */
    open fun hitTest(x: Number, y: Number): Boolean

    /**
     * Whether this Body is touching a tile or the world boundary while moving down.
     */
    open fun onFloor(): Boolean

    /**
     * Whether this Body is touching a tile or the world boundary while moving up.
     */
    open fun onCeiling(): Boolean

    /**
     * Whether this Body is touching a tile or the world boundary while moving left or right.
     */
    open fun onWall(): Boolean

    /**
     * The absolute (non-negative) change in this Body's horizontal position from the previous step.
     */
    open fun deltaAbsX(): Number

    /**
     * The absolute (non-negative) change in this Body's vertical position from the previous step.
     */
    open fun deltaAbsY(): Number

    /**
     * The change in this Body's horizontal position from the previous step.
     * This value is set during the Body's update phase.
     *
     * As a Body can update multiple times per step this may not hold the final
     * delta value for the Body. In this case, please see the `deltaXFinal` method.
     */
    open fun deltaX(): Number

    /**
     * The change in this Body's vertical position from the previous step.
     * This value is set during the Body's update phase.
     *
     * As a Body can update multiple times per step this may not hold the final
     * delta value for the Body. In this case, please see the `deltaYFinal` method.
     */
    open fun deltaY(): Number

    /**
     * The change in this Body's horizontal position from the previous game update.
     *
     * This value is set during the `postUpdate` phase and takes into account the
     * `deltaMax` and final position of the Body.
     *
     * Because this value is not calculated until `postUpdate`, you must listen for it
     * during a Scene `POST_UPDATE` or `RENDER` event, and not in `update`, as it will
     * not be calculated by that point. If you _do_ use these values in `update` they
     * will represent the delta from the _previous_ game frame.
     */
    open fun deltaXFinal(): Number

    /**
     * The change in this Body's vertical position from the previous game update.
     *
     * This value is set during the `postUpdate` phase and takes into account the
     * `deltaMax` and final position of the Body.
     *
     * Because this value is not calculated until `postUpdate`, you must listen for it
     * during a Scene `POST_UPDATE` or `RENDER` event, and not in `update`, as it will
     * not be calculated by that point. If you _do_ use these values in `update` they
     * will represent the delta from the _previous_ game frame.
     */
    open fun deltaYFinal(): Number

    /**
     * The change in this Body's rotation from the previous step, in degrees.
     */
    open fun deltaZ(): Number

    /**
     * Disables this Body and marks it for deletion by the simulation.
     */
    open fun destroy()

    /**
     * Draws this Body and its velocity, if enabled.
     * @param graphic The Graphics object to draw on.
     */
    open fun drawDebug(graphic: Graphics)

    /**
     * Whether this Body will be drawn to the debug display.
     */
    open fun willDrawDebug(): Boolean

    /**
     * Sets whether this Body collides with the world boundary.
     *
     * Optionally also sets the World Bounce and `onWorldBounds` values.
     * @param value `true` if the Body should collide with the world bounds, otherwise `false`. Default true.
     * @param bounceX If given this replaces the Body's `worldBounce.x` value.
     * @param bounceY If given this replaces the Body's `worldBounce.y` value.
     * @param onWorldBounds If given this replaces the Body's `onWorldBounds` value.
     */
    open fun setCollideWorldBounds(
        value: Boolean = definedExternally,
        bounceX: Number = definedExternally,
        bounceY: Number = definedExternally,
        onWorldBounds: Boolean = definedExternally
    ): Body

    /**
     * Sets the Body's velocity.
     * @param x The horizontal velocity, in pixels per second.
     * @param y The vertical velocity, in pixels per second. Default x.
     */
    open fun setVelocity(x: Number, y: Number = definedExternally): Body

    /**
     * Sets the Body's horizontal velocity.
     * @param value The velocity, in pixels per second.
     */
    open fun setVelocityX(value: Number): Body

    /**
     * Sets the Body's vertical velocity.
     * @param value The velocity, in pixels per second.
     */
    open fun setVelocityY(value: Number): Body

    /**
     * Sets the Body's maximum velocity.
     * @param x The horizontal velocity, in pixels per second.
     * @param y The vertical velocity, in pixels per second. Default x.
     */
    open fun setMaxVelocity(x: Number, y: Number = definedExternally): Body

    /**
     * Sets the Body's maximum horizontal velocity.
     * @param value The maximum horizontal velocity, in pixels per second.
     */
    open fun setMaxVelocityX(value: Number): Body

    /**
     * Sets the Body's maximum vertical velocity.
     * @param value The maximum vertical velocity, in pixels per second.
     */
    open fun setMaxVelocityY(value: Number): Body

    /**
     * Sets the maximum speed the Body can move.
     * @param value The maximum speed value, in pixels per second. Set to a negative value to disable.
     */
    open fun setMaxSpeed(value: Number): Body

    /**
     * Sets the Body's bounce.
     * @param x The horizontal bounce, relative to 1.
     * @param y The vertical bounce, relative to 1. Default x.
     */
    open fun setBounce(x: Number, y: Number = definedExternally): Body

    /**
     * Sets the Body's horizontal bounce.
     * @param value The bounce, relative to 1.
     */
    open fun setBounceX(value: Number): Body

    /**
     * Sets the Body's vertical bounce.
     * @param value The bounce, relative to 1.
     */
    open fun setBounceY(value: Number): Body

    /**
     * Sets the Body's acceleration.
     * @param x The horizontal component, in pixels per second squared.
     * @param y The vertical component, in pixels per second squared. Default x.
     */
    open fun setAcceleration(x: Number, y: Number = definedExternally): Body

    /**
     * Sets the Body's horizontal acceleration.
     * @param value The acceleration, in pixels per second squared.
     */
    open fun setAccelerationX(value: Number): Body

    /**
     * Sets the Body's vertical acceleration.
     * @param value The acceleration, in pixels per second squared.
     */
    open fun setAccelerationY(value: Number): Body

    /**
     * Enables or disables drag.
     * @param value `true` to allow drag on this body, or `false` to disable it. Default true.
     */
    open fun setAllowDrag(value: Boolean = definedExternally): Body

    /**
     * Enables or disables gravity's effect on this Body.
     * @param value `true` to allow gravity on this body, or `false` to disable it. Default true.
     */
    open fun setAllowGravity(value: Boolean = definedExternally): Body

    /**
     * Enables or disables rotation.
     * @param value `true` to allow rotation on this body, or `false` to disable it. Default true.
     */
    open fun setAllowRotation(value: Boolean = definedExternally): Body

    /**
     * Sets the Body's drag.
     * @param x The horizontal component, in pixels per second squared.
     * @param y The vertical component, in pixels per second squared. Default x.
     */
    open fun setDrag(x: Number, y: Number = definedExternally): Body

    /**
     * If this Body is using `drag` for deceleration this property controls how the drag is applied.
     * If set to `true` drag will use a damping effect rather than a linear approach. If you are
     * creating a game where the Body moves freely at any angle (i.e. like the way the ship moves in
     * the game Asteroids) then you will get a far smoother and more visually correct deceleration
     * by using damping, avoiding the axis-drift that is prone with linear deceleration.
     *
     * If you enable this property then you should use far smaller `drag` values than with linear, as
     * they are used as a multiplier on the velocity. Values such as 0.95 will give a nice slow
     * deceleration, where-as smaller values, such as 0.5 will stop an object almost immediately.
     * @param value `true` to use damping, or `false` to use drag.
     */
    open fun setDamping(value: Boolean): Body

    /**
     * Sets the Body's horizontal drag.
     * @param value The drag, in pixels per second squared.
     */
    open fun setDragX(value: Number): Body

    /**
     * Sets the Body's vertical drag.
     * @param value The drag, in pixels per second squared.
     */
    open fun setDragY(value: Number): Body

    /**
     * Sets the Body's gravity.
     * @param x The horizontal component, in pixels per second squared.
     * @param y The vertical component, in pixels per second squared. Default x.
     */
    open fun setGravity(x: Number, y: Number = definedExternally): Body

    /**
     * Sets the Body's horizontal gravity.
     * @param value The gravity, in pixels per second squared.
     */
    open fun setGravityX(value: Number): Body

    /**
     * Sets the Body's vertical gravity.
     * @param value The gravity, in pixels per second squared.
     */
    open fun setGravityY(value: Number): Body

    /**
     * Sets the Body's friction.
     * @param x The horizontal component, relative to 1.
     * @param y The vertical component, relative to 1. Default x.
     */
    open fun setFriction(x: Number, y: Number = definedExternally): Body

    /**
     * Sets the Body's horizontal friction.
     * @param value The friction value, relative to 1.
     */
    open fun setFrictionX(value: Number): Body

    /**
     * Sets the Body's vertical friction.
     * @param value The friction value, relative to 1.
     */
    open fun setFrictionY(value: Number): Body

    /**
     * Sets the Body's angular velocity.
     * @param value The velocity, in degrees per second.
     */
    open fun setAngularVelocity(value: Number): Body

    /**
     * Sets the Body's angular acceleration.
     * @param value The acceleration, in degrees per second squared.
     */
    open fun setAngularAcceleration(value: Number): Body

    /**
     * Sets the Body's angular drag.
     * @param value The drag, in degrees per second squared.
     */
    open fun setAngularDrag(value: Number): Body

    /**
     * Sets the Body's mass.
     * @param value The mass value, relative to 1.
     */
    open fun setMass(value: Number): Body

    /**
     * Sets the Body's `immovable` property.
     * @param value The value to assign to `immovable`. Default true.
     */
    open fun setImmovable(value: Boolean = definedExternally): Body

    /**
     * Sets the Body's `enable` property.
     * @param value The value to assign to `enable`. Default true.
     */
    open fun setEnable(value: Boolean = definedExternally): Body

    /**
     * This is an internal handler, called by the `ProcessX` function as part
     * of the collision step. You should almost never call this directly.
     * @param x The amount to add to the Body position.
     * @param vx The amount to add to the Body velocity.
     * @param left Set the blocked.left value?
     * @param right Set the blocked.right value?
     */
    open fun processX(
        x: Number,
        vx: Number = definedExternally,
        left: Boolean = definedExternally,
        right: Boolean = definedExternally
    )

    /**
     * This is an internal handler, called by the `ProcessY` function as part
     * of the collision step. You should almost never call this directly.
     * @param y The amount to add to the Body position.
     * @param vy The amount to add to the Body velocity.
     * @param up Set the blocked.up value?
     * @param down Set the blocked.down value?
     */
    open fun processY(
        y: Number,
        vy: Number = definedExternally,
        up: Boolean = definedExternally,
        down: Boolean = definedExternally
    )

    /**
     * The Bodys horizontal position (left edge).
     */
    open var x: Number

    /**
     * The Bodys vertical position (top edge).
     */
    open var y: Number

    /**
     * The left edge of the Body. Identical to x.
     */
    open val left: Number

    /**
     * The right edge of the Body.
     */
    open val right: Number

    /**
     * The top edge of the Body. Identical to y.
     */
    open val top: Number

    /**
     * The bottom edge of this Body.
     */
    open val bottom: Number
}

open external class Collider {
    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: GameObject,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: Phaser.GameObjects.Group,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: Sprite,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: Image,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: StaticGroup,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: Group,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: TilemapLayer,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: Array<GameObject>,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: Array<Sprite>,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: Array<Image>,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: Array<StaticGroup>,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: Array<Group>,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    constructor(
        world: World,
        overlapOnly: Boolean,
        object1: Array<TilemapLayer>,
        object2: Any,
        collideCallback: ArcadePhysicsCallback,
        processCallback: ArcadePhysicsCallback,
        callbackContext: Any
    )

    open var world: World
    open var name: String
    open var active: Boolean
    open var overlapOnly: Boolean
    open var object1: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    open var object2: dynamic /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    open var collideCallback: ArcadePhysicsCallback
    open var processCallback: ArcadePhysicsCallback
    open var callbackContext: Any?
    open fun setName(name: String): Collider
    open fun update()
    open fun destroy()
}

external var DYNAMIC_BODY: Number

external var STATIC_BODY: Number

external var GROUP: Number

external var TILEMAPLAYER: Number

external var FACING_NONE: Number

external var FACING_UP: Number

external var FACING_DOWN: Number

external var FACING_LEFT: Number

external var FACING_RIGHT: Number

open external class Factory(world: World) {
    open var world: World
    open var scene: Scene
    open var sys: Systems
    open fun collider(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun collider(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */
    ): Collider

    open fun collider(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun collider(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun collider(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun collider(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */
    ): Collider

    open fun collider(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun collider(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun collider(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun collider(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */
    ): Collider

    open fun collider(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun collider(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun collider(
        object1: Array<Phaser.GameObjects.Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun collider(
        object1: Array<Phaser.GameObjects.Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */
    ): Collider

    open fun collider(
        object1: Array<Phaser.GameObjects.Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun collider(
        object1: Array<Phaser.GameObjects.Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */
    ): Collider

    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */
    ): Collider

    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */
    ): Collider

    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun overlap(
        object1: Array<Phaser.GameObjects.Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun overlap(
        object1: Array<Phaser.GameObjects.Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */
    ): Collider

    open fun overlap(
        object1: Array<Phaser.GameObjects.Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun overlap(
        object1: Array<Phaser.GameObjects.Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun <G : GameObject> existing(gameObject: G, isStatic: Boolean = definedExternally): G
    open fun staticImage(
        x: Number,
        y: Number,
        texture: String,
        frame: String = definedExternally
    ): Image /* Phaser.Physics.Arcade.Image & `T$17` */

    open fun staticImage(x: Number, y: Number, texture: String): Image /* Phaser.Physics.Arcade.Image & `T$17` */
    open fun staticImage(
        x: Number,
        y: Number,
        texture: String,
        frame: Number = definedExternally
    ): Image /* Phaser.Physics.Arcade.Image & `T$17` */

    open fun staticImage(
        x: Number,
        y: Number,
        texture: Texture,
        frame: String = definedExternally
    ): Image /* Phaser.Physics.Arcade.Image & `T$17` */

    open fun staticImage(x: Number, y: Number, texture: Texture): Image /* Phaser.Physics.Arcade.Image & `T$17` */
    open fun staticImage(
        x: Number,
        y: Number,
        texture: Texture,
        frame: Number = definedExternally
    ): Image /* Phaser.Physics.Arcade.Image & `T$17` */

    open fun image(
        x: Number,
        y: Number,
        texture: String,
        frame: String = definedExternally
    ): Image /* Phaser.Physics.Arcade.Image & `T$16` */

    open fun image(x: Number, y: Number, texture: String): Image /* Phaser.Physics.Arcade.Image & `T$16` */
    open fun image(
        x: Number,
        y: Number,
        texture: String,
        frame: Number = definedExternally
    ): Image /* Phaser.Physics.Arcade.Image & `T$16` */

    open fun image(
        x: Number,
        y: Number,
        texture: Texture,
        frame: String = definedExternally
    ): Image /* Phaser.Physics.Arcade.Image & `T$16` */

    open fun image(x: Number, y: Number, texture: Texture): Image /* Phaser.Physics.Arcade.Image & `T$16` */
    open fun image(
        x: Number,
        y: Number,
        texture: Texture,
        frame: Number = definedExternally
    ): Image /* Phaser.Physics.Arcade.Image & `T$16` */

    open fun staticSprite(
        x: Number,
        y: Number,
        texture: String,
        frame: String = definedExternally
    ): Sprite /* Phaser.Physics.Arcade.Sprite & `T$17` */

    open fun staticSprite(x: Number, y: Number, texture: String): Sprite /* Phaser.Physics.Arcade.Sprite & `T$17` */
    open fun staticSprite(
        x: Number,
        y: Number,
        texture: String,
        frame: Number = definedExternally
    ): Sprite /* Phaser.Physics.Arcade.Sprite & `T$17` */

    open fun staticSprite(
        x: Number,
        y: Number,
        texture: Texture,
        frame: String = definedExternally
    ): Sprite /* Phaser.Physics.Arcade.Sprite & `T$17` */

    open fun staticSprite(x: Number, y: Number, texture: Texture): Sprite /* Phaser.Physics.Arcade.Sprite & `T$17` */
    open fun staticSprite(
        x: Number,
        y: Number,
        texture: Texture,
        frame: Number = definedExternally
    ): Sprite /* Phaser.Physics.Arcade.Sprite & `T$17` */

    open fun sprite(
        x: Number,
        y: Number,
        key: String,
        frame: String = definedExternally
    ): Sprite /* Phaser.Physics.Arcade.Sprite & `T$16` */

    open fun sprite(x: Number, y: Number, key: String): Sprite /* Phaser.Physics.Arcade.Sprite & `T$16` */
    open fun sprite(
        x: Number,
        y: Number,
        key: String,
        frame: Number = definedExternally
    ): Sprite /* Phaser.Physics.Arcade.Sprite & `T$16` */

    open fun staticGroup(
        children: Array<GameObject> = definedExternally,
        config: GroupConfig = definedExternally
    ): StaticGroup

    open fun staticGroup(): StaticGroup
    open fun staticGroup(children: Array<GameObject> = definedExternally): StaticGroup
    open fun staticGroup(
        children: Array<GameObject> = definedExternally,
        config: GroupCreateConfig = definedExternally
    ): StaticGroup

    open fun staticGroup(
        children: GroupConfig = definedExternally,
        config: GroupConfig = definedExternally
    ): StaticGroup

    open fun staticGroup(children: GroupConfig = definedExternally): StaticGroup
    open fun staticGroup(
        children: GroupConfig = definedExternally,
        config: GroupCreateConfig = definedExternally
    ): StaticGroup

    open fun staticGroup(
        children: GroupCreateConfig = definedExternally,
        config: GroupConfig = definedExternally
    ): StaticGroup

    open fun staticGroup(children: GroupCreateConfig = definedExternally): StaticGroup
    open fun staticGroup(
        children: GroupCreateConfig = definedExternally,
        config: GroupCreateConfig = definedExternally
    ): StaticGroup

    open fun group(
        children: Array<GameObject> = definedExternally,
        config: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$18` */ = definedExternally
    ): Group

    open fun group(): Group
    open fun group(children: Array<GameObject> = definedExternally): Group
    open fun group(
        children: Array<GameObject> = definedExternally,
        config: GroupCreateConfig = definedExternally
    ): Group

    open fun group(
        children: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$18` */ = definedExternally,
        config: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$18` */ = definedExternally
    ): Group

    open fun group(children: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$18` */ = definedExternally): Group
    open fun group(
        children: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$18` */ = definedExternally,
        config: GroupCreateConfig = definedExternally
    ): Group

    open fun group(
        children: GroupCreateConfig = definedExternally,
        config: GroupConfig /* Phaser.Types.GameObjects.Group.GroupConfig & `T$18` */ = definedExternally
    ): Group

    open fun group(children: GroupCreateConfig = definedExternally): Group
    open fun group(
        children: GroupCreateConfig = definedExternally,
        config: GroupCreateConfig = definedExternally
    ): Group

    open fun destroy()
}

external fun GetOverlapX(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Number

external fun GetOverlapY(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Number

open external class Group : Phaser.GameObjects.Group {
    constructor(
        world: World,
        scene: Scene,
        children: Array<GameObject> = definedExternally,
        config: GroupConfig = definedExternally
    )

    constructor(world: World, scene: Scene)
    constructor(world: World, scene: Scene, children: Array<GameObject> = definedExternally)
    constructor(
        world: World,
        scene: Scene,
        children: Array<GameObject> = definedExternally,
        config: GroupCreateConfig = definedExternally
    )

    constructor(
        world: World,
        scene: Scene,
        children: GroupConfig = definedExternally,
        config: GroupConfig = definedExternally
    )

    constructor(world: World, scene: Scene, children: GroupConfig = definedExternally)
    constructor(
        world: World,
        scene: Scene,
        children: GroupConfig = definedExternally,
        config: GroupCreateConfig = definedExternally
    )

    constructor(
        world: World,
        scene: Scene,
        children: GroupCreateConfig = definedExternally,
        config: GroupConfig = definedExternally
    )

    constructor(world: World, scene: Scene, children: GroupCreateConfig = definedExternally)
    constructor(
        world: World,
        scene: Scene,
        children: GroupCreateConfig = definedExternally,
        config: GroupCreateConfig = definedExternally
    )

    open var world: World
    override var classType: GroupClassTypeConstructor
    open var physicsType: Number
    open var defaults: PhysicsGroupDefaults
    override var type: String
    open fun createCallbackHandler(child: GameObject)
    open fun removeCallbackHandler(child: GameObject)
    open fun setVelocity(x: Number, y: Number, step: Number = definedExternally): Group
    open fun setVelocityX(value: Number, step: Number = definedExternally): Group
    open fun setVelocityY(value: Number, step: Number = definedExternally): Group
}

external fun SeparateX(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Boolean

external fun SeparateY(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Boolean

open external class StaticBody(world: World, gameObject: GameObject) {
    open var world: World
    open var gameObject: GameObject
    open var debugShowBody: Boolean
    open var debugBodyColor: Number
    open var enable: Boolean
    open var isCircle: Boolean
    open var radius: Number
    open val offset: Vector2
    open var position: Vector2
    open var width: Number
    open var height: Number
    open var halfWidth: Number
    open var halfHeight: Number
    open var center: Vector2
    open val velocity: Vector2
    open val allowGravity: Boolean
    open val gravity: Vector2
    open val bounce: Vector2
    open val onWorldBounds: Boolean
    open var onCollide: Boolean
    open var onOverlap: Boolean
    open var mass: Number
    open var immovable: Boolean
    open var pushable: Boolean
    open var customSeparateX: Boolean
    open var customSeparateY: Boolean
    open var overlapX: Number
    open var overlapY: Number
    open var overlapR: Number
    open var embedded: Boolean
    open val collideWorldBounds: Boolean
    open var checkCollision: ArcadeBodyCollision
    open var touching: ArcadeBodyCollision
    open var wasTouching: ArcadeBodyCollision
    open var blocked: ArcadeBodyCollision
    open var physicsType: Number
    open fun setGameObject(gameObject: GameObject, update: Boolean = definedExternally): StaticBody
    open fun updateFromGameObject(): StaticBody
    open fun setOffset(x: Number, y: Number): StaticBody
    open fun setSize(
        width: Number = definedExternally,
        height: Number = definedExternally,
        center: Boolean = definedExternally
    ): StaticBody

    open fun setCircle(
        radius: Number,
        offsetX: Number = definedExternally,
        offsetY: Number = definedExternally
    ): StaticBody

    open fun updateCenter()
    open fun reset(x: Number = definedExternally, y: Number = definedExternally)
    open fun stop(): StaticBody
    open fun getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds
    open fun hitTest(x: Number, y: Number): Boolean
    open fun postUpdate()
    open fun deltaAbsX(): Number
    open fun deltaAbsY(): Number
    open fun deltaX(): Number
    open fun deltaY(): Number
    open fun deltaZ(): Number
    open fun destroy()
    open fun drawDebug(graphic: Graphics)
    open fun willDrawDebug(): Boolean
    open fun setMass(value: Number): StaticBody
    open var x: Number
    open var y: Number
    open val left: Number
    open val right: Number
    open val top: Number
    open val bottom: Number
}

open external class StaticGroup : Phaser.GameObjects.Group {
    constructor(
        world: World,
        scene: Scene,
        children: Array<GameObject> = definedExternally,
        config: GroupConfig = definedExternally
    )

    constructor(world: World, scene: Scene)
    constructor(world: World, scene: Scene, children: Array<GameObject> = definedExternally)
    constructor(
        world: World,
        scene: Scene,
        children: Array<GameObject> = definedExternally,
        config: GroupCreateConfig = definedExternally
    )

    constructor(
        world: World,
        scene: Scene,
        children: GroupConfig = definedExternally,
        config: GroupConfig = definedExternally
    )

    constructor(world: World, scene: Scene, children: GroupConfig = definedExternally)
    constructor(
        world: World,
        scene: Scene,
        children: GroupConfig = definedExternally,
        config: GroupCreateConfig = definedExternally
    )

    constructor(
        world: World,
        scene: Scene,
        children: GroupCreateConfig = definedExternally,
        config: GroupConfig = definedExternally
    )

    constructor(world: World, scene: Scene, children: GroupCreateConfig = definedExternally)
    constructor(
        world: World,
        scene: Scene,
        children: GroupCreateConfig = definedExternally,
        config: GroupCreateConfig = definedExternally
    )

    open var world: World
    open var physicsType: Number
    override var type: String
    open fun createCallbackHandler(child: GameObject)
    open fun removeCallbackHandler(child: GameObject)
    open fun createMultipleCallbackHandler(entries: Array<GameObject>)
    open fun refresh(): StaticGroup
}

open external class World(scene: Scene, config: ArcadeWorldConfig) : EventEmitter {
    open var scene: Scene
    open var bodies: Set<Body>
    open var staticBodies: Set<StaticBody>
    open var pendingDestroy: Set<dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody */>
    open var colliders: ProcessQueue<Collider>
    open var gravity: Vector2
    open var bounds: Rectangle
    open var checkCollision: CheckCollisionObject
    open val fps: Number
    open var fixedStep: Boolean
    open val stepsLastFrame: Number
    open var timeScale: Number
    open var OVERLAP_BIAS: Number
    open var TILE_BIAS: Number
    open var forceX: Boolean
    open var isPaused: Boolean
    open var drawDebug: Boolean
    open var debugGraphic: Graphics
    open var defaults: ArcadeWorldDefaults
    open var maxEntries: Number
    open var useTree: Boolean
    open var tree: RTree
    open var staticTree: RTree
    open var treeMinMax: ArcadeWorldTreeMinMax
    open var tileFilterOptions: FilteringOptions
    open fun enable(obj: GameObject, bodyType: Number = definedExternally)
    open fun enable(obj: GameObject)
    open fun enable(obj: Array<GameObject>, bodyType: Number = definedExternally)
    open fun enable(obj: Array<GameObject>)
    open fun enable(obj: Phaser.GameObjects.Group, bodyType: Number = definedExternally)
    open fun enable(obj: Phaser.GameObjects.Group)
    open fun enable(obj: Array<Phaser.GameObjects.Group>, bodyType: Number = definedExternally)
    open fun enable(obj: Array<Phaser.GameObjects.Group>)
    open fun enableBody(obj: GameObject, bodyType: Number = definedExternally): GameObject
    open fun add(body: Body): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody */
    open fun add(body: StaticBody): dynamic /* Phaser.Physics.Arcade.Body | Phaser.Physics.Arcade.StaticBody */
    open fun disable(obj: GameObject)
    open fun disable(obj: Array<GameObject>)
    open fun disable(obj: Phaser.GameObjects.Group)
    open fun disable(obj: Array<Phaser.GameObjects.Group>)
    open fun disableBody(body: Body)
    open fun disableBody(body: StaticBody)
    open fun remove(body: Body)
    open fun remove(body: StaticBody)
    open fun createDebugGraphic(): Graphics
    open fun setBounds(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        checkLeft: Boolean = definedExternally,
        checkRight: Boolean = definedExternally,
        checkUp: Boolean = definedExternally,
        checkDown: Boolean = definedExternally
    ): World

    open fun setBoundsCollision(
        left: Boolean = definedExternally,
        right: Boolean = definedExternally,
        up: Boolean = definedExternally,
        down: Boolean = definedExternally
    ): World

    open fun pause(): World
    open fun resume(): World
    open fun addCollider(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addCollider(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addCollider(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */
    ): Collider

    open fun addOverlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun addOverlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Collider

    open fun removeCollider(collider: Collider): World
    open fun setFPS(framerate: Number): World /* this */
    open fun update(time: Number, delta: Number)
    open fun step(delta: Number)
    open fun postUpdate()
    open fun updateMotion(body: Body, delta: Number)
    open fun computeAngularVelocity(body: Body, delta: Number)
    open fun computeVelocity(body: Body, delta: Number)
    open fun separate(
        body1: Body,
        body2: Body,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally,
        overlapOnly: Boolean = definedExternally
    ): Boolean

    open fun separateCircle(
        body1: Body,
        body2: Body,
        overlapOnly: Boolean = definedExternally,
        bias: Number = definedExternally
    ): Boolean

    open fun intersects(body1: Body, body2: Body): Boolean
    open fun circleBodyIntersects(circle: Body, body: Body): Boolean
    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: GameObject): Boolean
    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Phaser.GameObjects.Group): Boolean
    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Sprite): Boolean
    open fun overlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Image): Boolean
    open fun overlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: StaticGroup): Boolean
    open fun overlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Group): Boolean
    open fun overlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: TilemapLayer): Boolean
    open fun overlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<GameObject>): Boolean
    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<Sprite>): Boolean
    open fun overlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<Image>): Boolean
    open fun overlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<StaticGroup>): Boolean
    open fun overlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<Group>): Boolean
    open fun overlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(object1: Array<TilemapLayer>): Boolean
    open fun overlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: GameObject): Boolean
    open fun collide(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: GameObject,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Phaser.GameObjects.Group): Boolean
    open fun collide(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Phaser.GameObjects.Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Sprite): Boolean
    open fun collide(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Sprite,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Image): Boolean
    open fun collide(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Image,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: StaticGroup): Boolean
    open fun collide(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: StaticGroup,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Group): Boolean
    open fun collide(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Group,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: TilemapLayer): Boolean
    open fun collide(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: TilemapLayer,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<GameObject>): Boolean
    open fun collide(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<GameObject>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<Sprite>): Boolean
    open fun collide(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Sprite>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<Image>): Boolean
    open fun collide(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Image>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<StaticGroup>): Boolean
    open fun collide(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<StaticGroup>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<Group>): Boolean
    open fun collide(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<Group>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collide(object1: Array<TilemapLayer>): Boolean
    open fun collide(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collide(
        object1: Array<TilemapLayer>,
        object2: Any /* Phaser.GameObjects.GameObject | Phaser.GameObjects.Group | Phaser.Physics.Arcade.Sprite | Phaser.Physics.Arcade.Image | Phaser.Physics.Arcade.StaticGroup | Phaser.Physics.Arcade.Group | Phaser.Tilemaps.TilemapLayer | Array<Phaser.GameObjects.GameObject> | Array<Phaser.Physics.Arcade.Sprite> | Array<Phaser.Physics.Arcade.Image> | Array<Phaser.Physics.Arcade.StaticGroup> | Array<Phaser.Physics.Arcade.Group> | Array<Phaser.Tilemaps.TilemapLayer> */ = definedExternally,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun collideTiles(
        sprite: GameObject,
        tiles: Array<Tile>,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlapTiles(
        sprite: GameObject,
        tiles: Array<Tile>,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun collideSpriteVsTilemapLayer(
        sprite: GameObject,
        tilemapLayer: TilemapLayer,
        collideCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally,
        overlapOnly: Boolean = definedExternally
    ): Boolean

    open fun wrap(obj: Any, padding: Number = definedExternally)
    open fun wrapArray(objects: Array<Any>, padding: Number = definedExternally)
    open fun wrapObject(obj: Any, padding: Number = definedExternally)
    override fun shutdown()
    override fun destroy()
}
