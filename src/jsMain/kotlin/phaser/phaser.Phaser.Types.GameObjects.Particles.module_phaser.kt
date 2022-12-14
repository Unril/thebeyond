@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.GameObjects.Particles

import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Particles.Particle
import Phaser.GameObjects.Particles.ParticleEmitter
import Phaser.Types.Math.Vector2Like

external interface DeathZoneSource {
    var contains: DeathZoneSourceCallback
}

typealias DeathZoneSourceCallback = (x: Number, y: Number) -> Unit

external interface EdgeZoneSource {
    var getPoints: EdgeZoneSourceCallback
}

typealias EdgeZoneSourceCallback = (quantity: Number, stepRate: Number) -> Unit

external interface EmitterOpCustomEmitConfig {
    var onEmit: EmitterOpOnEmitCallback
}

external interface EmitterOpCustomUpdateConfig {
    var onEmit: EmitterOpOnEmitCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onUpdate: EmitterOpOnUpdateCallback
}

external interface EmitterOpEaseConfig {
    var start: Number
    var end: Number
    var ease: dynamic /* String? | Function<*>? */
        get() = definedExternally
        set(value) = definedExternally
    var easeParams: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
}

typealias EmitterOpOnEmitCallback = (particle: Particle, key: String, value: Number) -> Unit

typealias EmitterOpOnUpdateCallback = (particle: Particle, key: String, t: Number, value: Number) -> Unit

external interface EmitterOpRandomConfig {
    var random: Array<Number>
}

external interface EmitterOpRandomMinMaxConfig {
    var min: Number
    var max: Number
}

external interface EmitterOpRandomStartEndConfig {
    var start: Number
    var end: Number
    var random: Boolean
}

external interface EmitterOpSteppedConfig {
    var start: Number
    var end: Number
    var steps: Number
}

external interface GravityWellConfig {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var power: Number?
        get() = definedExternally
        set(value) = definedExternally
    var epsilon: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gravity: Number?
        get() = definedExternally
        set(value) = definedExternally
}

typealias ParticleClassConstructor = (emitter: ParticleEmitter) -> Unit

typealias ParticleDeathCallback = (particle: Particle) -> Unit

external interface ParticleEmitterBounds {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface ParticleEmitterBoundsAlt {
    var x: Number
    var y: Number
    var w: Number
    var h: Number
}

typealias ParticleEmitterCallback = (particle: Particle, emitter: ParticleEmitter) -> Unit

external interface ParticleEmitterConfig {

    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var blendMode: dynamic /* Phaser.BlendModes? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var callbackScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var collideBottom: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var collideLeft: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var collideRight: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var collideTop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var deathCallback: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var deathCallbackScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var emitCallback: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var emitCallbackScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var follow: GameObject?
        get() = definedExternally
        set(value) = definedExternally
    var frequency: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gravityX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gravityY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxParticles: Number?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var on: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var particleBringToTop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var particleClass: ParticleClassConstructor?
        get() = definedExternally
        set(value) = definedExternally
    var radial: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var timeScale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var trackVisible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var accelerationX: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var accelerationY: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var alpha: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? | Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback? | Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var angle: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var bounce: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var delay: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var lifespan: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var maxVelocityX: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var maxVelocityY: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var moveToX: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var moveToY: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var quantity: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var rotate: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? | Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback? | Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? | Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback? | Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var scaleX: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? | Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback? | Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var scaleY: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? | Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback? | Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var speed: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var speedX: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var speedY: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var tint: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? | Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback? | Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var x: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* Number? | Array<Number>? | Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback? | Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig? | Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig? | Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig? | Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var emitZone: dynamic /* Phaser.Types.GameObjects.Particles.ParticleEmitterEdgeZoneConfig? | Phaser.Types.GameObjects.Particles.ParticleEmitterRandomZoneConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var deathZone: ParticleEmitterDeathZoneConfig?
        get() = definedExternally
        set(value) = definedExternally
    var bounds: dynamic /* Phaser.Types.GameObjects.Particles.ParticleEmitterBounds? | Phaser.Types.GameObjects.Particles.ParticleEmitterBoundsAlt? */
        get() = definedExternally
        set(value) = definedExternally
    var followOffset: Any?
        get() = definedExternally
        set(value) = definedExternally
    var frame: dynamic /* Number? | Array<Number>? | String? | Array<String>? | Phaser.Textures.Frame? | Array<Phaser.Textures.Frame>? | Phaser.Types.GameObjects.Particles.ParticleEmitterFrameConfig? */
        get() = definedExternally
        set(value) = definedExternally
    var reserve: Number?
        get() = definedExternally
        set(value) = definedExternally
}


inline operator fun ParticleEmitterConfig.get(key: String): Number? = asDynamic()[key]


inline operator fun ParticleEmitterConfig.set(key: String, value: Number?) {
    asDynamic()[key] = value
}

external interface ParticleEmitterDeathZoneConfig {
    var source: DeathZoneSource
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParticleEmitterEdgeZoneConfig {
    var source: EdgeZoneSource
    var type: String
    var quantity: Number
    var stepRate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var seamless: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParticleEmitterFrameConfig {
    var frames: dynamic /* Number? | Array<Number>? | String? | Array<String>? | Phaser.Textures.Frame? | Array<Phaser.Textures.Frame>? */
        get() = definedExternally
        set(value) = definedExternally
    var cycle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var quantity: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParticleEmitterManagerConfig {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var frame: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var emitters: dynamic /* Phaser.Types.GameObjects.Particles.ParticleEmitterConfig? | Array<Phaser.Types.GameObjects.Particles.ParticleEmitterConfig>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParticleEmitterRandomZoneConfig {
    var source: RandomZoneSource
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RandomZoneSource {
    var getRandomPoint: RandomZoneSourceCallback
}

typealias RandomZoneSourceCallback = (point: Vector2Like) -> Unit
