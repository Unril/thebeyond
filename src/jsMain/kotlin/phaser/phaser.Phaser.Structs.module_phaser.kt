@file:JsQualifier("Phaser.Structs")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Structs

import EachListCallback
import EachMapCallback
import EachSetCallback
import Phaser.Events.EventEmitter
import Phaser.Math.Vector2
import org.w3c.dom.HTMLElement

external open class List<T>(parent: Any) {
    open var parent: Any
    open var list: Array<T>
    open var position: Number
    open var addCallback: Function<*>
    open var removeCallback: Function<*>
    open var _sortKey: String
    open fun add(child: T, skipCallback: Boolean = definedExternally): T
    open fun addAt(child: T, index: Number = definedExternally, skipCallback: Boolean = definedExternally): T
    open fun getAt(index: Number): T
    open fun getIndex(child: T): Number
    open fun sort(property: String, handler: Function<*> = definedExternally): Array<T>
    open fun getByName(name: String): T?
    open fun getRandom(startIndex: Number = definedExternally, length: Number = definedExternally): T?
    open fun getFirst(
        property: String,
        value: Any,
        startIndex: Number = definedExternally,
        endIndex: Number = definedExternally
    ): T?

    open fun getAll(
        property: String = definedExternally,
        value: T = definedExternally,
        startIndex: Number = definedExternally,
        endIndex: Number = definedExternally
    ): Array<T>

    open fun count(property: String, value: T): Number
    open fun swap(child1: T, child2: T)
    open fun moveTo(child: T, index: Number): T
    open fun moveAbove(child1: T, child2: T)
    open fun moveBelow(child1: T, child2: T)
    open fun remove(child: T, skipCallback: Boolean = definedExternally): T
    open fun removeAt(index: Number, skipCallback: Boolean = definedExternally): T
    open fun removeBetween(
        startIndex: Number = definedExternally,
        endIndex: Number = definedExternally,
        skipCallback: Boolean = definedExternally
    ): Array<T>

    open fun removeAll(skipCallback: Boolean = definedExternally): List<T>
    open fun bringToTop(child: T): T
    open fun sendToBack(child: T): T
    open fun moveUp(child: T): T
    open fun moveDown(child: T): T
    open fun reverse(): List<T>
    open fun shuffle(): List<T>
    open fun replace(oldChild: T, newChild: T): T
    open fun exists(child: T): Boolean
    open fun setAll(
        property: String,
        value: T,
        startIndex: Number = definedExternally,
        endIndex: Number = definedExternally
    )

    open fun each(callback: EachListCallback<T>, context: Any = definedExternally, vararg args: Any)
    open fun shutdown()
    open fun destroy()
    open val length: Number
    open val first: T
    open val last: T
    open val next: T
    open val previous: T
}

external interface `T$22`<V> {
    @nativeGetter
    operator fun get(key: String): V?

    @nativeSetter
    operator fun set(key: String, value: V)
}

external open class Map<K, V>(elements: Array<V>) {
    open var entries: `T$22`<Any?>
    open var size: Number
    open fun set(key: K, value: V): Map<K, V>
    open fun get(key: K): V
    open fun getArray(): Array<V>
    open fun has(key: K): Boolean
    open fun delete(key: K): Map<K, V>
    open fun clear(): Map<K, V>
    open fun keys(): Array<K>
    open fun values(): Array<V>
    open fun dump()
    open fun each(callback: EachMapCallback<V>): Map<K, V>
    open fun contains(value: V): Boolean
    open fun merge(map: Map<K, V>, override: Boolean = definedExternally): Map<K, V>
}

external open class ProcessQueue<T> : EventEmitter {
    open var checkQueue: Boolean
    open fun isActive(item: T): ProcessQueue<T>
    open fun isPending(item: T): ProcessQueue<T>
    open fun isDestroying(item: T): ProcessQueue<T>
    open fun add(item: T): ProcessQueue<T>
    open fun remove(item: T): ProcessQueue<T>
    open fun removeAll(): ProcessQueue<T> /* this */
    open fun update(): Array<T>
    open fun getActive(): Array<T>
    open val length: Number
    override fun destroy()
}

external open class RTree

external open class Set<T>(elements: Array<T> = definedExternally) {
    open var entries: Array<T>
    open fun set(value: T): Set<T>
    open fun get(property: String, value: T): T
    open fun getArray(): Array<T>
    open fun delete(value: T): Set<T>
    open fun dump()
    open fun each(callback: EachSetCallback<T>, callbackScope: Any = definedExternally): Set<T>
    open fun iterate(callback: EachSetCallback<T>, callbackScope: Any = definedExternally): Set<T>
    open fun iterateLocal(callbackKey: String, vararg args: Any): Set<T>
    open fun clear(): Set<T>
    open fun contains(value: T): Boolean
    open fun union(set: Set<T>): Set<T>
    open fun intersect(set: Set<T>): Set<T>
    open fun difference(set: Set<T>): Set<T>
    open var size: Number
}

external open class Size(
    width: Number = definedExternally,
    height: Number = definedExternally,
    aspectMode: Number = definedExternally,
    parent: Any = definedExternally
) {
    open val aspectMode: Number
    open val aspectRatio: Number
    open val minWidth: Number
    open val minHeight: Number
    open val maxWidth: Number
    open val maxHeight: Number
    open val snapTo: Vector2
    open fun setAspectMode(value: Number = definedExternally): Size /* this */
    open fun setSnap(snapWidth: Number = definedExternally, snapHeight: Number = definedExternally): Size /* this */
    open fun setParent(parent: Any = definedExternally): Size /* this */
    open fun setMin(width: Number = definedExternally, height: Number = definedExternally): Size /* this */
    open fun setMax(width: Number = definedExternally, height: Number = definedExternally): Size /* this */
    open fun setSize(width: Number = definedExternally, height: Number = definedExternally): Size /* this */
    open fun setAspectRatio(ratio: Number): Size /* this */
    open fun resize(width: Number, height: Number = definedExternally): Size /* this */
    open fun getNewWidth(value: Number, checkParent: Boolean = definedExternally): Number
    open fun getNewHeight(value: Number, checkParent: Boolean = definedExternally): Number
    open fun constrain(
        width: Number = definedExternally,
        height: Number = definedExternally,
        fit: Boolean = definedExternally
    ): Size /* this */

    open fun fitTo(width: Number = definedExternally, height: Number = definedExternally): Size /* this */
    open fun envelop(width: Number = definedExternally, height: Number = definedExternally): Size /* this */
    open fun setWidth(width: Number): Size /* this */
    open fun setHeight(height: Number): Size /* this */
    override fun toString(): String
    open fun setCSS(element: HTMLElement)
    open fun copy(destination: Size): Size
    open fun destroy()
    open var width: Number
    open var height: Number

    companion object {
        val NONE: Number
        val WIDTH_CONTROLS_HEIGHT: Number
        val HEIGHT_CONTROLS_WIDTH: Number
        val FIT: Number
        val ENVELOP: Number
    }
}
