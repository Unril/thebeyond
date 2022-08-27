@file:JsQualifier("Phaser.GameObjects.Particles.Zones")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.GameObjects.Particles.Zones

import Phaser.GameObjects.Particles.Particle
import Phaser.Geom.Point
import Phaser.Types.GameObjects.Particles.DeathZoneSource
import Phaser.Types.GameObjects.Particles.EdgeZoneSource
import Phaser.Types.GameObjects.Particles.RandomZoneSource

open external class DeathZone(source: DeathZoneSource, killOnEnter: Boolean) {
    open var source: DeathZoneSource
    open var killOnEnter: Boolean
    open fun willKill(particle: Particle): Boolean
}

open external class EdgeZone(
    source: EdgeZoneSource,
    quantity: Number,
    stepRate: Number,
    yoyo: Boolean = definedExternally,
    seamless: Boolean = definedExternally
) {
    open var source: dynamic /* Phaser.Types.GameObjects.Particles.EdgeZoneSource | Phaser.Types.GameObjects.Particles.RandomZoneSource */
    open var points: Array<Point>
    open var quantity: Number
    open var stepRate: Number
    open var yoyo: Boolean
    open var counter: Number
    open var seamless: Boolean
    open fun updateSource(): EdgeZone /* this */
    open fun changeSource(source: EdgeZoneSource): EdgeZone /* this */
    open fun getPoint(particle: Particle)
}

open external class RandomZone(source: RandomZoneSource) {
    open var source: RandomZoneSource
    open fun getPoint(particle: Particle)
}
