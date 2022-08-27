@file:JsQualifier("Phaser.Core")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Core

import Phaser.DOM.RequestAnimationFrame
import Phaser.Display.Color
import Phaser.Game
import Phaser.Scale.CenterType
import Phaser.Scale.ScaleModeType
import Phaser.Types.Core.*
import org.w3c.dom.HTMLCanvasElement

open external class Config(GameConfig: GameConfig = definedExternally) {
    open val width: dynamic /* Number | String */
    open val height: dynamic /* Number | String */
    open val zoom: dynamic /* Phaser.Scale.ZoomType | Number */
    open val parent: Any
    open val scaleMode: ScaleModeType
    open val expandParent: Boolean
    open val autoRound: Boolean
    open val autoCenter: CenterType
    open val resizeInterval: Number
    open val fullscreenTarget: dynamic /* HTMLElement | String */
    open val minWidth: Number
    open val maxWidth: Number
    open val minHeight: Number
    open val maxHeight: Number
    open val renderType: Number
    open val canvas: HTMLCanvasElement
    open val context: dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */
    open val canvasStyle: String
    open val customEnvironment: Boolean
    open val sceneConfig: Any?
    open val seed: Array<String>
    open val gameTitle: String
    open val gameURL: String
    open val gameVersion: String
    open val autoFocus: Boolean
    open val domCreateContainer: Boolean
    open val domPointerEvents: String
    open val inputKeyboard: Boolean
    open val inputKeyboardEventTarget: Any
    open val inputKeyboardCapture: Array<Number>
    open val inputMouse: dynamic /* Boolean? | Any? */
    open val inputMouseEventTarget: Any
    open val inputMousePreventDefaultDown: Boolean
    open val inputMousePreventDefaultUp: Boolean
    open val inputMousePreventDefaultMove: Boolean
    open val inputMousePreventDefaultWheel: Boolean
    open val inputTouch: Boolean
    open val inputTouchEventTarget: Any
    open val inputTouchCapture: Boolean
    open val inputActivePointers: Number
    open val inputSmoothFactor: Number
    open val inputWindowEvents: Boolean
    open val inputGamepad: Boolean
    open val inputGamepadEventTarget: Any
    open val disableContextMenu: Boolean
    open val audio: AudioConfig
    open val hideBanner: Boolean
    open val hidePhaser: Boolean
    open val bannerTextColor: String
    open val bannerBackgroundColor: Array<String>
    open val fps: FPSConfig
    open val pipeline: PipelineConfig
    open val antialias: Boolean
    open val antialiasGL: Boolean
    open val mipmapFilter: String
    open val desynchronized: Boolean
    open val roundPixels: Boolean
    open val pixelArt: Boolean
    open val transparent: Boolean
    open val clearBeforeRender: Boolean
    open val preserveDrawingBuffer: Boolean
    open val premultipliedAlpha: Boolean
    open val failIfMajorPerformanceCaveat: Boolean
    open val powerPreference: String
    open val batchSize: Number
    open val maxTextures: Number
    open val maxLights: Number
    open val backgroundColor: Color
    open val preBoot: BootCallback
    open val postBoot: BootCallback
    open val physics: PhysicsConfig
    open val defaultPhysicsSystem: dynamic /* Boolean | String */
    open val loaderBaseURL: String
    open val loaderPath: String
    open val loaderMaxParallelDownloads: Number
    open val loaderCrossOrigin: String?
    open val loaderResponseType: String
    open val loaderAsync: Boolean
    open val loaderUser: String
    open val loaderPassword: String
    open val loaderTimeout: Number
    open val loaderWithCredentials: Boolean
    open val loaderImageLoadType: String
    open val loaderLocalScheme: Array<String>
    open val installGlobalPlugins: Any
    open val installScenePlugins: Any
    open val defaultPlugins: Any
    open val defaultImage: String
    open val missingImage: String
    open val whiteImage: String
}

external fun CreateRenderer(game: Game)

external fun DebugHeader(game: Game)

open external class TimeStep(game: Game, config: FPSConfig) {
    open val game: Game
    open val raf: RequestAnimationFrame
    open val started: Boolean
    open val running: Boolean
    open var minFps: Number
    open var targetFps: Number
    open val actualFps: Number
    open val nextFpsUpdate: Number
    open val framesThisSecond: Number
    open var callback: TimeStepCallback
    open val forceSetTimeOut: Boolean
    open var time: Number
    open var startTime: Number
    open var lastTime: Number
    open val frame: Number
    open val inFocus: Boolean
    open var delta: Number
    open var deltaIndex: Number
    open var deltaHistory: Array<Number>
    open var deltaSmoothingMax: Number
    open var panicMax: Number
    open var rawDelta: Number
    open var now: Number
    open var smoothStep: Boolean
    open fun blur()
    open fun focus()
    open fun pause()
    open fun resume()
    open fun resetDelta()
    open fun start(callback: TimeStepCallback)
    open fun step()
    open fun tick()
    open fun sleep()
    open fun wake(seamless: Boolean = definedExternally)
    open fun getDuration(): Number
    open fun getDurationMS(): Number
    open fun stop(): TimeStep /* this */
    open fun destroy()
}

external fun VisibilityHandler(game: Game)
