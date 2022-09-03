@file:JsQualifier("Phaser.Scale")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Scale

import Phaser.Device.Fullscreen
import Phaser.Events.EventEmitter
import Phaser.Game
import Phaser.Geom.Rectangle
import Phaser.Math.Vector2
import Phaser.Structs.Size
import Phaser.Types.Core.GameConfig
import org.w3c.dom.HTMLCanvasElement

external enum class Center {
    NO_CENTER,
    CENTER_BOTH,
    CENTER_HORIZONTALLY,
    CENTER_VERTICALLY
}

external enum class Orientation {
    LANDSCAPE,
    PORTRAIT
}

external enum class ScaleModes {
    NONE,
    WIDTH_CONTROLS_HEIGHT,
    HEIGHT_CONTROLS_WIDTH,
    FIT,
    ENVELOP,
    RESIZE
}

external enum class Zoom {
    NO_ZOOM,
    ZOOM_2X,
    ZOOM_4X,
    MAX_ZOOM
}

/**
 * The Scale Manager handles the scaling, resizing and alignment of the game canvas.
 *
 * The way scaling is handled is by setting the game canvas to a fixed size, which is defined in the
 * game configuration. You also define the parent container in the game config. If no parent is given,
 * it will default to using the document body. The Scale Manager will then look at the available space
 * within the _parent_ and scale the canvas accordingly. Scaling is handled by setting the canvas CSS
 * width and height properties, leaving the width and height of the canvas element itself untouched.
 * Scaling is therefore achieved by keeping the core canvas the same size and 'stretching'
 * it via its CSS properties. This gives the same result and speed as using the `transform-scale` CSS
 * property, without the need for browser prefix handling.
 *
 * The calculations for the scale are heavily influenced by the bounding parent size, which is the computed
 * dimensions of the canvas's parent. The CSS rules of the parent element play an important role in the
 * operation of the Scale Manager. For example, if the parent has no defined width or height, then actions
 * like auto-centering will fail to achieve the required result. The Scale Manager works in tandem with the
 * CSS you set-up on the page hosting your game, rather than taking control of it.
 *
 * #### Parent and Display canvas containment guidelines:
 *
 * - Style the Parent element (of the game canvas) to control the Parent size and thus the games size and layout.
 *
 * - The Parent element's CSS styles should _effectively_ apply maximum (and minimum) bounding behavior.
 *
 * - The Parent element should _not_ apply a padding as this is not accounted for.
 *   If a padding is required apply it to the Parent's parent or apply a margin to the Parent.
 *   If you need to add a border, margin or any other CSS around your game container, then use a parent element and
 *   apply the CSS to this instead, otherwise you'll be constantly resizing the shape of the game container.
 *
 * - The Display canvas layout CSS styles (i.e. margins, size) should not be altered / specified as
 *   they may be updated by the Scale Manager.
 *
 * #### Scale Modes
 *
 * The way the scaling is handled is determined by the `scaleMode` property. The default is `NONE`,
 * which prevents Phaser from scaling or touching the canvas, or its parent, at all. In this mode, you are
 * responsible for all scaling. The other scaling modes afford you automatic scaling.
 *
 * If you wish to scale your game so that it always fits into the available space within the parent, you
 * should use the scale mode `FIT`. Look at the documentation for other scale modes to see what options are
 * available. Here is a basic config showing how to set this scale mode:
 *
 * ```javascript
 * scale: {
 *     parent: 'yourgamediv',
 *     mode: Phaser.Scale.FIT,
 *     width: 800,
 *     height: 600
 * }
 * ```
 *
 * Place the `scale` config object within your game config.
 *
 * If you wish for the canvas to be resized directly, so that the canvas itself fills the available space
 * (i.e. it isn't scaled, it's resized) then use the `RESIZE` scale mode. This will give you a 1:1 mapping
 * of canvas pixels to game size. In this mode CSS isn't used to scale the canvas, it's literally adjusted
 * to fill all available space within the parent. You should be extremely careful about the size of the
 * canvas you're creating when doing this, as the larger the area, the more work the GPU has to do and it's
 * very easy to hit fill-rate limits quickly.
 *
 * For complex, custom-scaling requirements, you should probably consider using the `RESIZE` scale mode,
 * with your own limitations in place re: canvas dimensions and managing the scaling with the game scenes
 * yourself. For the vast majority of games, however, the `FIT` mode is likely to be the most used.
 *
 * Please appreciate that the Scale Manager cannot perform miracles. All it does is scale your game canvas
 * as best it can, based on what it can infer from its surrounding area. There are all kinds of environments
 * where it's up to you to guide and help the canvas position itself, especially when built into rendering
 * frameworks like React and Vue. If your page requires meta tags to prevent user scaling gestures, or such
 * like, then it's up to you to ensure they are present in the html.
 *
 * #### Centering
 *
 * You can also have the game canvas automatically centered. Again, this relies heavily on the parent being
 * properly configured and styled, as the centering offsets are based entirely on the available space
 * within the parent element. Centering is disabled by default, or can be applied horizontally, vertically,
 * or both. Here's an example:
 *
 * ```javascript
 * scale: {
 *     parent: 'yourgamediv',
 *     autoCenter: Phaser.Scale.CENTER_BOTH,
 *     width: 800,
 *     height: 600
 * }
 * ```
 *
 * #### Fullscreen API
 *
 * If the browser supports it, you can send your game into fullscreen mode. In this mode, the game will fill
 * the entire display, removing all browser UI and anything else present on the screen. It will remain in this
 * mode until your game either disables it, or until the user tabs out or presses ESCape if on desktop. It's a
 * great way to achieve a desktop-game like experience from the browser, but it does require a modern browser
 * to handle it. Some mobile browsers also support this.
 */
open external class ScaleManager(game: Game) : EventEmitter {
    open val game: Game
    open var canvas: HTMLCanvasElement
    open var canvasBounds: Rectangle
    open var parent: Any
    open var parentIsWindow: Boolean
    open var parentSize: Size
    open var gameSize: Size
    open var baseSize: Size
    open var displaySize: Size
    open var scaleMode: ScaleModeType
    open var zoom: Number
    open val _resetZoom: Boolean
    open var displayScale: Vector2
    open var autoRound: Boolean
    open var autoCenter: CenterType
    open var orientation: OrientationType
    open var fullscreen: Fullscreen
    open var fullscreenTarget: Any
    open var dirty: Boolean
    open var resizeInterval: Number
    open fun preBoot()
    open fun boot()
    open fun parseConfig(config: GameConfig)
    open fun getParent(config: GameConfig)
    open fun getParentBounds(): Boolean
    open fun lockOrientation(orientation: String): Boolean
    open fun setParentSize(width: Number, height: Number): ScaleManager /* this */
    open fun setGameSize(width: Number, height: Number): ScaleManager /* this */
    open fun resize(width: Number, height: Number): ScaleManager /* this */
    open fun setZoom(value: Number): ScaleManager /* this */
    open fun setMaxZoom(): ScaleManager /* this */
    open fun refresh(
        previousWidth: Number = definedExternally,
        previousHeight: Number = definedExternally
    ): ScaleManager /* this */

    open fun updateOrientation()
    open fun updateScale()
    open fun getMaxZoom(): Number
    open fun updateCenter()
    open fun updateBounds()
    open fun transformX(pageX: Number): Number
    open fun transformY(pageY: Number): Number
    open fun startFullscreen(fullscreenOptions: Any? = definedExternally)
    open fun getFullscreenTarget(): Any?
    open fun removeFullscreenTarget()
    open fun stopFullscreen()
    open fun toggleFullscreen(fullscreenOptions: Any? = definedExternally)
    open fun startListeners()
    open fun onFullScreenChange()
    open fun onFullScreenError()
    open fun getViewPort(out: Rectangle = definedExternally): Rectangle
    open fun step(time: Number, delta: Number)
    open fun stopListeners()
    override fun destroy()
    open val isFullscreen: Boolean
    open val width: Number
    open val height: Number
    open val isPortrait: Boolean
    open val isLandscape: Boolean
    open val isGamePortrait: Boolean
    open val isGameLandscape: Boolean
}

external var NO_CENTER: Number

external var CENTER_BOTH: Number

external var CENTER_HORIZONTALLY: Number

external var CENTER_VERTICALLY: Number

external var LANDSCAPE: String

external var PORTRAIT: String

external var NONE: Number

external var WIDTH_CONTROLS_HEIGHT: Number

external var HEIGHT_CONTROLS_WIDTH: Number

external var FIT: Number

external var ENVELOP: Number

external var RESIZE: Number

external var NO_ZOOM: Number

external var ZOOM_2X: Number

external var ZOOM_4X: Number

external var MAX_ZOOM: Number
