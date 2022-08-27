@file:JsQualifier("Phaser.Utils.Array")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Utils.Array

external fun Add(
    array: Array<Any>,
    item: Any,
    limit: Number = definedExternally,
    callback: Function<*> = definedExternally,
    context: Any? = definedExternally
): Array<Any>

external fun Add(array: Array<Any>, item: Any): Array<Any>

external fun Add(array: Array<Any>, item: Any, limit: Number = definedExternally): Array<Any>

external fun Add(
    array: Array<Any>,
    item: Any,
    limit: Number = definedExternally,
    callback: Function<*> = definedExternally
): Array<Any>

external fun Add(
    array: Array<Any>,
    item: Array<Any>,
    limit: Number = definedExternally,
    callback: Function<*> = definedExternally,
    context: Any? = definedExternally
): Array<Any>

external fun Add(array: Array<Any>, item: Array<Any>): Array<Any>

external fun Add(array: Array<Any>, item: Array<Any>, limit: Number = definedExternally): Array<Any>

external fun Add(
    array: Array<Any>,
    item: Array<Any>,
    limit: Number = definedExternally,
    callback: Function<*> = definedExternally
): Array<Any>

external fun AddAt(
    array: Array<Any>,
    item: Any,
    index: Number = definedExternally,
    limit: Number = definedExternally,
    callback: Function<*> = definedExternally,
    context: Any? = definedExternally
): Array<Any>

external fun AddAt(array: Array<Any>, item: Any): Array<Any>

external fun AddAt(array: Array<Any>, item: Any, index: Number = definedExternally): Array<Any>

external fun AddAt(
    array: Array<Any>,
    item: Any,
    index: Number = definedExternally,
    limit: Number = definedExternally
): Array<Any>

external fun AddAt(
    array: Array<Any>,
    item: Any,
    index: Number = definedExternally,
    limit: Number = definedExternally,
    callback: Function<*> = definedExternally
): Array<Any>

external fun AddAt(
    array: Array<Any>,
    item: Array<Any>,
    index: Number = definedExternally,
    limit: Number = definedExternally,
    callback: Function<*> = definedExternally,
    context: Any? = definedExternally
): Array<Any>

external fun AddAt(array: Array<Any>, item: Array<Any>): Array<Any>

external fun AddAt(array: Array<Any>, item: Array<Any>, index: Number = definedExternally): Array<Any>

external fun AddAt(
    array: Array<Any>,
    item: Array<Any>,
    index: Number = definedExternally,
    limit: Number = definedExternally
): Array<Any>

external fun AddAt(
    array: Array<Any>,
    item: Array<Any>,
    index: Number = definedExternally,
    limit: Number = definedExternally,
    callback: Function<*> = definedExternally
): Array<Any>

external fun BringToTop(array: Array<Any>, item: Any): Any

external fun CountAllMatching(
    array: Array<Any>,
    property: String,
    value: Any,
    startIndex: Number = definedExternally,
    endIndex: Number = definedExternally
): Number

external fun Each(array: Array<Any>, callback: Function<*>, context: Any?, vararg args: Any): Array<Any>

external fun EachInRange(
    array: Array<Any>,
    callback: Function<*>,
    context: Any?,
    startIndex: Number,
    endIndex: Number,
    vararg args: Any
): Array<Any>

external fun FindClosestInSorted(
    value: Number,
    array: Array<Any>,
    key: String = definedExternally
): dynamic /* Number | Any */

external fun GetAll(
    array: Array<Any>,
    property: String = definedExternally,
    value: Any = definedExternally,
    startIndex: Number = definedExternally,
    endIndex: Number = definedExternally
): Array<Any>

external fun GetFirst(
    array: Array<Any>,
    property: String = definedExternally,
    value: Any = definedExternally,
    startIndex: Number = definedExternally,
    endIndex: Number = definedExternally
): Any?

external fun GetRandom(
    array: Array<Any>,
    startIndex: Number = definedExternally,
    length: Number = definedExternally
): Any

external fun MoveAbove(array: Array<Any>, item1: Any, item2: Any): Array<Any>

external fun MoveBelow(array: Array<Any>, item1: Any, item2: Any): Array<Any>

external fun MoveDown(array: Array<Any>, item: Any): Array<Any>

external fun MoveTo(array: Array<Any>, item: Any, index: Number): Any

external fun MoveUp(array: Array<Any>, item: Any): Array<Any>

external fun NumberArray(
    start: Number,
    end: Number,
    prefix: String = definedExternally,
    suffix: String = definedExternally
): dynamic /* Array<Number> | Array<String> */

external fun NumberArrayStep(
    start: Number = definedExternally,
    end: Number = definedExternally,
    step: Number = definedExternally
): Array<Number>

external fun QuickSelect(
    arr: Array<Any>,
    k: Number,
    left: Number = definedExternally,
    right: Number = definedExternally,
    compare: Function<*> = definedExternally
)

external fun Range(a: Array<Any>, b: Array<Any>, options: Any? = definedExternally): Array<Any>

external fun Remove(
    array: Array<Any>,
    item: Any,
    callback: Function<*> = definedExternally,
    context: Any? = definedExternally
): dynamic /* Any | Array<Any> */

external fun Remove(array: Array<Any>, item: Any): dynamic /* Any | Array<Any> */

external fun Remove(
    array: Array<Any>,
    item: Any,
    callback: Function<*> = definedExternally
): dynamic /* Any | Array<Any> */

external fun Remove(
    array: Array<Any>,
    item: Array<Any>,
    callback: Function<*> = definedExternally,
    context: Any? = definedExternally
): dynamic /* Any | Array<Any> */

external fun Remove(array: Array<Any>, item: Array<Any>): dynamic /* Any | Array<Any> */

external fun Remove(
    array: Array<Any>,
    item: Array<Any>,
    callback: Function<*> = definedExternally
): dynamic /* Any | Array<Any> */

external fun RemoveAt(
    array: Array<Any>,
    index: Number,
    callback: Function<*> = definedExternally,
    context: Any? = definedExternally
): Any

external fun RemoveBetween(
    array: Array<Any>,
    startIndex: Number,
    endIndex: Number,
    callback: Function<*> = definedExternally,
    context: Any? = definedExternally
): Array<Any>

external fun RemoveRandomElement(
    array: Array<Any>,
    start: Number = definedExternally,
    length: Number = definedExternally
): Any?

external fun Replace(array: Array<Any>, oldChild: Any, newChild: Any): Boolean

external fun RotateLeft(array: Array<Any>, total: Number = definedExternally): Any

external fun RotateRight(array: Array<Any>, total: Number = definedExternally): Any

external fun SafeRange(
    array: Array<Any>,
    startIndex: Number,
    endIndex: Number,
    throwError: Boolean = definedExternally
): Boolean

external fun SendToBack(array: Array<Any>, item: Any): Any

external fun SetAll(
    array: Array<Any>,
    property: String,
    value: Any,
    startIndex: Number = definedExternally,
    endIndex: Number = definedExternally
): Array<Any>

external fun <T> Shuffle(array: Array<T>): Array<T>

external fun SortByDigits(array: Array<String>): Array<String>

external fun SpliceOne(array: Array<Any>, index: Number): Any

external fun StableSort(array: Array<Any>, compare: Function<*> = definedExternally): Array<Any>

external fun Swap(array: Array<Any>, item1: Any, item2: Any): Array<Any>
