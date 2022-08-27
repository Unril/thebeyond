@file:JsQualifier("Phaser.Physics.Matter.PhysicsEditorParser")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Physics.Matter.PhysicsEditorParser

import MatterJS.BodyType
import Phaser.Types.Physics.Matter.MatterBodyConfig

external fun parseBody(x: Number, y: Number, config: Any?, options: MatterBodyConfig = definedExternally): BodyType

external fun parseFixture(fixtureConfig: Any?): Array<BodyType>

external fun parseVertices(vertexSets: Array<Any>, options: MatterBodyConfig = definedExternally): Array<BodyType>
