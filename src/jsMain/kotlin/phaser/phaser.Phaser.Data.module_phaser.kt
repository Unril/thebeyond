@file:JsQualifier("Phaser.Data")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Data

import DataEachCallback
import Phaser.Events.EventEmitter
import Phaser.Scene
import Phaser.Scenes.Systems
import kotlin.js.Json
import kotlin.js.RegExp

open external class DataManager(parent: Any?, eventEmitter: EventEmitter = definedExternally) {
    open var parent: Any
    open var events: EventEmitter
    open var list: Json
    open var values: Json
    open fun get(key: String): Any
    open fun get(key: Array<String>): Any
    open fun getAll(): Json
    open fun query(search: RegExp): Json
    open fun set(key: String?, data: Any): DataManager /* this */
    open fun set(key: Any?, data: Any): DataManager /* this */
    open fun inc(key: String?, data: Any = definedExternally): DataManager
    open fun inc(key: String?): DataManager
    open fun inc(key: Any?, data: Any = definedExternally): DataManager
    open fun inc(key: Any?): DataManager
    open fun toggle(key: String?): DataManager
    open fun toggle(key: Any?): DataManager
    open fun each(
        callback: DataEachCallback,
        context: Any = definedExternally,
        vararg args: Any
    ): DataManager /* this */

    open fun merge(data: Json, overwrite: Boolean = definedExternally): DataManager /* this */
    open fun remove(key: String): DataManager /* this */
    open fun remove(key: Array<String>): DataManager /* this */
    open fun pop(key: String): Any
    open fun has(key: String): Boolean
    open fun setFreeze(value: Boolean): DataManager /* this */
    open fun reset(): DataManager /* this */
    open fun destroy()
    open var freeze: Boolean
    open var count: Number
}

open external class DataManagerPlugin(scene: Scene) : DataManager {
    open var scene: Scene
    open var systems: Systems
    override fun destroy()
}
