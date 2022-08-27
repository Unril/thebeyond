@file:JsQualifier("Phaser.Input.Touch")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Input.Touch

import Phaser.Input.InputManager

open external class TouchManager(inputManager: InputManager) {
    open var manager: InputManager
    open var capture: Boolean
    open var enabled: Boolean
    open var target: Any
    open var onTouchStart: Function<*>
    open var onTouchStartWindow: Function<*>
    open var onTouchMove: Function<*>
    open var onTouchEnd: Function<*>
    open var onTouchEndWindow: Function<*>
    open var onTouchCancel: Function<*>
    open var onTouchCancelWindow: Function<*>
    open val isTop: Boolean
    open fun disableContextMenu(): TouchManager /* this */
    open fun startListeners()
    open fun stopListeners()
    open fun destroy()
}
