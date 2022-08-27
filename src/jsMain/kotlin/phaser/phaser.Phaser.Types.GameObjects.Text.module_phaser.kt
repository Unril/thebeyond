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
    var fontFamily: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String?
        get() = definedExternally
        set(value) = definedExternally
    var font: String?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally
    var strokeThickness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadow: TextShadow?
        get() = definedExternally
        set(value) = definedExternally
    var padding: TextPadding?
        get() = definedExternally
        set(value) = definedExternally
    var align: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxLines: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fixedWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fixedHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rtl: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var testString: String?
        get() = definedExternally
        set(value) = definedExternally
    var baselineX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var baselineY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var wordWrap: TextWordWrap?
        get() = definedExternally
        set(value) = definedExternally
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
