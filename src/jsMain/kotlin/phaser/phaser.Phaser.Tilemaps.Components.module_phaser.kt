@file:JsQualifier("Phaser.Tilemaps.Components")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Tilemaps.Components

import EachTileCallback
import FindTileCallback
import Phaser.Cameras.Scene2D.Camera
import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Sprite
import Phaser.Geom.Circle
import Phaser.Geom.Line
import Phaser.Geom.Rectangle
import Phaser.Geom.Triangle
import Phaser.Math.Vector2
import Phaser.Scene
import Phaser.Tilemaps.LayerData
import Phaser.Tilemaps.Tile
import Phaser.Types.GameObjects.GameObjectConfig
import Phaser.Types.Tilemaps.DebugStyleOptions
import Phaser.Types.Tilemaps.FilteringOptions

external fun CalculateFacesAt(tileX: Number, tileY: Number, layer: LayerData)

external fun CalculateFacesWithin(tileX: Number, tileY: Number, width: Number, height: Number, layer: LayerData)

external fun CheckIsoBounds(tileX: Number, tileY: Number, layer: LayerData, camera: Camera = definedExternally): Boolean

external fun Copy(
    srcTileX: Number,
    srcTileY: Number,
    width: Number,
    height: Number,
    destTileX: Number,
    destTileY: Number,
    recalculateFaces: Boolean,
    layer: LayerData
)

external fun CreateFromTiles(
    indexes: Number,
    replacements: Number,
    spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
    scene: Scene,
    camera: Camera,
    layer: LayerData
): Array<Sprite>

external fun CreateFromTiles(
    indexes: Number,
    replacements: Array<Number>,
    spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
    scene: Scene,
    camera: Camera,
    layer: LayerData
): Array<Sprite>

external fun CreateFromTiles(
    indexes: Array<Number>,
    replacements: Number,
    spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
    scene: Scene,
    camera: Camera,
    layer: LayerData
): Array<Sprite>

external fun CreateFromTiles(
    indexes: Array<Number>,
    replacements: Array<Number>,
    spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
    scene: Scene,
    camera: Camera,
    layer: LayerData
): Array<Sprite>

external fun CullBounds(layer: LayerData, camera: Camera): Rectangle

external fun CullTiles(
    layer: LayerData,
    camera: Camera,
    outputArray: Array<Any> = definedExternally,
    renderOrder: Number = definedExternally
): Array<Tile>

external fun Fill(
    index: Number,
    tileX: Number,
    tileY: Number,
    width: Number,
    height: Number,
    recalculateFaces: Boolean,
    layer: LayerData
)

external fun FilterTiles(
    callback: Function<*>,
    context: Any?,
    tileX: Number,
    tileY: Number,
    width: Number,
    height: Number,
    filteringOptions: FilteringOptions,
    layer: LayerData
): Array<Tile>

external fun FindByIndex(index: Number, skip: Number, reverse: Boolean, layer: LayerData): Tile

external fun FindTile(
    callback: FindTileCallback,
    context: Any?,
    tileX: Number,
    tileY: Number,
    width: Number,
    height: Number,
    filteringOptions: FilteringOptions,
    layer: LayerData
): Tile

external fun ForEachTile(
    callback: EachTileCallback,
    context: Any?,
    tileX: Number,
    tileY: Number,
    width: Number,
    height: Number,
    filteringOptions: FilteringOptions,
    layer: LayerData
)

external fun GetCullTilesFunction(orientation: Number): Function<*>

external fun GetTileAt(tileX: Number, tileY: Number, nonNull: Boolean, layer: LayerData): Tile

external fun GetTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean, camera: Camera, layer: LayerData): Tile

external fun GetTilesWithin(
    tileX: Number,
    tileY: Number,
    width: Number,
    height: Number,
    filteringOptions: FilteringOptions,
    layer: LayerData
): Array<Tile>

external fun GetTilesWithinShape(
    shape: Circle,
    filteringOptions: FilteringOptions,
    camera: Camera,
    layer: LayerData
): Array<Tile>

external fun GetTilesWithinShape(
    shape: Line,
    filteringOptions: FilteringOptions,
    camera: Camera,
    layer: LayerData
): Array<Tile>

external fun GetTilesWithinShape(
    shape: Rectangle,
    filteringOptions: FilteringOptions,
    camera: Camera,
    layer: LayerData
): Array<Tile>

external fun GetTilesWithinShape(
    shape: Triangle,
    filteringOptions: FilteringOptions,
    camera: Camera,
    layer: LayerData
): Array<Tile>

external fun GetTilesWithinWorldXY(
    worldX: Number,
    worldY: Number,
    width: Number,
    height: Number,
    filteringOptions: FilteringOptions,
    camera: Camera,
    layer: LayerData
): Array<Tile>

external fun GetTileToWorldXFunction(orientation: Number): Function<*>

external fun GetTileToWorldXYFunction(orientation: Number): Function<*>

external fun GetTileToWorldYFunction(orientation: Number): Function<*>

external fun GetWorldToTileXFunction(orientation: Number): Function<*>

external fun GetWorldToTileXYFunction(orientation: Number): Function<*>

external fun GetWorldToTileYFunction(orientation: Number): Function<*>

external fun HasTileAt(tileX: Number, tileY: Number, layer: LayerData): Boolean

external fun HasTileAtWorldXY(worldX: Number, worldY: Number, camera: Camera, layer: LayerData): Boolean

external fun HexagonalCullBounds(layer: LayerData, camera: Camera): Any?

external fun HexagonalCullTiles(
    layer: LayerData,
    camera: Camera,
    outputArray: Array<Any> = definedExternally,
    renderOrder: Number = definedExternally
): Array<Tile>

external fun HexagonalTileToWorldXY(
    tileX: Number,
    tileY: Number,
    point: Vector2,
    camera: Camera,
    layer: LayerData
): Vector2

external fun HexagonalTileToWorldY(tileY: Number, camera: Camera, layer: LayerData): Number

external fun HexagonalWorldToTileXY(
    worldX: Number,
    worldY: Number,
    snapToFloor: Boolean,
    point: Vector2,
    camera: Camera,
    layer: LayerData
): Vector2

external fun HexagonalWorldToTileY(worldY: Number, snapToFloor: Boolean, camera: Camera, layer: LayerData): Number

external fun IsInLayerBounds(tileX: Number, tileY: Number, layer: LayerData): Boolean

external fun IsometricCullTiles(
    layer: LayerData,
    camera: Camera,
    outputArray: Array<Any> = definedExternally,
    renderOrder: Number = definedExternally
): Array<Tile>

external fun IsometricTileToWorldXY(
    tileX: Number,
    tileY: Number,
    point: Vector2,
    camera: Camera,
    layer: LayerData
): Vector2

external fun IsometricWorldToTileXY(
    worldX: Number,
    worldY: Number,
    snapToFloor: Boolean,
    point: Vector2,
    camera: Camera,
    layer: LayerData
): Vector2

external fun PutTileAt(tile: Number, tileX: Number, tileY: Number, recalculateFaces: Boolean, layer: LayerData): Tile

external fun PutTileAt(tile: Tile, tileX: Number, tileY: Number, recalculateFaces: Boolean, layer: LayerData): Tile

external fun PutTileAtWorldXY(
    tile: Number,
    worldX: Number,
    worldY: Number,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: LayerData
): Tile

external fun PutTileAtWorldXY(
    tile: Tile,
    worldX: Number,
    worldY: Number,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: LayerData
): Tile

external fun PutTilesAt(tile: Array<Number>, tileX: Number, tileY: Number, recalculateFaces: Boolean, layer: LayerData)

external fun PutTilesAt(
    tile: Array<Array<Number>>,
    tileX: Number,
    tileY: Number,
    recalculateFaces: Boolean,
    layer: LayerData
)

external fun PutTilesAt(tile: Array<Tile>, tileX: Number, tileY: Number, recalculateFaces: Boolean, layer: LayerData)

external fun PutTilesAt(
    tile: Array<Array<Tile>>,
    tileX: Number,
    tileY: Number,
    recalculateFaces: Boolean,
    layer: LayerData
)

external fun Randomize(
    tileX: Number,
    tileY: Number,
    width: Number,
    height: Number,
    indexes: Array<Number>,
    layer: LayerData
)

external fun RemoveTileAt(
    tileX: Number,
    tileY: Number,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    layer: LayerData
): Tile

external fun RemoveTileAtWorldXY(
    worldX: Number,
    worldY: Number,
    replaceWithNull: Boolean,
    recalculateFaces: Boolean,
    camera: Camera,
    layer: LayerData
): Tile

external fun RenderDebug(graphics: Graphics, styleConfig: DebugStyleOptions, layer: LayerData)

external fun ReplaceByIndex(
    findIndex: Number,
    newIndex: Number,
    tileX: Number,
    tileY: Number,
    width: Number,
    height: Number,
    layer: LayerData
)

external fun RunCull(layer: LayerData, bounds: Any?, renderOrder: Number, outputArray: Array<Any>): Array<Tile>

external fun SetCollision(
    indexes: Number,
    collides: Boolean,
    recalculateFaces: Boolean,
    layer: LayerData,
    updateLayer: Boolean = definedExternally
)

external fun SetCollision(indexes: Number, collides: Boolean, recalculateFaces: Boolean, layer: LayerData)

external fun SetCollision(
    indexes: Array<Any>,
    collides: Boolean,
    recalculateFaces: Boolean,
    layer: LayerData,
    updateLayer: Boolean = definedExternally
)

external fun SetCollision(indexes: Array<Any>, collides: Boolean, recalculateFaces: Boolean, layer: LayerData)

external fun SetCollisionBetween(
    start: Number,
    stop: Number,
    collides: Boolean,
    recalculateFaces: Boolean,
    layer: LayerData,
    updateLayer: Boolean = definedExternally
)

external fun SetCollisionByExclusion(
    indexes: Array<Number>,
    collides: Boolean,
    recalculateFaces: Boolean,
    layer: LayerData
)

external fun SetCollisionByProperty(properties: Any?, collides: Boolean, recalculateFaces: Boolean, layer: LayerData)

external fun SetCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: LayerData)

external fun SetLayerCollisionIndex(tileIndex: Number, collides: Boolean, layer: LayerData)

external fun SetTileCollision(tile: Tile, collides: Boolean = definedExternally)

external fun SetTileIndexCallback(indexes: Number, callback: Function<*>, callbackContext: Any?, layer: LayerData)

external fun SetTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any?, layer: LayerData)

external fun SetTileLocationCallback(
    tileX: Number,
    tileY: Number,
    width: Number,
    height: Number,
    callback: Function<*>,
    callbackContext: Any?,
    layer: LayerData
)

external fun Shuffle(tileX: Number, tileY: Number, width: Number, height: Number, layer: LayerData)

external fun StaggeredCullBounds(layer: LayerData, camera: Camera): Any?

external fun StaggeredCullTiles(
    layer: LayerData,
    camera: Camera,
    outputArray: Array<Any> = definedExternally,
    renderOrder: Number = definedExternally
): Array<Tile>

external fun StaggeredTileToWorldXY(
    tileX: Number,
    tileY: Number,
    point: Vector2,
    camera: Camera,
    layer: LayerData
): Vector2

external fun StaggeredTileToWorldY(tileY: Number, camera: Camera, layer: LayerData): Number

external fun StaggeredWorldToTileXY(
    worldX: Number,
    worldY: Number,
    snapToFloor: Boolean,
    point: Vector2,
    camera: Camera,
    layer: LayerData
): Vector2

external fun StaggeredWorldToTileY(worldY: Number, snapToFloor: Boolean, camera: Camera, layer: LayerData): Number

external fun SwapByIndex(
    tileA: Number,
    tileB: Number,
    tileX: Number,
    tileY: Number,
    width: Number,
    height: Number,
    layer: LayerData
)

external fun TileToWorldX(tileX: Number, camera: Camera, layer: LayerData): Number

external fun TileToWorldXY(tileX: Number, tileY: Number, point: Vector2, camera: Camera, layer: LayerData): Vector2

external fun TileToWorldY(tileY: Number, camera: Camera, layer: LayerData): Number

external fun WeightedRandomize(
    tileX: Number,
    tileY: Number,
    width: Number,
    height: Number,
    weightedIndexes: Array<Any?>,
    layer: LayerData
)

external fun WorldToTileX(worldX: Number, snapToFloor: Boolean, camera: Camera, layer: LayerData): Number

external fun WorldToTileXY(
    worldX: Number,
    worldY: Number,
    snapToFloor: Boolean,
    point: Vector2,
    camera: Camera,
    layer: LayerData
): Vector2

external fun WorldToTileY(worldY: Number, snapToFloor: Boolean, camera: Camera, layer: LayerData): Number
