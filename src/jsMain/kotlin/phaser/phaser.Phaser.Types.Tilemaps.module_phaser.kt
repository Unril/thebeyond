@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Tilemaps

import Phaser.Display.Color
import Phaser.GameObjects.Container
import Phaser.Scene
import Phaser.Tilemaps.LayerData
import Phaser.Tilemaps.TilemapLayer
import Phaser.Tilemaps.Tileset
import Phaser.Types.Math.Vector2Like

external interface CreateFromObjectLayerConfig {
    var id: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gid: Number?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var classType: CreateFromObjectsClassTypeConstructor?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreTileset: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scene: Scene?
        get() = definedExternally
        set(value) = definedExternally
    var container: Container?
        get() = definedExternally
        set(value) = definedExternally
    var key: dynamic /* String? | Phaser.Textures.Texture? */
        get() = definedExternally
        set(value) = definedExternally
    var frame: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

typealias CreateFromObjectsClassTypeConstructor = (scene: Scene) -> Unit

external interface DebugStyleOptions {

}


inline operator fun DebugStyleOptions.get(key: String): Color? = asDynamic()[key]


inline operator fun DebugStyleOptions.set(key: String, value: Color?) {
    asDynamic()[key] = value
}

external interface FilteringOptions {
    var isNotEmpty: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isColliding: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasInterestingFace: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GIDData {
    var gid: Number
    var flippedHorizontal: Boolean
    var flippedVertical: Boolean
    var flippedAntiDiagonal: Boolean
    var rotation: Number
    var flipped: Boolean
}

external interface LayerDataConfig {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var baseTileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var baseTileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var widthInPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var heightInPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var properties: Array<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var indexes: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var collideIndexes: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var callbacks: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var bodies: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var tilemapLayer: TilemapLayer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MapDataConfig {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var widthInPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var heightInPixels: Number?
        get() = definedExternally
        set(value) = definedExternally
    var format: Number?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: String?
        get() = definedExternally
        set(value) = definedExternally
    var renderOrder: String?
        get() = definedExternally
        set(value) = definedExternally
    var version: Number?
        get() = definedExternally
        set(value) = definedExternally
    var properties: Number?
        get() = definedExternally
        set(value) = definedExternally
    var layers: Array<LayerData>?
        get() = definedExternally
        set(value) = definedExternally
    var images: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var objects: Any?
        get() = definedExternally
        set(value) = definedExternally
    var collision: Any?
        get() = definedExternally
        set(value) = definedExternally
    var tilesets: Array<Tileset>?
        get() = definedExternally
        set(value) = definedExternally
    var imageCollections: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var tiles: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ObjectLayerConfig {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var properties: Any?
        get() = definedExternally
        set(value) = definedExternally
    var propertytypes: Any?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var objects: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StyleConfig {
    var tileColor: dynamic /* Phaser.Display.Color? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var collidingTileColor: dynamic /* Phaser.Display.Color? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var faceColor: dynamic /* Phaser.Display.Color? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TiledObject {
    var id: Number
    var name: String
    var type: String
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var properties: Any?
        get() = definedExternally
        set(value) = definedExternally
    var gid: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flippedHorizontal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flippedVertical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flippedAntiDiagonal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var polyline: Array<Vector2Like>?
        get() = definedExternally
        set(value) = definedExternally
    var polygon: Array<Vector2Like>?
        get() = definedExternally
        set(value) = definedExternally
    var text: Any?
        get() = definedExternally
        set(value) = definedExternally
    var rectangle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ellipse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var point: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TilemapConfig {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Array<Number>>?
        get() = definedExternally
        set(value) = definedExternally
    var tileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var insertNull: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}
