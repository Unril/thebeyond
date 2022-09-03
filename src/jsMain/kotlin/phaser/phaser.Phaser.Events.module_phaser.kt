@file:JsQualifier("Phaser.Events")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Events

/**
 * EventEmitter is a Scene Systems plugin compatible version of eventemitter3.
 */
open external class EventEmitter {
    /**
     * Removes all listeners.
     */
    open fun shutdown()

    /**
     * Removes all listeners.
     */
    open fun destroy()

    /**
     * Return an array listing the events for which the emitter has registered listeners.
     */
    open fun eventNames(): Array<String>

    /**
     * Return the listeners registered for a given event.
     * @param event The event name.
     */
    open fun listeners(event: String): Array<Function<*>>

    /**
     * Return the number of listeners listening to a given event.
     * @param event The event name.
     */
    open fun listenerCount(event: String): Number

    /**
     * Calls each of the listeners registered for a given event.
     * @param event The event name.
     * @param args Additional arguments that will be passed to the event handler.
     */
    open fun emit(event: String, vararg args: Any): Boolean

    /**
     * Add a listener for a given event.
     * @param event The event name.
     * @param fn The listener function.
     * @param context The context to invoke the listener with. Default this.
     */
    open fun on(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */

    /**
     * Add a listener for a given event.
     * @param event The event name.
     * @param fn The listener function.
     * @param context The context to invoke the listener with. Default this.
     */
    open fun addListener(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */

    /**
     * Add a one-time listener for a given event.
     * @param event The event name.
     * @param fn The listener function.
     * @param context The context to invoke the listener with. Default this.
     */
    open fun once(event: String, fn: Function<*>, context: Any = definedExternally): EventEmitter /* this */

    /**
     * Remove the listeners of a given event.
     * @param event The event name.
     * @param fn Only remove the listeners that match this function.
     * @param context Only remove the listeners that have this context.
     * @param once Only remove one-time listeners.
     */
    open fun removeListener(
        event: String,
        fn: Function<*>? = definedExternally,
        context: Any? = definedExternally,
        once: Boolean? = definedExternally
    ): EventEmitter /* this */

    /**
     * Remove the listeners of a given event.
     * @param event The event name.
     * @param fn Only remove the listeners that match this function.
     * @param context Only remove the listeners that have this context.
     * @param once Only remove one-time listeners.
     */
    open fun off(
        event: String,
        fn: Function<*>? = definedExternally,
        context: Any? = definedExternally,
        once: Boolean? = definedExternally
    ): EventEmitter /* this */

    /**
     * Remove all listeners, or those of the specified event.
     * @param event The event name.
     */
    open fun removeAllListeners(event: String = definedExternally): EventEmitter /* this */
}
