@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Animations

external interface Animation {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var frames: dynamic /* String? | Array<Phaser.Types.Animations.AnimationFrame>? */
        get() = definedExternally
        set(value) = definedExternally
    var sortFrames: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultTextureKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var frameRate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var skipMissedFrames: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeatDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showOnStart: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideOnComplete: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AnimationFrame {
    var key: String?
        get() = definedExternally
        set(value) = definedExternally
    var frame: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenerateFrameNames {
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
    var end: Number?
        get() = definedExternally
        set(value) = definedExternally
    var suffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var zeroPad: Number?
        get() = definedExternally
        set(value) = definedExternally
    var outputArray: Array<AnimationFrame>?
        get() = definedExternally
        set(value) = definedExternally
    var frames: dynamic /* Boolean? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenerateFrameNumbers {
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
    var end: Number?
        get() = definedExternally
        set(value) = definedExternally
    var first: dynamic /* Boolean? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var outputArray: Array<AnimationFrame>?
        get() = definedExternally
        set(value) = definedExternally
    var frames: dynamic /* Boolean? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONAnimation {
    var key: String
    var type: String
    var frames: Array<JSONAnimationFrame>
    var frameRate: Number
    var duration: Number
    var skipMissedFrames: Boolean
    var delay: Number
    var repeat: Number
    var repeatDelay: Number
    var yoyo: Boolean
    var showOnStart: Boolean
    var hideOnComplete: Boolean
}

external interface JSONAnimationFrame {
    var key: String
    var frame: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number
}

external interface JSONAnimations {
    var anims: Array<JSONAnimation>
    var globalTimeScale: Number
}

external interface PlayAnimationConfig {
    var key: dynamic /* String | Phaser.Animations.Animation */
        get() = definedExternally
        set(value) = definedExternally
    var frameRate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: Number?
        get() = definedExternally
        set(value) = definedExternally
    var repeatDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showOnStart: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hideOnComplete: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var startFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var timeScale: Number?
        get() = definedExternally
        set(value) = definedExternally
}
