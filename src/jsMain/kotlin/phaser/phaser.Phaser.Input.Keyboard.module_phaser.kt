@file:JsQualifier("Phaser.Input.Keyboard")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Input.Keyboard

import Phaser.Events.EventEmitter
import Phaser.Game
import Phaser.Input.InputManager
import Phaser.Input.InputPlugin
import Phaser.Scene
import Phaser.Types.Input.Keyboard.CursorKeys
import Phaser.Types.Input.Keyboard.KeyComboConfig
import Phaser.Types.Scenes.SettingsObject
import org.w3c.dom.events.KeyboardEvent

open external class KeyCombo {
    constructor(keyboardPlugin: KeyboardPlugin, keys: String, config: KeyComboConfig = definedExternally)
    constructor(keyboardPlugin: KeyboardPlugin, keys: String)
    constructor(keyboardPlugin: KeyboardPlugin, keys: Array<Number>, config: KeyComboConfig = definedExternally)
    constructor(keyboardPlugin: KeyboardPlugin, keys: Array<Number>)
    constructor(keyboardPlugin: KeyboardPlugin, keys: Array<Any?>, config: KeyComboConfig = definedExternally)
    constructor(keyboardPlugin: KeyboardPlugin, keys: Array<Any?>)

    open var manager: KeyboardPlugin
    open var enabled: Boolean
    open var keyCodes: Array<Any>
    open var current: Number
    open var index: Number
    open var size: Number
    open var timeLastMatched: Number
    open var matched: Boolean
    open var timeMatched: Number
    open var resetOnWrongKey: Boolean
    open var maxKeyDelay: Number
    open var resetOnMatch: Boolean
    open var deleteOnMatch: Boolean
    open val progress: Number
    open fun destroy()
}

open external class KeyboardManager(inputManager: InputManager) {
    open var manager: InputManager
    open var preventDefault: Boolean
    open var captures: Array<Number>
    open var enabled: Boolean
    open var target: Any
    open var onKeyDown: Function<*>
    open var onKeyUp: Function<*>
    open fun startListeners()
    open fun stopListeners()
    open fun addCapture(keycode: String)
    open fun addCapture(keycode: Number)
    open fun addCapture(keycode: Array<Number>)
    open fun addCapture(keycode: Array<Any>)
    open fun removeCapture(keycode: String)
    open fun removeCapture(keycode: Number)
    open fun removeCapture(keycode: Array<Number>)
    open fun removeCapture(keycode: Array<Any>)
    open fun clearCaptures()
    open fun destroy()
}

open external class KeyboardPlugin(sceneInputPlugin: InputPlugin) : EventEmitter {
    open var game: Game
    open var scene: Scene
    open var settings: SettingsObject
    open var sceneInputPlugin: InputPlugin
    open var manager: KeyboardManager
    open var enabled: Boolean
    open var keys: Array<Key>
    open var combos: Array<KeyCombo>
    open fun isActive(): Boolean
    open fun addCapture(keycode: String): KeyboardPlugin /* this */
    open fun addCapture(keycode: Number): KeyboardPlugin /* this */
    open fun addCapture(keycode: Array<Number>): KeyboardPlugin /* this */
    open fun addCapture(keycode: Array<Any>): KeyboardPlugin /* this */
    open fun removeCapture(keycode: String): KeyboardPlugin /* this */
    open fun removeCapture(keycode: Number): KeyboardPlugin /* this */
    open fun removeCapture(keycode: Array<Number>): KeyboardPlugin /* this */
    open fun removeCapture(keycode: Array<Any>): KeyboardPlugin /* this */
    open fun getCaptures(): Array<Number>
    open fun enableGlobalCapture(): KeyboardPlugin /* this */
    open fun disableGlobalCapture(): KeyboardPlugin /* this */
    open fun clearCaptures(): KeyboardPlugin /* this */
    open fun createCursorKeys(): CursorKeys
    open fun addKeys(
        keys: Any?,
        enableCapture: Boolean = definedExternally,
        emitOnRepeat: Boolean = definedExternally
    ): Any?

    open fun addKeys(keys: Any?): Any?
    open fun addKeys(keys: Any?, enableCapture: Boolean = definedExternally): Any?
    open fun addKeys(
        keys: String?,
        enableCapture: Boolean = definedExternally,
        emitOnRepeat: Boolean = definedExternally
    ): Any?

    open fun addKeys(keys: String?): Any?
    open fun addKeys(keys: String?, enableCapture: Boolean = definedExternally): Any?
    open fun addKey(
        key: Key,
        enableCapture: Boolean = definedExternally,
        emitOnRepeat: Boolean = definedExternally
    ): Key

    open fun addKey(key: Key): Key
    open fun addKey(key: Key, enableCapture: Boolean = definedExternally): Key
    open fun addKey(
        key: String,
        enableCapture: Boolean = definedExternally,
        emitOnRepeat: Boolean = definedExternally
    ): Key

    open fun addKey(key: String): Key
    open fun addKey(key: String, enableCapture: Boolean = definedExternally): Key
    open fun addKey(
        key: Number,
        enableCapture: Boolean = definedExternally,
        emitOnRepeat: Boolean = definedExternally
    ): Key

    open fun addKey(key: Number): Key
    open fun addKey(key: Number, enableCapture: Boolean = definedExternally): Key
    open fun removeKey(
        key: Key,
        destroy: Boolean = definedExternally,
        removeCapture: Boolean = definedExternally
    ): KeyboardPlugin /* this */

    open fun removeKey(key: Key): KeyboardPlugin /* this */
    open fun removeKey(key: Key, destroy: Boolean = definedExternally): KeyboardPlugin /* this */
    open fun removeKey(
        key: String,
        destroy: Boolean = definedExternally,
        removeCapture: Boolean = definedExternally
    ): KeyboardPlugin /* this */

    open fun removeKey(key: String): KeyboardPlugin /* this */
    open fun removeKey(key: String, destroy: Boolean = definedExternally): KeyboardPlugin /* this */
    open fun removeKey(
        key: Number,
        destroy: Boolean = definedExternally,
        removeCapture: Boolean = definedExternally
    ): KeyboardPlugin /* this */

    open fun removeKey(key: Number): KeyboardPlugin /* this */
    open fun removeKey(key: Number, destroy: Boolean = definedExternally): KeyboardPlugin /* this */
    open fun removeAllKeys(
        destroy: Boolean = definedExternally,
        removeCapture: Boolean = definedExternally
    ): KeyboardPlugin /* this */

    open fun createCombo(keys: String, config: KeyComboConfig = definedExternally): KeyCombo
    open fun createCombo(keys: String): KeyCombo
    open fun createCombo(keys: Array<Number>, config: KeyComboConfig = definedExternally): KeyCombo
    open fun createCombo(keys: Array<Number>): KeyCombo
    open fun createCombo(keys: Array<Any?>, config: KeyComboConfig = definedExternally): KeyCombo
    open fun createCombo(keys: Array<Any?>): KeyCombo
    open fun checkDown(key: Key, duration: Number = definedExternally): Boolean
    open fun resetKeys(): KeyboardPlugin /* this */
}

external fun DownDuration(key: Key, duration: Number = definedExternally): Boolean

external fun JustDown(key: Key): Boolean

external fun JustUp(key: Key): Boolean

open external class Key(plugin: KeyboardPlugin, keyCode: Number) : EventEmitter {
    open var plugin: KeyboardPlugin
    open var keyCode: Number
    open var originalEvent: KeyboardEvent
    open var enabled: Boolean
    open var isDown: Boolean
    open var isUp: Boolean
    open var altKey: Boolean
    open var ctrlKey: Boolean
    open var shiftKey: Boolean
    open var metaKey: Boolean
    open var location: Number
    open var timeDown: Number
    open var duration: Number
    open var timeUp: Number
    open var emitOnRepeat: Boolean
    open var repeats: Number
    open fun setEmitOnRepeat(value: Boolean): Key /* this */
    open fun onDown(event: KeyboardEvent)
    open fun onUp(event: KeyboardEvent)
    open fun reset(): Key /* this */
    open fun getDuration(): Number
    override fun destroy()
}

external fun UpDuration(key: Key, duration: Number = definedExternally): Boolean
