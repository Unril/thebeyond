@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused",
    "UNUSED_TYPEALIAS_PARAMETER"
)

package tsstdlib

import org.khronos.webgl.*
import kotlin.js.Date
import kotlin.js.RegExp

external interface PropertyDescriptor {
    var configurable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enumerable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any?
        get() = definedExternally
        set(value) = definedExternally
    var writable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val get: (() -> Any)?
    val set: ((v: Any) -> Unit)?
}

external interface PropertyDescriptorMap {
    @nativeGetter
    operator fun get(s: kotlin.String): PropertyDescriptor?

    @nativeSetter
    operator fun set(s: kotlin.String, value: PropertyDescriptor)
}

external interface Object {
    var constructor: Function<*>
    override fun toString(): kotlin.String
    fun toLocaleString(): kotlin.String
    fun valueOf(): Any
    fun hasOwnProperty(v: kotlin.String): Boolean
    fun hasOwnProperty(v: kotlin.Number): Boolean
    fun hasOwnProperty(v: Any): Boolean
    fun isPrototypeOf(v: Any): Boolean
    fun propertyIsEnumerable(v: kotlin.String): Boolean
    fun propertyIsEnumerable(v: kotlin.Number): Boolean
    fun propertyIsEnumerable(v: Any): Boolean
}

external interface ObjectConstructor {
    fun <T, U> assign(target: T, source: U): T /* T & U */
    fun <T, U, V> assign(target: T, source1: U, source2: V): T /* T & U & V */
    fun <T, U, V, W> assign(target: T, source1: U, source2: V, source3: W): T /* T & U & V & W */
    fun assign(target: Any?, vararg sources: Any): Any
    fun getOwnPropertySymbols(o: Any): Array<Any>
    fun keys(o: Any): Array<kotlin.String>
    fun `is`(value1: Any, value2: Any): Boolean
    fun setPrototypeOf(o: Any, proto: Any?): Any

    @nativeInvoke
    operator fun invoke(): Any

    @nativeInvoke
    operator fun invoke(value: Any): Any
    val prototype: Any
    fun getPrototypeOf(o: Any): Any
    fun getOwnPropertyDescriptor(o: Any, p: kotlin.String): PropertyDescriptor?
    fun getOwnPropertyDescriptor(o: Any, p: kotlin.Number): PropertyDescriptor?
    fun getOwnPropertyDescriptor(o: Any, p: Any): PropertyDescriptor?
    fun getOwnPropertyNames(o: Any): Array<kotlin.String>
    fun create(o: Any?): Any
    fun create(o: Any?, properties: PropertyDescriptorMap /* PropertyDescriptorMap & ThisType<Any> */): Any
    fun defineProperty(
        o: Any,
        p: kotlin.String,
        attributes: PropertyDescriptor /* PropertyDescriptor & ThisType<Any> */
    ): Any

    fun defineProperty(
        o: Any,
        p: kotlin.Number,
        attributes: PropertyDescriptor /* PropertyDescriptor & ThisType<Any> */
    ): Any

    fun defineProperty(o: Any, p: Any, attributes: PropertyDescriptor /* PropertyDescriptor & ThisType<Any> */): Any
    fun defineProperties(o: Any, properties: PropertyDescriptorMap /* PropertyDescriptorMap & ThisType<Any> */): Any
    fun <T> seal(o: T): T
    fun <T> freeze(a: Array<T>): Array<T>
    fun <T : Function<*>> freeze(f: T): dynamic
    fun <T> preventExtensions(o: T): T
    fun isSealed(o: Any): Boolean
    fun isFrozen(o: Any): Boolean
    fun isExtensible(o: Any): Boolean
    fun keys(o: Any?): Array<kotlin.String>
}

external interface FunctionConstructor {
    @nativeInvoke
    operator fun invoke(vararg args: kotlin.String): Function<*>
    val prototype: Function<*>
}

external interface StringConstructor {
    fun fromCodePoint(vararg codePoints: kotlin.Number): kotlin.String
    fun raw(template: Array<String>, vararg substitutions: Any): kotlin.String

    @nativeInvoke
    operator fun invoke(value: Any = definedExternally): kotlin.String
    val prototype: String
    fun fromCharCode(vararg codes: kotlin.Number): kotlin.String
}

external interface NumberConstructor {
    val EPSILON: kotlin.Number
    fun isFinite(number: Any): Boolean
    fun isInteger(number: Any): Boolean
    fun isNaN(number: Any): Boolean
    fun isSafeInteger(number: Any): Boolean
    val MAX_SAFE_INTEGER: kotlin.Number
    val MIN_SAFE_INTEGER: kotlin.Number
    fun parseFloat(string: kotlin.String): kotlin.Number
    fun parseInt(string: kotlin.String, radix: kotlin.Number = definedExternally): kotlin.Number

    @nativeInvoke
    operator fun invoke(value: Any = definedExternally): kotlin.Number
    val prototype: Number
    val MAX_VALUE: kotlin.Number
    val MIN_VALUE: kotlin.Number
    val NaN: kotlin.Number
    val NEGATIVE_INFINITY: kotlin.Number
    val POSITIVE_INFINITY: kotlin.Number
}

typealias TemplateStringsArray = Array<kotlin.String>

external interface DateConstructor {
    @nativeInvoke
    operator fun invoke(): kotlin.String
    val prototype: Date
    fun parse(s: kotlin.String): kotlin.Number
    fun UTC(
        year: kotlin.Number,
        month: kotlin.Number,
        date: kotlin.Number = definedExternally,
        hours: kotlin.Number = definedExternally,
        minutes: kotlin.Number = definedExternally,
        seconds: kotlin.Number = definedExternally,
        ms: kotlin.Number = definedExternally
    ): kotlin.Number

    fun now(): kotlin.Number
}

typealias RegExpMatchArray = Array<kotlin.String>

typealias RegExpExecArray = Array<kotlin.String>

external interface RegExpConstructor {
    @nativeGetter
    operator fun get(key: String): kotlin.String?

    @nativeSetter
    operator fun set(key: String, value: kotlin.String)

    @nativeInvoke
    operator fun invoke(pattern: RegExp, flags: kotlin.String = definedExternally): RegExp

    @nativeInvoke
    operator fun invoke(pattern: RegExp): RegExp

    @nativeInvoke
    operator fun invoke(pattern: kotlin.String, flags: kotlin.String = definedExternally): RegExp

    @nativeInvoke
    operator fun invoke(pattern: kotlin.String): RegExp
    val prototype: RegExp
    var lastMatch: kotlin.String
}

external interface ErrorConstructor {
    @nativeInvoke
    operator fun invoke(message: kotlin.String = definedExternally): Error
    val prototype: Error
}

external interface ConcatArray<T> {
    val length: kotlin.Number

    @nativeGetter
    operator fun get(n: kotlin.Number): T?

    @nativeSetter
    operator fun set(n: kotlin.Number, value: T)
    fun join(separator: kotlin.String = definedExternally): kotlin.String
    fun slice(start: kotlin.Number = definedExternally, end: kotlin.Number = definedExternally): Array<T>
}

external interface ArrayConstructor {
    fun <T> from(iterable: Iterable<T>): Array<T>
    fun <T> from(iterable: ArrayLike<T>): Array<T>
    fun <T, U> from(
        iterable: Iterable<T>,
        mapfn: (v: T, k: kotlin.Number) -> U,
        thisArg: Any = definedExternally
    ): Array<U>

    fun <T, U> from(iterable: Iterable<T>, mapfn: (v: T, k: kotlin.Number) -> U): Array<U>
    fun <T, U> from(
        iterable: ArrayLike<T>,
        mapfn: (v: T, k: kotlin.Number) -> U,
        thisArg: Any = definedExternally
    ): Array<U>

    fun <T, U> from(iterable: ArrayLike<T>, mapfn: (v: T, k: kotlin.Number) -> U): Array<U>
    fun <T> of(vararg items: T): Array<T>

    @nativeInvoke
    operator fun invoke(arrayLength: kotlin.Number = definedExternally): Array<Any>

    @nativeInvoke
    operator fun invoke(): Array<Any>

    @nativeInvoke
    operator fun <T> invoke(arrayLength: kotlin.Number): Array<T>

    @nativeInvoke
    operator fun <T> invoke(vararg items: T): Array<T>
    fun isArray(arg: Any): Boolean
    val prototype: Array<Any>
}

external interface PromiseLike<T> {
    fun then(
        onfulfilled: ((value: T) -> Any?)? = definedExternally,
        onrejected: ((reason: Any) -> Any?)? = definedExternally
    ): PromiseLike<dynamic /* TResult1 | TResult2 */>
}

external interface ArrayLike<T> {
    val length: kotlin.Number

    @nativeGetter
    operator fun get(n: kotlin.Number): T?

    @nativeSetter
    operator fun set(n: kotlin.Number, value: T)
}

typealias Readonly<T> = Any

typealias Record<K, T> = Any

external interface ThisType<T>

external interface ArrayBufferTypes {
    var ArrayBuffer: ArrayBuffer
}

external interface ArrayBufferConstructor {
    val prototype: ArrayBuffer
    fun isView(arg: Any): Boolean
}

external interface DataViewConstructor

external interface Int8ArrayConstructor {
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally,
        thisArg: Any = definedExternally
    ): Int8Array

    fun from(arrayLike: Iterable<kotlin.Number>): Int8Array
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally
    ): Int8Array

    val prototype: Int8Array
    val BYTES_PER_ELEMENT: kotlin.Number
    fun of(vararg items: kotlin.Number): Int8Array
    fun from(arrayLike: ArrayLike<kotlin.Number>): Int8Array
    fun <T> from(
        arrayLike: ArrayLike<T>,
        mapfn: (v: T, k: kotlin.Number) -> kotlin.Number,
        thisArg: Any = definedExternally
    ): Int8Array

    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: kotlin.Number) -> kotlin.Number): Int8Array
}

external interface Uint8ArrayConstructor {
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally,
        thisArg: Any = definedExternally
    ): Uint8Array

    fun from(arrayLike: Iterable<kotlin.Number>): Uint8Array
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally
    ): Uint8Array

    val prototype: Uint8Array
    val BYTES_PER_ELEMENT: kotlin.Number
    fun of(vararg items: kotlin.Number): Uint8Array
    fun from(arrayLike: ArrayLike<kotlin.Number>): Uint8Array
    fun <T> from(
        arrayLike: ArrayLike<T>,
        mapfn: (v: T, k: kotlin.Number) -> kotlin.Number,
        thisArg: Any = definedExternally
    ): Uint8Array

    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: kotlin.Number) -> kotlin.Number): Uint8Array
}

external interface Uint8ClampedArrayConstructor {
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally,
        thisArg: Any = definedExternally
    ): Uint8ClampedArray

    fun from(arrayLike: Iterable<kotlin.Number>): Uint8ClampedArray
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally
    ): Uint8ClampedArray

    val prototype: Uint8ClampedArray
    val BYTES_PER_ELEMENT: kotlin.Number
    fun of(vararg items: kotlin.Number): Uint8ClampedArray
    fun from(arrayLike: ArrayLike<kotlin.Number>): Uint8ClampedArray
    fun <T> from(
        arrayLike: ArrayLike<T>,
        mapfn: (v: T, k: kotlin.Number) -> kotlin.Number,
        thisArg: Any = definedExternally
    ): Uint8ClampedArray

    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: kotlin.Number) -> kotlin.Number): Uint8ClampedArray
}

external interface Int16ArrayConstructor {
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally,
        thisArg: Any = definedExternally
    ): Int16Array

    fun from(arrayLike: Iterable<kotlin.Number>): Int16Array
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally
    ): Int16Array

    val prototype: Int16Array
    val BYTES_PER_ELEMENT: kotlin.Number
    fun of(vararg items: kotlin.Number): Int16Array
    fun from(arrayLike: ArrayLike<kotlin.Number>): Int16Array
    fun <T> from(
        arrayLike: ArrayLike<T>,
        mapfn: (v: T, k: kotlin.Number) -> kotlin.Number,
        thisArg: Any = definedExternally
    ): Int16Array

    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: kotlin.Number) -> kotlin.Number): Int16Array
}

external interface Uint16ArrayConstructor {
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally,
        thisArg: Any = definedExternally
    ): Uint16Array

    fun from(arrayLike: Iterable<kotlin.Number>): Uint16Array
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally
    ): Uint16Array

    val prototype: Uint16Array
    val BYTES_PER_ELEMENT: kotlin.Number
    fun of(vararg items: kotlin.Number): Uint16Array
    fun from(arrayLike: ArrayLike<kotlin.Number>): Uint16Array
    fun <T> from(
        arrayLike: ArrayLike<T>,
        mapfn: (v: T, k: kotlin.Number) -> kotlin.Number,
        thisArg: Any = definedExternally
    ): Uint16Array

    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: kotlin.Number) -> kotlin.Number): Uint16Array
}

external interface Int32ArrayConstructor {
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally,
        thisArg: Any = definedExternally
    ): Int32Array

    fun from(arrayLike: Iterable<kotlin.Number>): Int32Array
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally
    ): Int32Array

    val prototype: Int32Array
    val BYTES_PER_ELEMENT: kotlin.Number
    fun of(vararg items: kotlin.Number): Int32Array
    fun from(arrayLike: ArrayLike<kotlin.Number>): Int32Array
    fun <T> from(
        arrayLike: ArrayLike<T>,
        mapfn: (v: T, k: kotlin.Number) -> kotlin.Number,
        thisArg: Any = definedExternally
    ): Int32Array

    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: kotlin.Number) -> kotlin.Number): Int32Array
}

external interface Uint32ArrayConstructor {
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally,
        thisArg: Any = definedExternally
    ): Uint32Array

    fun from(arrayLike: Iterable<kotlin.Number>): Uint32Array
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally
    ): Uint32Array

    val prototype: Uint32Array
    val BYTES_PER_ELEMENT: kotlin.Number
    fun of(vararg items: kotlin.Number): Uint32Array
    fun from(arrayLike: ArrayLike<kotlin.Number>): Uint32Array
    fun <T> from(
        arrayLike: ArrayLike<T>,
        mapfn: (v: T, k: kotlin.Number) -> kotlin.Number,
        thisArg: Any = definedExternally
    ): Uint32Array

    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: kotlin.Number) -> kotlin.Number): Uint32Array
}

external interface Float32ArrayConstructor {
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally,
        thisArg: Any = definedExternally
    ): Float32Array

    fun from(arrayLike: Iterable<kotlin.Number>): Float32Array
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally
    ): Float32Array

    val prototype: Float32Array
    val BYTES_PER_ELEMENT: kotlin.Number
    fun of(vararg items: kotlin.Number): Float32Array
    fun from(arrayLike: ArrayLike<kotlin.Number>): Float32Array
    fun <T> from(
        arrayLike: ArrayLike<T>,
        mapfn: (v: T, k: kotlin.Number) -> kotlin.Number,
        thisArg: Any = definedExternally
    ): Float32Array

    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: kotlin.Number) -> kotlin.Number): Float32Array
}

external interface Float64ArrayConstructor {
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally,
        thisArg: Any = definedExternally
    ): Float64Array

    fun from(arrayLike: Iterable<kotlin.Number>): Float64Array
    fun from(
        arrayLike: Iterable<kotlin.Number>,
        mapfn: (v: kotlin.Number, k: kotlin.Number) -> kotlin.Number = definedExternally
    ): Float64Array

    val prototype: Float64Array
    val BYTES_PER_ELEMENT: kotlin.Number
    fun of(vararg items: kotlin.Number): Float64Array
    fun from(arrayLike: ArrayLike<kotlin.Number>): Float64Array
    fun <T> from(
        arrayLike: ArrayLike<T>,
        mapfn: (v: T, k: kotlin.Number) -> kotlin.Number,
        thisArg: Any = definedExternally
    ): Float64Array

    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: kotlin.Number) -> kotlin.Number): Float64Array
}
