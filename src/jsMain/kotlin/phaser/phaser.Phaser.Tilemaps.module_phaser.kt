@file:JsQualifier("Phaser.Tilemaps")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Tilemaps

import EachTileCallback
import FindTileCallback
import Phaser.BlendModes
import Phaser.Cameras.Scene2D.Camera
import Phaser.Display.Masks.BitmapMask
import Phaser.Display.Masks.GeometryMask
import Phaser.GameObjects.Components.*
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.Graphics
import Phaser.GameObjects.Shape
import Phaser.GameObjects.Sprite
import Phaser.Geom.Circle
import Phaser.Geom.Line
import Phaser.Geom.Rectangle
import Phaser.Geom.Triangle
import Phaser.Math.Vector2
import Phaser.Renderer.WebGL.Pipelines.PostFXPipeline
import Phaser.Renderer.WebGL.WebGLPipeline
import Phaser.Scene
import Phaser.Textures.Frame
import Phaser.Textures.Texture
import Phaser.Types.GameObjects.GameObjectConfig
import Phaser.Types.Math.Vector2Like
import Phaser.Types.Math.Vector3Like
import Phaser.Types.Math.Vector4Like
import Phaser.Types.Tilemaps.*
import TilemapFilterCallback
import TilemapFindCallback
import org.khronos.webgl.WebGLTexture

external enum class Orientation {
    ORTHOGONAL,
    ISOMETRIC,
    STAGGERED,
    HEXAGONAL
}

open external class ImageCollection(
    name: String,
    firstgid: Number,
    width: Number = definedExternally,
    height: Number = definedExternally,
    margin: Number = definedExternally,
    spacing: Number = definedExternally,
    properties: Any? = definedExternally
) {
    open var name: String
    open var firstgid: Number
    open val imageWidth: Number
    open val imageHeight: Number
    open val imageMarge: Number
    open val imageSpacing: Number
    open var properties: Any?
    open val images: Array<Any>
    open val total: Number
    open fun containsImageIndex(imageIndex: Number): Boolean
    open fun addImage(gid: Number, image: String): ImageCollection
}

open external class LayerData(config: LayerDataConfig = definedExternally) {
    open var name: String
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var tileWidth: Number
    open var tileHeight: Number
    open var baseTileWidth: Number
    open var baseTileHeight: Number
    open var orientation: OrientationType61
    open var widthInPixels: Number
    open var heightInPixels: Number
    open var alpha: Number
    open var visible: Boolean
    open var properties: Array<Any?>
    open var indexes: Array<Any>
    open var collideIndexes: Array<Any>
    open var callbacks: Array<Any>
    open var bodies: Array<Any>
    open var data: Array<Array<Tile>>
    open var tilemapLayer: TilemapLayer
    open var hexSideLength: Number
}

open external class MapData(config: MapDataConfig = definedExternally) {
    open var name: String
    open var width: Number
    open var height: Number
    open var infinite: Boolean
    open var tileWidth: Number
    open var tileHeight: Number
    open var widthInPixels: Number
    open var heightInPixels: Number
    open var format: Number
    open var orientation: OrientationType61
    open var renderOrder: String
    open var version: String
    open var properties: Any?
    open var layers: dynamic /* Array<Phaser.Tilemaps.LayerData> | Phaser.Tilemaps.ObjectLayer */
    open var images: Array<Any>
    open var objects: Array<ObjectLayerConfig>
    open var collision: Any?
    open var tilesets: Array<Tileset>
    open var imageCollections: Array<Any>
    open var tiles: Array<Any>
    open var hexSideLength: Number
}

open external class ObjectLayer(config: ObjectLayerConfig = definedExternally) {
    open var name: String
    open var opacity: Number
    open var properties: Any?
    open var propertyTypes: Any?
    open var type: String
    open var visible: Boolean
    open var objects: Array<TiledObject>
}

open external class ObjectHelper(tilesets: Array<Tileset>) {
    open var gids: Array<Any>
    open var enabled: Boolean
    open fun getTypeIncludingTile(obj: TiledObject): String
    open fun setTextureAndFrame(
        sprite: GameObject,
        key: String = definedExternally,
        frame: String = definedExternally,
        obj: TiledObject = definedExternally
    )

    open fun setTextureAndFrame(sprite: GameObject)
    open fun setTextureAndFrame(sprite: GameObject, key: String = definedExternally)
    open fun setTextureAndFrame(sprite: GameObject, key: String = definedExternally, frame: String = definedExternally)
    open fun setTextureAndFrame(
        sprite: GameObject,
        key: String = definedExternally,
        frame: Number = definedExternally,
        obj: TiledObject = definedExternally
    )

    open fun setTextureAndFrame(sprite: GameObject, key: String = definedExternally, frame: Number = definedExternally)
    open fun setTextureAndFrame(
        sprite: GameObject,
        key: String = definedExternally,
        frame: Frame = definedExternally,
        obj: TiledObject = definedExternally
    )

    open fun setTextureAndFrame(sprite: GameObject, key: String = definedExternally, frame: Frame = definedExternally)
    open fun setTextureAndFrame(
        sprite: GameObject,
        key: Texture = definedExternally,
        frame: String = definedExternally,
        obj: TiledObject = definedExternally
    )

    open fun setTextureAndFrame(sprite: GameObject, key: Texture = definedExternally)
    open fun setTextureAndFrame(sprite: GameObject, key: Texture = definedExternally, frame: String = definedExternally)
    open fun setTextureAndFrame(
        sprite: GameObject,
        key: Texture = definedExternally,
        frame: Number = definedExternally,
        obj: TiledObject = definedExternally
    )

    open fun setTextureAndFrame(sprite: GameObject, key: Texture = definedExternally, frame: Number = definedExternally)
    open fun setTextureAndFrame(
        sprite: GameObject,
        key: Texture = definedExternally,
        frame: Frame = definedExternally,
        obj: TiledObject = definedExternally
    )

    open fun setTextureAndFrame(sprite: GameObject, key: Texture = definedExternally, frame: Frame = definedExternally)
    open fun setPropertiesFromTiledObject(sprite: GameObject, obj: TiledObject)
}

external fun ParseToTilemap(
    scene: Scene,
    key: String = definedExternally,
    tileWidth: Number = definedExternally,
    tileHeight: Number = definedExternally,
    width: Number = definedExternally,
    height: Number = definedExternally,
    data: Array<Array<Number>> = definedExternally,
    insertNull: Boolean = definedExternally
): Tilemap

open external class Tile(
    layer: LayerData,
    index: Number,
    x: Number,
    y: Number,
    width: Number,
    height: Number,
    baseWidth: Number,
    baseHeight: Number
) : Alpha, Flip, Visible {
    open var layer: LayerData
    open var index: Number
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var right: Number
    open var bottom: Number
    open var baseWidth: Number
    open var baseHeight: Number
    open var pixelX: Number
    open var pixelY: Number
    open var properties: Any
    open var rotation: Number
    open var collideLeft: Boolean
    open var collideRight: Boolean
    open var collideUp: Boolean
    open var collideDown: Boolean
    open var faceLeft: Boolean
    open var faceRight: Boolean
    open var faceTop: Boolean
    open var faceBottom: Boolean
    open var collisionCallback: Function<*>
    open var collisionCallbackContext: Any?
    open var tint: Number
    open var physics: Any?
    open fun containsPoint(x: Number, y: Number): Boolean
    open fun copy(tile: Tile): Tile /* this */
    open fun getCollisionGroup(): Any?
    open fun getTileData(): Any?
    open fun getLeft(camera: Camera = definedExternally): Number
    open fun getRight(camera: Camera = definedExternally): Number
    open fun getTop(camera: Camera = definedExternally): Number
    open fun getBottom(camera: Camera = definedExternally): Number
    open fun getBounds(
        camera: Camera = definedExternally,
        output: Rectangle = definedExternally
    ): dynamic /* Phaser.Geom.Rectangle? | Any? */

    open fun getCenterX(camera: Camera = definedExternally): Number
    open fun getCenterY(camera: Camera = definedExternally): Number
    open fun intersects(x: Number, y: Number, right: Number, bottom: Number): Boolean
    open fun isInteresting(collides: Boolean, faces: Boolean): Boolean
    open fun resetCollision(recalculateFaces: Boolean = definedExternally): Tile /* this */
    open fun resetFaces(): Tile /* this */
    open fun setCollision(
        left: Boolean,
        right: Boolean = definedExternally,
        up: Boolean = definedExternally,
        down: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tile /* this */

    open fun setCollisionCallback(callback: Function<*>, context: Any?): Tile /* this */
    open fun setSize(tileWidth: Number, tileHeight: Number, baseWidth: Number, baseHeight: Number): Tile /* this */
    open fun updatePixelXY(): Tile /* this */
    open fun destroy()
    open val canCollide: Boolean
    open val collides: Boolean
    open val hasInterestingFace: Boolean
    open val tileset: Tileset
    open val tilemapLayer: TilemapLayer
    open val tilemap: Tilemap
    override fun clearAlpha(): Tile /* this */
    override fun setAlpha(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number): Tile /* this */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): Tile /* this */
    override fun toggleFlipY(): Tile /* this */
    override fun setFlipX(value: Boolean): Tile /* this */
    override fun setFlipY(value: Boolean): Tile /* this */
    override fun setFlip(x: Boolean, y: Boolean): Tile /* this */
    override fun resetFlip(): Tile /* this */
    override var visible: Boolean
    override fun setVisible(value: Boolean): Tile /* this */
}

open external class Tilemap(scene: Scene, mapData: MapData) {
    open var scene: Scene
    open var tileWidth: Number
    open var tileHeight: Number
    open var width: Number
    open var height: Number
    open var orientation: String
    open var renderOrder: String
    open var format: Number
    open var version: Number
    open var properties: Any?
    open var widthInPixels: Number
    open var heightInPixels: Number
    open var imageCollections: Array<ImageCollection>
    open var images: Array<Any>
    open var layers: Array<LayerData>
    open var tilesets: Array<Tileset>
    open var objects: Array<ObjectLayer>
    open var currentLayerIndex: Number
    open var hexSideLength: Number
    open fun setRenderOrder(renderOrder: Number): Tilemap /* this */
    open fun setRenderOrder(renderOrder: String): Tilemap /* this */
    open fun addTilesetImage(
        tilesetName: String,
        key: String = definedExternally,
        tileWidth: Number = definedExternally,
        tileHeight: Number = definedExternally,
        tileMargin: Number = definedExternally,
        tileSpacing: Number = definedExternally,
        gid: Number = definedExternally
    ): Tileset

    open fun copy(
        srcTileX: Number,
        srcTileY: Number,
        width: Number,
        height: Number,
        destTileX: Number,
        destTileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun copy(
        srcTileX: Number,
        srcTileY: Number,
        width: Number,
        height: Number,
        destTileX: Number,
        destTileY: Number
    ): Tilemap

    open fun copy(
        srcTileX: Number,
        srcTileY: Number,
        width: Number,
        height: Number,
        destTileX: Number,
        destTileY: Number,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun copy(
        srcTileX: Number,
        srcTileY: Number,
        width: Number,
        height: Number,
        destTileX: Number,
        destTileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun copy(
        srcTileX: Number,
        srcTileY: Number,
        width: Number,
        height: Number,
        destTileX: Number,
        destTileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun createBlankLayer(
        name: String,
        tileset: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        tileWidth: Number = definedExternally,
        tileHeight: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(name: String, tileset: String): TilemapLayer
    open fun createBlankLayer(name: String, tileset: String, x: Number = definedExternally): TilemapLayer
    open fun createBlankLayer(
        name: String,
        tileset: String,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: String,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        tileWidth: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Array<String>,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        tileWidth: Number = definedExternally,
        tileHeight: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(name: String, tileset: Array<String>): TilemapLayer
    open fun createBlankLayer(name: String, tileset: Array<String>, x: Number = definedExternally): TilemapLayer
    open fun createBlankLayer(
        name: String,
        tileset: Array<String>,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Array<String>,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Array<String>,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Array<String>,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        tileWidth: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Tileset,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        tileWidth: Number = definedExternally,
        tileHeight: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(name: String, tileset: Tileset): TilemapLayer
    open fun createBlankLayer(name: String, tileset: Tileset, x: Number = definedExternally): TilemapLayer
    open fun createBlankLayer(
        name: String,
        tileset: Tileset,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Tileset,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Tileset,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Tileset,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        tileWidth: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Array<Tileset>,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        tileWidth: Number = definedExternally,
        tileHeight: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(name: String, tileset: Array<Tileset>): TilemapLayer
    open fun createBlankLayer(name: String, tileset: Array<Tileset>, x: Number = definedExternally): TilemapLayer
    open fun createBlankLayer(
        name: String,
        tileset: Array<Tileset>,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Array<Tileset>,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Array<Tileset>,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): TilemapLayer

    open fun createBlankLayer(
        name: String,
        tileset: Array<Tileset>,
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        tileWidth: Number = definedExternally
    ): TilemapLayer

    open fun createLayer(
        layerID: Number,
        tileset: String,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createLayer(layerID: Number, tileset: String): TilemapLayer
    open fun createLayer(layerID: Number, tileset: String, x: Number = definedExternally): TilemapLayer
    open fun createLayer(
        layerID: Number,
        tileset: Array<String>,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createLayer(layerID: Number, tileset: Array<String>): TilemapLayer
    open fun createLayer(layerID: Number, tileset: Array<String>, x: Number = definedExternally): TilemapLayer
    open fun createLayer(
        layerID: Number,
        tileset: Tileset,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createLayer(layerID: Number, tileset: Tileset): TilemapLayer
    open fun createLayer(layerID: Number, tileset: Tileset, x: Number = definedExternally): TilemapLayer
    open fun createLayer(
        layerID: Number,
        tileset: Array<Tileset>,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createLayer(layerID: Number, tileset: Array<Tileset>): TilemapLayer
    open fun createLayer(layerID: Number, tileset: Array<Tileset>, x: Number = definedExternally): TilemapLayer
    open fun createLayer(
        layerID: String,
        tileset: String,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createLayer(layerID: String, tileset: String): TilemapLayer
    open fun createLayer(layerID: String, tileset: String, x: Number = definedExternally): TilemapLayer
    open fun createLayer(
        layerID: String,
        tileset: Array<String>,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createLayer(layerID: String, tileset: Array<String>): TilemapLayer
    open fun createLayer(layerID: String, tileset: Array<String>, x: Number = definedExternally): TilemapLayer
    open fun createLayer(
        layerID: String,
        tileset: Tileset,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createLayer(layerID: String, tileset: Tileset): TilemapLayer
    open fun createLayer(layerID: String, tileset: Tileset, x: Number = definedExternally): TilemapLayer
    open fun createLayer(
        layerID: String,
        tileset: Array<Tileset>,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): TilemapLayer

    open fun createLayer(layerID: String, tileset: Array<Tileset>): TilemapLayer
    open fun createLayer(layerID: String, tileset: Array<Tileset>, x: Number = definedExternally): TilemapLayer
    open fun createFromObjects(
        objectLayerName: String,
        config: CreateFromObjectLayerConfig,
        useTileset: Boolean = definedExternally
    ): Array<GameObject>

    open fun createFromObjects(objectLayerName: String, config: CreateFromObjectLayerConfig): Array<GameObject>
    open fun createFromObjects(
        objectLayerName: String,
        config: Array<CreateFromObjectLayerConfig>,
        useTileset: Boolean = definedExternally
    ): Array<GameObject>

    open fun createFromObjects(objectLayerName: String, config: Array<CreateFromObjectLayerConfig>): Array<GameObject>
    open fun createFromTiles(
        indexes: Number,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Sprite>

    open fun fill(
        index: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun fill(index: Number): Tilemap
    open fun fill(index: Number, tileX: Number = definedExternally): Tilemap
    open fun fill(index: Number, tileX: Number = definedExternally, tileY: Number = definedExternally): Tilemap
    open fun fill(
        index: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Tilemap

    open fun fill(
        index: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Tilemap

    open fun fill(
        index: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun fill(
        index: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun fill(
        index: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun filterObjects(
        objectLayer: ObjectLayer,
        callback: TilemapFilterCallback,
        context: Any? = definedExternally
    ): Array<TiledObject>

    open fun filterObjects(objectLayer: ObjectLayer, callback: TilemapFilterCallback): Array<TiledObject>
    open fun filterObjects(
        objectLayer: String,
        callback: TilemapFilterCallback,
        context: Any? = definedExternally
    ): Array<TiledObject>

    open fun filterObjects(objectLayer: String, callback: TilemapFilterCallback): Array<TiledObject>
    open fun filterTiles(
        callback: Function<*>,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: String = definedExternally
    ): Array<Tile>

    open fun filterTiles(callback: Function<*>): Array<Tile>
    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally): Array<Tile>
    open fun filterTiles(
        callback: Function<*>,
        context: Any? = definedExternally,
        tileX: Number = definedExternally
    ): Array<Tile>

    open fun filterTiles(
        callback: Function<*>,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally
    ): Array<Tile>

    open fun filterTiles(
        callback: Function<*>,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Array<Tile>

    open fun filterTiles(
        callback: Function<*>,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Array<Tile>

    open fun filterTiles(
        callback: Function<*>,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally
    ): Array<Tile>

    open fun filterTiles(
        callback: Function<*>,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: Number = definedExternally
    ): Array<Tile>

    open fun filterTiles(
        callback: Function<*>,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Tile>

    open fun findByIndex(
        index: Number,
        skip: Number = definedExternally,
        reverse: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tile

    open fun findByIndex(index: Number): Tile
    open fun findByIndex(index: Number, skip: Number = definedExternally): Tile
    open fun findByIndex(index: Number, skip: Number = definedExternally, reverse: Boolean = definedExternally): Tile
    open fun findByIndex(
        index: Number,
        skip: Number = definedExternally,
        reverse: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tile

    open fun findByIndex(
        index: Number,
        skip: Number = definedExternally,
        reverse: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tile

    open fun findObject(
        objectLayer: ObjectLayer,
        callback: TilemapFindCallback,
        context: Any? = definedExternally
    ): TiledObject

    open fun findObject(objectLayer: ObjectLayer, callback: TilemapFindCallback): TiledObject
    open fun findObject(
        objectLayer: String,
        callback: TilemapFindCallback,
        context: Any? = definedExternally
    ): TiledObject

    open fun findObject(objectLayer: String, callback: TilemapFindCallback): TiledObject
    open fun findTile(
        callback: FindTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: String = definedExternally
    ): Tile

    open fun findTile(callback: FindTileCallback): Tile
    open fun findTile(callback: FindTileCallback, context: Any? = definedExternally): Tile
    open fun findTile(
        callback: FindTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally
    ): Tile

    open fun findTile(
        callback: FindTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally
    ): Tile

    open fun findTile(
        callback: FindTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Tile

    open fun findTile(
        callback: FindTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Tile

    open fun findTile(
        callback: FindTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally
    ): Tile

    open fun findTile(
        callback: FindTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: Number = definedExternally
    ): Tile

    open fun findTile(
        callback: FindTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tile

    open fun forEachTile(
        callback: EachTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun forEachTile(callback: EachTileCallback): Tilemap
    open fun forEachTile(callback: EachTileCallback, context: Any? = definedExternally): Tilemap
    open fun forEachTile(
        callback: EachTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally
    ): Tilemap

    open fun forEachTile(
        callback: EachTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally
    ): Tilemap

    open fun forEachTile(
        callback: EachTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Tilemap

    open fun forEachTile(
        callback: EachTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Tilemap

    open fun forEachTile(
        callback: EachTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally
    ): Tilemap

    open fun forEachTile(
        callback: EachTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun forEachTile(
        callback: EachTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun getImageIndex(name: String): Number
    open fun getImageLayerNames(): Array<String>
    open fun getIndex(location: Array<Any>, name: String): Number
    open fun getLayer(layer: String = definedExternally): LayerData
    open fun getLayer(): LayerData
    open fun getLayer(layer: Number = definedExternally): LayerData
    open fun getLayer(layer: TilemapLayer = definedExternally): LayerData
    open fun getObjectLayer(name: String = definedExternally): ObjectLayer
    open fun getObjectLayerNames(): Array<String>
    open fun getLayerIndex(layer: String = definedExternally): Number
    open fun getLayerIndex(): Number
    open fun getLayerIndex(layer: Number = definedExternally): Number
    open fun getLayerIndex(layer: TilemapLayer = definedExternally): Number
    open fun getLayerIndexByName(name: String): Number
    open fun getTileAt(
        tileX: Number,
        tileY: Number,
        nonNull: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tile

    open fun getTileAt(tileX: Number, tileY: Number): Tile
    open fun getTileAt(tileX: Number, tileY: Number, nonNull: Boolean = definedExternally): Tile
    open fun getTileAt(
        tileX: Number,
        tileY: Number,
        nonNull: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tile

    open fun getTileAt(
        tileX: Number,
        tileY: Number,
        nonNull: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tile

    open fun getTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        nonNull: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Tile

    open fun getTileAtWorldXY(worldX: Number, worldY: Number): Tile
    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean = definedExternally): Tile
    open fun getTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        nonNull: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Tile

    open fun getTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        nonNull: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Tile

    open fun getTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        nonNull: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tile

    open fun getTileLayerNames(): Array<String>
    open fun getTilesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: String = definedExternally
    ): Array<Tile>

    open fun getTilesWithin(): Array<Tile>
    open fun getTilesWithin(tileX: Number = definedExternally): Array<Tile>
    open fun getTilesWithin(tileX: Number = definedExternally, tileY: Number = definedExternally): Array<Tile>
    open fun getTilesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Array<Tile>

    open fun getTilesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Array<Tile>

    open fun getTilesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally
    ): Array<Tile>

    open fun getTilesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: Number = definedExternally
    ): Array<Tile>

    open fun getTilesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Circle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(shape: Circle): Array<Tile>
    open fun getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun getTilesWithinShape(
        shape: Circle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Circle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Circle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Line,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(shape: Line): Array<Tile>
    open fun getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun getTilesWithinShape(
        shape: Line,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Line,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Line,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Rectangle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(shape: Rectangle): Array<Tile>
    open fun getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun getTilesWithinShape(
        shape: Rectangle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Rectangle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Rectangle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Triangle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(shape: Triangle): Array<Tile>
    open fun getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun getTilesWithinShape(
        shape: Triangle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Triangle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Triangle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Tile>

    open fun getTilesWithinWorldXY(
        worldX: Number,
        worldY: Number,
        width: Number,
        height: Number,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Array<Tile>

    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number): Array<Tile>
    open fun getTilesWithinWorldXY(
        worldX: Number,
        worldY: Number,
        width: Number,
        height: Number,
        filteringOptions: FilteringOptions = definedExternally
    ): Array<Tile>

    open fun getTilesWithinWorldXY(
        worldX: Number,
        worldY: Number,
        width: Number,
        height: Number,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally
    ): Array<Tile>

    open fun getTilesWithinWorldXY(
        worldX: Number,
        worldY: Number,
        width: Number,
        height: Number,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Array<Tile>

    open fun getTilesWithinWorldXY(
        worldX: Number,
        worldY: Number,
        width: Number,
        height: Number,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Array<Tile>

    open fun getTileset(name: String): Tileset
    open fun getTilesetIndex(name: String): Number
    open fun hasTileAt(tileX: Number, tileY: Number, layer: String = definedExternally): Boolean
    open fun hasTileAt(tileX: Number, tileY: Number): Boolean
    open fun hasTileAt(tileX: Number, tileY: Number, layer: Number = definedExternally): Boolean
    open fun hasTileAt(tileX: Number, tileY: Number, layer: TilemapLayer = definedExternally): Boolean
    open fun hasTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Boolean

    open fun hasTileAtWorldXY(worldX: Number, worldY: Number): Boolean
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Camera = definedExternally): Boolean
    open fun hasTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Boolean

    open fun hasTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Boolean

    open var layer: LayerData
    open fun putTileAt(
        tile: Number,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tile

    open fun putTileAt(tile: Number, tileX: Number, tileY: Number): Tile
    open fun putTileAt(tile: Number, tileX: Number, tileY: Number, recalculateFaces: Boolean = definedExternally): Tile
    open fun putTileAt(
        tile: Number,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tile

    open fun putTileAt(
        tile: Number,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tile

    open fun putTileAt(
        tile: Tile,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tile

    open fun putTileAt(tile: Tile, tileX: Number, tileY: Number): Tile
    open fun putTileAt(tile: Tile, tileX: Number, tileY: Number, recalculateFaces: Boolean = definedExternally): Tile
    open fun putTileAt(
        tile: Tile,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tile

    open fun putTileAt(
        tile: Tile,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tile

    open fun putTileAtWorldXY(
        tile: Number,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Tile

    open fun putTileAtWorldXY(tile: Number, worldX: Number, worldY: Number): Tile
    open fun putTileAtWorldXY(
        tile: Number,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally
    ): Tile

    open fun putTileAtWorldXY(
        tile: Number,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Tile

    open fun putTileAtWorldXY(
        tile: Number,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Tile

    open fun putTileAtWorldXY(
        tile: Number,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tile

    open fun putTileAtWorldXY(
        tile: Tile,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Tile

    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number): Tile
    open fun putTileAtWorldXY(
        tile: Tile,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally
    ): Tile

    open fun putTileAtWorldXY(
        tile: Tile,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Tile

    open fun putTileAtWorldXY(
        tile: Tile,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Tile

    open fun putTileAtWorldXY(
        tile: Tile,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tile

    open fun putTilesAt(
        tile: Array<Number>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun putTilesAt(tile: Array<Number>, tileX: Number, tileY: Number): Tilemap
    open fun putTilesAt(
        tile: Array<Number>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Number>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Number>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Array<Number>>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun putTilesAt(tile: Array<Array<Number>>, tileX: Number, tileY: Number): Tilemap
    open fun putTilesAt(
        tile: Array<Array<Number>>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Array<Number>>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Array<Number>>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Tile>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun putTilesAt(tile: Array<Tile>, tileX: Number, tileY: Number): Tilemap
    open fun putTilesAt(
        tile: Array<Tile>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Tile>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Tile>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Array<Tile>>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun putTilesAt(tile: Array<Array<Tile>>, tileX: Number, tileY: Number): Tilemap
    open fun putTilesAt(
        tile: Array<Array<Tile>>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Array<Tile>>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun putTilesAt(
        tile: Array<Array<Tile>>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun randomize(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        indexes: Array<Number> = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun randomize(): Tilemap
    open fun randomize(tileX: Number = definedExternally): Tilemap
    open fun randomize(tileX: Number = definedExternally, tileY: Number = definedExternally): Tilemap
    open fun randomize(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Tilemap

    open fun randomize(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Tilemap

    open fun randomize(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        indexes: Array<Number> = definedExternally
    ): Tilemap

    open fun randomize(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        indexes: Array<Number> = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun randomize(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        indexes: Array<Number> = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun calculateFacesAt(tileX: Number, tileY: Number, layer: String = definedExternally): Tilemap
    open fun calculateFacesAt(tileX: Number, tileY: Number): Tilemap
    open fun calculateFacesAt(tileX: Number, tileY: Number, layer: Number = definedExternally): Tilemap
    open fun calculateFacesAt(tileX: Number, tileY: Number, layer: TilemapLayer = definedExternally): Tilemap
    open fun calculateFacesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun calculateFacesWithin(): Tilemap
    open fun calculateFacesWithin(tileX: Number = definedExternally): Tilemap
    open fun calculateFacesWithin(tileX: Number = definedExternally, tileY: Number = definedExternally): Tilemap
    open fun calculateFacesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Tilemap

    open fun calculateFacesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Tilemap

    open fun calculateFacesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun calculateFacesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun removeLayer(layer: String = definedExternally): Tilemap
    open fun removeLayer(): Tilemap
    open fun removeLayer(layer: Number = definedExternally): Tilemap
    open fun removeLayer(layer: TilemapLayer = definedExternally): Tilemap
    open fun destroyLayer(layer: String = definedExternally): Tilemap
    open fun destroyLayer(): Tilemap
    open fun destroyLayer(layer: Number = definedExternally): Tilemap
    open fun destroyLayer(layer: TilemapLayer = definedExternally): Tilemap
    open fun removeAllLayers(): Tilemap /* this */
    open fun removeTile(
        tiles: Tile,
        replaceIndex: Number = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Array<Tile>

    open fun removeTile(tiles: Tile): Array<Tile>
    open fun removeTile(tiles: Tile, replaceIndex: Number = definedExternally): Array<Tile>
    open fun removeTile(
        tiles: Array<Tile>,
        replaceIndex: Number = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Array<Tile>

    open fun removeTile(tiles: Array<Tile>): Array<Tile>
    open fun removeTile(tiles: Array<Tile>, replaceIndex: Number = definedExternally): Array<Tile>
    open fun removeTileAt(
        tileX: Number,
        tileY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tile

    open fun removeTileAt(tileX: Number, tileY: Number): Tile
    open fun removeTileAt(tileX: Number, tileY: Number, replaceWithNull: Boolean = definedExternally): Tile
    open fun removeTileAt(
        tileX: Number,
        tileY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tile

    open fun removeTileAt(
        tileX: Number,
        tileY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tile

    open fun removeTileAt(
        tileX: Number,
        tileY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tile

    open fun removeTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Tile

    open fun removeTileAtWorldXY(worldX: Number, worldY: Number): Tile
    open fun removeTileAtWorldXY(worldX: Number, worldY: Number, replaceWithNull: Boolean = definedExternally): Tile
    open fun removeTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tile

    open fun removeTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Tile

    open fun removeTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Tile

    open fun removeTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tile

    open fun renderDebug(
        graphics: Graphics,
        styleConfig: StyleConfig = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun renderDebug(graphics: Graphics): Tilemap
    open fun renderDebug(graphics: Graphics, styleConfig: StyleConfig = definedExternally): Tilemap
    open fun renderDebug(
        graphics: Graphics,
        styleConfig: StyleConfig = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun renderDebug(
        graphics: Graphics,
        styleConfig: StyleConfig = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun renderDebugFull(graphics: Graphics, styleConfig: StyleConfig = definedExternally): Tilemap /* this */
    open fun replaceByIndex(
        findIndex: Number,
        newIndex: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun replaceByIndex(findIndex: Number, newIndex: Number): Tilemap
    open fun replaceByIndex(findIndex: Number, newIndex: Number, tileX: Number = definedExternally): Tilemap
    open fun replaceByIndex(
        findIndex: Number,
        newIndex: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally
    ): Tilemap

    open fun replaceByIndex(
        findIndex: Number,
        newIndex: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Tilemap

    open fun replaceByIndex(
        findIndex: Number,
        newIndex: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Tilemap

    open fun replaceByIndex(
        findIndex: Number,
        newIndex: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun replaceByIndex(
        findIndex: Number,
        newIndex: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally,
        updateLayer: Boolean = definedExternally
    ): Tilemap

    open fun setCollision(indexes: Number): Tilemap
    open fun setCollision(indexes: Number, collides: Boolean = definedExternally): Tilemap
    open fun setCollision(
        indexes: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally,
        updateLayer: Boolean = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally,
        updateLayer: Boolean = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Array<Any>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally,
        updateLayer: Boolean = definedExternally
    ): Tilemap

    open fun setCollision(indexes: Array<Any>): Tilemap
    open fun setCollision(indexes: Array<Any>, collides: Boolean = definedExternally): Tilemap
    open fun setCollision(
        indexes: Array<Any>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Array<Any>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Array<Any>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally,
        updateLayer: Boolean = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Array<Any>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Array<Any>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally,
        updateLayer: Boolean = definedExternally
    ): Tilemap

    open fun setCollision(
        indexes: Array<Any>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun setCollisionBetween(
        start: Number,
        stop: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun setCollisionBetween(start: Number, stop: Number): Tilemap
    open fun setCollisionBetween(start: Number, stop: Number, collides: Boolean = definedExternally): Tilemap
    open fun setCollisionBetween(
        start: Number,
        stop: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun setCollisionBetween(
        start: Number,
        stop: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun setCollisionBetween(
        start: Number,
        stop: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun setCollisionByProperty(
        properties: Any?,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun setCollisionByProperty(properties: Any?): Tilemap
    open fun setCollisionByProperty(properties: Any?, collides: Boolean = definedExternally): Tilemap
    open fun setCollisionByProperty(
        properties: Any?,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun setCollisionByProperty(
        properties: Any?,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun setCollisionByProperty(
        properties: Any?,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun setCollisionByExclusion(
        indexes: Array<Number>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun setCollisionByExclusion(indexes: Array<Number>): Tilemap
    open fun setCollisionByExclusion(indexes: Array<Number>, collides: Boolean = definedExternally): Tilemap
    open fun setCollisionByExclusion(
        indexes: Array<Number>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun setCollisionByExclusion(
        indexes: Array<Number>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun setCollisionByExclusion(
        indexes: Array<Number>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun setCollisionFromCollisionGroup(
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun setCollisionFromCollisionGroup(): Tilemap
    open fun setCollisionFromCollisionGroup(collides: Boolean = definedExternally): Tilemap
    open fun setCollisionFromCollisionGroup(
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tilemap

    open fun setCollisionFromCollisionGroup(
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun setCollisionFromCollisionGroup(
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun setTileIndexCallback(
        indexes: Number,
        callback: Function<*>,
        callbackContext: Any?,
        layer: String = definedExternally
    ): Tilemap

    open fun setTileIndexCallback(indexes: Number, callback: Function<*>, callbackContext: Any?): Tilemap
    open fun setTileIndexCallback(
        indexes: Number,
        callback: Function<*>,
        callbackContext: Any?,
        layer: Number = definedExternally
    ): Tilemap

    open fun setTileIndexCallback(
        indexes: Number,
        callback: Function<*>,
        callbackContext: Any?,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun setTileIndexCallback(
        indexes: Array<Number>,
        callback: Function<*>,
        callbackContext: Any?,
        layer: String = definedExternally
    ): Tilemap

    open fun setTileIndexCallback(indexes: Array<Number>, callback: Function<*>, callbackContext: Any?): Tilemap
    open fun setTileIndexCallback(
        indexes: Array<Number>,
        callback: Function<*>,
        callbackContext: Any?,
        layer: Number = definedExternally
    ): Tilemap

    open fun setTileIndexCallback(
        indexes: Array<Number>,
        callback: Function<*>,
        callbackContext: Any?,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun setTileLocationCallback(
        tileX: Number,
        tileY: Number,
        width: Number,
        height: Number,
        callback: Function<*>,
        callbackContext: Any? = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun setTileLocationCallback(
        tileX: Number,
        tileY: Number,
        width: Number,
        height: Number,
        callback: Function<*>
    ): Tilemap

    open fun setTileLocationCallback(
        tileX: Number,
        tileY: Number,
        width: Number,
        height: Number,
        callback: Function<*>,
        callbackContext: Any? = definedExternally
    ): Tilemap

    open fun setTileLocationCallback(
        tileX: Number,
        tileY: Number,
        width: Number,
        height: Number,
        callback: Function<*>,
        callbackContext: Any? = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun setTileLocationCallback(
        tileX: Number,
        tileY: Number,
        width: Number,
        height: Number,
        callback: Function<*>,
        callbackContext: Any? = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun setLayer(layer: String = definedExternally): Tilemap /* this */
    open fun setLayer(): Tilemap /* this */
    open fun setLayer(layer: Number = definedExternally): Tilemap /* this */
    open fun setLayer(layer: TilemapLayer = definedExternally): Tilemap /* this */
    open fun setBaseTileSize(tileWidth: Number, tileHeight: Number): Tilemap /* this */
    open fun setLayerTileSize(
        tileWidth: Number,
        tileHeight: Number,
        layer: String = definedExternally
    ): Tilemap /* this */

    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number): Tilemap /* this */
    open fun setLayerTileSize(
        tileWidth: Number,
        tileHeight: Number,
        layer: Number = definedExternally
    ): Tilemap /* this */

    open fun setLayerTileSize(
        tileWidth: Number,
        tileHeight: Number,
        layer: TilemapLayer = definedExternally
    ): Tilemap /* this */

    open fun shuffle(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun shuffle(): Tilemap
    open fun shuffle(tileX: Number = definedExternally): Tilemap
    open fun shuffle(tileX: Number = definedExternally, tileY: Number = definedExternally): Tilemap
    open fun shuffle(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Tilemap

    open fun shuffle(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Tilemap

    open fun shuffle(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun shuffle(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun swapByIndex(
        tileA: Number,
        tileB: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun swapByIndex(tileA: Number, tileB: Number): Tilemap
    open fun swapByIndex(tileA: Number, tileB: Number, tileX: Number = definedExternally): Tilemap
    open fun swapByIndex(
        tileA: Number,
        tileB: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally
    ): Tilemap

    open fun swapByIndex(
        tileA: Number,
        tileB: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Tilemap

    open fun swapByIndex(
        tileA: Number,
        tileB: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Tilemap

    open fun swapByIndex(
        tileA: Number,
        tileB: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun swapByIndex(
        tileA: Number,
        tileB: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun tileToWorldX(tileX: Number, camera: Camera = definedExternally, layer: String = definedExternally): Number
    open fun tileToWorldX(tileX: Number): Number
    open fun tileToWorldX(tileX: Number, camera: Camera = definedExternally): Number
    open fun tileToWorldX(tileX: Number, camera: Camera = definedExternally, layer: Number = definedExternally): Number
    open fun tileToWorldX(
        tileX: Number,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Number

    open fun tileToWorldY(tileY: Number, camera: Camera = definedExternally, layer: String = definedExternally): Number
    open fun tileToWorldY(tileY: Number): Number
    open fun tileToWorldY(tileY: Number, camera: Camera = definedExternally): Number
    open fun tileToWorldY(tileY: Number, camera: Camera = definedExternally, layer: Number = definedExternally): Number
    open fun tileToWorldY(
        tileY: Number,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Number

    open fun tileToWorldXY(
        tileX: Number,
        tileY: Number,
        vec2: Vector2 = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Vector2

    open fun tileToWorldXY(tileX: Number, tileY: Number): Vector2
    open fun tileToWorldXY(tileX: Number, tileY: Number, vec2: Vector2 = definedExternally): Vector2
    open fun tileToWorldXY(
        tileX: Number,
        tileY: Number,
        vec2: Vector2 = definedExternally,
        camera: Camera = definedExternally
    ): Vector2

    open fun tileToWorldXY(
        tileX: Number,
        tileY: Number,
        vec2: Vector2 = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Vector2

    open fun tileToWorldXY(
        tileX: Number,
        tileY: Number,
        vec2: Vector2 = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Vector2

    open fun weightedRandomize(
        weightedIndexes: Array<Any?>,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: String = definedExternally
    ): Tilemap

    open fun weightedRandomize(weightedIndexes: Array<Any?>): Tilemap
    open fun weightedRandomize(weightedIndexes: Array<Any?>, tileX: Number = definedExternally): Tilemap
    open fun weightedRandomize(
        weightedIndexes: Array<Any?>,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally
    ): Tilemap

    open fun weightedRandomize(
        weightedIndexes: Array<Any?>,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally
    ): Tilemap

    open fun weightedRandomize(
        weightedIndexes: Array<Any?>,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Tilemap

    open fun weightedRandomize(
        weightedIndexes: Array<Any?>,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: Number = definedExternally
    ): Tilemap

    open fun weightedRandomize(
        weightedIndexes: Array<Any?>,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Tilemap

    open fun worldToTileX(
        worldX: Number,
        snapToFloor: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Number

    open fun worldToTileX(worldX: Number): Number
    open fun worldToTileX(worldX: Number, snapToFloor: Boolean = definedExternally): Number
    open fun worldToTileX(
        worldX: Number,
        snapToFloor: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Number

    open fun worldToTileX(
        worldX: Number,
        snapToFloor: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Number

    open fun worldToTileX(
        worldX: Number,
        snapToFloor: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Number

    open fun worldToTileY(
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Number

    open fun worldToTileY(worldY: Number): Number
    open fun worldToTileY(worldY: Number, snapToFloor: Boolean = definedExternally): Number
    open fun worldToTileY(
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Number

    open fun worldToTileY(
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Number

    open fun worldToTileY(
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Number

    open fun worldToTileXY(
        worldX: Number,
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        vec2: Vector2 = definedExternally,
        camera: Camera = definedExternally,
        layer: String = definedExternally
    ): Vector2

    open fun worldToTileXY(worldX: Number, worldY: Number): Vector2
    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean = definedExternally): Vector2
    open fun worldToTileXY(
        worldX: Number,
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        vec2: Vector2 = definedExternally
    ): Vector2

    open fun worldToTileXY(
        worldX: Number,
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        vec2: Vector2 = definedExternally,
        camera: Camera = definedExternally
    ): Vector2

    open fun worldToTileXY(
        worldX: Number,
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        vec2: Vector2 = definedExternally,
        camera: Camera = definedExternally,
        layer: Number = definedExternally
    ): Vector2

    open fun worldToTileXY(
        worldX: Number,
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        vec2: Vector2 = definedExternally,
        camera: Camera = definedExternally,
        layer: TilemapLayer = definedExternally
    ): Vector2

    open fun destroy()
}

open external class TilemapLayer : GameObject, Alpha, BlendMode, ComputedSize, Depth, Flip, GetBounds, Mask, Origin,
    Pipeline, ScrollFactor, Transform, Visible {
    constructor(
        scene: Scene,
        tilemap: Tilemap,
        layerIndex: Number,
        tileset: String,
        x: Number = definedExternally,
        y: Number = definedExternally
    )

    constructor(scene: Scene, tilemap: Tilemap, layerIndex: Number, tileset: String)
    constructor(scene: Scene, tilemap: Tilemap, layerIndex: Number, tileset: String, x: Number = definedExternally)
    constructor(
        scene: Scene,
        tilemap: Tilemap,
        layerIndex: Number,
        tileset: Array<String>,
        x: Number = definedExternally,
        y: Number = definedExternally
    )

    constructor(scene: Scene, tilemap: Tilemap, layerIndex: Number, tileset: Array<String>)
    constructor(
        scene: Scene,
        tilemap: Tilemap,
        layerIndex: Number,
        tileset: Array<String>,
        x: Number = definedExternally
    )

    constructor(
        scene: Scene,
        tilemap: Tilemap,
        layerIndex: Number,
        tileset: Tileset,
        x: Number = definedExternally,
        y: Number = definedExternally
    )

    constructor(scene: Scene, tilemap: Tilemap, layerIndex: Number, tileset: Tileset)
    constructor(scene: Scene, tilemap: Tilemap, layerIndex: Number, tileset: Tileset, x: Number = definedExternally)
    constructor(
        scene: Scene,
        tilemap: Tilemap,
        layerIndex: Number,
        tileset: Array<Tileset>,
        x: Number = definedExternally,
        y: Number = definedExternally
    )

    constructor(scene: Scene, tilemap: Tilemap, layerIndex: Number, tileset: Array<Tileset>)
    constructor(
        scene: Scene,
        tilemap: Tilemap,
        layerIndex: Number,
        tileset: Array<Tileset>,
        x: Number = definedExternally
    )

    open val isTilemap: Boolean
    open var tilemap: Tilemap
    open var layerIndex: Number
    open var layer: LayerData
    open var tileset: Array<Tileset>
    open val tilesDrawn: Number
    open val tilesTotal: Number
    open var culledTiles: Array<Tile>
    open var skipCull: Boolean
    open var cullPaddingX: Number
    open var cullPaddingY: Number
    open var cullCallback: Function<*>
    open var gidMap: Array<Tileset>
    open fun setRenderOrder(renderOrder: Number): TilemapLayer /* this */
    open fun setRenderOrder(renderOrder: String): TilemapLayer /* this */
    open fun calculateFacesAt(tileX: Number, tileY: Number): TilemapLayer /* this */
    open fun calculateFacesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): TilemapLayer /* this */

    open fun createFromTiles(
        indexes: Number,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(indexes: Number, replacements: Number): Array<Sprite>
    open fun createFromTiles(
        indexes: Number,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally,
        scene: Scene = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(indexes: Number, replacements: Array<Any>): Array<Sprite>
    open fun createFromTiles(
        indexes: Number,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Number,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally,
        scene: Scene = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(indexes: Array<Any>, replacements: Number): Array<Sprite>
    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Number,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally,
        scene: Scene = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally,
        scene: Scene = definedExternally,
        camera: Camera = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(indexes: Array<Any>, replacements: Array<Any>): Array<Sprite>
    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally
    ): Array<Sprite>

    open fun createFromTiles(
        indexes: Array<Any>,
        replacements: Array<Any>,
        spriteConfig: GameObjectConfig /* Phaser.Types.GameObjects.GameObjectConfig & `T$10` */ = definedExternally,
        scene: Scene = definedExternally
    ): Array<Sprite>

    open fun cull(camera: Camera = definedExternally): Array<Tile>
    open fun copy(
        srcTileX: Number,
        srcTileY: Number,
        width: Number,
        height: Number,
        destTileX: Number,
        destTileY: Number,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun fill(
        index: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun filterTiles(
        callback: Function<*>,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally
    ): Array<Tile>

    open fun findByIndex(index: Number, skip: Number = definedExternally, reverse: Boolean = definedExternally): Tile
    open fun findTile(
        callback: FindTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally
    ): Tile

    open fun forEachTile(
        callback: EachTileCallback,
        context: Any? = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally
    ): TilemapLayer /* this */

    open fun setTint(
        tint: Number = definedExternally,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally
    ): TilemapLayer /* this */

    open fun getTileAt(tileX: Number, tileY: Number, nonNull: Boolean = definedExternally): Tile
    open fun getTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        nonNull: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Tile

    open fun getTilesWithin(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        filteringOptions: FilteringOptions = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(
        shape: Circle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(shape: Circle): Array<Tile>
    open fun getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun getTilesWithinShape(
        shape: Line,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(shape: Line): Array<Tile>
    open fun getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun getTilesWithinShape(
        shape: Rectangle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(shape: Rectangle): Array<Tile>
    open fun getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun getTilesWithinShape(
        shape: Triangle,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally
    ): Array<Tile>

    open fun getTilesWithinShape(shape: Triangle): Array<Tile>
    open fun getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions = definedExternally): Array<Tile>
    open fun getTilesWithinWorldXY(
        worldX: Number,
        worldY: Number,
        width: Number,
        height: Number,
        filteringOptions: FilteringOptions = definedExternally,
        camera: Camera = definedExternally
    ): Array<Tile>

    open fun hasTileAt(tileX: Number, tileY: Number): Boolean
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: Camera = definedExternally): Boolean
    open fun putTileAt(tile: Number, tileX: Number, tileY: Number, recalculateFaces: Boolean = definedExternally): Tile
    open fun putTileAt(tile: Number, tileX: Number, tileY: Number): Tile
    open fun putTileAt(tile: Tile, tileX: Number, tileY: Number, recalculateFaces: Boolean = definedExternally): Tile
    open fun putTileAt(tile: Tile, tileX: Number, tileY: Number): Tile
    open fun putTileAtWorldXY(
        tile: Number,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Tile

    open fun putTileAtWorldXY(tile: Number, worldX: Number, worldY: Number): Tile
    open fun putTileAtWorldXY(
        tile: Number,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally
    ): Tile

    open fun putTileAtWorldXY(
        tile: Tile,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Tile

    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number): Tile
    open fun putTileAtWorldXY(
        tile: Tile,
        worldX: Number,
        worldY: Number,
        recalculateFaces: Boolean = definedExternally
    ): Tile

    open fun putTilesAt(
        tile: Array<Number>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun putTilesAt(tile: Array<Number>, tileX: Number, tileY: Number): TilemapLayer /* this */
    open fun putTilesAt(
        tile: Array<Array<Number>>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun putTilesAt(tile: Array<Array<Number>>, tileX: Number, tileY: Number): TilemapLayer /* this */
    open fun putTilesAt(
        tile: Array<Tile>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun putTilesAt(tile: Array<Tile>, tileX: Number, tileY: Number): TilemapLayer /* this */
    open fun putTilesAt(
        tile: Array<Array<Tile>>,
        tileX: Number,
        tileY: Number,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun putTilesAt(tile: Array<Array<Tile>>, tileX: Number, tileY: Number): TilemapLayer /* this */
    open fun randomize(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        indexes: Array<Number> = definedExternally
    ): TilemapLayer /* this */

    open fun removeTileAt(
        tileX: Number,
        tileY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): Tile

    open fun removeTileAtWorldXY(
        worldX: Number,
        worldY: Number,
        replaceWithNull: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Tile

    open fun renderDebug(graphics: Graphics, styleConfig: StyleConfig = definedExternally): TilemapLayer /* this */
    open fun replaceByIndex(
        findIndex: Number,
        newIndex: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): TilemapLayer /* this */

    open fun setSkipCull(value: Boolean = definedExternally): TilemapLayer /* this */
    open fun setCullPadding(
        paddingX: Number = definedExternally,
        paddingY: Number = definedExternally
    ): TilemapLayer /* this */

    open fun setCollision(
        indexes: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        updateLayer: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun setCollision(indexes: Number): TilemapLayer /* this */
    open fun setCollision(indexes: Number, collides: Boolean = definedExternally): TilemapLayer /* this */
    open fun setCollision(
        indexes: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun setCollision(
        indexes: Array<Any>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally,
        updateLayer: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun setCollision(indexes: Array<Any>): TilemapLayer /* this */
    open fun setCollision(indexes: Array<Any>, collides: Boolean = definedExternally): TilemapLayer /* this */
    open fun setCollision(
        indexes: Array<Any>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun setCollisionBetween(
        start: Number,
        stop: Number,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun setCollisionByProperty(
        properties: Any?,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun setCollisionByExclusion(
        indexes: Array<Number>,
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun setCollisionFromCollisionGroup(
        collides: Boolean = definedExternally,
        recalculateFaces: Boolean = definedExternally
    ): TilemapLayer /* this */

    open fun setTileIndexCallback(
        indexes: Number,
        callback: Function<*>,
        callbackContext: Any?
    ): TilemapLayer /* this */

    open fun setTileIndexCallback(
        indexes: Array<Number>,
        callback: Function<*>,
        callbackContext: Any?
    ): TilemapLayer /* this */

    open fun setTileLocationCallback(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        callback: Function<*> = definedExternally,
        callbackContext: Any? = definedExternally
    ): TilemapLayer /* this */

    open fun shuffle(
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): TilemapLayer /* this */

    open fun swapByIndex(
        tileA: Number,
        tileB: Number,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): TilemapLayer /* this */

    open fun tileToWorldX(tileX: Number, camera: Camera = definedExternally): Number
    open fun tileToWorldY(tileY: Number, camera: Camera = definedExternally): Number
    open fun tileToWorldXY(
        tileX: Number,
        tileY: Number,
        point: Vector2 = definedExternally,
        camera: Camera = definedExternally
    ): Vector2

    open fun weightedRandomize(
        weightedIndexes: Array<Any?>,
        tileX: Number = definedExternally,
        tileY: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): TilemapLayer /* this */

    open fun worldToTileX(
        worldX: Number,
        snapToFloor: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Number

    open fun worldToTileY(
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        camera: Camera = definedExternally
    ): Number

    open fun worldToTileXY(
        worldX: Number,
        worldY: Number,
        snapToFloor: Boolean = definedExternally,
        point: Vector2 = definedExternally,
        camera: Camera = definedExternally
    ): Vector2

    override fun destroy(fromScene: Boolean)
    override fun clearAlpha(): TilemapLayer /* this */
    override fun setAlpha(
        topLeft: Number,
        topRight: Number,
        bottomLeft: Number,
        bottomRight: Number
    ): TilemapLayer /* this */

    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* Phaser.BlendModes | String */
    override fun setBlendMode(value: String): dynamic /* TilemapLayer | BlendMode */
    override fun setBlendMode(value: BlendModes): dynamic /* TilemapLayer | BlendMode */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override fun setSize(width: Number, height: Number): TilemapLayer /* this */
    override fun setDisplaySize(width: Number, height: Number): TilemapLayer /* this */
    override var depth: Number
    override fun setDepth(value: Number): TilemapLayer /* this */
    override var flipX: Boolean
    override var flipY: Boolean
    override fun toggleFlipX(): TilemapLayer /* this */
    override fun toggleFlipY(): TilemapLayer /* this */
    override fun setFlipX(value: Boolean): TilemapLayer /* this */
    override fun setFlipY(value: Boolean): TilemapLayer /* this */
    override fun setFlip(x: Boolean, y: Boolean): TilemapLayer /* this */
    override fun resetFlip(): TilemapLayer /* this */
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
    override fun setMask(mask: BitmapMask): dynamic /* TilemapLayer | Mask */
    override fun setMask(mask: GeometryMask): dynamic /* TilemapLayer | Mask */
    override fun clearMask(destroyMask: Boolean): TilemapLayer /* this */
    override fun createBitmapMask(renderable: GameObject): BitmapMask
    override fun createGeometryMask(graphics: Graphics): GeometryMask
    override fun createGeometryMask(): GeometryMask
    override fun createGeometryMask(graphics: Shape): GeometryMask
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override fun setOrigin(x: Number, y: Number): TilemapLayer /* this */
    override fun setOriginFromFrame(): TilemapLayer /* this */
    override fun setDisplayOrigin(x: Number, y: Number): TilemapLayer /* this */
    override fun updateDisplayOrigin(): TilemapLayer /* this */
    override var defaultPipeline: WebGLPipeline
    override var pipeline: WebGLPipeline
    override var hasPostPipeline: Boolean
    override var postPipelines: Array<PostFXPipeline>
    override var pipelineData: Any?
    override fun initPipeline(pipeline: String): Boolean
    override fun initPipeline(pipeline: WebGLPipeline): Boolean
    override fun setPipeline(
        pipeline: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TilemapLayer | Pipeline */

    override fun setPipeline(pipeline: String): dynamic /* TilemapLayer | Pipeline */
    override fun setPipeline(pipeline: String, pipelineData: Any?): dynamic /* TilemapLayer | Pipeline */
    override fun setPipeline(
        pipeline: WebGLPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TilemapLayer | Pipeline */

    override fun setPipeline(pipeline: WebGLPipeline): dynamic /* TilemapLayer | Pipeline */
    override fun setPipeline(pipeline: WebGLPipeline, pipelineData: Any?): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(
        pipelines: String,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TilemapLayer | Pipeline */

    override fun setPostPipeline(pipelines: String): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(pipelines: String, pipelineData: Any?): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<String>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TilemapLayer | Pipeline */

    override fun setPostPipeline(pipelines: Array<String>): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(pipelines: Array<String>, pipelineData: Any?): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(
        pipelines: Function<*>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TilemapLayer | Pipeline */

    override fun setPostPipeline(pipelines: Function<*>): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(pipelines: Function<*>, pipelineData: Any?): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TilemapLayer | Pipeline */

    override fun setPostPipeline(pipelines: Array<Function<*>>): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<Function<*>>,
        pipelineData: Any?
    ): dynamic /* TilemapLayer | Pipeline */

    override fun setPostPipeline(
        pipelines: PostFXPipeline,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TilemapLayer | Pipeline */

    override fun setPostPipeline(pipelines: PostFXPipeline): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(pipelines: PostFXPipeline, pipelineData: Any?): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?,
        copyData: Boolean
    ): dynamic /* TilemapLayer | Pipeline */

    override fun setPostPipeline(pipelines: Array<PostFXPipeline>): dynamic /* TilemapLayer | Pipeline */
    override fun setPostPipeline(
        pipelines: Array<PostFXPipeline>,
        pipelineData: Any?
    ): dynamic /* TilemapLayer | Pipeline */

    override fun setPipelineData(key: String, value: Any): TilemapLayer /* this */
    override fun getPostPipeline(pipeline: String): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: Function<*>): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun getPostPipeline(pipeline: PostFXPipeline): dynamic /* Phaser.Renderer.WebGL.Pipelines.PostFXPipeline | Array<Phaser.Renderer.WebGL.Pipelines.PostFXPipeline> */
    override fun resetPipeline(resetPostPipelines: Boolean, resetData: Boolean): Boolean
    override fun resetPostPipeline(resetData: Boolean)
    override fun removePostPipeline(pipeline: String): dynamic /* TilemapLayer | Pipeline */
    override fun removePostPipeline(pipeline: PostFXPipeline): dynamic /* TilemapLayer | Pipeline */
    override fun getPipelineName(): String
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun setScrollFactor(x: Number, y: Number): TilemapLayer /* this */
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
    override fun setPosition(x: Number, y: Number, z: Number, w: Number): TilemapLayer /* this */
    override fun copyPosition(source: Vector2Like): dynamic /* TilemapLayer | Transform */
    override fun copyPosition(source: Vector3Like): dynamic /* TilemapLayer | Transform */
    override fun copyPosition(source: Vector4Like): dynamic /* TilemapLayer | Transform */
    override fun setRandomPosition(x: Number, y: Number, width: Number, height: Number): TilemapLayer /* this */
    override fun setRotation(radians: Number): TilemapLayer /* this */
    override fun setAngle(degrees: Number): TilemapLayer /* this */
    override fun setScale(x: Number, y: Number): TilemapLayer /* this */
    override fun setX(value: Number): TilemapLayer /* this */
    override fun setY(value: Number): TilemapLayer /* this */
    override fun setZ(value: Number): TilemapLayer /* this */
    override fun setW(value: Number): TilemapLayer /* this */
    override fun getLocalTransformMatrix(tempMatrix: TransformMatrix): TransformMatrix
    override fun getWorldTransformMatrix(tempMatrix: TransformMatrix, parentMatrix: TransformMatrix): TransformMatrix
    override fun getLocalPoint(x: Number, y: Number, point: Vector2, camera: Camera): Vector2
    override fun getParentRotation(): Number
    override var visible: Boolean
    override fun setVisible(value: Boolean): TilemapLayer /* this */
}

open external class Tileset(
    name: String,
    firstgid: Number,
    tileWidth: Number = definedExternally,
    tileHeight: Number = definedExternally,
    tileMargin: Number = definedExternally,
    tileSpacing: Number = definedExternally,
    tileProperties: Any? = definedExternally,
    tileData: Any? = definedExternally,
    tileOffset: Any? = definedExternally
) {
    open var name: String
    open var firstgid: Number
    open val tileWidth: Number
    open val tileHeight: Number
    open val tileMargin: Number
    open val tileSpacing: Number
    open var tileProperties: Any?
    open var tileData: Any?
    open var tileOffset: Vector2
    open val image: Texture
    open val glTexture: WebGLTexture
    open val rows: Number
    open val columns: Number
    open val total: Number
    open val texCoordinates: Array<Any?>
    open fun getTileProperties(tileIndex: Number): Any?
    open fun getTileData(tileIndex: Number): Any?
    open fun getTileCollisionGroup(tileIndex: Number): Any?
    open fun containsTileIndex(tileIndex: Number): Boolean
    open fun getTileTextureCoordinates(tileIndex: Number): Any?
    open fun setImage(texture: Texture): Tileset
    open fun setTileSize(tileWidth: Number = definedExternally, tileHeight: Number = definedExternally): Tileset
    open fun setSpacing(margin: Number = definedExternally, spacing: Number = definedExternally): Tileset
    open fun updateTileData(imageWidth: Number, imageHeight: Number): Tileset
}

external var ORTHOGONAL: Number

external var ISOMETRIC: Number

external var STAGGERED: Number

external var HEXAGONAL: Number
