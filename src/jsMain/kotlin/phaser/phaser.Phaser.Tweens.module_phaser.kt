@file:JsQualifier("Phaser.Tweens")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Tweens

import Phaser.Events.EventEmitter
import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Types.Tweens.*

open external class Timeline(manager: TweenManager) : EventEmitter {
    open var manager: TweenManager
    open var isTimeline: Boolean
    open var data: Array<Any>
    open var totalData: Number
    open var useFrames: Boolean
    open var timeScale: Number
    open var loop: Number
    open var loopDelay: Number
    open var loopCounter: Number
    open var completeDelay: Number
    open var countdown: Number
    open var state: Number
    open var paused: Boolean
    open var elapsed: Number
    open var totalElapsed: Number
    open var duration: Number
    open var progress: Number
    open var totalDuration: Number
    open var totalProgress: Number
    open var callbacks: Any?
    open var callbackScope: Any
    open fun dispatchTimelineEvent(event: Event, callback: Function<*>)
    open fun setTimeScale(value: Number): Timeline /* this */
    open fun getTimeScale(): Number
    open fun isPlaying(): Boolean
    open fun add(config: TweenBuilderConfig?): Timeline /* this */
    open fun add(config: Any?): Timeline /* this */
    open fun queue(tween: Tween): Timeline /* this */
    open fun hasOffset(tween: Tween): Boolean
    open fun isOffsetAbsolute(value: Number): Boolean
    open fun isOffsetRelative(value: String): Boolean
    open fun getRelativeOffset(value: String, base: Number): Number
    open fun calcDuration()
    open fun init(): Boolean
    open fun resetTweens(resetFromLoop: Boolean)
    open fun setCallback(
        type: String,
        callback: Function<*>,
        params: Array<Any> = definedExternally,
        scope: Any? = definedExternally
    ): Timeline /* this */

    open fun makeActive(tween: Tween): TweenManager
    open fun play()
    open fun nextState()
    open fun update(timestamp: Number, delta: Number): Boolean
    open fun stop()
    open fun pause(): Timeline /* this */
    open fun resume(): Timeline /* this */
    open fun hasTarget(target: Any?): Boolean
    override fun destroy()
}

external var CREATED: Number

external var INIT: Number

external var DELAY: Number

external var OFFSET_DELAY: Number

external var PENDING_RENDER: Number

external var PLAYING_FORWARD: Number

external var PLAYING_BACKWARD: Number

external var HOLD_DELAY: Number

external var REPEAT_DELAY: Number

external var COMPLETE: Number

external var PENDING_ADD: Number

external var PAUSED: Number

external var LOOP_DELAY: Number

external var ACTIVE: Number

external var COMPLETE_DELAY: Number

external var PENDING_REMOVE: Number

external var REMOVED: Number

open external class Tween : EventEmitter {
    constructor(parent: TweenManager, data: Array<TweenDataConfig>, targets: Array<Any>)
    constructor(parent: Timeline, data: Array<TweenDataConfig>, targets: Array<Any>)

    open var parent: dynamic /* Phaser.Tweens.TweenManager | Phaser.Tweens.Timeline */
    open var parentIsTimeline: Boolean
    open var data: Array<TweenDataConfig>
    open var totalData: Number
    open var targets: Array<Any?>
    open var totalTargets: Number
    open var useFrames: Boolean
    open var timeScale: Number
    open var loop: Number
    open var loopDelay: Number
    open var loopCounter: Number
    open var startDelay: Number
    open val hasStarted: Boolean
    open val isSeeking: Boolean
    open var completeDelay: Number
    open var countdown: Number
    open var offset: Number
    open var calculatedOffset: Number
    open var state: Number
    open var paused: Boolean
    open var elapsed: Number
    open var totalElapsed: Number
    open var duration: Number
    open var progress: Number
    open var totalDuration: Number
    open var totalProgress: Number
    open var callbacks: Any?
    open var callbackScope: Any
    open fun getValue(index: Number = definedExternally): Number
    open fun setTimeScale(value: Number): Tween /* this */
    open fun getTimeScale(): Number
    open fun isPlaying(): Boolean
    open fun isPaused(): Boolean
    open fun hasTarget(target: Any?): Boolean
    open fun updateTo(key: String, value: Any, startToCurrent: Boolean = definedExternally): Tween /* this */
    open fun restart(): Tween /* this */
    open fun calcDuration()
    open fun init(): Boolean
    open fun makeActive()
    open fun nextState()
    open fun pause(): Tween /* this */
    open fun play(resetFromTimeline: Boolean = definedExternally): Tween /* this */
    open fun resetTweenData(resetFromLoop: Boolean)
    open fun resume(): Tween /* this */
    open fun seek(toPosition: Number, delta: Number = definedExternally): Tween /* this */
    open fun setCallback(
        type: String,
        callback: Function<*>,
        params: Array<Any> = definedExternally,
        scope: Any = definedExternally
    ): Tween /* this */

    open fun complete(delay: Number = definedExternally): Tween /* this */
    open fun remove(): Tween /* this */
    open fun stop(resetTo: Number = definedExternally): Tween /* this */
    open fun update(timestamp: Number, delta: Number): Boolean
    open fun dispatchTweenDataEvent(event: Event, callback: Function<*>, tweenData: TweenDataConfig)
    open fun dispatchTweenEvent(event: Event, callback: Function<*>)
    open fun setStateFromEnd(tween: Tween, tweenData: TweenDataConfig, diff: Number): Number
    open fun setStateFromStart(tween: Tween, tweenData: TweenDataConfig, diff: Number): Number
    open fun updateTweenData(tween: Tween, tweenData: TweenDataConfig, delta: Number): Boolean
}

external fun TweenData(
    target: Any,
    index: Number,
    key: String,
    getEnd: Function<*>,
    getStart: Function<*>,
    getActive: Function<*>,
    ease: Function<*>,
    delay: Number,
    duration: Number,
    yoyo: Boolean,
    hold: Number,
    repeat: Number,
    repeatDelay: Number,
    flipX: Boolean,
    flipY: Boolean
): TweenDataConfig

open external class TweenManager(scene: Scene) {
    open var scene: Scene
    open var systems: Systems
    open var timeScale: Number
    open fun createTimeline(config: TimelineBuilderConfig = definedExternally): Timeline
    open fun timeline(config: TimelineBuilderConfig = definedExternally): Timeline
    open fun create(config: TweenBuilderConfig?): Tween
    open fun create(config: Any?): Tween
    open fun add(config: TweenBuilderConfig?): Tween
    open fun add(config: Any?): Tween
    open fun existing(tween: Tween): TweenManager
    open fun addCounter(config: NumberTweenBuilderConfig): Tween
    open fun stagger(value: Number, config: StaggerConfig): Function<*>
    open fun stagger(value: Array<Number>, config: StaggerConfig): Function<*>
    open fun preUpdate()
    open fun update(timestamp: Number, delta: Number)
    open fun remove(tween: Tween): TweenManager
    open fun reset(tween: Tween): TweenManager
    open fun makeActive(tween: Tween): TweenManager
    open fun each(callback: Function<*>, scope: Any? = definedExternally, vararg args: Any)
    open fun getAllTweens(): Array<Tween>
    open fun getGlobalTimeScale(): Number
    open fun getTweensOf(target: Any?, includePending: Boolean = definedExternally): Array<Tween>
    open fun getTweensOf(target: Any?): Array<Tween>
    open fun getTweensOf(target: Array<Any>?, includePending: Boolean = definedExternally): Array<Tween>
    open fun getTweensOf(target: Array<Any>?): Array<Tween>
    open fun isTweening(target: Any?): Boolean
    open fun killAll(): TweenManager
    open fun killTweensOf(target: Any?): TweenManager
    open fun killTweensOf(target: Array<Any>?): TweenManager
    open fun pauseAll(): TweenManager
    open fun resumeAll(): TweenManager
    open fun setGlobalTimeScale(value: Number): TweenManager
    open fun shutdown()
    open fun destroy()
}
