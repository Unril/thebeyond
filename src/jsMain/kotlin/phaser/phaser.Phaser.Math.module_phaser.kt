@file:JsQualifier("Phaser.Math")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Math

import Phaser.Geom.Point
import Phaser.Types.Math.SinCosTable
import Phaser.Types.Math.Vector2Like
import org.khronos.webgl.Float32Array

external fun Average(values: Array<Number>): Number

external fun Bernstein(n: Number, i: Number): Number

external fun Between(min: Number, max: Number): Number

external fun CatmullRom(t: Number, p0: Number, p1: Number, p2: Number, p3: Number): Number

external fun CeilTo(value: Number, place: Number = definedExternally, base: Number = definedExternally): Number

external fun Clamp(value: Number, min: Number, max: Number): Number

external var PI2: Number

external var TAU: Number

external var EPSILON: Number

external var DEG_TO_RAD: Number

external var RAD_TO_DEG: Number

external var RND: RandomDataGenerator

external var MIN_SAFE_INTEGER: Number

external var MAX_SAFE_INTEGER: Number

external fun DegToRad(degrees: Number): Number

external fun Difference(a: Number, b: Number): Number

open external class Euler(x: Number = definedExternally, y: Number = definedExternally, z: Number = definedExternally)

external fun Factorial(value: Number): Number

external fun FloatBetween(min: Number, max: Number): Number

external fun FloorTo(value: Number, place: Number = definedExternally, base: Number = definedExternally): Number

external fun FromPercent(percent: Number, min: Number, max: Number = definedExternally): Number

external fun GetSpeed(distance: Number, time: Number): Number

external fun IsEven(value: Number): Boolean

external fun IsEvenStrict(value: Number): Boolean

external fun Linear(p0: Number, p1: Number, t: Number): Number

external fun LinearXY(vector1: Vector2, vector2: Vector2, t: Number = definedExternally): Vector2

open external class Matrix3(m: Matrix3 = definedExternally) {
    open var `val`: Float32Array
    open fun clone(): Matrix3
    open fun set(src: Matrix3): Matrix3
    open fun copy(src: Matrix3): Matrix3
    open fun fromMat4(m: Matrix4): Matrix3
    open fun fromArray(a: Array<Any>): Matrix3
    open fun identity(): Matrix3
    open fun transpose(): Matrix3
    open fun invert(): Matrix3
    open fun adjoint(): Matrix3
    open fun determinant(): Number
    open fun multiply(src: Matrix3): Matrix3
    open fun translate(v: Vector2): Matrix3
    open fun translate(v: Vector3): Matrix3
    open fun translate(v: Vector4): Matrix3
    open fun rotate(rad: Number): Matrix3
    open fun scale(v: Vector2): Matrix3
    open fun scale(v: Vector3): Matrix3
    open fun scale(v: Vector4): Matrix3
    open fun fromQuat(q: Quaternion): Matrix3
    open fun normalFromMat4(m: Matrix4): Matrix3
}

open external class Matrix4(m: Matrix4 = definedExternally) {
    open var `val`: Float32Array
    open fun clone(): Matrix4
    open fun set(src: Matrix4): Matrix4 /* this */
    open fun setValues(
        m00: Number,
        m01: Number,
        m02: Number,
        m03: Number,
        m10: Number,
        m11: Number,
        m12: Number,
        m13: Number,
        m20: Number,
        m21: Number,
        m22: Number,
        m23: Number,
        m30: Number,
        m31: Number,
        m32: Number,
        m33: Number
    ): Matrix4 /* this */

    open fun copy(src: Matrix4): Matrix4 /* this */
    open fun fromArray(a: Array<Number>): Matrix4 /* this */
    open fun zero(): Matrix4
    open fun transform(position: Vector3, scale: Vector3, rotation: Quaternion): Matrix4 /* this */
    open fun xyz(x: Number, y: Number, z: Number): Matrix4 /* this */
    open fun scaling(x: Number, y: Number, z: Number): Matrix4 /* this */
    open fun identity(): Matrix4 /* this */
    open fun transpose(): Matrix4 /* this */
    open fun getInverse(m: Matrix4): Matrix4 /* this */
    open fun invert(): Matrix4 /* this */
    open fun adjoint(): Matrix4 /* this */
    open fun determinant(): Number
    open fun multiply(src: Matrix4): Matrix4 /* this */
    open fun multiplyLocal(src: Matrix4): Matrix4 /* this */
    open fun premultiply(m: Matrix4): Matrix4 /* this */
    open fun multiplyMatrices(a: Matrix4, b: Matrix4): Matrix4 /* this */
    open fun translate(v: Vector3): Matrix4 /* this */
    open fun translate(v: Vector4): Matrix4 /* this */
    open fun translateXYZ(x: Number, y: Number, z: Number): Matrix4 /* this */
    open fun scale(v: Vector3): Matrix4 /* this */
    open fun scale(v: Vector4): Matrix4 /* this */
    open fun scaleXYZ(x: Number, y: Number, z: Number): Matrix4 /* this */
    open fun makeRotationAxis(axis: Vector3, angle: Number): Matrix4 /* this */
    open fun makeRotationAxis(axis: Vector4, angle: Number): Matrix4 /* this */
    open fun rotate(rad: Number, axis: Vector3): Matrix4 /* this */
    open fun rotateX(rad: Number): Matrix4 /* this */
    open fun rotateY(rad: Number): Matrix4 /* this */
    open fun rotateZ(rad: Number): Matrix4 /* this */
    open fun fromRotationTranslation(q: Quaternion, v: Vector3): Matrix4 /* this */
    open fun fromQuat(q: Quaternion): Matrix4 /* this */
    open fun frustum(
        left: Number,
        right: Number,
        bottom: Number,
        top: Number,
        near: Number,
        far: Number
    ): Matrix4 /* this */

    open fun perspective(fovy: Number, aspect: Number, near: Number, far: Number): Matrix4 /* this */
    open fun perspectiveLH(width: Number, height: Number, near: Number, far: Number): Matrix4 /* this */
    open fun ortho(
        left: Number,
        right: Number,
        bottom: Number,
        top: Number,
        near: Number,
        far: Number
    ): Matrix4 /* this */

    open fun lookAtRH(eye: Vector3, target: Vector3, up: Vector3): Matrix4 /* this */
    open fun lookAt(eye: Vector3, center: Vector3, up: Vector3): Matrix4 /* this */
    open fun yawPitchRoll(yaw: Number, pitch: Number, roll: Number): Matrix4 /* this */
    open fun setWorldMatrix(
        rotation: Vector3,
        position: Vector3,
        scale: Vector3,
        viewMatrix: Matrix4 = definedExternally,
        projectionMatrix: Matrix4 = definedExternally
    ): Matrix4 /* this */

    open fun multiplyToMat4(src: Matrix4, out: Matrix4): Matrix4
    open fun fromRotationXYTranslation(
        rotation: Vector3,
        position: Vector3,
        translateFirst: Boolean
    ): Matrix4 /* this */

    open fun getMaxScaleOnAxis(): Number
}

external fun MaxAdd(value: Number, amount: Number, max: Number): Number

external fun Median(values: Array<Number>): Number

external fun MinSub(value: Number, amount: Number, min: Number): Number

external fun Percent(
    value: Number,
    min: Number,
    max: Number = definedExternally,
    upperMax: Number = definedExternally
): Number

open external class Quaternion(
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally,
    w: Number = definedExternally
) {
    open var onChangeCallback: Function<*>
    open var x: Number
    open var y: Number
    open var z: Number
    open var w: Number
    open fun copy(src: Quaternion): Quaternion
    open fun copy(src: Vector4): Quaternion
    open fun set(
        x: Number? = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        w: Number = definedExternally,
        update: Boolean = definedExternally
    ): Quaternion

    open fun set(): Quaternion
    open fun set(x: Number? = definedExternally): Quaternion
    open fun set(x: Number? = definedExternally, y: Number = definedExternally): Quaternion
    open fun set(
        x: Number? = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally
    ): Quaternion

    open fun set(
        x: Number? = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        w: Number = definedExternally
    ): Quaternion

    open fun set(
        x: Any? = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        w: Number = definedExternally,
        update: Boolean = definedExternally
    ): Quaternion

    open fun set(x: Any? = definedExternally): Quaternion
    open fun set(x: Any? = definedExternally, y: Number = definedExternally): Quaternion
    open fun set(x: Any? = definedExternally, y: Number = definedExternally, z: Number = definedExternally): Quaternion
    open fun set(
        x: Any? = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        w: Number = definedExternally
    ): Quaternion

    open fun add(v: Quaternion): Quaternion
    open fun add(v: Vector4): Quaternion
    open fun subtract(v: Quaternion): Quaternion
    open fun subtract(v: Vector4): Quaternion
    open fun scale(scale: Number): Quaternion
    open fun length(): Number
    open fun lengthSq(): Number
    open fun normalize(): Quaternion
    open fun dot(v: Quaternion): Number
    open fun dot(v: Vector4): Number
    open fun lerp(v: Quaternion, t: Number = definedExternally): Quaternion
    open fun lerp(v: Quaternion): Quaternion
    open fun lerp(v: Vector4, t: Number = definedExternally): Quaternion
    open fun lerp(v: Vector4): Quaternion
    open fun rotationTo(a: Vector3, b: Vector3): Quaternion
    open fun setAxes(view: Vector3, right: Vector3, up: Vector3): Quaternion
    open fun identity(): Quaternion
    open fun setAxisAngle(axis: Vector3, rad: Number): Quaternion
    open fun multiply(b: Quaternion): Quaternion
    open fun multiply(b: Vector4): Quaternion
    open fun slerp(b: Quaternion, t: Number): Quaternion
    open fun slerp(b: Vector4, t: Number): Quaternion
    open fun invert(): Quaternion
    open fun conjugate(): Quaternion
    open fun rotateX(rad: Number): Quaternion
    open fun rotateY(rad: Number): Quaternion
    open fun rotateZ(rad: Number): Quaternion
    open fun calculateW(): Quaternion
    open fun setFromEuler(euler: Euler, update: Boolean = definedExternally): Quaternion
    open fun setFromRotationMatrix(mat4: Matrix4): Quaternion
    open fun fromMat3(mat: Matrix3): Quaternion
}

external fun RadToDeg(radians: Number): Number

open external class RandomDataGenerator {
    constructor(seeds: String = definedExternally)
    constructor()
    constructor(seeds: Array<String> = definedExternally)

    open var signs: Array<Number>
    open fun init(seeds: String)
    open fun init(seeds: Array<String>)
    open fun sow(seeds: Array<String>)
    open fun integer(): Number
    open fun frac(): Number
    open fun real(): Number
    open fun integerInRange(min: Number, max: Number): Number
    open fun between(min: Number, max: Number): Number
    open fun realInRange(min: Number, max: Number): Number
    open fun normal(): Number
    open fun uuid(): String
    open fun <T> pick(array: Array<T>): T
    open fun sign(): Number
    open fun <T> weightedPick(array: Array<T>): T
    open fun timestamp(min: Number, max: Number): Number
    open fun angle(): Number
    open fun rotation(): Number
    open fun state(state: String = definedExternally): String
    open fun <T> shuffle(array: Array<T> = definedExternally): Array<T>
}

external fun RandomXY(vector: Vector2, scale: Number = definedExternally): Vector2

external fun RandomXYZ(vec3: Vector3, radius: Number = definedExternally): Vector3

external fun RandomXYZW(vec4: Vector4, scale: Number = definedExternally): Vector4

external fun Rotate(point: Point?, angle: Number): Point

external fun Rotate(point: Any?, angle: Number): Point

external fun <T : Vector2Like> RotateAround(point: T, x: Number, y: Number, angle: Number): T

external fun <T : Vector2Like> RotateAroundDistance(point: T, x: Number, y: Number, angle: Number, distance: Number): T

external fun <T : Vector2Like> RotateTo(point: T, x: Number, y: Number, angle: Number, distance: Number): T

external fun RotateVec3(vec: Vector3, axis: Vector3, radians: Number): Vector3

external fun RoundAwayFromZero(value: Number): Number

external fun RoundTo(value: Number, place: Number = definedExternally, base: Number = definedExternally): Number

external fun SinCosTableGenerator(
    length: Number,
    sinAmp: Number = definedExternally,
    cosAmp: Number = definedExternally,
    frequency: Number = definedExternally
): SinCosTable

external fun SmootherStep(x: Number, min: Number, max: Number): Number

external fun SmoothStep(x: Number, min: Number, max: Number): Number

external fun ToXY(index: Number, width: Number, height: Number, out: Vector2 = definedExternally): Vector2

external fun TransformXY(
    x: Number,
    y: Number,
    positionX: Number,
    positionY: Number,
    rotation: Number,
    scaleX: Number,
    scaleY: Number,
    output: Vector2? = definedExternally
): dynamic /* Phaser.Math.Vector2? | Phaser.Geom.Point? | Any? */

external fun TransformXY(
    x: Number,
    y: Number,
    positionX: Number,
    positionY: Number,
    rotation: Number,
    scaleX: Number,
    scaleY: Number
): dynamic /* Phaser.Math.Vector2? | Phaser.Geom.Point? | Any? */

external fun TransformXY(
    x: Number,
    y: Number,
    positionX: Number,
    positionY: Number,
    rotation: Number,
    scaleX: Number,
    scaleY: Number,
    output: Point? = definedExternally
): dynamic /* Phaser.Math.Vector2? | Phaser.Geom.Point? | Any? */

external fun TransformXY(
    x: Number,
    y: Number,
    positionX: Number,
    positionY: Number,
    rotation: Number,
    scaleX: Number,
    scaleY: Number,
    output: Any? = definedExternally
): dynamic /* Phaser.Math.Vector2? | Phaser.Geom.Point? | Any? */

open external class Vector2 {
    constructor(x: Number = definedExternally, y: Number = definedExternally)
    constructor()
    constructor(x: Number = definedExternally)
    constructor(x: Vector2Like = definedExternally, y: Number = definedExternally)
    constructor(x: Vector2Like = definedExternally)

    open var x: Number
    open var y: Number
    open fun clone(): Vector2
    open fun copy(src: Vector2Like): Vector2
    open fun setFromObject(obj: Vector2Like): Vector2
    open fun set(x: Number, y: Number = definedExternally): Vector2
    open fun setTo(x: Number, y: Number = definedExternally): Vector2
    open fun setToPolar(azimuth: Number, radius: Number = definedExternally): Vector2
    open fun equals(v: Vector2Like): Boolean
    open fun fuzzyEquals(v: Vector2Like, epsilon: Number = definedExternally): Boolean
    open fun angle(): Number
    open fun setAngle(angle: Number): Vector2
    open fun add(src: Vector2Like): Vector2
    open fun subtract(src: Vector2Like): Vector2
    open fun multiply(src: Vector2Like): Vector2
    open fun scale(value: Number): Vector2
    open fun divide(src: Vector2Like): Vector2
    open fun negate(): Vector2
    open fun distance(src: Vector2Like): Number
    open fun distanceSq(src: Vector2Like): Number
    open fun length(): Number
    open fun setLength(length: Number): Vector2
    open fun lengthSq(): Number
    open fun normalize(): Vector2
    open fun normalizeRightHand(): Vector2
    open fun normalizeLeftHand(): Vector2
    open fun dot(src: Vector2Like): Number
    open fun cross(src: Vector2Like): Number
    open fun lerp(src: Vector2Like, t: Number = definedExternally): Vector2
    open fun transformMat3(mat: Matrix3): Vector2
    open fun transformMat4(mat: Matrix4): Vector2
    open fun reset(): Vector2
    open fun limit(max: Number): Vector2
    open fun reflect(normal: Vector2): Vector2
    open fun mirror(axis: Vector2): Vector2
    open fun rotate(delta: Number): Vector2
    open fun project(src: Vector2): Vector2

    companion object {
        val ZERO: Vector2
        val RIGHT: Vector2
        val LEFT: Vector2
        val UP: Vector2
        val DOWN: Vector2
        val ONE: Vector2
    }
}

open external class Vector3(
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally
) {
    open var x: Number
    open var y: Number
    open var z: Number
    open fun up(): Vector3
    open fun min(v: Vector3): Vector3
    open fun max(v: Vector3): Vector3
    open fun clone(): Vector3
    open fun addVectors(a: Vector3, b: Vector3): Vector3
    open fun crossVectors(a: Vector3, b: Vector3): Vector3
    open fun equals(v: Vector3): Boolean
    open fun copy(src: Vector2): Vector3
    open fun copy(src: Vector3): Vector3
    open fun set(x: Number?, y: Number = definedExternally, z: Number = definedExternally): Vector3
    open fun set(x: Number?): Vector3
    open fun set(x: Number?, y: Number = definedExternally): Vector3
    open fun set(x: Any?, y: Number = definedExternally, z: Number = definedExternally): Vector3
    open fun set(x: Any?): Vector3
    open fun set(x: Any?, y: Number = definedExternally): Vector3
    open fun setFromMatrixPosition(mat4: Matrix4): Vector3
    open fun setFromMatrixColumn(mat4: Matrix4, index: Number): Vector3
    open fun fromArray(array: Array<Number>, offset: Number = definedExternally): Vector3
    open fun add(v: Vector2): Vector3
    open fun add(v: Vector3): Vector3
    open fun addScalar(s: Number): Vector3
    open fun addScale(v: Vector2, scale: Number): Vector3
    open fun addScale(v: Vector3, scale: Number): Vector3
    open fun subtract(v: Vector2): Vector3
    open fun subtract(v: Vector3): Vector3
    open fun multiply(v: Vector2): Vector3
    open fun multiply(v: Vector3): Vector3
    open fun scale(scale: Number): Vector3
    open fun divide(v: Vector2): Vector3
    open fun divide(v: Vector3): Vector3
    open fun negate(): Vector3
    open fun distance(v: Vector2): Number
    open fun distance(v: Vector3): Number
    open fun distanceSq(v: Vector2): Number
    open fun distanceSq(v: Vector3): Number
    open fun length(): Number
    open fun lengthSq(): Number
    open fun normalize(): Vector3
    open fun dot(v: Vector3): Number
    open fun cross(v: Vector3): Vector3
    open fun lerp(v: Vector3, t: Number = definedExternally): Vector3
    open fun applyMatrix3(mat3: Matrix3): Vector3
    open fun applyMatrix4(mat4: Matrix4): Vector3
    open fun transformMat3(mat: Matrix3): Vector3
    open fun transformMat4(mat: Matrix4): Vector3
    open fun transformCoordinates(mat: Matrix4): Vector3
    open fun transformQuat(q: Quaternion): Vector3
    open fun project(mat: Matrix4): Vector3
    open fun projectViewMatrix(viewMatrix: Matrix4, projectionMatrix: Matrix4): Vector3
    open fun unprojectViewMatrix(projectionMatrix: Matrix4, worldMatrix: Matrix4): Vector3
    open fun unproject(viewport: Vector4, invProjectionView: Matrix4): Vector3
    open fun reset(): Vector3

    companion object {
        val ZERO: Vector3
        val RIGHT: Vector3
        val LEFT: Vector3
        val UP: Vector3
        val DOWN: Vector3
        val FORWARD: Vector3
        val BACK: Vector3
        val ONE: Vector3
    }
}

open external class Vector4(
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally,
    w: Number = definedExternally
) {
    open var x: Number
    open var y: Number
    open var z: Number
    open var w: Number
    open fun clone(): Vector4
    open fun copy(src: Vector4): Vector4
    open fun equals(v: Vector4): Boolean
    open fun set(x: Number?, y: Number, z: Number, w: Number): Vector4
    open fun set(x: Any?, y: Number, z: Number, w: Number): Vector4
    open fun add(v: Vector2): Vector4
    open fun add(v: Vector3): Vector4
    open fun add(v: Vector4): Vector4
    open fun subtract(v: Vector2): Vector4
    open fun subtract(v: Vector3): Vector4
    open fun subtract(v: Vector4): Vector4
    open fun scale(scale: Number): Vector4
    open fun length(): Number
    open fun lengthSq(): Number
    open fun normalize(): Vector4
    open fun dot(v: Vector4): Number
    open fun lerp(v: Vector4, t: Number = definedExternally): Vector4
    open fun multiply(v: Vector2): Vector4
    open fun multiply(v: Vector3): Vector4
    open fun multiply(v: Vector4): Vector4
    open fun divide(v: Vector2): Vector4
    open fun divide(v: Vector3): Vector4
    open fun divide(v: Vector4): Vector4
    open fun distance(v: Vector2): Number
    open fun distance(v: Vector3): Number
    open fun distance(v: Vector4): Number
    open fun distanceSq(v: Vector2): Number
    open fun distanceSq(v: Vector3): Number
    open fun distanceSq(v: Vector4): Number
    open fun negate(): Vector4
    open fun transformMat4(mat: Matrix4): Vector4
    open fun transformQuat(q: Quaternion): Vector4
    open fun reset(): Vector4
}

external fun Within(a: Number, b: Number, tolerance: Number): Boolean

external fun Wrap(value: Number, min: Number, max: Number): Number
