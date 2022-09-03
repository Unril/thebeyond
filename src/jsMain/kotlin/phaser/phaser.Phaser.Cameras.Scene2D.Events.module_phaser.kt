@file:JsQualifier("Phaser.Cameras.Scene2D.Events")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Cameras.Scene2D.Events

/**
 * The Destroy Camera Event.
 *
 * This event is dispatched by a Camera instance when it is destroyed by the Camera Manager.
 */
external var DESTROY: String

/**
 * The Camera Fade In Complete Event.
 *
 * This event is dispatched by a Camera instance when the Fade In Effect completes.
 *
 * Listen to it from a Camera instance using `Camera.on('camerafadeincomplete', listener)`.
 */
external var FADE_IN_COMPLETE: String

/**
 * The Camera Fade In Start Event.
 *
 * This event is dispatched by a Camera instance when the Fade In Effect starts.
 *
 * Listen to it from a Camera instance using `Camera.on('camerafadeinstart', listener)`.
 */
external var FADE_IN_START: String

/**
 * The Camera Fade Out Complete Event.
 *
 * This event is dispatched by a Camera instance when the Fade Out Effect completes.
 *
 * Listen to it from a Camera instance using `Camera.on('camerafadeoutcomplete', listener)`.
 */
external var FADE_OUT_COMPLETE: String

/**
 * The Camera Fade Out Start Event.
 *
 * This event is dispatched by a Camera instance when the Fade Out Effect starts.
 *
 * Listen to it from a Camera instance using `Camera.on('camerafadeoutstart', listener)`.
 */
external var FADE_OUT_START: String

/**
 * The Camera Flash Complete Event.
 *
 * This event is dispatched by a Camera instance when the Flash Effect completes.
 */
external var FLASH_COMPLETE: String

/**
 * The Camera Flash Start Event.
 *
 * This event is dispatched by a Camera instance when the Flash Effect starts.
 */
external var FLASH_START: String

/**
 * The Camera Follower Update Event.
 *
 * This event is dispatched by a Camera instance when it is following a
 * Game Object and the Camera position has been updated as a result of
 * that following.
 *
 * Listen to it from a Camera instance using: `camera.on('followupdate', listener)`.
 */
external var FOLLOW_UPDATE: String

/**
 * The Camera Pan Complete Event.
 *
 * This event is dispatched by a Camera instance when the Pan Effect completes.
 */
external var PAN_COMPLETE: String

/**
 * The Camera Pan Start Event.
 *
 * This event is dispatched by a Camera instance when the Pan Effect starts.
 */
external var PAN_START: String

/**
 * The Camera Post-Render Event.
 *
 * This event is dispatched by a Camera instance after is has finished rendering.
 * It is only dispatched if the Camera is rendering to a texture.
 *
 * Listen to it from a Camera instance using: `camera.on('postrender', listener)`.
 */
external var POST_RENDER: String

/**
 * The Camera Pre-Render Event.
 *
 * This event is dispatched by a Camera instance when it is about to render.
 * It is only dispatched if the Camera is rendering to a texture.
 *
 * Listen to it from a Camera instance using: `camera.on('prerender', listener)`.
 */
external var PRE_RENDER: String

/**
 * The Camera Rotate Complete Event.
 *
 * This event is dispatched by a Camera instance when the Rotate Effect completes.
 */
external var ROTATE_COMPLETE: String

/**
 * The Camera Rotate Start Event.
 *
 * This event is dispatched by a Camera instance when the Rotate Effect starts.
 */
external var ROTATE_START: String

/**
 * The Camera Shake Complete Event.
 *
 * This event is dispatched by a Camera instance when the Shake Effect completes.
 */
external var SHAKE_COMPLETE: String

/**
 * The Camera Shake Start Event.
 *
 * This event is dispatched by a Camera instance when the Shake Effect starts.
 */
external var SHAKE_START: String

/**
 * The Camera Zoom Complete Event.
 *
 * This event is dispatched by a Camera instance when the Zoom Effect completes.
 */
external var ZOOM_COMPLETE: String

/**
 * The Camera Zoom Start Event.
 *
 * This event is dispatched by a Camera instance when the Zoom Effect starts.
 */
external var ZOOM_START: String
