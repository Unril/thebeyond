@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Loader.FileTypes

import Phaser.Types.Loader.FileConfig
import Phaser.Types.Loader.XHRSettingsObject
import tsstdlib.AudioContext

external interface AsepriteFileConfig {
    var key: String
    var textureURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var atlasURL: dynamic /* Any? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var atlasExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AtlasJSONFileConfig {
    var key: String
    var textureURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var normalMap: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasURL: dynamic /* Any? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var atlasExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AtlasXMLFileConfig {
    var key: String
    var textureURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var normalMap: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AudioFileConfig {
    var key: String
    var url: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var context: AudioContext?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AudioSpriteFileConfig {
    var key: String
    var jsonURL: String
    var jsonXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var audioURL: Any?
        get() = definedExternally
        set(value) = definedExternally
    var audioConfig: Any?
        get() = definedExternally
        set(value) = definedExternally
    var audioXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BinaryFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var dataType: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BitmapFontFileConfig {
    /**
     * The key of the file. Must be unique within both the Loader and the Texture Manager.
     */
    var key: String

    /**
     * The absolute or relative URL to load the texture image file from.
     */
    var textureURL: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The default file extension to use for the image texture if no url is provided.
     */
    var textureExtension: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Extra XHR Settings specifically for the texture image file.
     */
    var textureXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The filename of an associated normal map. It uses the same path and url to load as the texture image.
     */
    var normalMap: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The absolute or relative URL to load the font data xml file from.
     */
    var fontDataURL: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The default file extension to use for the font data xml if no url is provided.
     */
    var fontDataExtension: String?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * Extra XHR Settings specifically for the font data xml file.
     */
    var fontDataXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CompressedTextureFileEntry {
    var format: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var multiAtlasURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var multiPath: String?
        get() = definedExternally
        set(value) = definedExternally
    var multiBaseURL: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CompressedTextureFileConfig {
    var ETC: dynamic /* Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var ETC1: dynamic /* Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var ATC: dynamic /* Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var ASTC: dynamic /* Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var BPTC: dynamic /* Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var RGTC: dynamic /* Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var PVRTC: dynamic /* Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var S3TC: dynamic /* Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var S3TCRGB: dynamic /* Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var IMG: dynamic /* Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CSSFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GLSLFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var shaderType: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface HTMLFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface HTMLTextureFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ImageFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var normalMap: String?
        get() = definedExternally
        set(value) = definedExternally
    var frameConfig: ImageFrameConfig?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ImageFrameConfig {
    var frameWidth: Number
    var frameHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endFrame: Number?
        get() = definedExternally
        set(value) = definedExternally
    var margin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spacing: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface JSONFileConfig {
    var key: String
    var url: dynamic /* String? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MultiAtlasFileConfig {
    var key: String
    var atlasURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var baseURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MultiScriptFileConfig {
    var key: String
    var url: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OBJFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var flipUV: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var matURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var matExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PackFileConfig {
    var key: String
    var url: dynamic /* String? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PackFileSection {
    var files: Array<FileConfig>
    var baseURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var defaultType: String?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PluginFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var start: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mapping: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SceneFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScenePluginFileConfig {
    var key: String
    var url: dynamic /* String? | Function<*>? */
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var systemKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var sceneKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScriptFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SpriteSheetFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var normalMap: String?
        get() = definedExternally
        set(value) = definedExternally
    var frameConfig: ImageFrameConfig?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SVGFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var svgConfig: SVGSizeConfig?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SVGSizeConfig {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scale: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TextFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TilemapCSVFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TilemapImpactFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TilemapJSONFileConfig {
    var key: String
    var url: dynamic /* Any? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface UnityAtlasFileConfig {
    var key: String
    var textureURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
    var normalMap: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasExtension: String?
        get() = definedExternally
        set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VideoFileConfig {
    var key: dynamic /* String | Phaser.Types.Loader.FileTypes.VideoFileConfig */
        get() = definedExternally
        set(value) = definedExternally
    var url: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var loadEvent: String?
        get() = definedExternally
        set(value) = definedExternally
    var asBlob: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noAudio: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface XMLFileConfig {
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: XHRSettingsObject?
        get() = definedExternally
        set(value) = definedExternally
}
