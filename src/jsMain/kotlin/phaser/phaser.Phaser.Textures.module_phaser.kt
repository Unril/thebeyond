@file:JsQualifier("Phaser.Textures")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Textures

import EachTextureCallback
import Phaser.Display.Color
import Phaser.Events.EventEmitter
import Phaser.Game
import Phaser.GameObjects.GameObject
import Phaser.GameObjects.RenderTexture
import Phaser.Types.Create.GenerateTextureConfig
import Phaser.Types.Textures.CompressedTextureData
import Phaser.Types.Textures.PixelConfig
import Phaser.Types.Textures.SpriteSheetConfig
import Phaser.Types.Textures.SpriteSheetFromAtlasConfig
import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.Uint32Array
import org.khronos.webgl.Uint8ClampedArray
import org.khronos.webgl.WebGLTexture
import org.w3c.dom.*

open external class CanvasTexture(
    manager: TextureManager,
    key: String,
    source: HTMLCanvasElement,
    width: Number,
    height: Number
) : Texture {
    open val canvas: HTMLCanvasElement
    open val context: CanvasRenderingContext2D
    open val width: Number
    open val height: Number
    open var imageData: ImageData
    open var data: Uint8ClampedArray
    open var pixels: Uint32Array
    open var buffer: ArrayBuffer
    open fun update(): CanvasTexture
    open fun draw(x: Number, y: Number, source: HTMLImageElement): CanvasTexture
    open fun draw(x: Number, y: Number, source: HTMLCanvasElement): CanvasTexture
    open fun drawFrame(
        key: String,
        frame: String = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): CanvasTexture

    open fun drawFrame(key: String): CanvasTexture
    open fun drawFrame(key: String, frame: String = definedExternally): CanvasTexture
    open fun drawFrame(key: String, frame: String = definedExternally, x: Number = definedExternally): CanvasTexture
    open fun drawFrame(
        key: String,
        frame: Number = definedExternally,
        x: Number = definedExternally,
        y: Number = definedExternally
    ): CanvasTexture

    open fun drawFrame(key: String, frame: Number = definedExternally): CanvasTexture
    open fun drawFrame(key: String, frame: Number = definedExternally, x: Number = definedExternally): CanvasTexture
    open fun setPixel(
        x: Number,
        y: Number,
        red: Number,
        green: Number,
        blue: Number,
        alpha: Number = definedExternally
    ): CanvasTexture /* this */

    open fun putData(
        imageData: ImageData,
        x: Number,
        y: Number,
        dirtyX: Number = definedExternally,
        dirtyY: Number = definedExternally,
        dirtyWidth: Number = definedExternally,
        dirtyHeight: Number = definedExternally
    ): CanvasTexture /* this */

    open fun getData(x: Number, y: Number, width: Number, height: Number): ImageData
    open fun getPixel(x: Number, y: Number, out: Color = definedExternally): Color
    open fun getPixels(
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Array<Array<PixelConfig>>

    open fun getIndex(x: Number, y: Number): Number
    open fun refresh(): CanvasTexture
    open fun getCanvas(): HTMLCanvasElement
    open fun getContext(): CanvasRenderingContext2D
    open fun clear(
        x: Number = definedExternally,
        y: Number = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): CanvasTexture

    open fun setSize(width: Number, height: Number = definedExternally): CanvasTexture
    override fun destroy()
}

external enum class FilterMode {
    LINEAR,
    NEAREST
}

open external class Frame {
    constructor(
        texture: Texture,
        name: Number,
        sourceIndex: Number,
        x: Number,
        y: Number,
        width: Number,
        height: Number
    )

    constructor(
        texture: Texture,
        name: String,
        sourceIndex: Number,
        x: Number,
        y: Number,
        width: Number,
        height: Number
    )

    open var texture: Texture
    open var name: String
    open var source: TextureSource
    open var sourceIndex: Number
    open var glTexture: WebGLTexture
    open var cutX: Number
    open var cutY: Number
    open var cutWidth: Number
    open var cutHeight: Number
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var halfWidth: Number
    open var halfHeight: Number
    open var centerX: Number
    open var centerY: Number
    open var pivotX: Number
    open var pivotY: Number
    open var customPivot: Boolean
    open var rotated: Boolean
    open var autoRound: Number
    open var customData: Any?
    open var u0: Number
    open var v0: Number
    open var u1: Number
    open var v1: Number
    open fun setSize(width: Number, height: Number, x: Number = definedExternally, y: Number = definedExternally): Frame
    open fun setTrim(
        actualWidth: Number,
        actualHeight: Number,
        destX: Number,
        destY: Number,
        destWidth: Number,
        destHeight: Number
    ): Frame

    open fun setCropUVs(
        crop: Any?,
        x: Number,
        y: Number,
        width: Number,
        height: Number,
        flipX: Boolean,
        flipY: Boolean
    ): Any?

    open fun updateCropUVs(crop: Any?, flipX: Boolean, flipY: Boolean): Any?
    open fun setUVs(width: Number, height: Number, u0: Number, v0: Number, u1: Number, v1: Number): Frame
    open fun updateUVs(): Frame
    open fun updateUVsInverted(): Frame
    open fun clone(): Frame
    open fun destroy()
    open val realWidth: Number
    open val realHeight: Number
    open val radius: Number
    open val trimmed: Boolean
    open val canvasData: Any?
}

external var LINEAR: Number

external var NEAREST: Number

open external class Texture {
    constructor(
        manager: TextureManager,
        key: String,
        source: HTMLImageElement,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(manager: TextureManager, key: String, source: HTMLImageElement)
    constructor(manager: TextureManager, key: String, source: HTMLImageElement, width: Number = definedExternally)
    constructor(
        manager: TextureManager,
        key: String,
        source: HTMLCanvasElement,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(manager: TextureManager, key: String, source: HTMLCanvasElement)
    constructor(manager: TextureManager, key: String, source: HTMLCanvasElement, width: Number = definedExternally)
    constructor(
        manager: TextureManager,
        key: String,
        source: Array<HTMLImageElement>,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(manager: TextureManager, key: String, source: Array<HTMLImageElement>)
    constructor(
        manager: TextureManager,
        key: String,
        source: Array<HTMLImageElement>,
        width: Number = definedExternally
    )

    constructor(
        manager: TextureManager,
        key: String,
        source: Array<HTMLCanvasElement>,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(manager: TextureManager, key: String, source: Array<HTMLCanvasElement>)
    constructor(
        manager: TextureManager,
        key: String,
        source: Array<HTMLCanvasElement>,
        width: Number = definedExternally
    )

    open var manager: TextureManager
    open var key: String
    open var source: Array<TextureSource>
    open var dataSource: Array<Any>
    open var frames: Any?
    open var customData: Any?
    open var firstFrame: String
    open var frameTotal: Number
    open fun add(name: Number, sourceIndex: Number, x: Number, y: Number, width: Number, height: Number): Frame
    open fun add(name: String, sourceIndex: Number, x: Number, y: Number, width: Number, height: Number): Frame
    open fun remove(name: String): Boolean
    open fun has(name: String): Boolean
    open fun get(name: String = definedExternally): Frame
    open fun get(): Frame
    open fun get(name: Number = definedExternally): Frame
    open fun getTextureSourceIndex(source: TextureSource): Number
    open fun getFramesFromTextureSource(sourceIndex: Number, includeBase: Boolean = definedExternally): Array<Frame>
    open fun getFrameNames(includeBase: Boolean = definedExternally): Array<String>
    open fun getSourceImage(name: String = definedExternally): dynamic /* HTMLImageElement | HTMLCanvasElement | Phaser.GameObjects.RenderTexture */
    open fun getSourceImage(): dynamic /* HTMLImageElement | HTMLCanvasElement | Phaser.GameObjects.RenderTexture */
    open fun getSourceImage(name: Number = definedExternally): dynamic /* HTMLImageElement | HTMLCanvasElement | Phaser.GameObjects.RenderTexture */
    open fun getDataSourceImage(name: String = definedExternally): dynamic /* HTMLImageElement | HTMLCanvasElement */
    open fun getDataSourceImage(): dynamic /* HTMLImageElement | HTMLCanvasElement */
    open fun getDataSourceImage(name: Number = definedExternally): dynamic /* HTMLImageElement | HTMLCanvasElement */
    open fun setDataSource(data: HTMLImageElement)
    open fun setDataSource(data: HTMLCanvasElement)
    open fun setDataSource(data: Array<HTMLImageElement>)
    open fun setDataSource(data: Array<HTMLCanvasElement>)
    open fun setFilter(filterMode: FilterMode)
    open fun destroy()
}

open external class TextureManager(game: Game) : EventEmitter {
    open var game: Game
    open var name: String
    open var list: Any?
    open fun checkKey(key: String): Boolean
    open fun remove(key: String): TextureManager
    open fun remove(key: Texture): TextureManager
    open fun removeKey(key: String): TextureManager
    open fun addBase64(key: String, data: Any): TextureManager /* this */
    open fun getBase64(
        key: String,
        frame: String = definedExternally,
        type: String = definedExternally,
        encoderOptions: Number = definedExternally
    ): String

    open fun getBase64(key: String): String
    open fun getBase64(key: String, frame: String = definedExternally): String
    open fun getBase64(key: String, frame: String = definedExternally, type: String = definedExternally): String
    open fun getBase64(
        key: String,
        frame: Number = definedExternally,
        type: String = definedExternally,
        encoderOptions: Number = definedExternally
    ): String

    open fun getBase64(key: String, frame: Number = definedExternally): String
    open fun getBase64(key: String, frame: Number = definedExternally, type: String = definedExternally): String
    open fun addImage(key: String, source: HTMLImageElement, dataSource: HTMLImageElement = definedExternally): Texture
    open fun addImage(key: String, source: HTMLImageElement): Texture
    open fun addImage(key: String, source: HTMLImageElement, dataSource: HTMLCanvasElement = definedExternally): Texture
    open fun addGLTexture(
        key: String,
        glTexture: WebGLTexture,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): Texture

    open fun addCompressedTexture(
        key: String,
        textureData: CompressedTextureData,
        atlasData: Any? = definedExternally
    ): Texture

    open fun addRenderTexture(key: String, renderTexture: RenderTexture): Texture
    open fun generate(key: String, config: GenerateTextureConfig): Texture
    open fun createCanvas(
        key: String,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): CanvasTexture

    open fun addCanvas(key: String, source: HTMLCanvasElement, skipCache: Boolean = definedExternally): CanvasTexture
    open fun addAtlas(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: HTMLImageElement = definedExternally
    ): Texture

    open fun addAtlas(key: String, source: HTMLImageElement, data: Any?): Texture
    open fun addAtlas(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: HTMLCanvasElement = definedExternally
    ): Texture

    open fun addAtlas(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: Array<HTMLImageElement> = definedExternally
    ): Texture

    open fun addAtlas(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: Array<HTMLCanvasElement> = definedExternally
    ): Texture

    open fun addAtlasJSONArray(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: Any /* HTMLImageElement | HTMLCanvasElement | Array<HTMLImageElement> | Array<HTMLCanvasElement> */ = definedExternally
    ): Texture

    open fun addAtlasJSONArray(key: String, source: HTMLImageElement, data: Any?): Texture
    open fun addAtlasJSONArray(
        key: String,
        source: HTMLImageElement,
        data: Array<Any?>?,
        dataSource: Any /* HTMLImageElement | HTMLCanvasElement | Array<HTMLImageElement> | Array<HTMLCanvasElement> */ = definedExternally
    ): Texture

    open fun addAtlasJSONArray(key: String, source: HTMLImageElement, data: Array<Any?>?): Texture
    open fun addAtlasJSONArray(
        key: String,
        source: Array<HTMLImageElement>,
        data: Any?,
        dataSource: Any /* HTMLImageElement | HTMLCanvasElement | Array<HTMLImageElement> | Array<HTMLCanvasElement> */ = definedExternally
    ): Texture

    open fun addAtlasJSONArray(key: String, source: Array<HTMLImageElement>, data: Any?): Texture
    open fun addAtlasJSONArray(
        key: String,
        source: Array<HTMLImageElement>,
        data: Array<Any?>?,
        dataSource: Any /* HTMLImageElement | HTMLCanvasElement | Array<HTMLImageElement> | Array<HTMLCanvasElement> */ = definedExternally
    ): Texture

    open fun addAtlasJSONArray(key: String, source: Array<HTMLImageElement>, data: Array<Any?>?): Texture
    open fun addAtlasJSONHash(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: HTMLImageElement = definedExternally
    ): Texture

    open fun addAtlasJSONHash(key: String, source: HTMLImageElement, data: Any?): Texture
    open fun addAtlasJSONHash(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: HTMLCanvasElement = definedExternally
    ): Texture

    open fun addAtlasJSONHash(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: Array<HTMLImageElement> = definedExternally
    ): Texture

    open fun addAtlasJSONHash(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: Array<HTMLCanvasElement> = definedExternally
    ): Texture

    open fun addAtlasXML(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: HTMLImageElement = definedExternally
    ): Texture

    open fun addAtlasXML(key: String, source: HTMLImageElement, data: Any?): Texture
    open fun addAtlasXML(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: HTMLCanvasElement = definedExternally
    ): Texture

    open fun addAtlasXML(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: Array<HTMLImageElement> = definedExternally
    ): Texture

    open fun addAtlasXML(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: Array<HTMLCanvasElement> = definedExternally
    ): Texture

    open fun addUnityAtlas(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: HTMLImageElement = definedExternally
    ): Texture

    open fun addUnityAtlas(key: String, source: HTMLImageElement, data: Any?): Texture
    open fun addUnityAtlas(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: HTMLCanvasElement = definedExternally
    ): Texture

    open fun addUnityAtlas(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: Array<HTMLImageElement> = definedExternally
    ): Texture

    open fun addUnityAtlas(
        key: String,
        source: HTMLImageElement,
        data: Any?,
        dataSource: Array<HTMLCanvasElement> = definedExternally
    ): Texture

    open fun addSpriteSheet(key: String, source: HTMLImageElement, config: SpriteSheetConfig): Texture
    open fun addSpriteSheetFromAtlas(key: String, config: SpriteSheetFromAtlasConfig): Texture
    open fun create(key: String, source: HTMLImageElement, width: Number, height: Number): Texture
    open fun exists(key: String): Boolean
    open fun get(key: String): Texture
    open fun get(key: Texture): Texture
    open fun cloneFrame(key: String, frame: String): Frame
    open fun cloneFrame(key: String, frame: Number): Frame
    open fun getFrame(key: String, frame: String = definedExternally): Frame
    open fun getFrame(key: String): Frame
    open fun getFrame(key: String, frame: Number = definedExternally): Frame
    open fun getTextureKeys(): Array<String>
    open fun getPixel(x: Number, y: Number, key: String, frame: String = definedExternally): Color
    open fun getPixel(x: Number, y: Number, key: String): Color
    open fun getPixel(x: Number, y: Number, key: String, frame: Number = definedExternally): Color
    open fun getPixelAlpha(x: Number, y: Number, key: String, frame: String = definedExternally): Number
    open fun getPixelAlpha(x: Number, y: Number, key: String): Number
    open fun getPixelAlpha(x: Number, y: Number, key: String, frame: Number = definedExternally): Number
    open fun setTexture(gameObject: GameObject, key: String, frame: String = definedExternally): GameObject
    open fun setTexture(gameObject: GameObject, key: String): GameObject
    open fun setTexture(gameObject: GameObject, key: String, frame: Number = definedExternally): GameObject
    open fun renameTexture(currentKey: String, newKey: String): Boolean
    open fun each(callback: EachTextureCallback, scope: Any?, vararg args: Any)
    override fun destroy()
}

open external class TextureSource {
    constructor(
        texture: Texture,
        source: HTMLImageElement,
        width: Number = definedExternally,
        height: Number = definedExternally,
        flipY: Boolean = definedExternally
    )

    constructor(texture: Texture, source: HTMLImageElement)
    constructor(texture: Texture, source: HTMLImageElement, width: Number = definedExternally)
    constructor(
        texture: Texture,
        source: HTMLImageElement,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(
        texture: Texture,
        source: HTMLCanvasElement,
        width: Number = definedExternally,
        height: Number = definedExternally,
        flipY: Boolean = definedExternally
    )

    constructor(texture: Texture, source: HTMLCanvasElement)
    constructor(texture: Texture, source: HTMLCanvasElement, width: Number = definedExternally)
    constructor(
        texture: Texture,
        source: HTMLCanvasElement,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(
        texture: Texture,
        source: HTMLVideoElement,
        width: Number = definedExternally,
        height: Number = definedExternally,
        flipY: Boolean = definedExternally
    )

    constructor(texture: Texture, source: HTMLVideoElement)
    constructor(texture: Texture, source: HTMLVideoElement, width: Number = definedExternally)
    constructor(
        texture: Texture,
        source: HTMLVideoElement,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(
        texture: Texture,
        source: RenderTexture,
        width: Number = definedExternally,
        height: Number = definedExternally,
        flipY: Boolean = definedExternally
    )

    constructor(texture: Texture, source: RenderTexture)
    constructor(texture: Texture, source: RenderTexture, width: Number = definedExternally)
    constructor(
        texture: Texture,
        source: RenderTexture,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(
        texture: Texture,
        source: WebGLTexture,
        width: Number = definedExternally,
        height: Number = definedExternally,
        flipY: Boolean = definedExternally
    )

    constructor(texture: Texture, source: WebGLTexture)
    constructor(texture: Texture, source: WebGLTexture, width: Number = definedExternally)
    constructor(
        texture: Texture,
        source: WebGLTexture,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var texture: Texture
    open var source: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | Phaser.GameObjects.RenderTexture | WebGLTexture | Phaser.Types.Textures.CompressedTextureData */
    open var image: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement */
    open var compressionAlgorithm: Number
    open var resolution: Number
    open var width: Number
    open var height: Number
    open var scaleMode: Number
    open var isCanvas: Boolean
    open var isVideo: Boolean
    open var isRenderTexture: Boolean
    open var isGLTexture: Boolean
    open var isPowerOf2: Boolean
    open var glTexture: WebGLTexture
    open var glIndex: Number
    open var glIndexCounter: Number
    open var flipY: Boolean
    open fun init(game: Game)
    open fun setFilter(filterMode: FilterMode)
    open fun setFlipY(value: Boolean = definedExternally)
    open fun update()
    open fun destroy()
}
