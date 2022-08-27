@file:JsQualifier("Phaser.Loader.FileTypes")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Loader.FileTypes

import Phaser.Loader.File
import Phaser.Loader.LoaderPlugin
import Phaser.Loader.MultiFile
import Phaser.Types.Loader.FileTypes.*
import Phaser.Types.Loader.XHRSettingsObject
import tsstdlib.AudioContext

open external class AnimationJSONFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        dataKey: String = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: JSONFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        dataKey: String = definedExternally
    )

    constructor(loader: LoaderPlugin, key: JSONFileConfig)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: JSONFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    override fun onProcess()
    open fun onLoadComplete()
}

open external class AsepriteFile : MultiFile {
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: AsepriteFileConfig)
    constructor(loader: LoaderPlugin, key: AsepriteFileConfig, textureURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: AsepriteFileConfig, textureURL: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AsepriteFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    open fun addToCache()
}

open external class AtlasJSONFile : MultiFile {
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig)
    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: String = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: AtlasJSONFileConfig, textureURL: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: Any? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasJSONFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    open fun addToCache()
}

open external class AtlasXMLFile : MultiFile {
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig)
    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AtlasXMLFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    open fun addToCache()
}

open external class AudioFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        urlConfig: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        audioContext: AudioContext = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        urlConfig: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        audioContext: AudioContext = definedExternally
    )

    constructor(loader: LoaderPlugin, key: AudioFileConfig)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: Any = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    override fun onProcess()
}

open external class AudioSpriteFile : MultiFile {
    constructor(
        loader: LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: Any = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally,
        jsonXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String, jsonURL: String)
    constructor(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: Any = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: Any = definedExternally,
        audioConfig: Any = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        jsonURL: String,
        audioURL: Any = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Any = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally,
        jsonXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String)
    constructor(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String, audioURL: Any = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Any = definedExternally,
        audioConfig: Any = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Any = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally
    )

    override fun onFileComplete(file: File)
    open fun addToCache()
}

open external class BinaryFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        dataType: Any = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: BinaryFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        dataType: Any = definedExternally
    )

    constructor(loader: LoaderPlugin, key: BinaryFileConfig)
    constructor(loader: LoaderPlugin, key: BinaryFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: BinaryFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    override fun onProcess()
}

open external class BitmapFontFile : MultiFile {
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        fontDataURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        fontDataXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        fontDataURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        fontDataURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        fontDataURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        fontDataXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        fontDataURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        fontDataURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String = definedExternally,
        fontDataURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        fontDataXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig)
    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String = definedExternally,
        fontDataURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: String = definedExternally,
        fontDataURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: Array<String> = definedExternally,
        fontDataURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        fontDataXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: Array<String> = definedExternally,
        fontDataURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: BitmapFontFileConfig,
        textureURL: Array<String> = definedExternally,
        fontDataURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    open fun addToCache()
}

open external class CompressedTextureFile(
    loader: LoaderPlugin,
    key: String,
    entry: CompressedTextureFileEntry,
    xhrSettings: XHRSettingsObject = definedExternally
) : MultiFile {
    override fun onFileComplete(file: File)
    open fun addToCache()
    open fun addMultiToCache()
}

open external class CSSFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: CSSFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: CSSFileConfig)
    constructor(loader: LoaderPlugin, key: CSSFileConfig, url: String = definedExternally)

    override fun onProcess()
}

open external class GLSLFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        shaderType: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        shaderType: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: GLSLFileConfig,
        url: String = definedExternally,
        shaderType: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: GLSLFileConfig)
    constructor(loader: LoaderPlugin, key: GLSLFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: GLSLFileConfig,
        url: String = definedExternally,
        shaderType: String = definedExternally
    )

    override fun onProcess()
    override fun addToCache()
    open fun getShaderName(headerSource: Array<String>): String
    open fun getShaderType(headerSource: Array<String>): String
    open fun getShaderUniforms(headerSource: Array<String>): Any
}

open external class HTML5AudioFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        urlConfig: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, urlConfig: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: AudioFileConfig,
        urlConfig: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: AudioFileConfig)
    constructor(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: String = definedExternally)

    open fun onLoad()
    open fun onError()
    open fun onProgress()
    override fun load()
}

open external class HTMLFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: HTMLFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: HTMLFileConfig)
    constructor(loader: LoaderPlugin, key: HTMLFileConfig, url: String = definedExternally)

    override fun onProcess()
}

open external class HTMLTextureFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, width: Number = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: HTMLTextureFileConfig)
    constructor(loader: LoaderPlugin, key: HTMLTextureFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String = definedExternally,
        width: Number = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: HTMLTextureFileConfig,
        url: String = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    )

    override fun onProcess()
    override fun addToCache()
}

open external class ImageFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        url: Array<String> = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: Array<String> = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: ImageFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    )

    constructor(loader: LoaderPlugin, key: ImageFileConfig)
    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: ImageFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: ImageFileConfig,
        url: Array<String> = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    )

    constructor(loader: LoaderPlugin, key: ImageFileConfig, url: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: ImageFileConfig,
        url: Array<String> = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    override fun onProcess()
    override fun addToCache()
}

open external class JSONFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: Any? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        dataKey: String = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: Any? = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: Any? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        dataKey: String = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String, url: String? = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: JSONFileConfig,
        url: Any? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        dataKey: String = definedExternally
    )

    constructor(loader: LoaderPlugin, key: JSONFileConfig)
    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: Any? = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: JSONFileConfig,
        url: Any? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: JSONFileConfig,
        url: String? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        dataKey: String = definedExternally
    )

    constructor(loader: LoaderPlugin, key: JSONFileConfig, url: String? = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: JSONFileConfig,
        url: String? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    override fun onProcess()
}

open external class MultiAtlasFile : MultiFile {
    constructor(
        loader: LoaderPlugin,
        key: String,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, atlasURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        atlasURL: String = definedExternally,
        path: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: MultiAtlasFileConfig,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: MultiAtlasFileConfig)
    constructor(loader: LoaderPlugin, key: MultiAtlasFileConfig, atlasURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: MultiAtlasFileConfig,
        atlasURL: String = definedExternally,
        path: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: MultiAtlasFileConfig,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: MultiAtlasFileConfig,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    override fun onFileComplete(file: File)
    open fun addToCache()
}

open external class MultiScriptFile : MultiFile {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: Array<String> = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: MultiScriptFileConfig,
        url: Array<String> = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: MultiScriptFileConfig)
    constructor(loader: LoaderPlugin, key: MultiScriptFileConfig, url: Array<String> = definedExternally)

    open fun addToCache()
}

open external class OBJFile : MultiFile {
    constructor(
        loader: LoaderPlugin,
        key: String,
        objURL: String = definedExternally,
        matURL: String = definedExternally,
        flipUV: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, objURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        objURL: String = definedExternally,
        matURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        objURL: String = definedExternally,
        matURL: String = definedExternally,
        flipUV: Boolean = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: OBJFileConfig,
        objURL: String = definedExternally,
        matURL: String = definedExternally,
        flipUV: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: OBJFileConfig)
    constructor(loader: LoaderPlugin, key: OBJFileConfig, objURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: OBJFileConfig,
        objURL: String = definedExternally,
        matURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: OBJFileConfig,
        objURL: String = definedExternally,
        matURL: String = definedExternally,
        flipUV: Boolean = definedExternally
    )

    open fun addToCache()
}

open external class PackFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        dataKey: String = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: PackFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally,
        dataKey: String = definedExternally
    )

    constructor(loader: LoaderPlugin, key: PackFileConfig)
    constructor(loader: LoaderPlugin, key: PackFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: PackFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    override fun onProcess()
}

open external class PluginFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, start: Boolean = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: PluginFileConfig,
        url: String = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: PluginFileConfig)
    constructor(loader: LoaderPlugin, key: PluginFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: PluginFileConfig,
        url: String = definedExternally,
        start: Boolean = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: PluginFileConfig,
        url: String = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally
    )

    override fun onProcess()
}

open external class SceneFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: SceneFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: SceneFileConfig)
    constructor(loader: LoaderPlugin, key: SceneFileConfig, url: String = definedExternally)

    override fun onProcess()
    override fun addToCache()
}

open external class ScenePluginFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        systemKey: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: ScenePluginFileConfig)
    constructor(loader: LoaderPlugin, key: ScenePluginFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String = definedExternally,
        systemKey: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: ScenePluginFileConfig,
        url: String = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally
    )

    override fun onProcess()
}

open external class ScriptFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        type: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally, type: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: ScriptFileConfig,
        url: String = definedExternally,
        type: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: ScriptFileConfig)
    constructor(loader: LoaderPlugin, key: ScriptFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: ScriptFileConfig,
        url: String = definedExternally,
        type: String = definedExternally
    )

    override fun onProcess()
}

open external class SpriteSheetFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        url: Array<String> = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String, url: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: Array<String> = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: String = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig)
    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: String = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: Array<String> = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: SpriteSheetFileConfig,
        url: Array<String> = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    )

    override fun addToCache()
}

open external class SVGFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        svgConfig: SVGSizeConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        svgConfig: SVGSizeConfig = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: SVGFileConfig,
        url: String = definedExternally,
        svgConfig: SVGSizeConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: SVGFileConfig)
    constructor(loader: LoaderPlugin, key: SVGFileConfig, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: SVGFileConfig,
        url: String = definedExternally,
        svgConfig: SVGSizeConfig = definedExternally
    )

    override fun onProcess()
    override fun addToCache()
}

open external class TextFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: TextFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: TextFileConfig)
    constructor(loader: LoaderPlugin, key: TextFileConfig, url: String = definedExternally)

    override fun onProcess()
}

open external class TilemapCSVFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: TilemapCSVFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: TilemapCSVFileConfig)
    constructor(loader: LoaderPlugin, key: TilemapCSVFileConfig, url: String = definedExternally)

    override fun onProcess()
    override fun addToCache()
}

open external class TilemapImpactFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: TilemapImpactFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: TilemapImpactFileConfig)
    constructor(loader: LoaderPlugin, key: TilemapImpactFileConfig, url: String = definedExternally)

    override fun addToCache()
}

open external class TilemapJSONFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: Any? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: Any? = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String, url: String? = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: TilemapJSONFileConfig,
        url: Any? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: TilemapJSONFileConfig)
    constructor(loader: LoaderPlugin, key: TilemapJSONFileConfig, url: Any? = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: TilemapJSONFileConfig,
        url: String? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: TilemapJSONFileConfig, url: String? = definedExternally)

    override fun addToCache()
}

open external class UnityAtlasFile : MultiFile {
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, textureURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String, textureURL: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig)
    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: Array<String> = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: UnityAtlasFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    )

    open fun addToCache()
}

open external class VideoFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        urlConfig: Any = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, urlConfig: Any = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: String,
        urlConfig: Any = definedExternally,
        loadEvent: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        urlConfig: Any = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: String,
        urlConfig: Any = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: VideoFileConfig,
        urlConfig: Any = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: VideoFileConfig)
    constructor(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: Any = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: VideoFileConfig,
        urlConfig: Any = definedExternally,
        loadEvent: String = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: VideoFileConfig,
        urlConfig: Any = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally
    )

    constructor(
        loader: LoaderPlugin,
        key: VideoFileConfig,
        urlConfig: Any = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally
    )

    override fun onProcess()
    override fun load()
}

open external class XMLFile : File {
    constructor(
        loader: LoaderPlugin,
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: String)
    constructor(loader: LoaderPlugin, key: String, url: String = definedExternally)
    constructor(
        loader: LoaderPlugin,
        key: XMLFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    )

    constructor(loader: LoaderPlugin, key: XMLFileConfig)
    constructor(loader: LoaderPlugin, key: XMLFileConfig, url: String = definedExternally)

    override fun onProcess()
}
