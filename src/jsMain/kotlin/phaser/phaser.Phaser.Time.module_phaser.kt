@file:JsQualifier("Phaser.Time")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Time

import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Types.Time.TimerEventConfig

open external class Clock(scene: Scene) {
    open var scene: Scene
    open var systems: Systems
    open var now: Number
    open var timeScale: Number
    open var paused: Boolean
    open fun addEvent(config: TimerEvent): TimerEvent
    open fun addEvent(config: TimerEventConfig): TimerEvent
    open fun delayedCall(
        delay: Number,
        callback: Function<*>,
        args: Array<Any> = definedExternally,
        callbackScope: Any = definedExternally
    ): TimerEvent

    open fun clearPendingEvents(): Clock /* this */
    open fun removeEvent(events: TimerEvent): Clock /* this */
    open fun removeEvent(events: Array<TimerEvent>): Clock /* this */
    open fun removeAllEvents(): Clock /* this */
    open fun preUpdate(time: Number, delta: Number)
    open fun update(time: Number, delta: Number)
}

open external class TimerEvent(config: TimerEventConfig) {
    open val delay: Number
    open val repeat: Number
    open var repeatCount: Number
    open val loop: Boolean
    open var callback: Function<*>
    open var callbackScope: Any?
    open var args: Array<Any>
    open var timeScale: Number
    open var startAt: Number
    open var elapsed: Number
    open var paused: Boolean
    open var hasDispatched: Boolean
    open fun reset(config: TimerEventConfig): TimerEvent
    open fun getProgress(): Number
    open fun getOverallProgress(): Number
    open fun getRepeatCount(): Number
    open fun getElapsed(): Number
    open fun getElapsedSeconds(): Number
    open fun getRemaining(): Number
    open fun getRemainingSeconds(): Number
    open fun getOverallRemaining(): Number
    open fun getOverallRemainingSeconds(): Number
    open fun remove(dispatchCallback: Boolean = definedExternally)
    open fun destroy()
}
