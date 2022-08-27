@file:JsQualifier("Phaser.Renderer.WebGL")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Renderer.WebGL

import Class
import Phaser.Cameras.Scene2D.Camera
import Phaser.Display.ColorMatrix
import Phaser.Display.Masks.GeometryMask
import Phaser.Events.EventEmitter
import Phaser.Game
import Phaser.GameObjects.GameObject
import Phaser.Math.Matrix4
import Phaser.Renderer.WebGL.Pipelines.BitmapMaskPipeline
import Phaser.Renderer.WebGL.Pipelines.MultiPipeline
import Phaser.Renderer.WebGL.Pipelines.PostFXPipeline
import Phaser.Renderer.WebGL.Pipelines.UtilityPipeline
import Phaser.Scene
import Phaser.Structs.Map
import Phaser.Structs.Size
import Phaser.Textures.Frame
import Phaser.Textures.TextureSource
import Phaser.Types.Core.PipelineConfig
import Phaser.Types.Renderer.Snapshot.SnapshotCallback
import Phaser.Types.Renderer.Snapshot.SnapshotState
import Phaser.Types.Renderer.WebGL.*
import org.khronos.webgl.*
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLVideoElement
import tsstdlib.ANGLE_instanced_arrays
import tsstdlib.GLenum
import tsstdlib.OES_vertex_array_object

external var BYTE: WebGLConst

external var UNSIGNED_BYTE: WebGLConst

external var SHORT: WebGLConst

external var UNSIGNED_SHORT: WebGLConst

external var INT: WebGLConst

external var UNSIGNED_INT: WebGLConst

external var FLOAT: WebGLConst

open external class PipelineManager(renderer: WebGLRenderer) {
    open var game: Game
    open var renderer: WebGLRenderer
    open var classes: Map<String, Class>
    open var postPipelineClasses: Map<String, Class>
    open var pipelines: Map<String, WebGLPipeline>
    open var current: WebGLPipeline
    open var previous: WebGLPipeline
    open var MULTI_PIPELINE: MultiPipeline
    open var BITMAPMASK_PIPELINE: BitmapMaskPipeline
    open var UTILITY_PIPELINE: UtilityPipeline
    open var fullFrame1: RenderTarget
    open var fullFrame2: RenderTarget
    open var halfFrame1: RenderTarget
    open var halfFrame2: RenderTarget
    open var renderTargets: Array<RenderTarget>
    open var maxDimension: Number
    open var frameInc: Number
    open var targetIndex: Number
    open fun boot(pipelineConfig: PipelineConfig = definedExternally)
    open fun add(name: String, pipeline: WebGLPipeline): WebGLPipeline
    open fun addPostPipeline(name: String, pipeline: Function<*>): PipelineManager /* this */
    open fun flush()
    open fun has(pipeline: String): Boolean
    open fun has(pipeline: WebGLPipeline): Boolean
    open fun get(pipeline: String): WebGLPipeline
    open fun get(pipeline: WebGLPipeline): WebGLPipeline
    open fun getPostPipeline(pipeline: String, gameObject: GameObject = definedExternally): PostFXPipeline
    open fun getPostPipeline(pipeline: String): PostFXPipeline
    open fun getPostPipeline(pipeline: Function<*>, gameObject: GameObject = definedExternally): PostFXPipeline
    open fun getPostPipeline(pipeline: Function<*>): PostFXPipeline
    open fun getPostPipeline(pipeline: PostFXPipeline, gameObject: GameObject = definedExternally): PostFXPipeline
    open fun getPostPipeline(pipeline: PostFXPipeline): PostFXPipeline
    open fun remove(
        name: String,
        removeClass: Boolean = definedExternally,
        removePostPipelineClass: Boolean = definedExternally
    )

    open fun set(
        pipeline: WebGLPipeline,
        gameObject: GameObject = definedExternally,
        currentShader: WebGLShader = definedExternally
    ): WebGLPipeline

    open fun preBatch(gameObject: GameObject)
    open fun postBatch(gameObject: GameObject)
    open fun preBatchCamera(camera: Camera)
    open fun postBatchCamera(camera: Camera)
    open fun isCurrent(pipeline: WebGLPipeline, currentShader: WebGLShader = definedExternally): Boolean
    open fun copyFrame(
        source: RenderTarget,
        target: RenderTarget = definedExternally,
        brightness: Number = definedExternally,
        clear: Boolean = definedExternally,
        clearAlpha: Boolean = definedExternally
    ): PipelineManager /* this */

    open fun copyToGame(source: RenderTarget)
    open fun drawFrame(
        source: RenderTarget,
        target: RenderTarget = definedExternally,
        clearAlpha: Boolean = definedExternally,
        colorMatrix: ColorMatrix = definedExternally
    ): PipelineManager /* this */

    open fun blendFrames(
        source1: RenderTarget,
        source2: RenderTarget,
        target: RenderTarget = definedExternally,
        strength: Number = definedExternally,
        clearAlpha: Boolean = definedExternally
    ): PipelineManager /* this */

    open fun blendFramesAdditive(
        source1: RenderTarget,
        source2: RenderTarget,
        target: RenderTarget = definedExternally,
        strength: Number = definedExternally,
        clearAlpha: Boolean = definedExternally
    ): PipelineManager /* this */

    open fun clearFrame(target: RenderTarget, clearAlpha: Boolean = definedExternally): PipelineManager /* this */
    open fun blitFrame(
        source: RenderTarget,
        target: RenderTarget,
        brightness: Number = definedExternally,
        clear: Boolean = definedExternally,
        clearAlpha: Boolean = definedExternally,
        eraseMode: Boolean = definedExternally
    ): PipelineManager /* this */

    open fun copyFrameRect(
        source: RenderTarget,
        target: RenderTarget,
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        clear: Boolean = definedExternally,
        clearAlpha: Boolean = definedExternally
    ): PipelineManager /* this */

    open fun forceZero(): Boolean
    open fun setMulti(): MultiPipeline
    open fun setUtility(currentShader: WebGLShader = definedExternally): UtilityPipeline
    open fun rebind(pipeline: WebGLPipeline = definedExternally)
    open fun clear()
    open fun getRenderTarget(): RenderTarget
    open fun getSwapRenderTarget(): RenderTarget
    open fun getAltSwapRenderTarget(): RenderTarget
    open fun destroy()
}

open external class RenderTarget(
    renderer: WebGLRenderer,
    width: Number,
    height: Number,
    scale: Number = definedExternally,
    minFilter: Number = definedExternally,
    autoClear: Boolean = definedExternally,
    autoResize: Boolean = definedExternally
) {
    open var renderer: WebGLRenderer
    open var framebuffer: WebGLFramebuffer
    open var texture: WebGLTexture
    open val width: Number
    open val height: Number
    open var scale: Number
    open var minFilter: Number
    open var autoClear: Boolean
    open val autoResize: Boolean
    open fun setAutoResize(autoResize: Boolean): RenderTarget /* this */
    open fun resize(width: Number, height: Number): RenderTarget /* this */
    open fun bind(
        adjustViewport: Boolean = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    open fun adjustViewport()
    open fun clear()
    open var unbind: Any
    open var destroy: Any
}

open external class WebGLPipeline(config: WebGLPipelineConfig) : EventEmitter {
    open var name: String
    open var game: Game
    open var renderer: WebGLRenderer
    open var manager: PipelineManager
    open var gl: WebGLRenderingContext
    open var view: HTMLCanvasElement
    open var width: Number
    open var height: Number
    open var vertexCount: Number
    open var vertexCapacity: Number
    open val vertexData: ArrayBuffer
    open val vertexBuffer: WebGLBuffer
    open var topology: GLenum
    open var bytes: Uint8Array
    open var vertexViewF32: Float32Array
    open var vertexViewU32: Uint32Array
    open var active: Boolean
    open var currentUnit: Number
    open var forceZero: Boolean
    open val hasBooted: Boolean
    open val isPostFX: Boolean
    open val isSpriteFX: Boolean
    open var renderTargets: Array<RenderTarget>
    open var currentRenderTarget: RenderTarget
    open var shaders: Array<WebGLShader>
    open var currentShader: WebGLShader
    open var projectionMatrix: Matrix4
    open var projectionWidth: Number
    open var projectionHeight: Number
    open var config: WebGLPipelineConfig
    open var glReset: Boolean
    open fun boot()
    open fun onBoot()
    open fun onResize(width: Number, height: Number)
    open fun setShader(
        shader: WebGLShader,
        setAttributes: Boolean = definedExternally,
        vertexBuffer: WebGLBuffer = definedExternally
    ): WebGLPipeline /* this */

    open fun getShaderByName(name: String): WebGLShader
    open fun setShadersFromConfig(config: WebGLPipelineConfig): WebGLPipeline /* this */
    open fun setGameObject(gameObject: GameObject, frame: Frame = definedExternally): Number
    open fun shouldFlush(amount: Number = definedExternally): Boolean
    open fun resize(width: Number, height: Number): WebGLPipeline /* this */
    open fun setProjectionMatrix(width: Number, height: Number): WebGLPipeline /* this */
    open fun flipProjectionMatrix(flipY: Boolean = definedExternally)
    open fun updateProjectionMatrix()
    open fun bind(currentShader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun rebind(currentShader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun setVertexBuffer(buffer: WebGLBuffer = definedExternally): Boolean
    open fun preBatch(gameObject: GameObject = definedExternally): WebGLPipeline /* this */
    open fun preBatch(): WebGLPipeline /* this */
    open fun preBatch(gameObject: Camera = definedExternally): WebGLPipeline /* this */
    open fun postBatch(gameObject: GameObject = definedExternally): WebGLPipeline /* this */
    open fun postBatch(): WebGLPipeline /* this */
    open fun postBatch(gameObject: Camera = definedExternally): WebGLPipeline /* this */
    open fun onDraw(renderTarget: RenderTarget, swapTarget: RenderTarget = definedExternally)
    open fun unbind()
    open fun flush(isPostFlush: Boolean = definedExternally): WebGLPipeline /* this */
    open fun onActive(currentShader: WebGLShader)
    open fun onBind(gameObject: GameObject = definedExternally)
    open fun onRebind()
    open fun onBatch(gameObject: GameObject = definedExternally)
    open fun onPreBatch(gameObject: GameObject = definedExternally)
    open fun onPostBatch(gameObject: GameObject = definedExternally)
    open fun onPreRender()
    open fun onRender(scene: Scene, camera: Camera)
    open fun onPostRender()
    open fun onBeforeFlush(isPostFlush: Boolean = definedExternally)
    open fun onAfterFlush(isPostFlush: Boolean = definedExternally)
    open fun batchVert(x: Number, y: Number, u: Number, v: Number, unit: Number, tintEffect: Number, tint: Number)
    open fun batchVert(x: Number, y: Number, u: Number, v: Number, unit: Number, tintEffect: Boolean, tint: Number)
    open fun batchQuad(
        gameObject: GameObject?,
        x0: Number,
        y0: Number,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintBR: Number,
        tintEffect: Number,
        texture: WebGLTexture = definedExternally,
        unit: Number = definedExternally
    ): Boolean

    open fun batchQuad(
        gameObject: GameObject?,
        x0: Number,
        y0: Number,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintBR: Number,
        tintEffect: Number
    ): Boolean

    open fun batchQuad(
        gameObject: GameObject?,
        x0: Number,
        y0: Number,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintBR: Number,
        tintEffect: Number,
        texture: WebGLTexture = definedExternally
    ): Boolean

    open fun batchQuad(
        gameObject: GameObject?,
        x0: Number,
        y0: Number,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintBR: Number,
        tintEffect: Boolean,
        texture: WebGLTexture = definedExternally,
        unit: Number = definedExternally
    ): Boolean

    open fun batchQuad(
        gameObject: GameObject?,
        x0: Number,
        y0: Number,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintBR: Number,
        tintEffect: Boolean
    ): Boolean

    open fun batchQuad(
        gameObject: GameObject?,
        x0: Number,
        y0: Number,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintBR: Number,
        tintEffect: Boolean,
        texture: WebGLTexture = definedExternally
    ): Boolean

    open fun batchTri(
        gameObject: GameObject?,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintEffect: Number,
        texture: WebGLTexture = definedExternally,
        unit: Number = definedExternally
    ): Boolean

    open fun batchTri(
        gameObject: GameObject?,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintEffect: Number
    ): Boolean

    open fun batchTri(
        gameObject: GameObject?,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintEffect: Number,
        texture: WebGLTexture = definedExternally
    ): Boolean

    open fun batchTri(
        gameObject: GameObject?,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintEffect: Boolean,
        texture: WebGLTexture = definedExternally,
        unit: Number = definedExternally
    ): Boolean

    open fun batchTri(
        gameObject: GameObject?,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintEffect: Boolean
    ): Boolean

    open fun batchTri(
        gameObject: GameObject?,
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        x3: Number,
        y3: Number,
        u0: Number,
        v0: Number,
        u1: Number,
        v1: Number,
        tintTL: Number,
        tintTR: Number,
        tintBL: Number,
        tintEffect: Boolean,
        texture: WebGLTexture = definedExternally
    ): Boolean

    open fun drawFillRect(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        color: Number,
        alpha: Number,
        texture: WebGLTexture = definedExternally,
        flipUV: Boolean = definedExternally
    )

    open fun setTexture2D(texture: WebGLTexture = definedExternally): Number
    open fun bindTexture(
        target: WebGLTexture = definedExternally,
        unit: Number = definedExternally
    ): WebGLPipeline /* this */

    open fun bindRenderTarget(
        target: RenderTarget = definedExternally,
        unit: Number = definedExternally
    ): WebGLPipeline /* this */

    open fun setTime(name: String): WebGLPipeline /* this */
    open fun setBoolean(name: String, value: Boolean, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set1f(name: String, x: Number, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set2f(
        name: String,
        x: Number,
        y: Number,
        shader: WebGLShader = definedExternally
    ): WebGLPipeline /* this */

    open fun set3f(
        name: String,
        x: Number,
        y: Number,
        z: Number,
        shader: WebGLShader = definedExternally
    ): WebGLPipeline /* this */

    open fun set4f(
        name: String,
        x: Number,
        y: Number,
        z: Number,
        w: Number,
        shader: WebGLShader = definedExternally
    ): WebGLPipeline /* this */

    open fun set1fv(name: String, arr: Array<Number>, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set1fv(name: String, arr: Array<Number>): WebGLPipeline /* this */
    open fun set1fv(name: String, arr: Float32Array, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set1fv(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun set2fv(name: String, arr: Array<Number>, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set2fv(name: String, arr: Array<Number>): WebGLPipeline /* this */
    open fun set2fv(name: String, arr: Float32Array, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set2fv(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun set3fv(name: String, arr: Array<Number>, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set3fv(name: String, arr: Array<Number>): WebGLPipeline /* this */
    open fun set3fv(name: String, arr: Float32Array, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set3fv(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun set4fv(name: String, arr: Array<Number>, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set4fv(name: String, arr: Array<Number>): WebGLPipeline /* this */
    open fun set4fv(name: String, arr: Float32Array, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set4fv(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun set1iv(name: String, arr: Array<Number>, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set1iv(name: String, arr: Array<Number>): WebGLPipeline /* this */
    open fun set1iv(name: String, arr: Float32Array, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set1iv(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun set2iv(name: String, arr: Array<Number>, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set2iv(name: String, arr: Array<Number>): WebGLPipeline /* this */
    open fun set2iv(name: String, arr: Float32Array, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set2iv(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun set3iv(name: String, arr: Array<Number>, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set3iv(name: String, arr: Array<Number>): WebGLPipeline /* this */
    open fun set3iv(name: String, arr: Float32Array, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set3iv(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun set4iv(name: String, arr: Array<Number>, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set4iv(name: String, arr: Array<Number>): WebGLPipeline /* this */
    open fun set4iv(name: String, arr: Float32Array, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set4iv(name: String, arr: Float32Array): WebGLPipeline /* this */
    open fun set1i(name: String, x: Number, shader: WebGLShader = definedExternally): WebGLPipeline /* this */
    open fun set2i(
        name: String,
        x: Number,
        y: Number,
        shader: WebGLShader = definedExternally
    ): WebGLPipeline /* this */

    open fun set3i(
        name: String,
        x: Number,
        y: Number,
        z: Number,
        shader: WebGLShader = definedExternally
    ): WebGLPipeline /* this */

    open fun set4i(
        name: String,
        x: Number,
        y: Number,
        z: Number,
        w: Number,
        shader: WebGLShader = definedExternally
    ): WebGLPipeline /* this */

    open fun setMatrix2fv(
        name: String,
        transpose: Boolean,
        matrix: Array<Number>,
        shader: WebGLShader = definedExternally
    ): WebGLPipeline /* this */

    open fun setMatrix2fv(name: String, transpose: Boolean, matrix: Array<Number>): WebGLPipeline /* this */
    open fun setMatrix2fv(
        name: String,
        transpose: Boolean,
        matrix: Float32Array,
        shader: WebGLShader = definedExternally
    ): WebGLPipeline /* this */

    open fun setMatrix2fv(name: String, transpose: Boolean, matrix: Float32Array): WebGLPipeline /* this */
    open fun setMatrix3fv(
        name: String,
        transpose: Boolean,
        matrix: Float32Array,
        shader: WebGLShader = definedExternally
    ): WebGLPipeline /* this */

    open fun setMatrix4fv(
        name: String,
        transpose: Boolean,
        matrix: Float32Array,
        shader: WebGLShader = definedExternally
    ): WebGLPipeline /* this */

    override fun destroy(): WebGLPipeline /* this */
}

open external class WebGLRenderer(game: Game) : EventEmitter {
    open var config: Any?
    open var game: Game
    open var type: Number
    open var pipelines: PipelineManager
    open var width: Number
    open var height: Number
    open var canvas: HTMLCanvasElement
    open var blendModes: Array<Any>
    open var contextLost: Boolean
    open var snapshotState: SnapshotState
    open var currentActiveTexture: Number
    open var startActiveTexture: Number
    open var maxTextures: Number
    open var textureIndexes: Array<Any>
    open var tempTextures: Array<Any>
    open var textureZero: WebGLTexture
    open var normalTexture: WebGLTexture
    open var currentFramebuffer: WebGLFramebuffer
    open var fboStack: Array<WebGLFramebuffer>
    open var currentProgram: WebGLProgram
    open var currentBlendMode: Number
    open var currentScissorEnabled: Boolean
    open var currentScissor: Uint32Array
    open var scissorStack: Uint32Array
    open var contextLostHandler: Function<*>
    open var contextRestoredHandler: Function<*>
    open var gl: WebGLRenderingContext
    open var supportedExtensions: Array<String>
    open var instancedArraysExtension: ANGLE_instanced_arrays
    open var vaoExtension: OES_vertex_array_object
    open var extensions: Any?
    open var glFormats: Array<Any>
    open var compression: WebGLTextureCompression
    open val drawingBufferHeight: Number
    open val blankTexture: WebGLTexture
    open val whiteTexture: WebGLTexture
    open var maskCount: Number
    open var maskStack: Array<GeometryMask>
    open var currentMask: Any
    open var currentCameraMask: Any
    open var glFuncMap: Any
    open var currentType: String
    open var newType: Boolean
    open var nextTypeMatch: Boolean
    open var finalType: Boolean
    open var mipmapFilter: GLenum
    open var textureFlush: Number
    open var isTextureClean: Boolean
    open var isBooted: Boolean
    open var renderTarget: RenderTarget
    open var projectionMatrix: Matrix4
    open var projectionWidth: Number
    open var projectionHeight: Number
    open fun init(config: Any?): WebGLRenderer /* this */
    open fun onResize(gameSize: Size, baseSize: Size)
    open fun beginCapture(width: Number = definedExternally, height: Number = definedExternally)
    open fun endCapture(): RenderTarget
    open fun resize(width: Number = definedExternally, height: Number = definedExternally): WebGLRenderer /* this */
    open fun getCompressedTextures(): WebGLTextureCompression
    open fun getCompressedTextureName(baseFormat: String, format: GLenum = definedExternally): String
    open fun supportsCompressedTexture(baseFormat: String, format: GLenum = definedExternally): Boolean
    open fun getAspectRatio(): Number
    open fun setProjectionMatrix(width: Number, height: Number): WebGLRenderer /* this */
    open fun resetProjectionMatrix()
    open fun hasExtension(extensionName: String): Boolean
    open fun getExtension(extensionName: String): Any?
    open fun flush()
    open fun pushScissor(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        drawingBufferHeight: Number = definedExternally
    ): Array<Number>

    open fun setScissor(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        drawingBufferHeight: Number = definedExternally
    )

    open fun resetScissor()
    open fun popScissor()
    open fun hasActiveStencilMask(): Boolean
    open fun resetViewport()
    open fun setBlendMode(blendModeId: Number, force: Boolean = definedExternally): Boolean
    open fun addBlendMode(func: Array<GLenum>, equation: GLenum): Number
    open fun updateBlendMode(index: Number, func: Function<*>, equation: Function<*>): WebGLRenderer /* this */
    open fun removeBlendMode(index: Number): WebGLRenderer /* this */
    open fun setTextureSource(textureSource: TextureSource): Number
    open fun isNewNormalMap(texture: WebGLTexture, normalMap: WebGLTexture): Boolean
    open fun setTextureZero(texture: WebGLTexture, flush: Boolean = definedExternally)
    open fun clearTextureZero()
    open fun setNormalMap(texture: WebGLTexture)
    open fun clearNormalMap()
    open fun unbindTextures(all: Boolean = definedExternally)
    open fun resetTextures(all: Boolean = definedExternally)
    open fun setTexture2D(texture: WebGLTexture): Number
    open fun pushFramebuffer(
        framebuffer: WebGLFramebuffer,
        updateScissor: Boolean = definedExternally,
        resetTextures: Boolean = definedExternally,
        setViewport: Boolean = definedExternally
    ): WebGLRenderer /* this */

    open fun setFramebuffer(
        framebuffer: WebGLFramebuffer,
        updateScissor: Boolean = definedExternally,
        resetTextures: Boolean = definedExternally,
        setViewport: Boolean = definedExternally
    ): WebGLRenderer /* this */

    open fun popFramebuffer(
        updateScissor: Boolean = definedExternally,
        resetTextures: Boolean = definedExternally,
        setViewport: Boolean = definedExternally
    ): WebGLFramebuffer

    open fun setProgram(program: WebGLProgram): Boolean
    open fun resetProgram(): WebGLRenderer /* this */
    open fun createTextureFromSource(
        source: Any?,
        width: Number,
        height: Number,
        scaleMode: Number,
        forceClamp: Boolean = definedExternally
    ): WebGLTexture

    open fun createTexture2D(
        mipLevel: Number,
        minFilter: Number,
        magFilter: Number,
        wrapT: Number,
        wrapS: Number,
        format: Number,
        pixels: Any?,
        width: Number,
        height: Number,
        pma: Boolean = definedExternally,
        forceSize: Boolean = definedExternally,
        flipY: Boolean = definedExternally
    ): WebGLTexture

    open fun createFramebuffer(
        width: Number,
        height: Number,
        renderTexture: WebGLTexture,
        addDepthStencilBuffer: Boolean = definedExternally
    ): WebGLFramebuffer

    open fun createProgram(vertexShader: String, fragmentShader: String): WebGLProgram
    open fun createVertexBuffer(initialDataOrSize: ArrayBuffer, bufferUsage: Number): WebGLBuffer
    open fun createIndexBuffer(initialDataOrSize: ArrayBuffer, bufferUsage: Number): WebGLBuffer
    open fun deleteTexture(texture: WebGLTexture, reset: Boolean = definedExternally): WebGLRenderer /* this */
    open fun deleteFramebuffer(framebuffer: WebGLFramebuffer): WebGLRenderer /* this */
    open fun deleteProgram(program: WebGLProgram): WebGLRenderer /* this */
    open fun deleteBuffer(vertexBuffer: WebGLBuffer): WebGLRenderer /* this */
    open fun preRenderCamera(camera: Camera)
    open fun postRenderCamera(camera: Camera)
    open fun preRender()
    open fun render(scene: Scene, children: Array<GameObject>, camera: Camera)
    open fun postRender()
    open fun snapshot(
        callback: SnapshotCallback,
        type: String = definedExternally,
        encoderOptions: Number = definedExternally
    ): WebGLRenderer /* this */

    open fun snapshotArea(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        callback: SnapshotCallback,
        type: String = definedExternally,
        encoderOptions: Number = definedExternally
    ): WebGLRenderer /* this */

    open fun snapshotPixel(x: Number, y: Number, callback: SnapshotCallback): WebGLRenderer /* this */
    open fun snapshotFramebuffer(
        framebuffer: WebGLFramebuffer,
        bufferWidth: Number,
        bufferHeight: Number,
        callback: SnapshotCallback,
        getPixel: Boolean = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        type: String = definedExternally,
        encoderOptions: Number = definedExternally
    ): WebGLRenderer /* this */

    open fun canvasToTexture(
        srcCanvas: HTMLCanvasElement,
        dstTexture: WebGLTexture = definedExternally,
        noRepeat: Boolean = definedExternally,
        flipY: Boolean = definedExternally
    ): WebGLTexture

    open fun createCanvasTexture(
        srcCanvas: HTMLCanvasElement,
        noRepeat: Boolean = definedExternally,
        flipY: Boolean = definedExternally
    ): WebGLTexture

    open fun updateCanvasTexture(
        srcCanvas: HTMLCanvasElement,
        dstTexture: WebGLTexture,
        flipY: Boolean = definedExternally
    ): WebGLTexture

    open fun createVideoTexture(
        srcVideo: HTMLVideoElement,
        noRepeat: Boolean = definedExternally,
        flipY: Boolean = definedExternally
    ): WebGLTexture

    open fun updateVideoTexture(
        srcVideo: HTMLVideoElement,
        dstTexture: WebGLTexture,
        flipY: Boolean = definedExternally
    ): WebGLTexture

    open fun setTextureFilter(texture: Number, filter: Number): WebGLRenderer /* this */
    open fun getMaxTextureSize(): Number
    override fun destroy()
}

open external class WebGLShader(
    pipeline: WebGLPipeline,
    name: String,
    vertexShader: String,
    fragmentShader: String,
    attributes: Array<WebGLPipelineAttributeConfig>
) {
    open var pipeline: WebGLPipeline
    open var name: String
    open var renderer: WebGLRenderer
    open var gl: WebGLRenderingContext
    open var fragSrc: String
    open var vertSrc: String
    open var program: WebGLProgram
    open var attributes: Array<WebGLPipelineAttribute>
    open var vertexComponentCount: Number
    open val vertexSize: Number
    open var uniforms: WebGLPipelineUniformsConfig
    open fun createAttributes(attributes: Array<WebGLPipelineAttributeConfig>)
    open fun bind(
        setAttributes: Boolean = definedExternally,
        flush: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun rebind(): WebGLShader /* this */
    open fun setAttribPointers(reset: Boolean = definedExternally): WebGLShader /* this */
    open fun createUniforms(): WebGLShader /* this */
    open fun hasUniform(name: String): Boolean
    open fun resetUniform(name: String): WebGLShader /* this */
    open fun setUniform1(
        setter: Function<*>,
        name: String,
        value1: Boolean,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform1(setter: Function<*>, name: String, value1: Boolean): WebGLShader /* this */
    open fun setUniform1(
        setter: Function<*>,
        name: String,
        value1: Number,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform1(setter: Function<*>, name: String, value1: Number): WebGLShader /* this */
    open fun setUniform1(
        setter: Function<*>,
        name: String,
        value1: Array<Number>,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform1(setter: Function<*>, name: String, value1: Array<Number>): WebGLShader /* this */
    open fun setUniform1(
        setter: Function<*>,
        name: String,
        value1: Float32Array,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform1(setter: Function<*>, name: String, value1: Float32Array): WebGLShader /* this */
    open fun setUniform2(
        setter: Function<*>,
        name: String,
        value1: Boolean,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform2(
        setter: Function<*>,
        name: String,
        value1: Boolean,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform2(
        setter: Function<*>,
        name: String,
        value1: Number,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform2(
        setter: Function<*>,
        name: String,
        value1: Number,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform2(
        setter: Function<*>,
        name: String,
        value1: Array<Number>,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform2(
        setter: Function<*>,
        name: String,
        value1: Array<Number>,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform2(
        setter: Function<*>,
        name: String,
        value1: Float32Array,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform2(
        setter: Function<*>,
        name: String,
        value1: Float32Array,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform3(
        setter: Function<*>,
        name: String,
        value1: Boolean,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform3(
        setter: Function<*>,
        name: String,
        value1: Boolean,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform3(
        setter: Function<*>,
        name: String,
        value1: Number,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform3(
        setter: Function<*>,
        name: String,
        value1: Number,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform3(
        setter: Function<*>,
        name: String,
        value1: Array<Number>,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform3(
        setter: Function<*>,
        name: String,
        value1: Array<Number>,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform3(
        setter: Function<*>,
        name: String,
        value1: Float32Array,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform3(
        setter: Function<*>,
        name: String,
        value1: Float32Array,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform4(
        setter: Function<*>,
        name: String,
        value1: Boolean,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value4: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform4(
        setter: Function<*>,
        name: String,
        value1: Boolean,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value4: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform4(
        setter: Function<*>,
        name: String,
        value1: Number,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value4: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform4(
        setter: Function<*>,
        name: String,
        value1: Number,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value4: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform4(
        setter: Function<*>,
        name: String,
        value1: Array<Number>,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value4: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform4(
        setter: Function<*>,
        name: String,
        value1: Array<Number>,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value4: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setUniform4(
        setter: Function<*>,
        name: String,
        value1: Float32Array,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value4: Any /* Boolean | Number | Array<Number> | Float32Array */,
        skipCheck: Boolean = definedExternally
    ): WebGLShader /* this */

    open fun setUniform4(
        setter: Function<*>,
        name: String,
        value1: Float32Array,
        value2: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value3: Any /* Boolean | Number | Array<Number> | Float32Array */,
        value4: Any /* Boolean | Number | Array<Number> | Float32Array */
    ): WebGLShader /* this */

    open fun setBoolean(name: String, value: Boolean): WebGLShader /* this */
    open fun set1f(name: String, x: Number): WebGLShader /* this */
    open fun set2f(name: String, x: Number, y: Number): WebGLShader /* this */
    open fun set3f(name: String, x: Number, y: Number, z: Number): WebGLShader /* this */
    open fun set4f(name: String, x: Number, y: Number, z: Number, w: Number): WebGLShader /* this */
    open fun set1fv(name: String, arr: Array<Number>): WebGLShader /* this */
    open fun set1fv(name: String, arr: Float32Array): WebGLShader /* this */
    open fun set2fv(name: String, arr: Array<Number>): WebGLShader /* this */
    open fun set2fv(name: String, arr: Float32Array): WebGLShader /* this */
    open fun set3fv(name: String, arr: Array<Number>): WebGLShader /* this */
    open fun set3fv(name: String, arr: Float32Array): WebGLShader /* this */
    open fun set4fv(name: String, arr: Array<Number>): WebGLShader /* this */
    open fun set4fv(name: String, arr: Float32Array): WebGLShader /* this */
    open fun set1iv(name: String, arr: Array<Number>): WebGLShader /* this */
    open fun set1iv(name: String, arr: Float32Array): WebGLShader /* this */
    open fun set2iv(name: String, arr: Array<Number>): WebGLShader /* this */
    open fun set2iv(name: String, arr: Float32Array): WebGLShader /* this */
    open fun set3iv(name: String, arr: Array<Number>): WebGLShader /* this */
    open fun set3iv(name: String, arr: Float32Array): WebGLShader /* this */
    open fun set4iv(name: String, arr: Array<Number>): WebGLShader /* this */
    open fun set4iv(name: String, arr: Float32Array): WebGLShader /* this */
    open fun set1i(name: String, x: Number): WebGLShader /* this */
    open fun set2i(name: String, x: Number, y: Number): WebGLShader /* this */
    open fun set3i(name: String, x: Number, y: Number, z: Number): WebGLShader /* this */
    open fun set4i(name: String, x: Number, y: Number, z: Number, w: Number): WebGLShader /* this */
    open fun setMatrix2fv(name: String, transpose: Boolean, matrix: Array<Number>): WebGLShader /* this */
    open fun setMatrix2fv(name: String, transpose: Boolean, matrix: Float32Array): WebGLShader /* this */
    open fun setMatrix3fv(name: String, transpose: Boolean, matrix: Float32Array): WebGLShader /* this */
    open fun setMatrix4fv(name: String, transpose: Boolean, matrix: Float32Array): WebGLShader /* this */
    open fun createProgram(
        vertSrc: String = definedExternally,
        fragSrc: String = definedExternally
    ): WebGLShader /* this */

    open fun destroy()
}
