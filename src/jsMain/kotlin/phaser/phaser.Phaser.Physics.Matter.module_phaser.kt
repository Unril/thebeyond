@file:JsQualifier("Phaser.Physics.Matter")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Physics.Matter

import MatterJS.*
import Phaser.BlendModes
import Phaser.Cameras.Scene2D.Camera
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.Events.EventEmitter
import Phaser.GameObjects.Components.*
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Shape
import Phaser.Geom.Rectangle
import Phaser.Input.Pointer
import Phaser.Math.Vector2
import Phaser.Physics.Matter.Components.*
import Phaser.Physics.Matter.Components.Collision
import Phaser.Physics.Matter.Components.Gravity
import Phaser.Physics.Matter.Components.Transform
import Phaser.Renderer.WebGL.Pipelines.PostFXPipeline
import Phaser.Renderer.WebGL.Pipelines.SpriteFXPipeline
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Scene
import Phaser.Scenes.Systems
import Phaser.Textures.Frame
import Phaser.Textures.Texture
import Phaser.Tilemaps.Tile
import Phaser.Tilemaps.TilemapLayer
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Math.Vector3Like
import Phaser.Types.Math.Vector4Like
import Phaser.Types.Physics.Arcade.ArcadePhysicsCallback
import Phaser.Types.Physics.Matter.*
import MatterJS.Collision as _MatterJS_Collision
import Phaser.GameObjects.Components.Texture as _Phaser_GameObjects_Components_Texture
import Phaser.GameObjects.Components.Transform as _Phaser_GameObjects_Components_Transform

open external class BodyBounds {
    open var boundsCenter: Vector2
    open var centerDiff: Vector2
    open fun parseBody(body: BodyType): Boolean
    open fun parseBody(body: GameObject): Boolean
    open fun parseBody(body: Image): Boolean
    open fun parseBody(body: Sprite): Boolean
    open fun parseBody(body: TileBody): Boolean
    open fun getTopLeft(
        body: BodyType,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopLeft(body: BodyType): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopLeft(body: BodyType, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopLeft(
        body: GameObject,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopLeft(body: GameObject): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopLeft(body: GameObject, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopLeft(
        body: Image,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopLeft(body: Image): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopLeft(body: Image, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopLeft(
        body: Sprite,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopLeft(body: Sprite): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopLeft(body: Sprite, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopLeft(
        body: TileBody,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopLeft(body: TileBody): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopLeft(body: TileBody, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopCenter(
        body: BodyType,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopCenter(body: BodyType): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopCenter(body: BodyType, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopCenter(
        body: GameObject,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopCenter(body: GameObject): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopCenter(body: GameObject, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopCenter(
        body: Image,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopCenter(body: Image): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopCenter(body: Image, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopCenter(
        body: Sprite,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopCenter(body: Sprite): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopCenter(body: Sprite, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopCenter(
        body: TileBody,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopCenter(body: TileBody): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopCenter(body: TileBody, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopRight(
        body: BodyType,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopRight(body: BodyType): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopRight(body: BodyType, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopRight(
        body: GameObject,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopRight(body: GameObject): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopRight(body: GameObject, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopRight(
        body: Image,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopRight(body: Image): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopRight(body: Image, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopRight(
        body: Sprite,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopRight(body: Sprite): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopRight(body: Sprite, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopRight(
        body: TileBody,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getTopRight(body: TileBody): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getTopRight(body: TileBody, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getLeftCenter(
        body: BodyType,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getLeftCenter(body: BodyType): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getLeftCenter(body: BodyType, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getLeftCenter(
        body: GameObject,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getLeftCenter(body: GameObject): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getLeftCenter(body: GameObject, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getLeftCenter(
        body: Image,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getLeftCenter(body: Image): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getLeftCenter(body: Image, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getLeftCenter(
        body: Sprite,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getLeftCenter(body: Sprite): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getLeftCenter(body: Sprite, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getLeftCenter(
        body: TileBody,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getLeftCenter(body: TileBody): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getLeftCenter(body: TileBody, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getCenter(
        body: BodyType,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getCenter(body: BodyType): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getCenter(body: BodyType, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getCenter(
        body: GameObject,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getCenter(body: GameObject): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getCenter(body: GameObject, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getCenter(
        body: Image,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getCenter(body: Image): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getCenter(body: Image, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getCenter(
        body: Sprite,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getCenter(body: Sprite): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getCenter(body: Sprite, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getCenter(
        body: TileBody,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getCenter(body: TileBody): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getCenter(body: TileBody, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getRightCenter(
        body: BodyType,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getRightCenter(body: BodyType): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getRightCenter(body: BodyType, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getRightCenter(
        body: GameObject,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getRightCenter(body: GameObject): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getRightCenter(
        body: GameObject,
        x: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getRightCenter(
        body: Image,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getRightCenter(body: Image): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getRightCenter(body: Image, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getRightCenter(
        body: Sprite,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getRightCenter(body: Sprite): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getRightCenter(body: Sprite, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getRightCenter(
        body: TileBody,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getRightCenter(body: TileBody): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getRightCenter(body: TileBody, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomLeft(
        body: BodyType,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomLeft(body: BodyType): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomLeft(body: BodyType, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomLeft(
        body: GameObject,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomLeft(body: GameObject): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomLeft(body: GameObject, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomLeft(
        body: Image,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomLeft(body: Image): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomLeft(body: Image, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomLeft(
        body: Sprite,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomLeft(body: Sprite): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomLeft(body: Sprite, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomLeft(
        body: TileBody,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomLeft(body: TileBody): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomLeft(body: TileBody, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomCenter(
        body: BodyType,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomCenter(body: BodyType): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomCenter(body: BodyType, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomCenter(
        body: GameObject,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomCenter(body: GameObject): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomCenter(
        body: GameObject,
        x: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomCenter(
        body: Image,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomCenter(body: Image): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomCenter(body: Image, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomCenter(
        body: Sprite,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomCenter(body: Sprite): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomCenter(body: Sprite, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomCenter(
        body: TileBody,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomCenter(body: TileBody): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomCenter(body: TileBody, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomRight(
        body: BodyType,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomRight(body: BodyType): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomRight(body: BodyType, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomRight(
        body: GameObject,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomRight(body: GameObject): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomRight(
        body: GameObject,
        x: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomRight(
        body: Image,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomRight(body: Image): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomRight(body: Image, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomRight(
        body: Sprite,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomRight(body: Sprite): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomRight(body: Sprite, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomRight(
        body: TileBody,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): dynamic /* Phaser.Math.Vector2 | Boolean */

    open fun getBottomRight(body: TileBody): dynamic /* Phaser.Math.Vector2 | Boolean */
    open fun getBottomRight(body: TileBody, x: Number = definedExternally): dynamic /* Phaser.Math.Vector2 | Boolean */
}

open external class Factory(world: World) {
    open var world: World
    open var scene: Scene
    open var sys: Systems
    open fun rectangle(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        options: MatterBodyConfig = definedExternally
    ): BodyType

    open fun trapezoid(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        slope: Number,
        options: MatterBodyConfig = definedExternally
    ): BodyType

    open fun circle(
        x: Number,
        y: Number,
        radius: Number,
        options: MatterBodyConfig = definedExternally,
        maxSides: Number = definedExternally
    ): BodyType

    open fun polygon(
        x: Number,
        y: Number,
        sides: Number,
        radius: Number,
        options: MatterBodyConfig = definedExternally
    ): BodyType

    open fun fromVertices(
        x: Number,
        y: Number,
        vertexSets: String,
        options: MatterBodyConfig = definedExternally,
        flagInternal: Boolean = definedExternally,
        removeCollinear: Number = definedExternally,
        minimumArea: Number = definedExternally
    ): BodyType

    open fun fromVertices(x: Number, y: Number, vertexSets: String): BodyType
    open fun fromVertices(
        x: Number,
        y: Number,
        vertexSets: String,
        options: MatterBodyConfig = definedExternally
    ): BodyType

    open fun fromVertices(
        x: Number,
        y: Number,
        vertexSets: String,
        options: MatterBodyConfig = definedExternally,
        flagInternal: Boolean = definedExternally
    ): BodyType

    open fun fromVertices(
        x: Number,
        y: Number,
        vertexSets: String,
        options: MatterBodyConfig = definedExternally,
        flagInternal: Boolean = definedExternally,
        removeCollinear: Number = definedExternally
    ): BodyType

    open fun fromVertices(
        x: Number,
        y: Number,
        vertexSets: Array<Any>,
        options: MatterBodyConfig = definedExternally,
        flagInternal: Boolean = definedExternally,
        removeCollinear: Number = definedExternally,
        minimumArea: Number = definedExternally
    ): BodyType

    open fun fromVertices(x: Number, y: Number, vertexSets: Array<Any>): BodyType
    open fun fromVertices(
        x: Number,
        y: Number,
        vertexSets: Array<Any>,
        options: MatterBodyConfig = definedExternally
    ): BodyType

    open fun fromVertices(
        x: Number,
        y: Number,
        vertexSets: Array<Any>,
        options: MatterBodyConfig = definedExternally,
        flagInternal: Boolean = definedExternally
    ): BodyType

    open fun fromVertices(
        x: Number,
        y: Number,
        vertexSets: Array<Any>,
        options: MatterBodyConfig = definedExternally,
        flagInternal: Boolean = definedExternally,
        removeCollinear: Number = definedExternally
    ): BodyType

    open fun fromPhysicsEditor(
        x: Number,
        y: Number,
        config: Any,
        options: MatterBodyConfig = definedExternally,
        addToWorld: Boolean = definedExternally
    ): BodyType

    open fun fromSVG(
        x: Number,
        y: Number,
        xml: Any?,
        scale: Number = definedExternally,
        options: MatterBodyConfig = definedExternally,
        addToWorld: Boolean = definedExternally
    ): BodyType

    open fun fromJSON(
        x: Number,
        y: Number,
        config: Any,
        options: MatterBodyConfig = definedExternally,
        addToWorld: Boolean = definedExternally
    ): BodyType

    open fun imageStack(
        key: String,
        frame: String,
        x: Number,
        y: Number,
        columns: Number,
        rows: Number,
        columnGap: Number = definedExternally,
        rowGap: Number = definedExternally,
        options: MatterBodyConfig = definedExternally
    ): CompositeType

    open fun imageStack(key: String, frame: String, x: Number, y: Number, columns: Number, rows: Number): CompositeType
    open fun imageStack(
        key: String,
        frame: String,
        x: Number,
        y: Number,
        columns: Number,
        rows: Number,
        columnGap: Number = definedExternally
    ): CompositeType

    open fun imageStack(
        key: String,
        frame: String,
        x: Number,
        y: Number,
        columns: Number,
        rows: Number,
        columnGap: Number = definedExternally,
        rowGap: Number = definedExternally
    ): CompositeType

    open fun imageStack(
        key: String,
        frame: Number,
        x: Number,
        y: Number,
        columns: Number,
        rows: Number,
        columnGap: Number = definedExternally,
        rowGap: Number = definedExternally,
        options: MatterBodyConfig = definedExternally
    ): CompositeType

    open fun imageStack(key: String, frame: Number, x: Number, y: Number, columns: Number, rows: Number): CompositeType
    open fun imageStack(
        key: String,
        frame: Number,
        x: Number,
        y: Number,
        columns: Number,
        rows: Number,
        columnGap: Number = definedExternally
    ): CompositeType

    open fun imageStack(
        key: String,
        frame: Number,
        x: Number,
        y: Number,
        columns: Number,
        rows: Number,
        columnGap: Number = definedExternally,
        rowGap: Number = definedExternally
    ): CompositeType

    open fun stack(
        x: Number,
        y: Number,
        columns: Number,
        rows: Number,
        columnGap: Number,
        rowGap: Number,
        callback: Function<*>
    ): CompositeType

    open fun pyramid(
        x: Number,
        y: Number,
        columns: Number,
        rows: Number,
        columnGap: Number,
        rowGap: Number,
        callback: Function<*>
    ): CompositeType

    open fun chain(
        composite: CompositeType,
        xOffsetA: Number,
        yOffsetA: Number,
        xOffsetB: Number,
        yOffsetB: Number,
        options: MatterConstraintConfig = definedExternally
    ): CompositeType

    open fun mesh(
        composite: CompositeType,
        columns: Number,
        rows: Number,
        crossBrace: Boolean,
        options: MatterConstraintConfig = definedExternally
    ): CompositeType

    open fun newtonsCradle(x: Number, y: Number, number: Number, size: Number, length: Number): CompositeType
    open fun car(x: Number, y: Number, width: Number, height: Number, wheelSize: Number): CompositeType
    open fun softBody(
        x: Number,
        y: Number,
        columns: Number,
        rows: Number,
        columnGap: Number,
        rowGap: Number,
        crossBrace: Boolean,
        particleRadius: Number,
        particleOptions: MatterBodyConfig = definedExternally,
        constraintOptions: MatterConstraintConfig = definedExternally
    ): CompositeType

    open fun joint(
        bodyA: BodyType,
        bodyB: BodyType,
        length: Number = definedExternally,
        stiffness: Number = definedExternally,
        options: MatterConstraintConfig = definedExternally
    ): ConstraintType

    open fun spring(
        bodyA: BodyType,
        bodyB: BodyType,
        length: Number = definedExternally,
        stiffness: Number = definedExternally,
        options: MatterConstraintConfig = definedExternally
    ): ConstraintType

    open fun constraint(
        bodyA: BodyType,
        bodyB: BodyType,
        length: Number = definedExternally,
        stiffness: Number = definedExternally,
        options: MatterConstraintConfig = definedExternally
    ): ConstraintType

    open fun worldConstraint(
        body: BodyType,
        length: Number = definedExternally,
        stiffness: Number = definedExternally,
        options: MatterConstraintConfig = definedExternally
    ): ConstraintType

    open fun mouseSpring(options: MatterConstraintConfig = definedExternally): ConstraintType
    open fun pointerConstraint(options: MatterConstraintConfig = definedExternally): ConstraintType

    /**
     * Creates a Matter Physics Image Game Object.
     *
     * An Image is a light-weight Game Object useful for the display of static images in your game,
     * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
     * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
     * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
     * @param x The horizontal position of this Game Object in the world.
     * @param y The vertical position of this Game Object in the world.
     * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
     * @param frame An optional frame from the Texture this Game Object is rendering with. Set to `null` to skip this value.
     * string | number
     * @param options An optional Body configuration object that is used to set initial Body properties on creation.
     */
    open fun image(
        x: Number,
        y: Number,
        key: String,
        frame: dynamic = definedExternally,
        options: MatterBodyConfig = definedExternally
    ): Image

    open fun tileBody(tile: Tile, options: MatterTileOptions = definedExternally): TileBody
    open fun sprite(
        x: Number,
        y: Number,
        key: String,
        frame: String = definedExternally,
        options: MatterBodyConfig = definedExternally
    ): Sprite

    open fun sprite(x: Number, y: Number, key: String): Sprite
    open fun sprite(x: Number, y: Number, key: String, frame: String = definedExternally): Sprite
    open fun sprite(
        x: Number,
        y: Number,
        key: String,
        frame: Number = definedExternally,
        options: MatterBodyConfig = definedExternally
    ): Sprite

    open fun sprite(x: Number, y: Number, key: String, frame: Number = definedExternally): Sprite

    /**
     * Takes an existing Game Object and injects all of the Matter Components into it.
     *
     * This enables you to use component methods such as `setVelocity` or `isSensor` directly from
     * this Game Object.
     *
     * You can also pass in either a Matter Body Configuration object, or a Matter Body instance
     * to link with this Game Object.
     * @param gameObject The Game Object to inject the Matter Components in to.
     * @param options A Matter Body configuration object, or an instance of a Matter Body.
     * @param addToWorld Add this Matter Body to the World? Default true.
     */
    open fun gameObject(
        gameObject: GameObject,
        options: MatterBodyConfig = definedExternally,
        addToWorld: Boolean = definedExternally
    ): dynamic /* Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.GameObjects.GameObject */

    open fun gameObject(
        gameObject: GameObject,
        options: MatterJS.Body = definedExternally,
        addToWorld: Boolean = definedExternally
    ): dynamic /* Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.GameObjects.GameObject */

    open fun destroy()
}

external fun MatterGameObject(
    world: World,
    gameObject: GameObject,
    options: MatterBodyConfig = definedExternally,
    addToWorld: Boolean = definedExternally
): GameObject

external fun MatterGameObject(world: World, gameObject: GameObject): GameObject

external fun MatterGameObject(
    world: World,
    gameObject: GameObject,
    options: MatterBodyConfig = definedExternally
): GameObject

external fun MatterGameObject(
    world: World,
    gameObject: GameObject,
    options: Body = definedExternally,
    addToWorld: Boolean = definedExternally
): GameObject

external fun MatterGameObject(world: World, gameObject: GameObject, options: Body = definedExternally): GameObject

open external class Image : Phaser.GameObjects.Image, Bounce, Collision, Force, Friction, Gravity, Mass, Sensor,
    SetBody, Sleep, Static, Transform, Velocity, Alpha, BlendMode, Depth, Flip, GetBounds, Origin, Pipeline,
    ScrollFactor, Size, _Phaser_GameObjects_Components_Texture, Tint, _Phaser_GameObjects_Components_Transform,
    Visible {
    constructor(
        world: World,
        x: Number,
        y: Number,
        texture: String,
        frame: String = definedExternally,
        options: MatterBodyConfig = definedExternally
    )

    constructor(world: World, x: Number, y: Number, texture: String)
    constructor(world: World, x: Number, y: Number, texture: String, frame: String = definedExternally)
    constructor(
        world: World,
        x: Number,
        y: Number,
        texture: String,
        frame: Number = definedExternally,
        options: MatterBodyConfig = definedExternally
    )

    constructor(world: World, x: Number, y: Number, texture: String, frame: Number = definedExternally)
    constructor(
        world: World,
        x: Number,
        y: Number,
        texture: Texture,
        frame: String = definedExternally,
        options: MatterBodyConfig = definedExternally
    )

    constructor(world: World, x: Number, y: Number, texture: Texture)
    constructor(world: World, x: Number, y: Number, texture: Texture, frame: String = definedExternally)
    constructor(
        world: World,
        x: Number,
        y: Number,
        texture: Texture,
        frame: Number = definedExternally,
        options: MatterBodyConfig = definedExternally
    )

    constructor(world: World, x: Number, y: Number, texture: Texture, frame: Number = definedExternally)

    open var world: World
    override fun clearAlpha(): Image /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Image /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Image | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Image | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Image /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Image /* this */
    override fun toggleFlipY(): Image /* this */
    override fun setFlipX(value: Boolean): Image /* this */
    override fun setFlipY(value: Boolean): Image /* this */
    override fun setFlip(x: Boolean, y: Boolean): Image /* this */
    override fun resetFlip(): Image /* this */
    override var fxPadding: Number
    override fun setFXPadding(padding: Number): Image /* this */
    override fun onFXCopy(pipeline: SpriteFXPipeline)
    override fun onFX(pipeline: SpriteFXPipeline)
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Image /* this */
    override fun setMask(mask: GeometryMask): Image /* this */
    override fun clearMask(destroyMask: Boolean): Image /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Image /* this */
    override fun setOriginFromFrame(): Image /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Image /* this */
    override fun updateDisplayOrigin(): Image /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Image | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Image | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Image | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Image | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Image | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Image | Pipeline */
    override fun setPipelineData(key: String, value: Any): Image /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Image | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Image | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Image /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Image /* this */
    override fun setSize(width: Number, height: Number): Image /* this */
    override fun setDisplaySize(width: Number, height: Number): Image /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): Image /* this */
    override fun setCrop(): Image /* this */
    override fun setCrop(x: Number): Image /* this */
    override fun setCrop(x: Number, y: Number): Image /* this */
    override fun setCrop(x: Number, y: Number, width: Number): Image /* this */
    override fun setCrop(x: Rectangle, y: Number, width: Number, height: Number): Image /* this */
    override fun setCrop(x: Rectangle): Image /* this */
    override fun setCrop(x: Rectangle, y: Number): Image /* this */
    override fun setCrop(x: Rectangle, y: Number, width: Number): Image /* this */
    override fun setTexture(key: String, frame: String): dynamic /* Image | Texture */
    override fun setTexture(key: String): dynamic /* Texture */
    override fun setTexture(key: String, frame: Number): dynamic /* Image | Texture */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Image | Texture */
    override fun setFrame(frame: String): dynamic /* Image | Texture */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Image | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Image | Texture */
    override fun setFrame(frame: Number): dynamic /* Image | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Image | Texture */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): Image /* this */
    override fun setTint(
        topLeft: Number?,
        topRight: Number?,
        bottomLeft: Number?,
        bottomRight: Number?
    ): Image /* this */

    override fun setTintFill(
        topLeft: Number?,
        topRight: Number?,
        bottomLeft: Number?,
        bottomRight: Number?
    ): Image /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Image /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Image | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Image | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Image | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Image /* this */
    override fun setRotation(radians: Number): Image /* this */
    override fun setAngle(degrees: Number): Image /* this */
    override fun setScale(x: Number, y: Number): Image /* this */
    override fun setX(value: Number): Image /* this */
    override fun setY(value: Number): Image /* this */
    override fun setZ(value: Number): Image /* this */
    override fun setW(value: Number): Image /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Image /* this */
    override fun setBounce(value: Number): GameObject
    override fun setCollisionCategory(value: Number): GameObject
    override fun setCollisionGroup(value: Number): GameObject
    override fun setCollidesWith(categories: Number): GameObject
    override fun setCollidesWith(categories: Array<Number>): GameObject
    override fun setOnCollide(callback: Function<*>): GameObject
    override fun setOnCollideEnd(callback: Function<*>): GameObject
    override fun setOnCollideActive(callback: Function<*>): GameObject
    override fun setOnCollideWith(body: Body, callback: Function<*>): GameObject
    override fun setOnCollideWith(body: Array<Body>, callback: Function<*>): GameObject
    override fun applyForce(force: Vector2): GameObject
    override fun applyForceFrom(position: Vector2, force: Vector2): GameObject
    override fun thrust(speed: Number): GameObject
    override fun thrustLeft(speed: Number): GameObject
    override fun thrustRight(speed: Number): GameObject
    override fun thrustBack(speed: Number): GameObject
    override fun setFriction(value: Number, air: Number, fstatic: Number): GameObject
    override fun setFrictionAir(value: Number): GameObject
    override fun setFrictionStatic(value: Number): GameObject
    override fun setIgnoreGravity(value: Boolean): GameObject
    override fun setMass(value: Number): GameObject
    override fun setDensity(value: Number): GameObject
    override val centerOfMass: Vector2
    override fun setSensor(value: Boolean): GameObject
    override fun isSensor(): Boolean
    override fun setRectangle(width: Number, height: Number, options: MatterBodyConfig): GameObject
    override fun setCircle(radius: Number, options: MatterBodyConfig): GameObject
    override fun setPolygon(radius: Number, sides: Number, options: MatterBodyConfig): GameObject
    override fun setTrapezoid(width: Number, height: Number, slope: Number, options: MatterBodyConfig): GameObject
    override fun setExistingBody(body: BodyType, addToWorld: Boolean): GameObject
    override fun setBody(config: String, options: MatterBodyConfig): GameObject
    override fun setBody(config: String): GameObject
    override fun setBody(config: MatterSetBodyConfig, options: MatterBodyConfig): GameObject
    override fun setBody(config: MatterSetBodyConfig): GameObject
    override fun setToSleep(): Image /* this */
    override fun setAwake(): Image /* this */
    override fun setSleepThreshold(value: Number): Image /* this */
    override fun setSleepEvents(start: Boolean, end: Boolean): Image /* this */
    override fun setSleepStartEvent(value: Boolean): Image /* this */
    override fun setSleepEndEvent(value: Boolean): Image /* this */
    override fun setStatic(value: Boolean): GameObject
    override fun isStatic(): Boolean
    override fun setFixedRotation(): Image /* this */
    override fun setAngularVelocity(value: Number): GameObject
    override fun setVelocityX(x: Number): GameObject
    override fun setVelocityY(y: Number): GameObject
    override fun setVelocity(x: Number, y: Number): GameObject
    override fun setTexture(key: Texture, frame: String): _Phaser_GameObjects_Components_Texture /* this */
    override fun setTexture(key: Texture): _Phaser_GameObjects_Components_Texture /* this */
    override fun setTexture(key: Texture, frame: Number): _Phaser_GameObjects_Components_Texture /* this */

    override fun setPosition(x: Number, y: Number): Transform
    override fun setScale(x: Number, y: Number, point: Vector2): Transform
}

open external class MatterPhysics(scene: Scene) {
    open var scene: Scene
    open var systems: Systems
    open var config: MatterWorldConfig
    open var world: World
    open var add: Factory
    open var bodyBounds: BodyBounds
    open var body: BodyFactory
    open var composite: CompositeFactory
    open var collision: _MatterJS_Collision
    open var detector: DetectorFactory
    open var pair: PairFactory
    open var pairs: PairsFactory
    open var query: QueryFactory
    open var resolver: ResolverFactory
    open var constraint: ConstraintFactory
    open var bodies: BodiesFactory
    open var composites: CompositesFactory
    open var axes: AxesFactory
    open var bounds: BoundsFactory
    open var svg: SvgFactory
    open var vector: VectorFactory
    open var vertices: VerticesFactory
    open var verts: VerticesFactory
    open fun getConfig(): MatterWorldConfig
    open fun enableAttractorPlugin(): MatterPhysics /* this */
    open fun enableWrapPlugin(): MatterPhysics /* this */
    open fun enableCollisionEventsPlugin(): MatterPhysics /* this */
    open fun pause(): World
    open fun resume(): World
    open fun set60Hz(): MatterPhysics /* this */
    open fun set30Hz(): MatterPhysics /* this */
    open fun step(delta: Number = definedExternally, correction: Number = definedExternally)
    open fun containsPoint(body: BodyType, x: Number, y: Number): Boolean
    open fun containsPoint(body: GameObject, x: Number, y: Number): Boolean
    open fun containsPoint(body: Image, x: Number, y: Number): Boolean
    open fun containsPoint(body: Sprite, x: Number, y: Number): Boolean
    open fun containsPoint(body: TileBody, x: Number, y: Number): Boolean
    open fun containsPoint(
        body: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        x: Number,
        y: Number
    ): Boolean

    open fun intersectPoint(
        x: Number,
        y: Number,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>

    open fun intersectRect(
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        outside: Boolean = definedExternally,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>

    open fun intersectRay(
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        rayWidth: Number = definedExternally,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>

    open fun intersectBody(
        body: BodyType,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>

    open fun intersectBody(body: BodyType): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>
    open fun intersectBody(
        body: GameObject,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>

    open fun intersectBody(body: GameObject): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>
    open fun intersectBody(
        body: Image,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>

    open fun intersectBody(body: Image): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>
    open fun intersectBody(
        body: Sprite,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>

    open fun intersectBody(body: Sprite): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>
    open fun intersectBody(
        body: TileBody,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>

    open fun intersectBody(body: TileBody): Array<dynamic /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>
    open fun overlap(
        target: BodyType,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(target: BodyType): Boolean
    open fun overlap(
        target: BodyType,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Boolean

    open fun overlap(
        target: BodyType,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: BodyType,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: GameObject,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(target: GameObject): Boolean
    open fun overlap(
        target: GameObject,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Boolean

    open fun overlap(
        target: GameObject,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: GameObject,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: Image,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(target: Image): Boolean
    open fun overlap(
        target: Image,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Boolean

    open fun overlap(
        target: Image,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: Image,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: Sprite,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(target: Sprite): Boolean
    open fun overlap(
        target: Sprite,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Boolean

    open fun overlap(
        target: Sprite,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: Sprite,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: TileBody,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(target: TileBody): Boolean
    open fun overlap(
        target: TileBody,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Boolean

    open fun overlap(
        target: TileBody,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: TileBody,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally,
        callbackContext: Any = definedExternally
    ): Boolean

    open fun overlap(target: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>): Boolean
    open fun overlap(
        target: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally
    ): Boolean

    open fun overlap(
        target: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun overlap(
        target: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */> = definedExternally,
        overlapCallback: ArcadePhysicsCallback = definedExternally,
        processCallback: ArcadePhysicsCallback = definedExternally
    ): Boolean

    open fun setCollisionCategory(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        value: Number
    ): MatterPhysics /* this */

    open fun setCollisionGroup(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        value: Number
    ): MatterPhysics /* this */

    open fun setCollidesWith(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        categories: Number
    ): MatterPhysics /* this */

    open fun setCollidesWith(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        categories: Array<Number>
    ): MatterPhysics /* this */

    open fun getMatterBodies(bodies: Array<Any> = definedExternally): Array<BodyType>
    open fun setVelocity(bodies: BodyType, x: Number, y: Number): MatterPhysics /* this */
    open fun setVelocity(bodies: GameObject, x: Number, y: Number): MatterPhysics /* this */
    open fun setVelocity(bodies: Image, x: Number, y: Number): MatterPhysics /* this */
    open fun setVelocity(bodies: Sprite, x: Number, y: Number): MatterPhysics /* this */
    open fun setVelocity(bodies: TileBody, x: Number, y: Number): MatterPhysics /* this */
    open fun setVelocity(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        x: Number,
        y: Number
    ): MatterPhysics /* this */

    open fun setVelocityX(bodies: BodyType, x: Number): MatterPhysics /* this */
    open fun setVelocityX(bodies: GameObject, x: Number): MatterPhysics /* this */
    open fun setVelocityX(bodies: Image, x: Number): MatterPhysics /* this */
    open fun setVelocityX(bodies: Sprite, x: Number): MatterPhysics /* this */
    open fun setVelocityX(bodies: TileBody, x: Number): MatterPhysics /* this */
    open fun setVelocityX(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        x: Number
    ): MatterPhysics /* this */

    open fun setVelocityY(bodies: BodyType, y: Number): MatterPhysics /* this */
    open fun setVelocityY(bodies: GameObject, y: Number): MatterPhysics /* this */
    open fun setVelocityY(bodies: Image, y: Number): MatterPhysics /* this */
    open fun setVelocityY(bodies: Sprite, y: Number): MatterPhysics /* this */
    open fun setVelocityY(bodies: TileBody, y: Number): MatterPhysics /* this */
    open fun setVelocityY(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        y: Number
    ): MatterPhysics /* this */

    open fun setAngularVelocity(bodies: BodyType, value: Number): MatterPhysics /* this */
    open fun setAngularVelocity(bodies: GameObject, value: Number): MatterPhysics /* this */
    open fun setAngularVelocity(bodies: Image, value: Number): MatterPhysics /* this */
    open fun setAngularVelocity(bodies: Sprite, value: Number): MatterPhysics /* this */
    open fun setAngularVelocity(bodies: TileBody, value: Number): MatterPhysics /* this */
    open fun setAngularVelocity(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        value: Number
    ): MatterPhysics /* this */

    open fun applyForce(bodies: BodyType, force: Vector2Like): MatterPhysics /* this */
    open fun applyForce(bodies: GameObject, force: Vector2Like): MatterPhysics /* this */
    open fun applyForce(bodies: Image, force: Vector2Like): MatterPhysics /* this */
    open fun applyForce(bodies: Sprite, force: Vector2Like): MatterPhysics /* this */
    open fun applyForce(bodies: TileBody, force: Vector2Like): MatterPhysics /* this */
    open fun applyForce(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        force: Vector2Like
    ): MatterPhysics /* this */

    open fun applyForceFromPosition(
        bodies: BodyType,
        position: Vector2Like,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromPosition(bodies: BodyType, position: Vector2Like, speed: Number): MatterPhysics /* this */
    open fun applyForceFromPosition(
        bodies: GameObject,
        position: Vector2Like,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromPosition(bodies: GameObject, position: Vector2Like, speed: Number): MatterPhysics /* this */
    open fun applyForceFromPosition(
        bodies: Image,
        position: Vector2Like,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromPosition(bodies: Image, position: Vector2Like, speed: Number): MatterPhysics /* this */
    open fun applyForceFromPosition(
        bodies: Sprite,
        position: Vector2Like,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromPosition(bodies: Sprite, position: Vector2Like, speed: Number): MatterPhysics /* this */
    open fun applyForceFromPosition(
        bodies: TileBody,
        position: Vector2Like,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromPosition(bodies: TileBody, position: Vector2Like, speed: Number): MatterPhysics /* this */
    open fun applyForceFromPosition(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        position: Vector2Like,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromPosition(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        position: Vector2Like,
        speed: Number
    ): MatterPhysics /* this */

    open fun applyForceFromAngle(
        bodies: BodyType,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromAngle(bodies: BodyType, speed: Number): MatterPhysics /* this */
    open fun applyForceFromAngle(
        bodies: GameObject,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromAngle(bodies: GameObject, speed: Number): MatterPhysics /* this */
    open fun applyForceFromAngle(
        bodies: Image,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromAngle(bodies: Image, speed: Number): MatterPhysics /* this */
    open fun applyForceFromAngle(
        bodies: Sprite,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromAngle(bodies: Sprite, speed: Number): MatterPhysics /* this */
    open fun applyForceFromAngle(
        bodies: TileBody,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromAngle(bodies: TileBody, speed: Number): MatterPhysics /* this */
    open fun applyForceFromAngle(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        speed: Number,
        angle: Number = definedExternally
    ): MatterPhysics /* this */

    open fun applyForceFromAngle(
        bodies: Array<Any /* MatterJS.BodyType | Phaser.GameObjects.GameObject | Phaser.Physics.Matter.Image | Phaser.Physics.Matter.Sprite | Phaser.Physics.Matter.TileBody */>,
        speed: Number
    ): MatterPhysics /* this */

    open fun getConstraintLength(constraint: ConstraintType): Number
    open fun alignBody(body: BodyType, x: Number, y: Number, align: Number): MatterPhysics /* this */
    open fun alignBody(body: GameObject, x: Number, y: Number, align: Number): MatterPhysics /* this */
    open fun alignBody(body: Image, x: Number, y: Number, align: Number): MatterPhysics /* this */
    open fun alignBody(body: Sprite, x: Number, y: Number, align: Number): MatterPhysics /* this */
    open fun alignBody(body: TileBody, x: Number, y: Number, align: Number): MatterPhysics /* this */
}

open external class Sprite : Phaser.GameObjects.Sprite, Bounce, Collision, Force, Friction, Gravity, Mass, Sensor,
    SetBody, Sleep, Static, Transform, Velocity, Alpha, BlendMode, Depth, Flip, GetBounds, Origin, Pipeline,
    ScrollFactor, Size, _Phaser_GameObjects_Components_Texture, Tint, _Phaser_GameObjects_Components_Transform,
    Visible {
    constructor(
        world: World,
        x: Number,
        y: Number,
        texture: String,
        frame: String = definedExternally,
        options: MatterBodyConfig = definedExternally
    )

    constructor(world: World, x: Number, y: Number, texture: String)
    constructor(world: World, x: Number, y: Number, texture: String, frame: String = definedExternally)
    constructor(
        world: World,
        x: Number,
        y: Number,
        texture: String,
        frame: Number = definedExternally,
        options: MatterBodyConfig = definedExternally
    )

    constructor(world: World, x: Number, y: Number, texture: String, frame: Number = definedExternally)
    constructor(
        world: World,
        x: Number,
        y: Number,
        texture: Texture,
        frame: String = definedExternally,
        options: MatterBodyConfig = definedExternally
    )

    constructor(world: World, x: Number, y: Number, texture: Texture)
    constructor(world: World, x: Number, y: Number, texture: Texture, frame: String = definedExternally)
    constructor(
        world: World,
        x: Number,
        y: Number,
        texture: Texture,
        frame: Number = definedExternally,
        options: MatterBodyConfig = definedExternally
    )

    constructor(world: World, x: Number, y: Number, texture: Texture, frame: Number = definedExternally)

    open var world: World
    override fun clearAlpha(): Sprite /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Sprite /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* Sprite | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* Sprite | BlendMode */
    override var depth: Number
    override fun setDepth(value: Number): Sprite /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Sprite /* this */
    override fun toggleFlipY(): Sprite /* this */
    override fun setFlipX(value: Boolean): Sprite /* this */
    override fun setFlipY(value: Boolean): Sprite /* this */
    override fun setFlip(x: Boolean, y: Boolean): Sprite /* this */
    override fun resetFlip(): Sprite /* this */
    override var fxPadding: Number
    override fun setFXPadding(padding: Number): Sprite /* this */
    override fun onFXCopy(pipeline: SpriteFXPipeline)
    override fun onFX(pipeline: SpriteFXPipeline)
    override fun <O : Vector2> getCenter(output: O): O
    override fun <O : Vector2> getTopLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getTopRight(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getLeftCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getRightCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomLeft(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomCenter(output: O, includeParent: Boolean): O
    override fun <O : Vector2> getBottomRight(output: O, includeParent: Boolean): O
    override fun <O : Rectangle> getBounds(output: O): O
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override fun setMask(mask: BitmapMask): Sprite /* this */
    override fun setMask(mask: GeometryMask): Sprite /* this */
    override fun clearMask(destroyMask: Boolean): Sprite /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): Sprite /* this */
    override fun setOriginFromFrame(): Sprite /* this */
    override fun setDisplayOrigin(x: Number, y: Number): Sprite /* this */
    override fun updateDisplayOrigin(): Sprite /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(pipeline: String, pipelineData: Any?, copyData: Boolean): dynamic /* Sprite | Pipeline */
    override fun setPipeline(pipeline: String): dynamic /* Sprite | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* Sprite | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: Array<Function<*>>, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* Sprite | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* Sprite | Pipeline */
    override fun setPostPipeline(pipelines: Array<PostFXPipeline>, pipelineData: Any?): dynamic /* Sprite | Pipeline */
    override fun setPipelineData(key: String, value: Any): Sprite /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* Sprite | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* Sprite | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): Sprite /* this */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSizeToFrame(frame: Frame): Sprite /* this */
    override fun setSize(width: Number, height: Number): Sprite /* this */
    override fun setDisplaySize(width: Number, height: Number): Sprite /* this */
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Frame
    override var isCropped: Boolean
    override fun setCrop(x: Number, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setCrop(): Sprite /* this */
    override fun setCrop(x: Number): Sprite /* this */
    override fun setCrop(x: Number, y: Number): Sprite /* this */
    override fun setCrop(x: Number, y: Number, width: Number): Sprite /* this */
    override fun setCrop(x: Rectangle, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setCrop(x: Rectangle): Sprite /* this */
    override fun setCrop(x: Rectangle, y: Number): Sprite /* this */
    override fun setCrop(x: Rectangle, y: Number, width: Number): Sprite /* this */
    override fun setTexture(key: String, frame: String): dynamic /* Sprite | Texture */
    override fun setTexture(key: String): dynamic /* Texture */
    override fun setTexture(key: String, frame: Number): dynamic /* Sprite | Texture */
    override fun setFrame(frame: String, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Sprite | Texture */
    override fun setFrame(frame: String): dynamic /* Sprite | Texture */
    override fun setFrame(frame: String, updateSize: Boolean): dynamic /* Sprite | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean, updateOrigin: Boolean): dynamic /* Sprite | Texture */
    override fun setFrame(frame: Number): dynamic /* Sprite | Texture */
    override fun setFrame(frame: Number, updateSize: Boolean): dynamic /* Sprite | Texture */
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tintFill: Boolean
    override fun clearTint(): Sprite /* this */
    override fun setTint(
        topLeft: Number?,
        topRight: Number?,
        bottomLeft: Number?,
        bottomRight: Number?
    ): Sprite /* this */

    override fun setTintFill(
        topLeft: Number?,
        topRight: Number?,
        bottomLeft: Number?,
        bottomRight: Number?
    ): Sprite /* this */

    override var tint: Number
    override val isTinted: Boolean
    override val hasTransformComponent: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scale: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): Sprite /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* Sprite | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* Sprite | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* Sprite | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): Sprite /* this */
    override fun setRotation(radians: Number): Sprite /* this */
    override fun setAngle(degrees: Number): Sprite /* this */
    override fun setScale(x: Number, y: Number): Sprite /* this */
    override fun setX(value: Number): Sprite /* this */
    override fun setY(value: Number): Sprite /* this */
    override fun setZ(value: Number): Sprite /* this */
    override fun setW(value: Number): Sprite /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): Sprite /* this */
    override fun setBounce(value: Number): GameObject
    override fun setCollisionCategory(value: Number): GameObject
    override fun setCollisionGroup(value: Number): GameObject
    override fun setCollidesWith(categories: Number): GameObject
    override fun setCollidesWith(categories: Array<Number>): GameObject
    override fun setOnCollide(callback: Function<*>): GameObject
    override fun setOnCollideEnd(callback: Function<*>): GameObject
    override fun setOnCollideActive(callback: Function<*>): GameObject
    override fun setOnCollideWith(body: Body, callback: Function<*>): GameObject
    override fun setOnCollideWith(body: Array<Body>, callback: Function<*>): GameObject
    override fun applyForce(force: Vector2): GameObject
    override fun applyForceFrom(position: Vector2, force: Vector2): GameObject
    override fun thrust(speed: Number): GameObject
    override fun thrustLeft(speed: Number): GameObject
    override fun thrustRight(speed: Number): GameObject
    override fun thrustBack(speed: Number): GameObject
    override fun setFriction(value: Number, air: Number, fstatic: Number): GameObject
    override fun setFrictionAir(value: Number): GameObject
    override fun setFrictionStatic(value: Number): GameObject
    override fun setIgnoreGravity(value: Boolean): GameObject
    override fun setMass(value: Number): GameObject
    override fun setDensity(value: Number): GameObject
    override val centerOfMass: Vector2
    override fun setSensor(value: Boolean): GameObject
    override fun isSensor(): Boolean
    override fun setRectangle(width: Number, height: Number, options: MatterBodyConfig): GameObject
    override fun setCircle(radius: Number, options: MatterBodyConfig): GameObject
    override fun setPolygon(radius: Number, sides: Number, options: MatterBodyConfig): GameObject
    override fun setTrapezoid(width: Number, height: Number, slope: Number, options: MatterBodyConfig): GameObject
    override fun setExistingBody(body: BodyType, addToWorld: Boolean): GameObject
    override fun setBody(config: String, options: MatterBodyConfig): GameObject
    override fun setBody(config: String): GameObject
    override fun setBody(config: MatterSetBodyConfig, options: MatterBodyConfig): GameObject
    override fun setBody(config: MatterSetBodyConfig): GameObject
    override fun setToSleep(): Sprite /* this */
    override fun setAwake(): Sprite /* this */
    override fun setSleepThreshold(value: Number): Sprite /* this */
    override fun setSleepEvents(start: Boolean, end: Boolean): Sprite /* this */
    override fun setSleepStartEvent(value: Boolean): Sprite /* this */
    override fun setSleepEndEvent(value: Boolean): Sprite /* this */
    override fun setStatic(value: Boolean): GameObject
    override fun isStatic(): Boolean
    override fun setFixedRotation(): Sprite /* this */
    override fun setAngularVelocity(value: Number): GameObject
    override fun setVelocityX(x: Number): GameObject
    override fun setVelocityY(y: Number): GameObject
    override fun setVelocity(x: Number, y: Number): GameObject
    override fun setTexture(key: Texture, frame: String): _Phaser_GameObjects_Components_Texture /* this */
    override fun setTexture(key: Texture): _Phaser_GameObjects_Components_Texture /* this */
    override fun setTexture(key: Texture, frame: Number): _Phaser_GameObjects_Components_Texture /* this */

    override fun setPosition(x: Number, y: Number): Transform
    override fun setScale(x: Number, y: Number, point: Vector2): Transform
}

open external class TileBody(world: World, tile: Tile, options: MatterTileOptions = definedExternally) : EventEmitter,
    Bounce, Collision, Friction, Gravity, Mass, Sensor, Sleep, Static {
    open var tile: Tile
    open var world: World
    open fun setFromTileRectangle(options: MatterBodyTileOptions = definedExternally): TileBody
    open fun setFromTileCollision(options: MatterBodyTileOptions = definedExternally): TileBody
    open fun setBody(body: BodyType, addToWorld: Boolean = definedExternally): TileBody
    open fun removeBody(): TileBody
    override fun destroy(): TileBody
    override fun setBounce(value: Number): GameObject
    override fun setCollisionCategory(value: Number): GameObject
    override fun setCollisionGroup(value: Number): GameObject
    override fun setCollidesWith(categories: Number): GameObject
    override fun setCollidesWith(categories: Array<Number>): GameObject
    override fun setOnCollide(callback: Function<*>): GameObject
    override fun setOnCollideEnd(callback: Function<*>): GameObject
    override fun setOnCollideActive(callback: Function<*>): GameObject
    override fun setOnCollideWith(body: Body, callback: Function<*>): GameObject
    override fun setOnCollideWith(body: Array<Body>, callback: Function<*>): GameObject
    override fun setFriction(value: Number, air: Number, fstatic: Number): GameObject
    override fun setFrictionAir(value: Number): GameObject
    override fun setFrictionStatic(value: Number): GameObject
    override fun setIgnoreGravity(value: Boolean): GameObject
    override fun setMass(value: Number): GameObject
    override fun setDensity(value: Number): GameObject
    override val centerOfMass: Vector2
    override fun setSensor(value: Boolean): GameObject
    override fun isSensor(): Boolean
    override fun setToSleep(): TileBody /* this */
    override fun setAwake(): TileBody /* this */
    override fun setSleepThreshold(value: Number): TileBody /* this */
    override fun setSleepEvents(start: Boolean, end: Boolean): TileBody /* this */
    override fun setSleepStartEvent(value: Boolean): TileBody /* this */
    override fun setSleepEndEvent(value: Boolean): TileBody /* this */
    override fun setStatic(value: Boolean): GameObject
    override fun isStatic(): Boolean
}

open external class PointerConstraint(scene: Scene, world: World, options: Any? = definedExternally) {
    open var scene: Scene
    open var world: World
    open var camera: Camera
    open var pointer: Pointer
    open var active: Boolean
    open var position: Vector2
    open var body: BodyType
    open var part: BodyType
    open var constraint: ConstraintType
    open fun onDown(pointer: Pointer)
    open fun onUp(pointer: Pointer)
    open fun getBody(): Boolean
    open fun hitTestBody(body: BodyType, position: Vector2): Boolean
    open fun update()
    open fun stopDrag()
    open fun destroy()
}

open external class World(scene: Scene, config: MatterWorldConfig) : EventEmitter {
    open var scene: Scene
    open var engine: Engine
    open var localWorld: MatterJS.World
    open var walls: Any?
    open var enabled: Boolean
    open var correction: Number
    open var getDelta: Function<*>
    open var runner: MatterRunnerConfig
    open var autoUpdate: Boolean
    open var drawDebug: Boolean
    open var debugGraphic: Graphics
    open var debugConfig: MatterDebugConfig
    open fun setCompositeRenderStyle(composite: CompositeType): World /* this */
    open fun setBodyRenderStyle(
        body: BodyType,
        lineColor: Number = definedExternally,
        lineOpacity: Number = definedExternally,
        lineThickness: Number = definedExternally,
        fillColor: Number = definedExternally,
        fillOpacity: Number = definedExternally
    ): World /* this */

    open fun setConstraintRenderStyle(
        constraint: ConstraintType,
        lineColor: Number = definedExternally,
        lineOpacity: Number = definedExternally,
        lineThickness: Number = definedExternally,
        pinSize: Number = definedExternally,
        anchorColor: Number = definedExternally,
        anchorSize: Number = definedExternally
    ): World /* this */

    open fun setEventsProxy()
    open fun setBounds(
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        thickness: Number = definedExternally,
        left: Boolean = definedExternally,
        right: Boolean = definedExternally,
        top: Boolean = definedExternally,
        bottom: Boolean = definedExternally
    ): World

    open fun updateWall(
        add: Boolean,
        position: String = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    open fun createDebugGraphic(): Graphics
    open fun disableGravity(): World /* this */
    open fun setGravity(
        x: Number = definedExternally,
        y: Number = definedExternally,
        scale: Number = definedExternally
    ): World /* this */

    open fun create(x: Number, y: Number, width: Number, height: Number, options: Any?): BodyType
    open fun add(obj: Any?): World /* this */
    open fun add(obj: Array<Any?>?): World /* this */
    open fun remove(obj: Any?, deep: Boolean = definedExternally): World /* this */
    open fun remove(obj: Any?): World /* this */
    open fun remove(obj: Array<Any?>?, deep: Boolean = definedExternally): World /* this */
    open fun remove(obj: Array<Any?>?): World /* this */
    open fun removeConstraint(constraint: ConstraintType, deep: Boolean = definedExternally): World /* this */
    open fun removeConstraint(constraint: ConstraintType): World /* this */
    open fun removeConstraint(constraint: Array<ConstraintType>, deep: Boolean = definedExternally): World /* this */
    open fun removeConstraint(constraint: Array<ConstraintType>): World /* this */
    open fun convertTilemapLayer(tilemapLayer: TilemapLayer, options: Any? = definedExternally): World /* this */
    open fun convertTiles(tiles: Array<Tile>, options: Any? = definedExternally): World /* this */
    open fun nextGroup(isNonColliding: Boolean = definedExternally): Number
    open fun nextCategory(): Number
    open fun pause(): World /* this */
    open fun resume(): World /* this */
    open fun update(time: Number, delta: Number)
    open fun step(delta: Number = definedExternally, correction: Number = definedExternally)
    open fun update60Hz(): Number
    open fun update30Hz(): Number
    open fun has(body: Body): Array<BodyType>
    open fun has(body: GameObject): Array<BodyType>
    open fun getAllBodies(): Array<BodyType>
    open fun getAllConstraints(): Array<ConstraintType>
    open fun getAllComposites(): Array<CompositeType>
    open fun renderGrid(grid: Grid, graphics: Graphics, lineColor: Number, lineOpacity: Number): World /* this */
    open fun renderSeparations(pairs: Array<Pair>, graphics: Graphics, lineColor: Number): World /* this */
    open fun renderCollisions(pairs: Array<Pair>, graphics: Graphics, lineColor: Number): World /* this */
    open fun renderBodyBounds(bodies: Array<Any>, graphics: Graphics, lineColor: Number, lineOpacity: Number)
    open fun renderBodyAxes(
        bodies: Array<Any>,
        graphics: Graphics,
        showAxes: Boolean,
        lineColor: Number,
        lineOpacity: Number
    )

    open fun renderBodyVelocity(
        bodies: Array<Any>,
        graphics: Graphics,
        lineColor: Number,
        lineOpacity: Number,
        lineThickness: Number
    )

    open fun renderBody(
        body: BodyType,
        graphics: Graphics,
        showInternalEdges: Boolean,
        lineColor: Number = definedExternally,
        lineOpacity: Number = definedExternally,
        lineThickness: Number = definedExternally,
        fillColor: Number = definedExternally,
        fillOpacity: Number = definedExternally
    ): World /* this */

    open fun renderConvexHull(
        body: BodyType,
        graphics: Graphics,
        hullColor: Number,
        lineThickness: Number = definedExternally
    ): World /* this */

    open fun renderConstraint(
        constraint: ConstraintType,
        graphics: Graphics,
        lineColor: Number,
        lineOpacity: Number,
        lineThickness: Number,
        pinSize: Number,
        anchorColor: Number,
        anchorSize: Number
    ): World /* this */

    open fun resetCollisionIDs()
    override fun shutdown()
    override fun destroy()
}
