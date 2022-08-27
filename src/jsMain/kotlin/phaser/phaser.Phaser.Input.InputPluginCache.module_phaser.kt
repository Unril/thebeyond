@file:JsQualifier("Phaser.Input.InputPluginCache")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Input.InputPluginCache

import Phaser.Input.InputPlugin
import Phaser.Types.Input.InputPluginContainer

external fun register(key: String, plugin: Function<*>, mapping: String, settingsKey: String, configKey: String)

external fun getPlugin(key: String): InputPluginContainer

external fun install(target: InputPlugin)

external fun remove(key: String)
