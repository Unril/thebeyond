@file:JsQualifier("Phaser.Physics.Arcade.Tilemap")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Physics.Arcade.Tilemap

import Phaser.GameObjects.Sprite
import Phaser.Geom.Rectangle
import Phaser.Physics.Arcade.Body
import Phaser.Tilemaps.Tile
import Phaser.Tilemaps.TilemapLayer

external fun ProcessTileCallbacks(tile: Tile, sprite: Sprite): Boolean

external fun ProcessTileSeparationX(body: Body, x: Number)

external fun ProcessTileSeparationY(body: Body, y: Number)

external fun SeparateTile(
    i: Number,
    body: Body,
    tile: Tile,
    tileWorldRect: Rectangle,
    tilemapLayer: TilemapLayer,
    tileBias: Number,
    isLayer: Boolean
): Boolean

external fun TileCheckX(
    body: Body,
    tile: Tile,
    tileLeft: Number,
    tileRight: Number,
    tileBias: Number,
    isLayer: Boolean
): Number

external fun TileCheckY(
    body: Body,
    tile: Tile,
    tileTop: Number,
    tileBottom: Number,
    tileBias: Number,
    isLayer: Boolean
): Number

external fun TileIntersectsBody(tileWorldRect: Any, body: Body): Boolean
