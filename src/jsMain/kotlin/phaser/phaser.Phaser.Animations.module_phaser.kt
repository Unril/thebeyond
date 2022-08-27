@file:JsQualifier("Phaser.Animations")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Animations

import Phaser.Events.EventEmitter
import Phaser.Game
import Phaser.GameObjects.GameObject
import Phaser.Structs.Map
import Phaser.Textures.Frame
import Phaser.Textures.TextureManager
import Phaser.Types.Animations.*

open external class Animation(manager: AnimationManager, key: String, config: Phaser.Types.Animations.Animation) {
    open var manager: AnimationManager
    open var key: String
    open var type: String
    open var frames: Array<AnimationFrame>
    open var frameRate: Number
    open var duration: Number
    open var msPerFrame: Number
    open var skipMissedFrames: Boolean
    open var delay: Number
    open var repeat: Number
    open var repeatDelay: Number
    open var yoyo: Boolean
    open var showOnStart: Boolean
    open var hideOnComplete: Boolean
    open var paused: Boolean
    open fun getTotalFrames(): Number
    open fun calculateDuration(
        target: Animation,
        totalFrames: Number,
        duration: Number = definedExternally,
        frameRate: Number = definedExternally
    )

    open fun addFrame(config: String): Animation /* this */
    open fun addFrame(config: Array<Phaser.Types.Animations.AnimationFrame>): Animation /* this */
    open fun addFrameAt(index: Number, config: String): Animation /* this */
    open fun addFrameAt(index: Number, config: Array<Phaser.Types.Animations.AnimationFrame>): Animation /* this */
    open fun checkFrame(index: Number): Boolean
    open fun getFirstTick(state: AnimationState)
    open fun getFrameAt(index: Number): AnimationFrame
    open fun getFrames(
        textureManager: TextureManager,
        frames: String,
        defaultTextureKey: String = definedExternally
    ): Array<AnimationFrame>

    open fun getFrames(textureManager: TextureManager, frames: String): Array<AnimationFrame>
    open fun getFrames(
        textureManager: TextureManager,
        frames: Array<Phaser.Types.Animations.AnimationFrame>,
        defaultTextureKey: String = definedExternally
    ): Array<AnimationFrame>

    open fun getFrames(
        textureManager: TextureManager,
        frames: Array<Phaser.Types.Animations.AnimationFrame>
    ): Array<AnimationFrame>

    open fun getNextTick(state: AnimationState)
    open fun getFrameByProgress(value: Number): AnimationFrame
    open fun nextFrame(state: AnimationState)
    open fun getLastFrame(): AnimationFrame
    open fun previousFrame(state: AnimationState)
    open fun removeFrame(frame: AnimationFrame): Animation /* this */
    open fun removeFrameAt(index: Number): Animation /* this */
    open fun repeatAnimation(state: AnimationState)
    open fun toJSON(): JSONAnimation
    open fun updateFrameSequence(): Animation /* this */
    open fun pause(): Animation /* this */
    open fun resume(): Animation /* this */
    open fun destroy()
}

open external class AnimationFrame {
    constructor(
        textureKey: String,
        textureFrame: String,
        index: Number,
        frame: Frame,
        isKeyFrame: Boolean = definedExternally
    )

    constructor(textureKey: String, textureFrame: String, index: Number, frame: Frame)
    constructor(
        textureKey: String,
        textureFrame: Number,
        index: Number,
        frame: Frame,
        isKeyFrame: Boolean = definedExternally
    )

    constructor(textureKey: String, textureFrame: Number, index: Number, frame: Frame)

    open var textureKey: String
    open var textureFrame: dynamic /* String | Number */
    open var index: Number
    open var frame: Frame
    open val isFirst: Boolean
    open val isLast: Boolean
    open val prevFrame: AnimationFrame
    open val nextFrame: AnimationFrame
    open var duration: Number
    open val progress: Number
    open var isKeyFrame: Boolean
    open fun toJSON(): JSONAnimationFrame
    open fun destroy()
}

open external class AnimationManager(game: Game) : EventEmitter {
    open var game: Game
    open var textureManager: TextureManager
    open var globalTimeScale: Number
    open var anims: Map<String, Animation>
    open var mixes: Map<String, Animation>
    open var paused: Boolean
    open var name: String
    open fun boot()
    open fun addMix(animA: String, animB: String, delay: Number): AnimationManager /* this */
    open fun addMix(animA: String, animB: Animation, delay: Number): AnimationManager /* this */
    open fun addMix(animA: Animation, animB: String, delay: Number): AnimationManager /* this */
    open fun addMix(animA: Animation, animB: Animation, delay: Number): AnimationManager /* this */
    open fun removeMix(animA: String, animB: String = definedExternally): AnimationManager /* this */
    open fun removeMix(animA: String): AnimationManager /* this */
    open fun removeMix(animA: String, animB: Animation = definedExternally): AnimationManager /* this */
    open fun removeMix(animA: Animation, animB: String = definedExternally): AnimationManager /* this */
    open fun removeMix(animA: Animation): AnimationManager /* this */
    open fun removeMix(animA: Animation, animB: Animation = definedExternally): AnimationManager /* this */
    open fun getMix(animA: String, animB: String): Number
    open fun getMix(animA: String, animB: Animation): Number
    open fun getMix(animA: Animation, animB: String): Number
    open fun getMix(animA: Animation, animB: Animation): Number
    open fun add(key: String, animation: Animation): AnimationManager /* this */
    open fun exists(key: String): Boolean
    open fun createFromAseprite(
        key: String,
        tags: Array<String> = definedExternally,
        target: AnimationManager = definedExternally
    ): Array<Animation>

    open fun createFromAseprite(key: String): Array<Animation>
    open fun createFromAseprite(key: String, tags: Array<String> = definedExternally): Array<Animation>
    open fun createFromAseprite(
        key: String,
        tags: Array<String> = definedExternally,
        target: GameObject = definedExternally
    ): Array<Animation>

    open fun create(config: Phaser.Types.Animations.Animation): dynamic /* Phaser.Animations.Animation | Boolean */
    open fun fromJSON(data: String, clearCurrentAnimations: Boolean = definedExternally): Array<Animation>
    open fun fromJSON(data: String): Array<Animation>
    open fun fromJSON(data: JSONAnimations, clearCurrentAnimations: Boolean = definedExternally): Array<Animation>
    open fun fromJSON(data: JSONAnimations): Array<Animation>
    open fun fromJSON(data: JSONAnimation, clearCurrentAnimations: Boolean = definedExternally): Array<Animation>
    open fun fromJSON(data: JSONAnimation): Array<Animation>
    open fun generateFrameNames(
        key: String,
        config: GenerateFrameNames = definedExternally
    ): Array<Phaser.Types.Animations.AnimationFrame>

    open fun generateFrameNumbers(
        key: String,
        config: GenerateFrameNumbers
    ): Array<Phaser.Types.Animations.AnimationFrame>

    open fun get(key: String): Animation
    open fun pauseAll(): AnimationManager /* this */
    open fun play(key: String, children: GameObject): AnimationManager /* this */
    open fun play(key: String, children: Array<GameObject>): AnimationManager /* this */
    open fun play(key: Animation, children: GameObject): AnimationManager /* this */
    open fun play(key: Animation, children: Array<GameObject>): AnimationManager /* this */
    open fun play(key: PlayAnimationConfig, children: GameObject): AnimationManager /* this */
    open fun play(key: PlayAnimationConfig, children: Array<GameObject>): AnimationManager /* this */
    open fun <G : Array<GameObject>> staggerPlay(
        key: String,
        children: GameObject,
        stagger: Number,
        staggerFirst: Boolean = definedExternally
    ): G

    open fun <G : Array<GameObject>> staggerPlay(key: String, children: GameObject, stagger: Number): G
    open fun <G : Array<GameObject>> staggerPlay(
        key: String,
        children: Array<GameObject>,
        stagger: Number,
        staggerFirst: Boolean = definedExternally
    ): G

    open fun <G : Array<GameObject>> staggerPlay(key: String, children: Array<GameObject>, stagger: Number): G
    open fun <G : Array<GameObject>> staggerPlay(
        key: Animation,
        children: GameObject,
        stagger: Number,
        staggerFirst: Boolean = definedExternally
    ): G

    open fun <G : Array<GameObject>> staggerPlay(key: Animation, children: GameObject, stagger: Number): G
    open fun <G : Array<GameObject>> staggerPlay(
        key: Animation,
        children: Array<GameObject>,
        stagger: Number,
        staggerFirst: Boolean = definedExternally
    ): G

    open fun <G : Array<GameObject>> staggerPlay(key: Animation, children: Array<GameObject>, stagger: Number): G
    open fun <G : Array<GameObject>> staggerPlay(
        key: PlayAnimationConfig,
        children: GameObject,
        stagger: Number,
        staggerFirst: Boolean = definedExternally
    ): G

    open fun <G : Array<GameObject>> staggerPlay(key: PlayAnimationConfig, children: GameObject, stagger: Number): G
    open fun <G : Array<GameObject>> staggerPlay(
        key: PlayAnimationConfig,
        children: Array<GameObject>,
        stagger: Number,
        staggerFirst: Boolean = definedExternally
    ): G

    open fun <G : Array<GameObject>> staggerPlay(
        key: PlayAnimationConfig,
        children: Array<GameObject>,
        stagger: Number
    ): G

    open fun remove(key: String): Animation
    open fun resumeAll(): AnimationManager /* this */
    open fun toJSON(key: String = definedExternally): JSONAnimations
    override fun destroy()
}

open external class AnimationState(parent: GameObject) {
    open var parent: GameObject
    open var animationManager: AnimationManager
    open var textureManager: TextureManager
    open var anims: Map<String, Animation>
    open var isPlaying: Boolean
    open var hasStarted: Boolean
    open var currentAnim: Animation
    open var currentFrame: AnimationFrame
    open var nextAnim: dynamic /* String | Phaser.Animations.Animation | Phaser.Types.Animations.PlayAnimationConfig */
    open var nextAnimsQueue: Array<Any>
    open var timeScale: Number
    open var frameRate: Number
    open var duration: Number
    open var msPerFrame: Number
    open var skipMissedFrames: Boolean
    open var delay: Number
    open var repeat: Number
    open var repeatDelay: Number
    open var yoyo: Boolean
    open var showOnStart: Boolean
    open var hideOnComplete: Boolean
    open var forward: Boolean
    open var inReverse: Boolean
    open var accumulator: Number
    open var nextTick: Number
    open var delayCounter: Number
    open var repeatCounter: Number
    open var pendingRepeat: Boolean
    open fun chain(key: String = definedExternally): GameObject
    open fun chain(): GameObject
    open fun chain(key: Animation = definedExternally): GameObject
    open fun chain(key: PlayAnimationConfig = definedExternally): GameObject
    open fun chain(key: Array<String> = definedExternally): GameObject
    open fun chain(key: Array<Animation> = definedExternally): GameObject
    open fun chain(key: Array<PlayAnimationConfig> = definedExternally): GameObject
    open fun getName(): String
    open fun getFrameName(): String
    open fun load(key: String): GameObject
    open fun load(key: PlayAnimationConfig): GameObject
    open fun pause(atFrame: AnimationFrame = definedExternally): GameObject
    open fun resume(fromFrame: AnimationFrame = definedExternally): GameObject
    open fun playAfterDelay(key: String, delay: Number): GameObject
    open fun playAfterDelay(key: Animation, delay: Number): GameObject
    open fun playAfterDelay(key: PlayAnimationConfig, delay: Number): GameObject
    open fun playAfterRepeat(key: String, repeatCount: Number = definedExternally): GameObject
    open fun playAfterRepeat(key: String): GameObject
    open fun playAfterRepeat(key: Animation, repeatCount: Number = definedExternally): GameObject
    open fun playAfterRepeat(key: Animation): GameObject
    open fun playAfterRepeat(key: PlayAnimationConfig, repeatCount: Number = definedExternally): GameObject
    open fun playAfterRepeat(key: PlayAnimationConfig): GameObject
    open fun play(key: String, ignoreIfPlaying: Boolean = definedExternally): GameObject
    open fun play(key: String): GameObject
    open fun play(key: Animation, ignoreIfPlaying: Boolean = definedExternally): GameObject
    open fun play(key: Animation): GameObject
    open fun play(key: PlayAnimationConfig, ignoreIfPlaying: Boolean = definedExternally): GameObject
    open fun play(key: PlayAnimationConfig): GameObject
    open fun playReverse(key: String, ignoreIfPlaying: Boolean = definedExternally): GameObject
    open fun playReverse(key: String): GameObject
    open fun playReverse(key: Animation, ignoreIfPlaying: Boolean = definedExternally): GameObject
    open fun playReverse(key: Animation): GameObject
    open fun playReverse(key: PlayAnimationConfig, ignoreIfPlaying: Boolean = definedExternally): GameObject
    open fun playReverse(key: PlayAnimationConfig): GameObject
    open fun startAnimation(key: String): GameObject
    open fun startAnimation(key: PlayAnimationConfig): GameObject
    open fun reverse(): GameObject
    open fun getProgress(): Number
    open fun setProgress(value: Number = definedExternally): GameObject
    open fun setRepeat(value: Number): GameObject
    open fun globalRemove(key: String = definedExternally, animation: Animation = definedExternally)
    open fun restart(includeDelay: Boolean = definedExternally, resetRepeats: Boolean = definedExternally): GameObject
    open fun complete(): GameObject
    open fun stop(): GameObject
    open fun stopAfterDelay(delay: Number): GameObject
    open fun stopAfterRepeat(repeatCount: Number = definedExternally): GameObject
    open fun stopOnFrame(frame: AnimationFrame): GameObject
    open fun getTotalFrames(): Number
    open fun update(time: Number, delta: Number)
    open fun setCurrentFrame(animationFrame: AnimationFrame): GameObject
    open fun nextFrame(): GameObject
    open fun previousFrame(): GameObject
    open fun get(key: String): Animation
    open fun exists(key: String): Boolean
    open fun create(config: Phaser.Types.Animations.Animation): dynamic /* Phaser.Animations.Animation | Boolean */
    open fun createFromAseprite(key: String, tags: Array<String> = definedExternally): Array<Animation>
    open fun generateFrameNames(
        key: String,
        config: GenerateFrameNames = definedExternally
    ): Array<Phaser.Types.Animations.AnimationFrame>

    open fun generateFrameNumbers(
        key: String,
        config: GenerateFrameNumbers
    ): Array<Phaser.Types.Animations.AnimationFrame>

    open fun remove(key: String): Animation
    open fun destroy()
    open val isPaused: Boolean
}
