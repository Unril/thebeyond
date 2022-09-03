@file:JsQualifier("Phaser.Scale.Events")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Scale.Events

/**
 * The Scale Manager has successfully entered fullscreen mode.
 */
external var ENTER_FULLSCREEN: String

/**
 * The Scale Manager tried to enter fullscreen mode but failed.
 */
external var FULLSCREEN_FAILED: String

/**
 * The Scale Manager tried to enter fullscreen mode, but it is unsupported by the browser.
 */
external var FULLSCREEN_UNSUPPORTED: String

/**
 * The Scale Manager was in fullscreen mode, but has since left, either directly via game code,
 * or via a user gestured, such as pressing the ESC key.
 */
external var LEAVE_FULLSCREEN: String

/**
 * The Scale Manager Orientation Change Event.
 *
 * This event is dispatched whenever the Scale Manager detects an orientation change event from the browser.
 */
external var ORIENTATION_CHANGE: String

/**
 * The Scale Manager Resize Event.
 *
 * This event is dispatched whenever the Scale Manager detects a resize event from the browser.
 * It sends three parameters to the callback, each of them being Size components. You can read
 * the `width`, `height`, `aspectRatio` and other properties of these components to help with
 * scaling your own game content.
 *
 * gameSize: Phaser.Structs.Size
 * A reference to the Game Size component. This is the un-scaled size of your game canvas.
 *
 * baseSize: Phaser.Structs.Size
 * A reference to the Base Size component. This is the game size.
 *
 * displaySize: Phaser.Structs.Size
 * A reference to the Display Size component. This is the scaled canvas size, after applying zoom and scale mode.
 *
 * previousWidth: number
 * If the gameSize has changed, this value contains its previous width, otherwise it contains the current width.
 *
 * previousHeight: number
 * If the gameSize has changed, this value contains its previous height, otherwise it contains the current height.
 */
external var RESIZE: String
