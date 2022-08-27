@file:JsQualifier("Phaser.Sound")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Sound

import Phaser.Cache.BaseCache
import Phaser.Events.EventEmitter
import Phaser.Game
import Phaser.Types.Sound.DecodeAudioConfig
import Phaser.Types.Sound.SoundConfig
import Phaser.Types.Sound.SoundMarker
import org.khronos.webgl.ArrayBuffer
import tsstdlib.*

external interface `T$21` {
    @nativeGetter
    operator fun get(key: String): SoundMarker?

    @nativeSetter
    operator fun set(key: String, value: SoundMarker)
}

external open class BaseSound(manager: BaseSoundManager, key: String, config: SoundConfig = definedExternally) :
    EventEmitter {
    open val key: String
    open val isPlaying: Boolean
    open val isPaused: Boolean
    open val totalRate: Number
    open val duration: Number
    open val totalDuration: Number
    open val markers: `T$21`
    open val currentMarker: SoundMarker
    open fun addMarker(marker: SoundMarker): Boolean
    open fun updateMarker(marker: SoundMarker): Boolean
    open fun removeMarker(markerName: String): SoundMarker
    open fun play(markerName: String = definedExternally, config: SoundConfig = definedExternally): Boolean
    open fun play(): Boolean
    open fun play(markerName: String = definedExternally): Boolean
    open fun play(markerName: SoundConfig = definedExternally, config: SoundConfig = definedExternally): Boolean
    open fun play(markerName: SoundConfig = definedExternally): Boolean
    open fun pause(): Boolean
    open fun resume(): Boolean
    open fun stop(): Boolean
    open fun applyConfig()
    open fun resetConfig()
    open fun update(time: Number, delta: Number)
    open fun calculateRate()
    override fun destroy()
}

external open class BaseSoundManager(game: Game) : EventEmitter {
    open val game: Game
    open val jsonCache: BaseCache
    open var mute: Boolean
    open var volume: Number
    open var pauseOnBlur: Boolean
    open val locked: Boolean
    open fun add(key: String, config: SoundConfig = definedExternally): BaseSound
    open fun addAudioSprite(
        key: String,
        config: SoundConfig = definedExternally
    ): dynamic /* Phaser.Sound.HTML5AudioSound | Phaser.Sound.WebAudioSound */

    open fun get(key: String): BaseSound
    open fun getAll(key: String): Array<BaseSound>
    open fun play(key: String, extra: SoundConfig = definedExternally): Boolean
    open fun play(key: String): Boolean
    open fun play(key: String, extra: SoundMarker = definedExternally): Boolean
    open fun playAudioSprite(key: String, spriteName: String, config: SoundConfig = definedExternally): Boolean
    open fun remove(sound: BaseSound): Boolean
    open fun removeAll()
    open fun removeByKey(key: String): Number
    open fun pauseAll()
    open fun resumeAll()
    open fun stopAll()
    open fun stopByKey(key: String): Number
    open fun unlock()
    open fun onBlur()
    open fun onFocus()
    open fun update(time: Number, delta: Number)
    override fun destroy()
    open fun setRate(value: Number): BaseSoundManager
    open var rate: Number
    open fun setDetune(value: Number): BaseSoundManager
    open var detune: Number
}

external open class HTML5AudioSound(
    manager: HTML5AudioSoundManager,
    key: String,
    config: SoundConfig = definedExternally
) : BaseSound {
    override fun play(markerName: String, config: SoundConfig): Boolean
    override fun play(): Boolean
    override fun play(markerName: String): Boolean
    override fun play(markerName: SoundConfig, config: SoundConfig): Boolean
    override fun play(markerName: SoundConfig): Boolean
    override fun pause(): Boolean
    override fun resume(): Boolean
    override fun stop(): Boolean
    open fun update(time: Number)
    override fun destroy()
    override fun calculateRate()
    open var mute: Boolean
    open fun setMute(value: Boolean): HTML5AudioSound /* this */
    open var volume: Number
    open fun setVolume(value: Number): HTML5AudioSound /* this */
    open var rate: Number
    open fun setRate(value: Number): HTML5AudioSound /* this */
    open var detune: Number
    open fun setDetune(value: Number): HTML5AudioSound /* this */
    open var seek: Number
    open fun setSeek(value: Number): HTML5AudioSound /* this */
    open var loop: Boolean
    open fun setLoop(value: Boolean): HTML5AudioSound
    open var pan: Number
    open fun setPan(value: Number): HTML5AudioSound /* this */
}

external open class HTML5AudioSoundManager(game: Game) : BaseSoundManager {
    open var override: Boolean
    open var audioPlayDelay: Number
    open var loopEndOffset: Number
    override fun add(key: String, config: SoundConfig): HTML5AudioSound
    override fun unlock()
    override fun onBlur()
    override fun onFocus()
    override fun destroy()
    open fun isLocked(sound: HTML5AudioSound, prop: String, value: Any = definedExternally): Boolean
    open fun setMute(value: Boolean): HTML5AudioSoundManager
    override var mute: Boolean
    open fun setVolume(value: Number): HTML5AudioSoundManager
    override var volume: Number
}

external open class NoAudioSound(manager: NoAudioSoundManager, key: String, config: SoundConfig = definedExternally) {
    open fun addMarker(marker: SoundMarker): Boolean
    open fun updateMarker(marker: SoundMarker): Boolean
    open fun removeMarker(markerName: String): Nothing?
    open fun play(markerName: String = definedExternally, config: SoundConfig = definedExternally): Boolean
    open fun play(): Boolean
    open fun play(markerName: String = definedExternally): Boolean
    open fun play(markerName: SoundConfig = definedExternally, config: SoundConfig = definedExternally): Boolean
    open fun play(markerName: SoundConfig = definedExternally): Boolean
    open fun pause(): Boolean
    open fun resume(): Boolean
    open fun stop(): Boolean
    open fun destroy()
}

external open class NoAudioSoundManager(game: Game) : BaseSoundManager

external fun SoundManagerCreator(game: Game): dynamic /* Phaser.Sound.HTML5AudioSoundManager | Phaser.Sound.WebAudioSoundManager | Phaser.Sound.NoAudioSoundManager */

external open class WebAudioSound(manager: WebAudioSoundManager, key: String, config: SoundConfig = definedExternally) :
    BaseSound {
    open var audioBuffer: AudioBuffer
    open var source: AudioBufferSourceNode
    open var loopSource: AudioBufferSourceNode
    open var muteNode: GainNode
    open var volumeNode: GainNode
    open var pannerNode: StereoPannerNode
    open val hasEnded: Boolean
    open val hasLooped: Boolean
    override fun play(markerName: String, config: SoundConfig): Boolean
    override fun play(): Boolean
    override fun play(markerName: String): Boolean
    override fun play(markerName: SoundConfig, config: SoundConfig): Boolean
    override fun play(markerName: SoundConfig): Boolean
    override fun pause(): Boolean
    override fun resume(): Boolean
    override fun stop(): Boolean
    override fun applyConfig()
    open fun update()
    override fun destroy()
    override fun calculateRate()
    open var rate: Number
    open fun setRate(value: Number): WebAudioSound /* this */
    open var detune: Number
    open fun setDetune(value: Number): WebAudioSound /* this */
    open var mute: Boolean
    open fun setMute(value: Boolean): WebAudioSound /* this */
    open var volume: Number
    open fun setVolume(value: Number): WebAudioSound /* this */
    open var seek: Number
    open fun setSeek(value: Number): WebAudioSound /* this */
    open var loop: Boolean
    open fun setLoop(value: Boolean): WebAudioSound /* this */
    open var pan: Number
    open fun setPan(value: Number): WebAudioSound /* this */
}

external open class WebAudioSoundManager(game: Game) : BaseSoundManager {
    open var context: AudioContext
    open var masterMuteNode: GainNode
    open var masterVolumeNode: GainNode
    open var destination: AudioNode
    open fun createAudioContext(game: Game): AudioContext
    open fun setAudioContext(context: AudioContext): WebAudioSoundManager /* this */
    override fun add(key: String, config: SoundConfig): WebAudioSound
    open fun decodeAudio(
        audioKey: Array<DecodeAudioConfig> = definedExternally,
        audioData: ArrayBuffer = definedExternally
    )

    open fun decodeAudio()
    open fun decodeAudio(audioKey: Array<DecodeAudioConfig> = definedExternally)
    open fun decodeAudio(audioKey: Array<DecodeAudioConfig> = definedExternally, audioData: String = definedExternally)
    open fun decodeAudio(audioKey: String = definedExternally, audioData: ArrayBuffer = definedExternally)
    open fun decodeAudio(audioKey: String = definedExternally)
    open fun decodeAudio(audioKey: String = definedExternally, audioData: String = definedExternally)
    override fun unlock()
    override fun onBlur()
    override fun onFocus()
    override fun update(time: Number, delta: Number)
    override fun destroy()
    open fun setMute(value: Boolean): WebAudioSoundManager
    override var mute: Boolean
    open fun setVolume(value: Number): WebAudioSoundManager
    override var volume: Number
}
