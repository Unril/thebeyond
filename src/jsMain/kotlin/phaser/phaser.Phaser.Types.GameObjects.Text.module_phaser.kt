@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.GameObjects.Text

import TextStyleWordWrapCallback

external interface GetTextSizeObject {
    var width: Number
    var height: Number
    var lines: Number
    var lineWidths: Array<Number>
    var lineSpacing: Number
    var lineHeight: Number
}

external interface `T$11` {
    var text: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var style: TextStyle?
        get() = definedExternally
        set(value) = definedExternally
    var padding: TextPadding?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TextMetrics {
    var ascent: Number
    var descent: Number
    var fontSize: Number
}

external interface TextPadding {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var left: Number?
        get() = definedExternally
        set(value) = definedExternally
    var right: Number?
        get() = definedExternally
        set(value) = definedExternally
    var top: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bottom: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TextShadow {
    var offsetX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var offsetY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var blur: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TextStyle {
    /**
     * The font the Text object will render with. This is a Canvas style font string.
     */
    var fontFamily: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The font size, as a CSS size string.
     */
    var fontSize: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Any addition font styles, such as 'strong'.
     */
    var fontStyle: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The font family or font settings to set. Overrides the other font settings.
     */
    var font: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * A solid fill color that is rendered behind the Text object. Given as a CSS string color such as `#ff0`.
     */
    var backgroundColor: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The color the Text is drawn in. Given as a CSS string color such as `#fff` or `rgb()`.
     */
    var color: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The color used to stroke the Text if the `strokeThickness` property is greater than zero.
     */
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The thickness of the stroke around the Text. Set to zero for no stroke.
     */
    var strokeThickness: Number?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The Text shadow configuration object.
     */
    var shadow: TextShadow?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * A Text Padding object.
     */
    var padding: TextPadding?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The alignment of the Text. This only impacts multi-line text. Either `left`, `right`, `center` or `justify`.
     */
    var align: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The maximum number of lines to display within the Text object.
     */
    var maxLines: Number?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Force the Text object to have the exact width specified in this property. Leave as zero for it to change accordingly to content.
     */
    var fixedWidth: Number?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Force the Text object to have the exact height specified in this property. Leave as zero for it to change accordingly to content.
     */
    var fixedHeight: Number?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Sets the resolution (DPI setting) of the Text object. Leave at zero for it to use the game resolution.
     */
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Set to `true` if this Text object should render from right-to-left.
     */
    var rtl: Boolean?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * This is the string used to aid Canvas in calculating the height of the font.
     */
    var testString: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The amount of horizontal padding added to the width of the text when calculating the font metrics.
     */
    var baselineX: Number?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The amount of vertical padding added to the height of the text when calculating the font metrics.
     */
    var baselineY: Number?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The Text Word wrap configuration object.
     */
    var wordWrap: TextWordWrap?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * A Text Metrics object. Use this to avoid expensive font size calculations in text heavy games.
     */
    var metrics: TextMetrics?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TextWordWrap {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var callback: TextStyleWordWrapCallback?
        get() = definedExternally
        set(value) = definedExternally
    var callbackScope: Any?
        get() = definedExternally
        set(value) = definedExternally
    var useAdvancedWrap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}
