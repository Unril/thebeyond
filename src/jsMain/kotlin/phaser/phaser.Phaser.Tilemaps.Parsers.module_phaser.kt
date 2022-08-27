@file:JsQualifier("Phaser.Tilemaps.Parsers")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Tilemaps.Parsers

import Phaser.Tilemaps.MapData
import Phaser.Tilemaps.OrientationType61

external fun FromOrientationString(orientation: String = definedExternally): OrientationType61

external fun Parse(
    name: String,
    mapFormat: Number,
    data: Array<Array<Number>>?,
    tileWidth: Number,
    tileHeight: Number,
    insertNull: Boolean
): MapData

external fun Parse(
    name: String,
    mapFormat: Number,
    data: String?,
    tileWidth: Number,
    tileHeight: Number,
    insertNull: Boolean
): MapData

external fun Parse(
    name: String,
    mapFormat: Number,
    data: Any?,
    tileWidth: Number,
    tileHeight: Number,
    insertNull: Boolean
): MapData

external fun Parse2DArray(
    name: String,
    data: Array<Array<Number>>,
    tileWidth: Number,
    tileHeight: Number,
    insertNull: Boolean
): MapData

external fun ParseCSV(name: String, data: String, tileWidth: Number, tileHeight: Number, insertNull: Boolean): MapData
