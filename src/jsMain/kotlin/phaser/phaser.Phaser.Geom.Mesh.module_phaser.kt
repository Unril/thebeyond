@file:JsQualifier("Phaser.Geom.Mesh")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Geom.Mesh

import Phaser.Cameras.Scene2D.Camera
import Phaser.GameObjects.Components.TransformMatrix
import Phaser.GameObjects.Mesh
import Phaser.Geom.Rectangle
import Phaser.Math.Matrix4
import Phaser.Math.Vector2
import Phaser.Math.Vector3
import Phaser.Types.Geom.Mesh.GenerateGridConfig
import Phaser.Types.Geom.Mesh.GenerateGridVertsResult
import Phaser.Types.Geom.Mesh.GenerateVertsResult
import Phaser.Types.Geom.Mesh.OBJData
import org.khronos.webgl.Float32Array
import org.khronos.webgl.Uint32Array

open external class Face(vertex1: Vertex, vertex2: Vertex, vertex3: Vertex) {
    open var vertex1: Vertex
    open var vertex2: Vertex
    open var vertex3: Vertex
    open var bounds: Rectangle
    open fun getInCenter(local: Boolean = definedExternally): Vector2
    open fun contains(x: Number, y: Number, calcMatrix: TransformMatrix = definedExternally): Boolean
    open fun isCounterClockwise(z: Number): Boolean
    open fun load(F32: Float32Array, U32: Uint32Array, offset: Number, textureUnit: Number, tintEffect: Number): Number
    open fun transformCoordinatesLocal(
        transformMatrix: Matrix4,
        width: Number,
        height: Number,
        cameraZ: Number
    ): Face /* this */

    open fun updateBounds(): Face /* this */
    open fun isInView(
        camera: Camera,
        hideCCW: Boolean,
        z: Number,
        alpha: Number,
        a: Number,
        b: Number,
        c: Number,
        d: Number,
        e: Number,
        f: Number,
        roundPixels: Boolean
    ): Boolean

    open fun translate(x: Number, y: Number = definedExternally): Face /* this */
    open var x: Number
    open var y: Number
    open var alpha: Number
    open val depth: Number
    open fun destroy()
}

external fun GenerateGridVerts(config: GenerateGridConfig): GenerateGridVertsResult

external fun GenerateObjVerts(
    data: OBJData,
    mesh: Mesh = definedExternally,
    scale: Number = definedExternally,
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally,
    rotateX: Number = definedExternally,
    rotateY: Number = definedExternally,
    rotateZ: Number = definedExternally,
    zIsUp: Boolean = definedExternally
): GenerateVertsResult

external fun GenerateVerts(
    vertices: Array<Number>,
    uvs: Array<Number>,
    indicies: Array<Number> = definedExternally,
    containsZ: Boolean = definedExternally,
    normals: Array<Number> = definedExternally,
    colors: Number = definedExternally,
    alphas: Number = definedExternally
): GenerateVertsResult

external fun GenerateVerts(vertices: Array<Number>, uvs: Array<Number>): GenerateVertsResult

external fun GenerateVerts(
    vertices: Array<Number>,
    uvs: Array<Number>,
    indicies: Array<Number> = definedExternally
): GenerateVertsResult

external fun GenerateVerts(
    vertices: Array<Number>,
    uvs: Array<Number>,
    indicies: Array<Number> = definedExternally,
    containsZ: Boolean = definedExternally
): GenerateVertsResult

external fun GenerateVerts(
    vertices: Array<Number>,
    uvs: Array<Number>,
    indicies: Array<Number> = definedExternally,
    containsZ: Boolean = definedExternally,
    normals: Array<Number> = definedExternally
): GenerateVertsResult

external fun GenerateVerts(
    vertices: Array<Number>,
    uvs: Array<Number>,
    indicies: Array<Number> = definedExternally,
    containsZ: Boolean = definedExternally,
    normals: Array<Number> = definedExternally,
    colors: Number = definedExternally
): GenerateVertsResult

external fun GenerateVerts(
    vertices: Array<Number>,
    uvs: Array<Number>,
    indicies: Array<Number> = definedExternally,
    containsZ: Boolean = definedExternally,
    normals: Array<Number> = definedExternally,
    colors: Number = definedExternally,
    alphas: Array<Number> = definedExternally
): GenerateVertsResult

external fun GenerateVerts(
    vertices: Array<Number>,
    uvs: Array<Number>,
    indicies: Array<Number> = definedExternally,
    containsZ: Boolean = definedExternally,
    normals: Array<Number> = definedExternally,
    colors: Array<Number> = definedExternally,
    alphas: Number = definedExternally
): GenerateVertsResult

external fun GenerateVerts(
    vertices: Array<Number>,
    uvs: Array<Number>,
    indicies: Array<Number> = definedExternally,
    containsZ: Boolean = definedExternally,
    normals: Array<Number> = definedExternally,
    colors: Array<Number> = definedExternally
): GenerateVertsResult

external fun GenerateVerts(
    vertices: Array<Number>,
    uvs: Array<Number>,
    indicies: Array<Number> = definedExternally,
    containsZ: Boolean = definedExternally,
    normals: Array<Number> = definedExternally,
    colors: Array<Number> = definedExternally,
    alphas: Array<Number> = definedExternally
): GenerateVertsResult

external fun ParseObj(data: String, flipUV: Boolean = definedExternally): OBJData

external fun ParseObjMaterial(mtl: String): Any?

external fun RotateFace(face: Face, angle: Number, cx: Number = definedExternally, cy: Number = definedExternally)

open external class Vertex(
    x: Number,
    y: Number,
    z: Number,
    u: Number,
    v: Number,
    color: Number = definedExternally,
    alpha: Number = definedExternally,
    nx: Number = definedExternally,
    ny: Number = definedExternally,
    nz: Number = definedExternally
) : Vector3 {
    open var vx: Number
    open var vy: Number
    open var vz: Number
    open var nx: Number
    open var ny: Number
    open var nz: Number
    open var u: Number
    open var v: Number
    open var color: Number
    open var alpha: Number
    open var tx: Number
    open var ty: Number
    open var ta: Number
    open fun setUVs(u: Number, v: Number): Vertex /* this */
    open fun transformCoordinatesLocal(transformMatrix: Matrix4, width: Number, height: Number, cameraZ: Number)
    open fun update(
        a: Number,
        b: Number,
        c: Number,
        d: Number,
        e: Number,
        f: Number,
        roundPixels: Boolean,
        alpha: Number
    ): Vertex /* this */

    open fun load(F32: Float32Array, U32: Uint32Array, offset: Number, textureUnit: Number, tintEffect: Number): Number
}
