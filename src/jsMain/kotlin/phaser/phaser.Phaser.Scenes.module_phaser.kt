@file:JsQualifier("Phaser.Scenes")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Scenes

import Phaser.Animations.AnimationManager
import Phaser.Cache.CacheManager
import Phaser.Cameras.Scene2D.CameraManager
import Phaser.Data.DataManager
import Phaser.Events.EventEmitter
import Phaser.FacebookInstantGamesPlugin
import Phaser.Game
import Phaser.GameObjects.DisplayList
import Phaser.GameObjects.GameObjectCreator
import Phaser.GameObjects.GameObjectFactory
import Phaser.GameObjects.UpdateList
import Phaser.Plugins.PluginManager
import Phaser.Renderer.Canvas.CanvasRenderer
import Phaser.Renderer.WebGL.WebGLRenderer
import Phaser.Scale.ScaleManager
import Phaser.Scene
import Phaser.Textures.TextureManager
import Phaser.Types.Scenes.CreateSceneFromObjectConfig
import Phaser.Types.Scenes.SceneTransitionConfig
import Phaser.Types.Scenes.SettingsConfig
import Phaser.Types.Scenes.SettingsObject
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import tsstdlib.Record

external var PENDING: Number

external var INIT: Number

external var START: Number

external var LOADING: Number

external var CREATING: Number

external var RUNNING: Number

external var PAUSED: Number

external var SLEEPING: Number

external var SHUTDOWN: Number

external var DESTROYED: Number

external fun GetPhysicsPlugins(sys: Systems): Array<Any>

external fun GetScenePlugins(sys: Systems): Array<Any>

open external class SceneManager(game: Game, sceneConfig: Any?) {
    open var game: Game
    open var keys: Record<String, Scene>
    open var scenes: Array<Scene>
    open val isProcessing: Boolean
    open val isBooted: Boolean
    open var customViewports: Number
    open fun processQueue()
    open fun add(
        key: String,
        sceneConfig: Scene,
        autoStart: Boolean = definedExternally,
        data: Any? = definedExternally
    ): Scene

    open fun add(key: String, sceneConfig: Scene): Scene
    open fun add(key: String, sceneConfig: Scene, autoStart: Boolean = definedExternally): Scene
    open fun add(
        key: String,
        sceneConfig: SettingsConfig,
        autoStart: Boolean = definedExternally,
        data: Any? = definedExternally
    ): Scene

    open fun add(key: String, sceneConfig: SettingsConfig): Scene
    open fun add(key: String, sceneConfig: SettingsConfig, autoStart: Boolean = definedExternally): Scene
    open fun add(
        key: String,
        sceneConfig: CreateSceneFromObjectConfig,
        autoStart: Boolean = definedExternally,
        data: Any? = definedExternally
    ): Scene

    open fun add(key: String, sceneConfig: CreateSceneFromObjectConfig): Scene
    open fun add(key: String, sceneConfig: CreateSceneFromObjectConfig, autoStart: Boolean = definedExternally): Scene
    open fun add(
        key: String,
        sceneConfig: Function<*>,
        autoStart: Boolean = definedExternally,
        data: Any? = definedExternally
    ): Scene

    open fun add(key: String, sceneConfig: Function<*>): Scene
    open fun add(key: String, sceneConfig: Function<*>, autoStart: Boolean = definedExternally): Scene
    open fun remove(key: String): SceneManager /* this */
    open fun update(time: Number, delta: Number)
    open fun render(renderer: CanvasRenderer)
    open fun render(renderer: WebGLRenderer)
    open fun getScenes(isActive: Boolean = definedExternally, inReverse: Boolean = definedExternally): Array<Scene>
    open fun getScene(key: String): Scene
    open fun getScene(key: Scene): Scene
    open fun isActive(key: String): Boolean
    open fun isActive(key: Scene): Boolean
    open fun isPaused(key: String): Boolean
    open fun isPaused(key: Scene): Boolean
    open fun isVisible(key: String): Boolean
    open fun isVisible(key: Scene): Boolean
    open fun isSleeping(key: String): Boolean
    open fun isSleeping(key: Scene): Boolean
    open fun pause(key: String, data: Any? = definedExternally): SceneManager /* this */
    open fun pause(key: String): SceneManager /* this */
    open fun pause(key: Scene, data: Any? = definedExternally): SceneManager /* this */
    open fun pause(key: Scene): SceneManager /* this */
    open fun resume(key: String, data: Any? = definedExternally): SceneManager /* this */
    open fun resume(key: String): SceneManager /* this */
    open fun resume(key: Scene, data: Any? = definedExternally): SceneManager /* this */
    open fun resume(key: Scene): SceneManager /* this */
    open fun sleep(key: String, data: Any? = definedExternally): SceneManager /* this */
    open fun sleep(key: String): SceneManager /* this */
    open fun sleep(key: Scene, data: Any? = definedExternally): SceneManager /* this */
    open fun sleep(key: Scene): SceneManager /* this */
    open fun wake(key: String, data: Any? = definedExternally): SceneManager /* this */
    open fun wake(key: String): SceneManager /* this */
    open fun wake(key: Scene, data: Any? = definedExternally): SceneManager /* this */
    open fun wake(key: Scene): SceneManager /* this */
    open fun run(key: String, data: Any? = definedExternally): SceneManager /* this */
    open fun run(key: String): SceneManager /* this */
    open fun run(key: Scene, data: Any? = definedExternally): SceneManager /* this */
    open fun run(key: Scene): SceneManager /* this */
    open fun start(key: String, data: Any? = definedExternally): SceneManager /* this */
    open fun start(key: String): SceneManager /* this */
    open fun start(key: Scene, data: Any? = definedExternally): SceneManager /* this */
    open fun start(key: Scene): SceneManager /* this */
    open fun stop(key: String, data: Any? = definedExternally): SceneManager /* this */
    open fun stop(key: String): SceneManager /* this */
    open fun stop(key: Scene, data: Any? = definedExternally): SceneManager /* this */
    open fun stop(key: Scene): SceneManager /* this */
    open fun switch(from: String, to: String): SceneManager /* this */
    open fun switch(from: String, to: Scene): SceneManager /* this */
    open fun switch(from: Scene, to: String): SceneManager /* this */
    open fun switch(from: Scene, to: Scene): SceneManager /* this */
    open fun getAt(index: Number): Scene?
    open fun getIndex(key: String): Number
    open fun getIndex(key: Scene): Number
    open fun bringToTop(key: String): SceneManager /* this */
    open fun bringToTop(key: Scene): SceneManager /* this */
    open fun sendToBack(key: String): SceneManager /* this */
    open fun sendToBack(key: Scene): SceneManager /* this */
    open fun moveDown(key: String): SceneManager /* this */
    open fun moveDown(key: Scene): SceneManager /* this */
    open fun moveUp(key: String): SceneManager /* this */
    open fun moveUp(key: Scene): SceneManager /* this */
    open fun moveAbove(keyA: String, keyB: String): SceneManager /* this */
    open fun moveAbove(keyA: String, keyB: Scene): SceneManager /* this */
    open fun moveAbove(keyA: Scene, keyB: String): SceneManager /* this */
    open fun moveAbove(keyA: Scene, keyB: Scene): SceneManager /* this */
    open fun moveBelow(keyA: String, keyB: String): SceneManager /* this */
    open fun moveBelow(keyA: String, keyB: Scene): SceneManager /* this */
    open fun moveBelow(keyA: Scene, keyB: String): SceneManager /* this */
    open fun moveBelow(keyA: Scene, keyB: Scene): SceneManager /* this */
    open fun swapPosition(keyA: String, keyB: String): SceneManager /* this */
    open fun swapPosition(keyA: String, keyB: Scene): SceneManager /* this */
    open fun swapPosition(keyA: Scene, keyB: String): SceneManager /* this */
    open fun swapPosition(keyA: Scene, keyB: Scene): SceneManager /* this */
    open fun dump()
    open fun destroy()
}

open external class ScenePlugin(scene: Scene) {
    open var scene: Scene
    open var systems: Systems
    open var settings: SettingsObject
    open var key: String
    open var manager: SceneManager
    open var transitionProgress: Number
    open fun start(key: String = definedExternally, data: Any? = definedExternally): ScenePlugin /* this */
    open fun start(): ScenePlugin /* this */
    open fun start(key: String = definedExternally): ScenePlugin /* this */
    open fun start(key: Scene = definedExternally, data: Any? = definedExternally): ScenePlugin /* this */
    open fun start(key: Scene = definedExternally): ScenePlugin /* this */
    open fun restart(data: Any? = definedExternally): ScenePlugin /* this */
    open fun transition(config: SceneTransitionConfig): Boolean
    open fun add(
        key: String,
        sceneConfig: Scene,
        autoStart: Boolean = definedExternally,
        data: Any? = definedExternally
    ): Scene

    open fun add(key: String, sceneConfig: Scene): Scene
    open fun add(key: String, sceneConfig: Scene, autoStart: Boolean = definedExternally): Scene
    open fun add(
        key: String,
        sceneConfig: SettingsConfig,
        autoStart: Boolean = definedExternally,
        data: Any? = definedExternally
    ): Scene

    open fun add(key: String, sceneConfig: SettingsConfig): Scene
    open fun add(key: String, sceneConfig: SettingsConfig, autoStart: Boolean = definedExternally): Scene
    open fun add(
        key: String,
        sceneConfig: CreateSceneFromObjectConfig,
        autoStart: Boolean = definedExternally,
        data: Any? = definedExternally
    ): Scene

    open fun add(key: String, sceneConfig: CreateSceneFromObjectConfig): Scene
    open fun add(key: String, sceneConfig: CreateSceneFromObjectConfig, autoStart: Boolean = definedExternally): Scene
    open fun add(
        key: String,
        sceneConfig: Function<*>,
        autoStart: Boolean = definedExternally,
        data: Any? = definedExternally
    ): Scene

    open fun add(key: String, sceneConfig: Function<*>): Scene
    open fun add(key: String, sceneConfig: Function<*>, autoStart: Boolean = definedExternally): Scene
    open fun launch(key: String, data: Any? = definedExternally): ScenePlugin /* this */
    open fun launch(key: String): ScenePlugin /* this */
    open fun launch(key: Scene, data: Any? = definedExternally): ScenePlugin /* this */
    open fun launch(key: Scene): ScenePlugin /* this */
    open fun run(key: String, data: Any? = definedExternally): ScenePlugin /* this */
    open fun run(key: String): ScenePlugin /* this */
    open fun run(key: Scene, data: Any? = definedExternally): ScenePlugin /* this */
    open fun run(key: Scene): ScenePlugin /* this */
    open fun pause(key: String = definedExternally, data: Any? = definedExternally): ScenePlugin /* this */
    open fun pause(): ScenePlugin /* this */
    open fun pause(key: String = definedExternally): ScenePlugin /* this */
    open fun pause(key: Scene = definedExternally, data: Any? = definedExternally): ScenePlugin /* this */
    open fun pause(key: Scene = definedExternally): ScenePlugin /* this */
    open fun resume(key: String = definedExternally, data: Any? = definedExternally): ScenePlugin /* this */
    open fun resume(): ScenePlugin /* this */
    open fun resume(key: String = definedExternally): ScenePlugin /* this */
    open fun resume(key: Scene = definedExternally, data: Any? = definedExternally): ScenePlugin /* this */
    open fun resume(key: Scene = definedExternally): ScenePlugin /* this */
    open fun sleep(key: String = definedExternally, data: Any? = definedExternally): ScenePlugin /* this */
    open fun sleep(): ScenePlugin /* this */
    open fun sleep(key: String = definedExternally): ScenePlugin /* this */
    open fun sleep(key: Scene = definedExternally, data: Any? = definedExternally): ScenePlugin /* this */
    open fun sleep(key: Scene = definedExternally): ScenePlugin /* this */
    open fun wake(key: String = definedExternally, data: Any? = definedExternally): ScenePlugin /* this */
    open fun wake(): ScenePlugin /* this */
    open fun wake(key: String = definedExternally): ScenePlugin /* this */
    open fun wake(key: Scene = definedExternally, data: Any? = definedExternally): ScenePlugin /* this */
    open fun wake(key: Scene = definedExternally): ScenePlugin /* this */
    open fun switch(key: String): ScenePlugin /* this */
    open fun switch(key: Scene): ScenePlugin /* this */
    open fun stop(key: String = definedExternally, data: Any = definedExternally): ScenePlugin /* this */
    open fun stop(): ScenePlugin /* this */
    open fun stop(key: String = definedExternally): ScenePlugin /* this */
    open fun stop(key: Scene = definedExternally, data: Any = definedExternally): ScenePlugin /* this */
    open fun stop(key: Scene = definedExternally): ScenePlugin /* this */
    open fun setActive(
        value: Boolean,
        key: String = definedExternally,
        data: Any? = definedExternally
    ): ScenePlugin /* this */

    open fun setActive(value: Boolean): ScenePlugin /* this */
    open fun setActive(value: Boolean, key: String = definedExternally): ScenePlugin /* this */
    open fun setActive(
        value: Boolean,
        key: Scene = definedExternally,
        data: Any? = definedExternally
    ): ScenePlugin /* this */

    open fun setActive(value: Boolean, key: Scene = definedExternally): ScenePlugin /* this */
    open fun setVisible(value: Boolean, key: String = definedExternally): ScenePlugin /* this */
    open fun setVisible(value: Boolean): ScenePlugin /* this */
    open fun setVisible(value: Boolean, key: Scene = definedExternally): ScenePlugin /* this */
    open fun isSleeping(key: String = definedExternally): Boolean
    open fun isSleeping(): Boolean
    open fun isSleeping(key: Scene = definedExternally): Boolean
    open fun isActive(key: String = definedExternally): Boolean
    open fun isActive(): Boolean
    open fun isActive(key: Scene = definedExternally): Boolean
    open fun isPaused(key: String = definedExternally): Boolean
    open fun isPaused(): Boolean
    open fun isPaused(key: Scene = definedExternally): Boolean
    open fun isVisible(key: String = definedExternally): Boolean
    open fun isVisible(): Boolean
    open fun isVisible(key: Scene = definedExternally): Boolean
    open fun swapPosition(keyA: String, keyB: String = definedExternally): ScenePlugin /* this */
    open fun swapPosition(keyA: String): ScenePlugin /* this */
    open fun swapPosition(keyA: String, keyB: Scene = definedExternally): ScenePlugin /* this */
    open fun swapPosition(keyA: Scene, keyB: String = definedExternally): ScenePlugin /* this */
    open fun swapPosition(keyA: Scene): ScenePlugin /* this */
    open fun swapPosition(keyA: Scene, keyB: Scene = definedExternally): ScenePlugin /* this */
    open fun moveAbove(keyA: String, keyB: String = definedExternally): ScenePlugin /* this */
    open fun moveAbove(keyA: String): ScenePlugin /* this */
    open fun moveAbove(keyA: String, keyB: Scene = definedExternally): ScenePlugin /* this */
    open fun moveAbove(keyA: Scene, keyB: String = definedExternally): ScenePlugin /* this */
    open fun moveAbove(keyA: Scene): ScenePlugin /* this */
    open fun moveAbove(keyA: Scene, keyB: Scene = definedExternally): ScenePlugin /* this */
    open fun moveBelow(keyA: String, keyB: String = definedExternally): ScenePlugin /* this */
    open fun moveBelow(keyA: String): ScenePlugin /* this */
    open fun moveBelow(keyA: String, keyB: Scene = definedExternally): ScenePlugin /* this */
    open fun moveBelow(keyA: Scene, keyB: String = definedExternally): ScenePlugin /* this */
    open fun moveBelow(keyA: Scene): ScenePlugin /* this */
    open fun moveBelow(keyA: Scene, keyB: Scene = definedExternally): ScenePlugin /* this */
    open fun remove(key: String = definedExternally): ScenePlugin /* this */
    open fun remove(): ScenePlugin /* this */
    open fun remove(key: Scene = definedExternally): ScenePlugin /* this */
    open fun moveUp(key: String = definedExternally): ScenePlugin /* this */
    open fun moveUp(): ScenePlugin /* this */
    open fun moveUp(key: Scene = definedExternally): ScenePlugin /* this */
    open fun moveDown(key: String = definedExternally): ScenePlugin /* this */
    open fun moveDown(): ScenePlugin /* this */
    open fun moveDown(key: Scene = definedExternally): ScenePlugin /* this */
    open fun bringToTop(key: String = definedExternally): ScenePlugin /* this */
    open fun bringToTop(): ScenePlugin /* this */
    open fun bringToTop(key: Scene = definedExternally): ScenePlugin /* this */
    open fun sendToBack(key: String = definedExternally): ScenePlugin /* this */
    open fun sendToBack(): ScenePlugin /* this */
    open fun sendToBack(key: Scene = definedExternally): ScenePlugin /* this */
    open fun get(key: String): Scene
    open fun get(key: Scene): Scene
    open fun getStatus(key: String): Number
    open fun getStatus(key: Scene): Number
    open fun getIndex(key: String = definedExternally): Number
    open fun getIndex(): Number
    open fun getIndex(key: Scene = definedExternally): Number
}

open external class Systems {
    constructor(scene: Scene, config: String)
    constructor(scene: Scene, config: SettingsConfig)

    open var scene: Scene
    open var game: Game
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var facebook: FacebookInstantGamesPlugin
    open var config: dynamic /* String | Phaser.Types.Scenes.SettingsConfig */
    open var settings: SettingsObject
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    open var anims: AnimationManager
    open var cache: CacheManager
    open var plugins: PluginManager
    open var registry: DataManager
    open var scale: ScaleManager
    open var sound: dynamic /* Phaser.Sound.NoAudioSoundManager | Phaser.Sound.HTML5AudioSoundManager | Phaser.Sound.WebAudioSoundManager */
    open var textures: TextureManager
    open var add: GameObjectFactory
    open var cameras: CameraManager
    open var displayList: DisplayList
    open var events: EventEmitter
    open var make: GameObjectCreator
    open var scenePlugin: ScenePlugin
    open var updateList: UpdateList
    open fun init(game: Game)
    open fun step(time: Number, delta: Number)
    open fun render(renderer: CanvasRenderer)
    open fun render(renderer: WebGLRenderer)
    open fun queueDepthSort()
    open fun depthSort()
    open fun pause(data: Any? = definedExternally): Systems
    open fun resume(data: Any? = definedExternally): Systems
    open fun sleep(data: Any? = definedExternally): Systems
    open fun wake(data: Any? = definedExternally): Systems
    open fun getData(): Any
    open fun getStatus(): Number
    open fun isSleeping(): Boolean
    open fun isActive(): Boolean
    open fun isPaused(): Boolean
    open fun isTransitioning(): Boolean
    open fun isTransitionOut(): Boolean
    open fun isTransitionIn(): Boolean
    open fun isVisible(): Boolean
    open fun setVisible(value: Boolean): Systems
    open fun setActive(value: Boolean, data: Any? = definedExternally): Systems
    open fun start(data: Any?)
    open fun shutdown(data: Any? = definedExternally)
}
