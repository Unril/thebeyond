@file:JsQualifier("Phaser.Display")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Display

import Phaser.Types.Display.ColorObject
import Phaser.Types.Display.HSVColorObject
import Phaser.Types.Display.InputColorObject
import org.khronos.webgl.Float32Array

open external class Color(
    red: Number = definedExternally,
    green: Number = definedExternally,
    blue: Number = definedExternally,
    alpha: Number = definedExternally
) {
    open var gl: Array<Number>
    open fun transparent(): Color
    open fun setTo(
        red: Number,
        green: Number,
        blue: Number,
        alpha: Number = definedExternally,
        updateHSV: Boolean = definedExternally
    ): Color

    open fun setGLTo(red: Number, green: Number, blue: Number, alpha: Number = definedExternally): Color
    open fun setFromRGB(color: InputColorObject): Color
    open fun setFromHSV(h: Number, s: Number, v: Number): Color
    open fun clone(): Color
    open fun gray(shade: Number): Color
    open fun random(min: Number = definedExternally, max: Number = definedExternally): Color
    open fun randomGray(min: Number = definedExternally, max: Number = definedExternally): Color
    open fun saturate(amount: Number): Color
    open fun desaturate(amount: Number): Color
    open fun lighten(amount: Number): Color
    open fun darken(amount: Number): Color
    open fun brighten(amount: Number): Color
    open val color: Number
    open val color32: Number
    open val rgba: String
    open var redGL: Number
    open var greenGL: Number
    open var blueGL: Number
    open var alphaGL: Number
    open var red: Number
    open var green: Number
    open var blue: Number
    open var alpha: Number
    open var h: Number
    open var s: Number
    open var v: Number

    companion object {
        fun ColorSpectrum(limit: Number = definedExternally): Array<ColorObject>
        fun ColorToRGBA(color: Number): ColorObject
        fun ComponentToHex(color: Number): String
        fun GetColor(red: Number, green: Number, blue: Number): Number
        fun GetColor32(red: Number, green: Number, blue: Number, alpha: Number): Number
        fun HexStringToColor(hex: String): Color
        fun HSLToColor(h: Number, s: Number, l: Number): Color
        fun HSVColorWheel(s: Number = definedExternally, v: Number = definedExternally): Array<ColorObject>
        fun HSVToRGB(
            h: Number,
            s: Number,
            v: Number,
            out: ColorObject = definedExternally
        ): dynamic /* Phaser.Types.Display.ColorObject | Phaser.Display.Color */

        fun HSVToRGB(
            h: Number,
            s: Number,
            v: Number,
            out: Color = definedExternally
        ): dynamic /* Phaser.Types.Display.ColorObject | Phaser.Display.Color */

        fun HueToComponent(p: Number, q: Number, t: Number): Number
        fun IntegerToColor(input: Number): Color
        fun IntegerToRGB(input: Number): ColorObject
        fun ObjectToColor(input: InputColorObject): Color
        fun RandomRGB(min: Number = definedExternally, max: Number = definedExternally): Color
        fun RGBStringToColor(rgb: String): Color
        fun RGBToHSV(
            r: Number,
            g: Number,
            b: Number,
            out: HSVColorObject = definedExternally
        ): dynamic /* Phaser.Types.Display.HSVColorObject | Phaser.Display.Color */

        fun RGBToHSV(
            r: Number,
            g: Number,
            b: Number,
            out: Color = definedExternally
        ): dynamic /* Phaser.Types.Display.HSVColorObject | Phaser.Display.Color */

        fun RGBToString(
            r: Number,
            g: Number,
            b: Number,
            a: Number = definedExternally,
            prefix: String = definedExternally
        ): String

        fun ValueToColor(input: String): Color
        fun ValueToColor(input: Number): Color
        fun ValueToColor(input: InputColorObject): Color
    }
}

open external class ColorMatrix {
    open var alpha: Number
    open fun set(value: Array<Number>): ColorMatrix /* this */
    open fun reset(): ColorMatrix /* this */
    open fun getData(): Float32Array
    open fun brightness(
        value: Number = definedExternally,
        multiply: Boolean = definedExternally
    ): ColorMatrix /* this */

    open fun saturate(value: Number = definedExternally, multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun saturation(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun hue(rotation: Number = definedExternally, multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun grayscale(value: Number = definedExternally, multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun blackWhite(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun contrast(value: Number = definedExternally, multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun negative(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun desaturateLuminance(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun sepia(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun night(intensity: Number = definedExternally, multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun lsd(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun brown(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun vintagePinhole(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun kodachrome(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun technicolor(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun polaroid(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun shiftToBGR(multiply: Boolean = definedExternally): ColorMatrix /* this */
    open fun multiply(a: Array<Number>): ColorMatrix /* this */
}

open external class RGB(
    red: Number = definedExternally,
    green: Number = definedExternally,
    blue: Number = definedExternally
) {
    open var onChangeCallback: Function<*>
    open var dirty: Boolean
    open fun set(
        red: Number = definedExternally,
        green: Number = definedExternally,
        blue: Number = definedExternally
    ): RGB /* this */

    open fun equals(red: Number, green: Number, blue: Number): Boolean
    open fun onChange()
    open var r: Number
    open var g: Number
    open var b: Number
    open fun destroy()
}

open external class BaseShader(
    key: String,
    fragmentSrc: String = definedExternally,
    vertexSrc: String = definedExternally,
    uniforms: Any = definedExternally
) {
    open var key: String
    open var fragmentSrc: String
    open var vertexSrc: String
    open var uniforms: Any
}
