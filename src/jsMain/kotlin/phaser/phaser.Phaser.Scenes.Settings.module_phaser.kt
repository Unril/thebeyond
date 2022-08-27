@file:JsQualifier("Phaser.Scenes.Settings")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Scenes.Settings

import Phaser.Types.Scenes.SettingsConfig
import Phaser.Types.Scenes.SettingsObject

external fun create(config: String): SettingsObject

external fun create(config: SettingsConfig): SettingsObject
