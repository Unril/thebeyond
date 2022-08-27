@file:JsQualifier("Phaser.Input.Mouse")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Input.Mouse

import Phaser.Input.InputManager

open external class MouseManager(inputManager: InputManager) {
    open var manager: InputManager
    open var preventDefaultDown: Boolean
    open var preventDefaultUp: Boolean
    open var preventDefaultMove: Boolean
    open var preventDefaultWheel: Boolean
    open var enabled: Boolean
    open var target: Any
    open var locked: Boolean
    open var onMouseMove: Function<*>
    open var onMouseDown: Function<*>
    open var onMouseUp: Function<*>
    open var onMouseDownWindow: Function<*>
    open var onMouseUpWindow: Function<*>
    open var onMouseOver: Function<*>
    open var onMouseOut: Function<*>
    open var onMouseWheel: Function<*>
    open var pointerLockChange: Function<*>
    open val isTop: Boolean
    open fun disableContextMenu(): MouseManager /* this */
    open fun requestPointerLock()
    open fun releasePointerLock()
    open fun startListeners()
    open fun stopListeners()
    open fun destroy()
}
