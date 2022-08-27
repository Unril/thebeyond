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
