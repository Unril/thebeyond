@file:JsQualifier("Phaser.Input.Gamepad")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Input.Gamepad

import Phaser.Events.EventEmitter
import Phaser.Input.InputPlugin
import Phaser.Math.Vector2
import Phaser.Scene
import Phaser.Types.Input.Gamepad.Pad
import Phaser.Types.Scenes.SettingsObject
import tsstdlib.GamepadHapticActuator

open external class Axis(pad: Gamepad, index: Number) {
    open var pad: Gamepad
    open var events: EventEmitter
    open var index: Number
    open var value: Number
    open var threshold: Number
    open fun getValue(): Number
    open fun destroy()
}

open external class Button(pad: Gamepad, index: Number) {
    open var pad: Gamepad
    open var events: EventEmitter
    open var index: Number
    open var value: Number
    open var threshold: Number
    open var pressed: Boolean
    open fun destroy()
}

open external class Gamepad(manager: GamepadPlugin, pad: Pad) : EventEmitter {
    open var manager: GamepadPlugin
    open var pad: Any
    open var id: String
    open var index: Number
    open var buttons: Array<Button>
    open var axes: Array<Axis>
    open var vibration: GamepadHapticActuator
    open var leftStick: Vector2
    open var rightStick: Vector2
    open fun getAxisTotal(): Number
    open fun getAxisValue(index: Number): Number
    open fun setAxisThreshold(value: Number)
    open fun getButtonTotal(): Number
    open fun getButtonValue(index: Number): Number
    open fun isButtonDown(index: Number): Boolean
    override fun destroy()
    open var connected: Boolean
    open var timestamp: Number
    open var left: Boolean
    open var right: Boolean
    open var up: Boolean
    open var down: Boolean
    open var A: Boolean
    open var Y: Boolean
    open var X: Boolean
    open var B: Boolean
    open var L1: Number
    open var L2: Number
    open var R1: Number
    open var R2: Number
}

open external class GamepadPlugin(sceneInputPlugin: InputPlugin) : EventEmitter {
    open var scene: Scene
    open var settings: SettingsObject
    open var sceneInputPlugin: InputPlugin
    open var enabled: Boolean
    open var target: Any
    open var gamepads: Array<Gamepad>
    open fun isActive(): Boolean
    open fun disconnectAll()
    open fun getAll(): Array<Gamepad>
    open fun getPad(index: Number): Gamepad
    open var total: Number
    open var pad1: Gamepad
    open var pad2: Gamepad
    open var pad3: Gamepad
    open var pad4: Gamepad
}
