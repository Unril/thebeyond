@file:JsQualifier("Phaser.Plugins")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Plugins

import Phaser.Game
import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Types.Plugins.GlobalPlugin

open external class BasePlugin(pluginManager: PluginManager) {
    open var pluginManager: PluginManager
    open var game: Game
    open fun init(data: Any = definedExternally)
    open fun start()
    open fun stop()
    open fun destroy()
}

open external class PluginManager(game: Game) {
    open var game: Game
    open var plugins: Array<GlobalPlugin>
    open var scenePlugins: Array<String>
    open fun boot()
    open fun addToScene(sys: Systems, globalPlugins: Array<Any>, scenePlugins: Array<Any>)
    open fun getDefaultScenePlugins(): Array<String>
    open fun installScenePlugin(
        key: String,
        plugin: Function<*>,
        mapping: String = definedExternally,
        addToScene: Scene = definedExternally,
        fromLoader: Boolean = definedExternally
    )

    open fun install(
        key: String,
        plugin: Function<*>,
        start: Boolean = definedExternally,
        mapping: String = definedExternally,
        data: Any = definedExternally
    ): BasePlugin

    open fun getIndex(key: String): Number
    open fun getEntry(key: String): GlobalPlugin
    open fun isActive(key: String): Boolean
    open fun start(key: String, runAs: String = definedExternally): BasePlugin
    open fun stop(key: String): PluginManager /* this */
    open fun get(
        key: String,
        autoStart: Boolean = definedExternally
    ): dynamic /* Phaser.Plugins.BasePlugin | Function<*> */

    open fun getClass(key: String): BasePlugin
    open fun removeGlobalPlugin(key: String)
    open fun removeScenePlugin(key: String)
    open fun registerGameObject(
        key: String,
        factoryCallback: Function<*> = definedExternally,
        creatorCallback: Function<*> = definedExternally
    )

    open fun removeGameObject(
        key: String,
        removeFromFactory: Boolean = definedExternally,
        removeFromCreator: Boolean = definedExternally
    )

    open fun registerFileType(key: String, callback: Function<*>, addToScene: Scene = definedExternally)
    open fun destroy()
}

open external class ScenePlugin(scene: Scene, pluginManager: PluginManager, pluginKey: String) : BasePlugin {
    open var scene: Scene
    open var systems: Systems
    open val pluginKey: String
    open fun boot()
    override fun destroy()
}
