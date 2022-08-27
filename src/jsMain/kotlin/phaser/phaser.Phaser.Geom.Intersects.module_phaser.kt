@file:JsQualifier("Phaser.Geom.Intersects")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Geom.Intersects

import Phaser.Geom.*
import Phaser.Math.Vector2
import Phaser.Math.Vector3
import Phaser.Math.Vector4

external fun CircleToCircle(circleA: Circle, circleB: Circle): Boolean

external fun CircleToRectangle(circle: Circle, rect: Rectangle): Boolean

external fun GetCircleToCircle(circleA: Circle, circleB: Circle, out: Array<Any> = definedExternally): Array<Any>

external fun GetCircleToRectangle(circle: Circle, rect: Rectangle, out: Array<Any> = definedExternally): Array<Any>

external fun GetLineToCircle(line: Line, circle: Circle, out: Array<Any> = definedExternally): Array<Any>

external fun GetLineToLine(
    line1: Line,
    line2: Line,
    isRay: Boolean = definedExternally,
    out: Vector3 = definedExternally
): Vector3

external fun GetLineToPoints(
    line: Line,
    points: Array<Vector2>,
    isRay: Boolean = definedExternally,
    out: Vector3 = definedExternally
): Vector3

external fun GetLineToPoints(line: Line, points: Array<Vector2>): Vector3

external fun GetLineToPoints(line: Line, points: Array<Vector2>, isRay: Boolean = definedExternally): Vector3

external fun GetLineToPoints(
    line: Line,
    points: Array<Point>,
    isRay: Boolean = definedExternally,
    out: Vector3 = definedExternally
): Vector3

external fun GetLineToPoints(line: Line, points: Array<Point>): Vector3

external fun GetLineToPoints(line: Line, points: Array<Point>, isRay: Boolean = definedExternally): Vector3

external fun GetLineToPolygon(
    line: Line,
    polygons: Polygon,
    isRay: Boolean = definedExternally,
    out: Vector4 = definedExternally
): Vector4

external fun GetLineToPolygon(line: Line, polygons: Polygon): Vector4

external fun GetLineToPolygon(line: Line, polygons: Polygon, isRay: Boolean = definedExternally): Vector4

external fun GetLineToPolygon(
    line: Line,
    polygons: Array<Polygon>,
    isRay: Boolean = definedExternally,
    out: Vector4 = definedExternally
): Vector4

external fun GetLineToPolygon(line: Line, polygons: Array<Polygon>): Vector4

external fun GetLineToPolygon(line: Line, polygons: Array<Polygon>, isRay: Boolean = definedExternally): Vector4

external fun GetLineToRectangle(line: Line, rect: Rectangle?, out: Array<Any> = definedExternally): Array<Any>

external fun GetLineToRectangle(line: Line, rect: Rectangle?): Array<Any>

external fun GetLineToRectangle(line: Line, rect: Any?, out: Array<Any> = definedExternally): Array<Any>

external fun GetLineToRectangle(line: Line, rect: Any?): Array<Any>

external fun GetRaysFromPointToPolygon(x: Number, y: Number, polygons: Polygon): Array<Vector4>

external fun GetRaysFromPointToPolygon(x: Number, y: Number, polygons: Array<Polygon>): Array<Vector4>

external fun <O : Rectangle> GetRectangleIntersection(
    rectA: Rectangle,
    rectB: Rectangle,
    output: O = definedExternally
): O

external fun GetRectangleToRectangle(
    rectA: Rectangle,
    rectB: Rectangle,
    out: Array<Any> = definedExternally
): Array<Any>

external fun GetRectangleToTriangle(
    rect: Rectangle,
    triangle: Triangle,
    out: Array<Any> = definedExternally
): Array<Any>

external fun GetTriangleToCircle(triangle: Triangle, circle: Circle, out: Array<Any> = definedExternally): Array<Any>

external fun GetTriangleToLine(triangle: Triangle, line: Line, out: Array<Any> = definedExternally): Array<Any>

external fun GetTriangleToTriangle(
    triangleA: Triangle,
    triangleB: Triangle,
    out: Array<Any> = definedExternally
): Array<Any>

external fun LineToCircle(line: Line, circle: Circle, nearest: Point = definedExternally): Boolean

external fun LineToCircle(line: Line, circle: Circle): Boolean

external fun LineToCircle(line: Line, circle: Circle, nearest: Any = definedExternally): Boolean

external fun LineToLine(line1: Line, line2: Line, out: Point = definedExternally): Boolean

external fun LineToRectangle(line: Line, rect: Rectangle?): Boolean

external fun LineToRectangle(line: Line, rect: Any?): Boolean

external fun PointToLine(point: Point, line: Line, lineThickness: Number = definedExternally): Boolean

external fun PointToLine(point: Point, line: Line): Boolean

external fun PointToLine(point: Any, line: Line, lineThickness: Number = definedExternally): Boolean

external fun PointToLine(point: Any, line: Line): Boolean

external fun PointToLineSegment(point: Point, line: Line): Boolean

external fun RectangleToRectangle(rectA: Rectangle, rectB: Rectangle): Boolean

external fun RectangleToTriangle(rect: Rectangle, triangle: Triangle): Boolean

external fun RectangleToValues(
    rect: Rectangle,
    left: Number,
    right: Number,
    top: Number,
    bottom: Number,
    tolerance: Number = definedExternally
): Boolean

external fun TriangleToCircle(triangle: Triangle, circle: Circle): Boolean

external fun TriangleToLine(triangle: Triangle, line: Line): Boolean

external fun TriangleToTriangle(triangleA: Triangle, triangleB: Triangle): Boolean
