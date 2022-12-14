@file:JsQualifier("Phaser.Tweens.Builders")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Tweens.Builders

import Phaser.Tweens.Timeline
import Phaser.Tweens.Tween
import Phaser.Tweens.TweenManager
import Phaser.Types.Tweens.*

external fun GetBoolean(source: Any?, key: String, defaultValue: Any): Any

external fun GetEaseFunction(ease: String, easeParams: Array<Number> = definedExternally): Function<*>

external fun GetEaseFunction(ease: String): Function<*>

external fun GetEaseFunction(ease: Function<*>, easeParams: Array<Number> = definedExternally): Function<*>

external fun GetEaseFunction(ease: Function<*>): Function<*>

external fun GetNewValue(source: Any, key: String, defaultValue: Any): Function<*>

external fun GetProps(config: TweenBuilderConfig): Array<String>

external fun GetTargets(config: Any?): Array<Any>

external fun GetTweens(config: TimelineBuilderConfig): Array<Tween>

external fun GetValueOp(key: String, propertyValue: Any): Function<*>

external fun NumberTweenBuilder(
    parent: TweenManager,
    config: NumberTweenBuilderConfig,
    defaults: TweenConfigDefaults
): Tween

external fun NumberTweenBuilder(
    parent: Timeline,
    config: NumberTweenBuilderConfig,
    defaults: TweenConfigDefaults
): Tween

external fun StaggerBuilder(value: Number, config: StaggerConfig = definedExternally): Function<*>

external fun StaggerBuilder(value: Number): Function<*>

external fun StaggerBuilder(value: Array<Number>, config: StaggerConfig = definedExternally): Function<*>

external fun StaggerBuilder(value: Array<Number>): Function<*>

external fun TimelineBuilder(manager: TweenManager, config: TimelineBuilderConfig): Timeline

external fun TweenBuilder(parent: TweenManager, config: TweenBuilderConfig?, defaults: TweenConfigDefaults): Tween

external fun TweenBuilder(parent: TweenManager, config: Any?, defaults: TweenConfigDefaults): Tween

external fun TweenBuilder(parent: Timeline, config: TweenBuilderConfig?, defaults: TweenConfigDefaults): Tween

external fun TweenBuilder(parent: Timeline, config: Any?, defaults: TweenConfigDefaults): Tween
