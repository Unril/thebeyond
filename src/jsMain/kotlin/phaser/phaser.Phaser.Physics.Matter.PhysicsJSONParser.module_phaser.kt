@file:JsQualifier("Phaser.Physics.Matter.PhysicsJSONParser")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Physics.Matter.PhysicsJSONParser

import MatterJS.BodyType
import Phaser.Types.Physics.Matter.MatterBodyConfig

external fun parseBody(x: Number, y: Number, config: Any?, options: MatterBodyConfig = definedExternally): BodyType
