@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Scenes

import Phaser.Scene
import Phaser.Types.Core.LoaderConfig
import Phaser.Types.Core.PhysicsConfig

external interface CreateSceneFromObjectConfig {

    var init: SceneInitCallback?
        get() = definedExternally
        set(value) = definedExternally
    var preload: ScenePreloadCallback?
        get() = definedExternally
        set(value) = definedExternally
    var create: SceneCreateCallback?
        get() = definedExternally
        set(value) = definedExternally
    var update: SceneUpdateCallback?
        get() = definedExternally
        set(value) = definedExternally
    var extend: Any?
        get() = definedExternally
        set(value) = definedExternally
}


inline operator fun CreateSceneFromObjectConfig.get(key: String): Any? = asDynamic()[key]


inline operator fun CreateSceneFromObjectConfig.set(key: String, value: Any?) {
    asDynamic()[key] = value
}

typealias SceneCreateCallback = (self: Scene, data: Any?) -> Unit

typealias SceneInitCallback = (self: Scene, data: Any?) -> Unit

typealias ScenePreloadCallback = (self: Scene) -> Unit

external interface SceneTransitionConfig {
    var target: String
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sleep: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var remove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var allowInput: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var moveAbove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var moveBelow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdate: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdateScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
}

typealias SceneUpdateCallback = (self: Scene, time: Number, delta: Number) -> Unit

external interface `T$19` {

}


inline operator fun `T$19`.get(key: String): String? = asDynamic()[key]


inline operator fun `T$19`.set(key: String, value: String) {
    asDynamic()[key] = value
}

external interface SettingsConfig {
    /**
     * The unique key of this Scene. Must be unique within the entire Game instance.
     */
    var key: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Does the Scene start as active or not? An active Scene updates each step.
     */
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Does the Scene start as visible or not? A visible Scene renders each step.
     */
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Files to be loaded before the Scene begins.
     */
    var pack: dynamic /* Boolean? | Phaser.Types.Loader.FileTypes.PackFileSection? */
        get() = definedExternally
        set(value) = definedExternally

    /**
     * An optional Camera configuration object.
     */
    var cameras: dynamic /* Phaser.Types.Cameras.Scene2D.JSONCamera? | Array<Phaser.Types.Cameras.Scene2D.JSONCamera>? */
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Overwrites the default injection map for a scene.
     */
    var map: `T$19`?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Extends the injection map for a scene.
     */
    var mapAdd: `T$19`?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The physics configuration object for the Scene.
     */
    var physics: PhysicsConfig?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The loader configuration object for the Scene.
     */
    var loader: LoaderConfig?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The plugin configuration object for the Scene.
     */
    var plugins: dynamic /* Boolean? | Any? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SettingsObject {
    var status: Number
    var key: String
    var active: Boolean
    var visible: Boolean
    var isBooted: Boolean
    var isTransition: Boolean
    var transitionFrom: Scene
    var transitionDuration: Number
    var transitionAllowInput: Boolean
    var data: Any?
    var pack: dynamic /* Boolean | Phaser.Types.Loader.FileTypes.PackFileSection */
        get() = definedExternally
        set(value) = definedExternally
    var cameras: dynamic /* Phaser.Types.Cameras.Scene2D.JSONCamera | Array<Phaser.Types.Cameras.Scene2D.JSONCamera> */
        get() = definedExternally
        set(value) = definedExternally
    var map: `T$19`
    var physics: PhysicsConfig
    var loader: LoaderConfig
    var plugins: dynamic /* Boolean | Any */
        get() = definedExternally
        set(value) = definedExternally
}
