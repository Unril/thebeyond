@file:JsQualifier("Phaser.Loader")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Loader

import Phaser.Cache.CacheManager
import Phaser.Events.EventEmitter
import Phaser.Scene
import Phaser.Scenes.SceneManager
import Phaser.Scenes.Systems
import Phaser.Structs.Set
import Phaser.Textures.TextureManager
import Phaser.Types.Loader.FileConfig
import Phaser.Types.Loader.FileTypes.*
import Phaser.Types.Loader.XHRSettingsObject
import org.w3c.dom.HTMLImageElement
import org.w3c.files.Blob
import org.w3c.xhr.XMLHttpRequest
import tsstdlib.ProgressEvent__0

external var LOADER_IDLE: Number

external var LOADER_LOADING: Number

external var LOADER_PROCESSING: Number

external var LOADER_COMPLETE: Number

external var LOADER_SHUTDOWN: Number

external var LOADER_DESTROYED: Number

external var FILE_PENDING: Number

external var FILE_LOADING: Number

external var FILE_LOADED: Number

external var FILE_FAILED: Number

external var FILE_PROCESSING: Number

external var FILE_ERRORED: Number

external var FILE_COMPLETE: Number

external var FILE_DESTROYED: Number

external var FILE_POPULATED: Number

external var FILE_PENDING_DESTROY: Number

open external class File(loader: LoaderPlugin, fileConfig: FileConfig) {
    open var loader: LoaderPlugin
    open var cache: dynamic /* Phaser.Cache.BaseCache | Phaser.Textures.TextureManager */
    open var type: String
    open var key: String
    open var url: dynamic /* Any? | String? */
    open var src: String
    open var xhrSettings: XHRSettingsObject
    open var xhrLoader: XMLHttpRequest
    open var state: Number
    open var bytesTotal: Number
    open var bytesLoaded: Number
    open var percentComplete: Number
    open var crossOrigin: String?
    open var data: Any
    open var config: Any
    open var multiFile: MultiFile
    open var linkFile: File
    open fun setLink(fileB: File)
    open fun resetXHR()
    open fun load()
    open fun onLoad(xhr: XMLHttpRequest, event: ProgressEvent__0)
    open fun onError(xhr: XMLHttpRequest, event: ProgressEvent__0)
    open fun onProgress(event: ProgressEvent__0)
    open fun onProcess()
    open fun onProcessComplete()
    open fun onProcessError()
    open fun hasCacheConflict(): Boolean
    open fun addToCache()
    open fun pendingDestroy()
    open fun destroy()

    companion object {
        fun createObjectURL(image: HTMLImageElement, blob: Blob, defaultType: String)
        fun revokeObjectURL(image: HTMLImageElement)
    }
}

/**
 * Given a File and a baseURL value this returns the URL the File will use to download from.
 * @param file The File object.
 * @param baseURL A default base URL.
 */
external fun GetURL(file: File, baseURL: String): String

/**
 * The Loader handles loading all external content such as Images, Sounds, Texture Atlases and data files.
 * You typically interact with it via `this.load` in your Scene. Scenes can have a `preload` method, which is always
 * called before the Scenes `create` method, allowing you to preload assets that the Scene may need.
 *
 * If you call any `this.load` methods from outside of `Scene.preload` then you need to start the Loader going
 * yourself by calling `Loader.start()`. It's only automatically started during the Scene preload.
 *
 * The Loader uses a combination of tag loading (eg. Audio elements) and XHR and provides progress and completion events.
 * Files are loaded in parallel by default. The amount of concurrent connections can be controlled in your Game Configuration.
 *
 * Once the Loader has started loading you are still able to add files to it. These can be injected as a result of a loader
 * event, the type of file being loaded (such as a pack file) or other external events. As long as the Loader hasn't finished
 * simply adding a new file to it, while running, will ensure it's added into the current queue.
 *
 * Every Scene has its own instance of the Loader and they are bound to the Scene in which they are created. However,
 * assets loaded by the Loader are placed into global game-level caches. For example, loading an XML file will place that
 * file inside `Game.cache.xml`, which is accessible from every Scene in your game, no matter who was responsible
 * for loading it. The same is true of Textures. A texture loaded in one Scene is instantly available to all other Scenes
 * in your game.
 *
 * The Loader works by using custom File Types. These are stored in the FileTypesManager, which injects them into the Loader
 * when it's instantiated. You can create your own custom file types by extending either the File or MultiFile classes.
 * See those files for more details.
 */
open external class LoaderPlugin(scene: Scene) : EventEmitter {
    /**
     * Adds an Animation JSON Data file, or array of Animation JSON files, to the current load queue.
     *
     * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
     *
     * ```javascript
     * function preload ()
     * {
     *     this.load.animation('baddieAnims', 'files/BaddieAnims.json');
     * }
     * ```
     *
     * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
     * or if it's already running, when the next free load slot becomes available. This happens automatically if you
     * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
     * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
     * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
     * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
     * loaded.
     *
     * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
     * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
     *
     * The key must be a unique String. It is used to add the file to the global JSON Cache upon a successful load.
     * The key should be unique both in terms of files being loaded and files already present in the JSON Cache.
     * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
     * then remove it from the JSON Cache first, before loading a new one.
     *
     * Instead of passing arguments you can pass a configuration object, such as:
     *
     * ```javascript
     * this.load.animation({
     *     key: 'baddieAnims',
     *     url: 'files/BaddieAnims.json'
     * });
     * ```
     *
     * See the documentation for `Phaser.Types.Loader.FileTypes.JSONFileConfig` for more details.
     *
     * Once the file has finished loading it will automatically be passed to the global Animation Managers `fromJSON` method.
     * This will parse all of the JSON data and create animation data from it. This process happens at the very end
     * of the Loader, once every other file in the load queue has finished. The reason for this is to allow you to load
     * both animation data and the images it relies upon in the same load call.
     *
     * Once the animation data has been parsed you will be able to play animations using that data.
     * Please see the Animation Manager `fromJSON` method for more details about the format and playback.
     *
     * You can also access the raw animation data from its Cache using its key:
     *
     * ```javascript
     * this.load.animation('baddieAnims', 'files/BaddieAnims.json');
     * // and later in your game ...
     * var data = this.cache.json.get('baddieAnims');
     * ```
     *
     * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
     * key. For example, if the prefix was `LEVEL1.` and the key was `Waves` the final key will be `LEVEL1.Waves` and
     * this is what you would use to retrieve the text from the JSON Cache.
     *
     * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
     *
     * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "data"
     * and no URL is given then the Loader will set the URL to be "data.json". It will always add `.json` as the extension, although
     * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
     *
     * You can also optionally provide a `dataKey` to use. This allows you to extract only a part of the JSON and store it in the Cache,
     * rather than the whole file. For example, if your JSON data had a structure like this:
     *
     * ```json
     * {
     *     "level1": {
     *         "baddies": {
     *             "aliens": {},
     *             "boss": {}
     *         }
     *     },
     *     "level2": {},
     *     "level3": {}
     * }
     * ```
     *
     * And if you only wanted to create animations from the `boss` data, then you could pass `level1.baddies.boss`as the `dataKey`.
     *
     * Note: The ability to load this type of file will only be available if the JSON File type has been built into Phaser.
     * It is available in the default build but can be excluded from custom builds.
     * @param key The key to use for this file, or a file configuration object, or array of them.
     * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
     * @param dataKey When the Animation JSON file loads only this property will be stored in the Cache and used to create animation data.
     * @param xhrSettings An XHR Settings configuration object. Used in replacement of the Loaders default XHR Settings.
     */
    open fun animation(
        key: String,
        url: String? = definedExternally,
        dataKey: String? = definedExternally,
        xhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun animation(
        key: JSONFileConfig,
        url: String? = definedExternally,
        dataKey: String? = definedExternally,
        xhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun animation(
        key: Array<JSONFileConfig>,
        url: String? = definedExternally,
        dataKey: String? = definedExternally,
        xhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    /**
     * Aseprite is a powerful animated sprite editor and pixel art tool.
     *
     * You can find more details at https://www.aseprite.org/
     *
     * Adds a JSON based Aseprite Animation, or array of animations, to the current load queue.
     *
     * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
     *
     * ```javascript
     * function preload ()
     * {
     *     this.load.aseprite('gladiator', 'images/Gladiator.png', 'images/Gladiator.json');
     * }
     * ```
     *
     * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
     * or if it's already running, when the next free load slot becomes available. This happens automatically if you
     * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
     * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
     * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
     * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
     * loaded.
     *
     * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
     * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
     *
     * To export a compatible JSON file in Aseprite, please do the following:
     *
     * 1. Go to "File - Export Sprite Sheet"
     *
     * 2. On the **Layout** tab:
     * 2a. Set the "Sheet type" to "Packed"
     * 2b. Set the "Constraints" to "None"
     * 2c. Check the "Merge Duplicates" checkbox
     *
     * 3. On the **Sprite** tab:
     * 3a. Set "Layers" to "Visible layers"
     * 3b. Set "Frames" to "All frames", unless you only wish to export a sub-set of tags
     *
     * 4. On the **Borders** tab:
     * 4a. Check the "Trim Sprite" and "Trim Cells" options
     * 4b. Ensure "Border Padding", "Spacing" and "Inner Padding" are all > 0 (1 is usually enough)
     *
     * 5. On the **Output** tab:
     * 5a. Check "Output File", give your image a name and make sure you choose "png files" as the file type
     * 5b. Check "JSON Data" and give your json file a name
     * 5c. The JSON Data type can be either a Hash or Array, Phaser doesn't mind.
     * 5d. Make sure "Tags" is checked in the Meta options
     * 5e. In the "Item Filename" input box, make sure it says just "{frame}" and nothing more.
     *
     * 6. Click export
     *
     * This was tested with Aseprite 1.2.25.
     *
     * This will export a png and json file which you can load using the Aseprite Loader, i.e.:
     *
     * Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.
     *
     * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
     * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
     * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
     * then remove it from the Texture Manager first, before loading a new one.
     *
     * Instead of passing arguments you can pass a configuration object, such as:
     *
     * ```javascript
     * this.load.aseprite({
     *     key: 'gladiator',
     *     textureURL: 'images/Gladiator.png',
     *     atlasURL: 'images/Gladiator.json'
     * });
     * ```
     *
     * See the documentation for `Phaser.Types.Loader.FileTypes.AsepriteFileConfig` for more details.
     *
     * Instead of passing a URL for the JSON data you can also pass in a well formed JSON object instead.
     *
     * Once loaded, you can call this method from within a Scene with the 'atlas' key:
     *
     * ```javascript
     * this.anims.createFromAseprite('paladin');
     * ```
     *
     * Any animations defined in the JSON will now be available to use in Phaser and you play them
     * via their Tag name. For example, if you have an animation called 'War Cry' on your Aseprite timeline,
     * you can play it in Phaser using that Tag name:
     *
     * ```javascript
     * this.add.sprite(400, 300).play('War Cry');
     * ```
     *
     * When calling this method you can optionally provide an array of tag names, and only those animations
     * will be created. For example:
     *
     * ```javascript
     * this.anims.createFromAseprite('paladin', [ 'step', 'War Cry', 'Magnum Break' ]);
     * ```
     *
     * This will only create the 3 animations defined. Note that the tag names are case-sensitive.
     *
     * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
     * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
     * this is what you would use to retrieve the image from the Texture Manager.
     *
     * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
     *
     * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
     * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
     * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
     *
     * Note: The ability to load this type of file will only be available if the Aseprite File type has been built into Phaser.
     * It is available in the default build but can be excluded from custom builds.
     * @param key The key to use for this file, or a file configuration object, or array of them.
     * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
     * string | string[]
     * @param atlasURL The absolute or relative URL to load the texture atlas json data file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, a well formed JSON object.
     * object | string
     * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
     * @param atlasXhrSettings An XHR Settings configuration object for the atlas json file. Used in replacement of the Loaders default XHR Settings.
     */
    open fun aseprite(
        key: String,
        textureURL: dynamic = definedExternally,
        atlasURL: dynamic = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        atlasXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun aseprite(
        key: AsepriteFileConfig,
        textureURL: dynamic = definedExternally,
        atlasURL: dynamic = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        atlasXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun aseprite(
        key: Array<AsepriteFileConfig>,
        textureURL: dynamic = definedExternally,
        atlasURL: dynamic = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        atlasXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    /**
     * Adds a JSON based Texture Atlas, or array of atlases, to the current load queue.
     *
     * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
     *
     * ```javascript
     * function preload ()
     * {
     *     this.load.atlas('mainmenu', 'images/MainMenu.png', 'images/MainMenu.json');
     * }
     * ```
     *
     * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
     * or if it's already running, when the next free load slot becomes available. This happens automatically if you
     * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
     * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
     * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
     * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
     * loaded.
     *
     * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
     * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
     *
     * Phaser expects the atlas data to be provided in a JSON file, using either the JSON Hash or JSON Array format.
     *
     * These files are created by software such as:
     *
     * * [Texture Packer](https://www.codeandweb.com/texturepacker/tutorials/how-to-create-sprite-sheets-for-phaser3?source=photonstorm)
     * * [Shoebox](https://renderhjs.net/shoebox/)
     * * [Gamma Texture Packer](https://gammafp.com/tool/atlas-packer/)
     * * [Adobe Flash / Animate](https://www.adobe.com/uk/products/animate.html)
     * * [Free Texture Packer](http://free-tex-packer.com/)
     * * [Leshy SpriteSheet Tool](https://www.leshylabs.com/apps/sstool/)
     *
     * If you are using Texture Packer and have enabled multi-atlas support, then please use the Phaser Multi Atlas loader
     * instead of this one.
     *
     * Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.
     *
     * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
     * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
     * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
     * then remove it from the Texture Manager first, before loading a new one.
     *
     * Instead of passing arguments you can pass a configuration object, such as:
     *
     * ```javascript
     * this.load.atlas({
     *     key: 'mainmenu',
     *     textureURL: 'images/MainMenu.png',
     *     atlasURL: 'images/MainMenu.json'
     * });
     * ```
     *
     * See the documentation for `Phaser.Types.Loader.FileTypes.AtlasJSONFileConfig` for more details.
     *
     * Instead of passing a URL for the atlas JSON data you can also pass in a well formed JSON object instead.
     *
     * Once the atlas has finished loading you can use frames from it as textures for a Game Object by referencing its key:
     *
     * ```javascript
     * this.load.atlas('mainmenu', 'images/MainMenu.png', 'images/MainMenu.json');
     * // and later in your game ...
     * this.add.image(x, y, 'mainmenu', 'background');
     * ```
     *
     * To get a list of all available frames within an atlas please consult your Texture Atlas software.
     *
     * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
     * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
     * this is what you would use to retrieve the image from the Texture Manager.
     *
     * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
     *
     * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
     * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
     * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
     *
     * Phaser also supports the automatic loading of associated normal maps. If you have a normal map to go with this image,
     * then you can specify it by providing an array as the `url` where the second element is the normal map:
     *
     * ```javascript
     * this.load.atlas('mainmenu', [ 'images/MainMenu.png', 'images/MainMenu-n.png' ], 'images/MainMenu.json');
     * ```
     *
     * Or, if you are using a config object use the `normalMap` property:
     *
     * ```javascript
     * this.load.atlas({
     *     key: 'mainmenu',
     *     textureURL: 'images/MainMenu.png',
     *     normalMap: 'images/MainMenu-n.png',
     *     atlasURL: 'images/MainMenu.json'
     * });
     * ```
     *
     * The normal map file is subject to the same conditions as the image file with regard to the path, baseURL, CORs and XHR Settings.
     * Normal maps are a WebGL only feature.
     *
     * Note: The ability to load this type of file will only be available if the Atlas JSON File type has been built into Phaser.
     * It is available in the default build but can be excluded from custom builds.
     * @param key The key to use for this file, or a file configuration object, or array of them.
     * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
     * string | string[]
     * @param atlasURL The absolute or relative URL to load the texture atlas json data file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, a well formed JSON object.
     * object | string
     * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
     * @param atlasXhrSettings An XHR Settings configuration object for the atlas json file. Used in replacement of the Loaders default XHR Settings.
     */
    open fun atlas(
        key: String,
        textureURL: dynamic = definedExternally,
        atlasURL: dynamic = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        atlasXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun atlas(
        key: AtlasJSONFileConfig,
        textureURL: dynamic = definedExternally,
        atlasURL: dynamic = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        atlasXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun atlas(
        key: Array<AtlasJSONFileConfig>,
        textureURL: dynamic = definedExternally,
        atlasURL: dynamic = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        atlasXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    /**
     * Adds an XML based Texture Atlas, or array of atlases, to the current load queue.
     *
     * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
     *
     * ```javascript
     * function preload ()
     * {
     *     this.load.atlasXML('mainmenu', 'images/MainMenu.png', 'images/MainMenu.xml');
     * }
     * ```
     *
     * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
     * or if it's already running, when the next free load slot becomes available. This happens automatically if you
     * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
     * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
     * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
     * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
     * loaded.
     *
     * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
     * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
     *
     * Phaser expects the atlas data to be provided in an XML file format.
     * These files are created by software such as Shoebox and Adobe Flash / Animate.
     *
     * Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.
     *
     * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
     * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
     * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
     * then remove it from the Texture Manager first, before loading a new one.
     *
     * Instead of passing arguments you can pass a configuration object, such as:
     *
     * ```javascript
     * this.load.atlasXML({
     *     key: 'mainmenu',
     *     textureURL: 'images/MainMenu.png',
     *     atlasURL: 'images/MainMenu.xml'
     * });
     * ```
     *
     * See the documentation for `Phaser.Types.Loader.FileTypes.AtlasXMLFileConfig` for more details.
     *
     * Once the atlas has finished loading you can use frames from it as textures for a Game Object by referencing its key:
     *
     * ```javascript
     * this.load.atlasXML('mainmenu', 'images/MainMenu.png', 'images/MainMenu.xml');
     * // and later in your game ...
     * this.add.image(x, y, 'mainmenu', 'background');
     * ```
     *
     * To get a list of all available frames within an atlas please consult your Texture Atlas software.
     *
     * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
     * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
     * this is what you would use to retrieve the image from the Texture Manager.
     *
     * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
     *
     * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
     * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
     * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
     *
     * Phaser also supports the automatic loading of associated normal maps. If you have a normal map to go with this image,
     * then you can specify it by providing an array as the `url` where the second element is the normal map:
     *
     * ```javascript
     * this.load.atlasXML('mainmenu', [ 'images/MainMenu.png', 'images/MainMenu-n.png' ], 'images/MainMenu.xml');
     * ```
     *
     * Or, if you are using a config object use the `normalMap` property:
     *
     * ```javascript
     * this.load.atlasXML({
     *     key: 'mainmenu',
     *     textureURL: 'images/MainMenu.png',
     *     normalMap: 'images/MainMenu-n.png',
     *     atlasURL: 'images/MainMenu.xml'
     * });
     * ```
     *
     * The normal map file is subject to the same conditions as the image file with regard to the path, baseURL, CORs and XHR Settings.
     * Normal maps are a WebGL only feature.
     *
     * Note: The ability to load this type of file will only be available if the Atlas XML File type has been built into Phaser.
     * It is available in the default build but can be excluded from custom-builds.
     * @param key The key to use for this file, or a file configuration object, or array of them.
     * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
     * string | string[]
     * @param atlasURL The absolute or relative URL to load the texture atlas xml data file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
     * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
     * @param atlasXhrSettings An XHR Settings configuration object for the atlas xml file. Used in replacement of the Loaders default XHR Settings.
     */
    open fun atlasXML(
        key: String,
        textureURL: dynamic = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        atlasXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun atlasXML(
        key: AtlasXMLFileConfig,
        textureURL: dynamic = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        atlasXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun atlasXML(
        key: Array<AtlasXMLFileConfig>,
        textureURL: dynamic = definedExternally,
        atlasURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        atlasXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(
        key: String,
        urls: String = definedExternally,
        config: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(key: String): LoaderPlugin /* this */
    open fun audio(key: String, urls: String = definedExternally): LoaderPlugin /* this */
    open fun audio(
        key: String,
        urls: String = definedExternally,
        config: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(
        key: String,
        urls: Array<String> = definedExternally,
        config: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(key: String, urls: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun audio(
        key: String,
        urls: Array<String> = definedExternally,
        config: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(
        key: AudioFileConfig,
        urls: String = definedExternally,
        config: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(key: AudioFileConfig): LoaderPlugin /* this */
    open fun audio(key: AudioFileConfig, urls: String = definedExternally): LoaderPlugin /* this */
    open fun audio(
        key: AudioFileConfig,
        urls: String = definedExternally,
        config: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(
        key: AudioFileConfig,
        urls: Array<String> = definedExternally,
        config: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(key: AudioFileConfig, urls: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun audio(
        key: AudioFileConfig,
        urls: Array<String> = definedExternally,
        config: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(
        key: Array<AudioFileConfig>,
        urls: String = definedExternally,
        config: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(key: Array<AudioFileConfig>): LoaderPlugin /* this */
    open fun audio(key: Array<AudioFileConfig>, urls: String = definedExternally): LoaderPlugin /* this */
    open fun audio(
        key: Array<AudioFileConfig>,
        urls: String = definedExternally,
        config: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(
        key: Array<AudioFileConfig>,
        urls: Array<String> = definedExternally,
        config: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audio(key: Array<AudioFileConfig>, urls: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun audio(
        key: Array<AudioFileConfig>,
        urls: Array<String> = definedExternally,
        config: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: String,
        jsonURL: String,
        audioURL: String = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally,
        jsonXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(key: String, jsonURL: String): LoaderPlugin /* this */
    open fun audioSprite(key: String, jsonURL: String, audioURL: String = definedExternally): LoaderPlugin /* this */
    open fun audioSprite(
        key: String,
        jsonURL: String,
        audioURL: String = definedExternally,
        audioConfig: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: String,
        jsonURL: String,
        audioURL: String = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: String,
        jsonURL: String,
        audioURL: Array<String> = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally,
        jsonXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: String,
        jsonURL: String,
        audioURL: Array<String> = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: String,
        jsonURL: String,
        audioURL: Array<String> = definedExternally,
        audioConfig: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: String,
        jsonURL: String,
        audioURL: Array<String> = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: String = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally,
        jsonXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(key: AudioSpriteFileConfig, jsonURL: String): LoaderPlugin /* this */
    open fun audioSprite(
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: String = definedExternally,
        audioConfig: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: String = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Array<String> = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally,
        jsonXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Array<String> = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Array<String> = definedExternally,
        audioConfig: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: AudioSpriteFileConfig,
        jsonURL: String,
        audioURL: Array<String> = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: Array<AudioSpriteFileConfig>,
        jsonURL: String,
        audioURL: String = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally,
        jsonXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(key: Array<AudioSpriteFileConfig>, jsonURL: String): LoaderPlugin /* this */
    open fun audioSprite(
        key: Array<AudioSpriteFileConfig>,
        jsonURL: String,
        audioURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: Array<AudioSpriteFileConfig>,
        jsonURL: String,
        audioURL: String = definedExternally,
        audioConfig: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: Array<AudioSpriteFileConfig>,
        jsonURL: String,
        audioURL: String = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: Array<AudioSpriteFileConfig>,
        jsonURL: String,
        audioURL: Array<String> = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally,
        jsonXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: Array<AudioSpriteFileConfig>,
        jsonURL: String,
        audioURL: Array<String> = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: Array<AudioSpriteFileConfig>,
        jsonURL: String,
        audioURL: Array<String> = definedExternally,
        audioConfig: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun audioSprite(
        key: Array<AudioSpriteFileConfig>,
        jsonURL: String,
        audioURL: Array<String> = definedExternally,
        audioConfig: Any = definedExternally,
        audioXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun binary(
        key: String,
        url: String = definedExternally,
        dataType: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun binary(key: String): LoaderPlugin /* this */
    open fun binary(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun binary(
        key: String,
        url: String = definedExternally,
        dataType: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun binary(
        key: BinaryFileConfig,
        url: String = definedExternally,
        dataType: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun binary(key: BinaryFileConfig): LoaderPlugin /* this */
    open fun binary(key: BinaryFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun binary(
        key: BinaryFileConfig,
        url: String = definedExternally,
        dataType: Any = definedExternally
    ): LoaderPlugin /* this */

    open fun binary(
        key: Array<BinaryFileConfig>,
        url: String = definedExternally,
        dataType: Any = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun binary(key: Array<BinaryFileConfig>): LoaderPlugin /* this */
    open fun binary(key: Array<BinaryFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun binary(
        key: Array<BinaryFileConfig>,
        url: String = definedExternally,
        dataType: Any = definedExternally
    ): LoaderPlugin /* this */

    /**
     * Adds an XML based Bitmap Font, or array of fonts, to the current load queue.
     *
     * You can call this method from within your Scene's `preload`, along with any other files you wish to load:
     * ```javascript
     * function preload ()
     * {
     *     this.load.bitmapFont('goldenFont', 'images/GoldFont.png', 'images/GoldFont.xml');
     * }
     * ```
     *
     * The file is **not** loaded right away. It is added to a queue ready to be loaded either when the loader starts,
     * or if it's already running, when the next free load slot becomes available. This happens automatically if you
     * are calling this from within the Scene's `preload` method, or a related callback. Because the file is queued
     * it means you cannot use the file immediately after calling this method, but must wait for the file to complete.
     * The typical flow for a Phaser Scene is that you load assets in the Scene's `preload` method and then when the
     * Scene's `create` method is called you are guaranteed that all of those assets are ready for use and have been
     * loaded.
     *
     * If you call this from outside of `preload` then you are responsible for starting the Loader afterwards and monitoring
     * its events to know when it's safe to use the asset. Please see the Phaser.Loader.LoaderPlugin class for more details.
     *
     * Phaser expects the font data to be provided in an XML file format.
     * These files are created by software such as the [Angelcode Bitmap Font Generator](http://www.angelcode.com/products/bmfont/),
     * [Littera](http://kvazars.com/littera/) or [Glyph Designer](https://71squared.com/glyphdesigner)
     *
     * Phaser can load all common image types: png, jpg, gif and any other format the browser can natively handle.
     *
     * The key must be a unique String. It is used to add the file to the global Texture Manager upon a successful load.
     * The key should be unique both in terms of files being loaded and files already present in the Texture Manager.
     * Loading a file using a key that is already taken will result in a warning. If you wish to replace an existing file
     * then remove it from the Texture Manager first, before loading a new one.
     *
     * Instead of passing arguments you can pass a configuration object, such as:
     *
     * ```javascript
     * this.load.bitmapFont({
     *     key: 'goldenFont',
     *     textureURL: 'images/GoldFont.png',
     *     fontDataURL: 'images/GoldFont.xml'
     * });
     * ```
     *
     * See the documentation for `Phaser.Types.Loader.FileTypes.BitmapFontFileConfig` for more details.
     *
     * Once the atlas has finished loading you can use key of it when creating a Bitmap Text Game Object:
     *
     * ```javascript
     * this.load.bitmapFont('goldenFont', 'images/GoldFont.png', 'images/GoldFont.xml');
     * // and later in your game ...
     * this.add.bitmapText(x, y, 'goldenFont', 'Hello World');
     * ```
     *
     * If you have specified a prefix in the loader, via `Loader.setPrefix` then this value will be prepended to this files
     * key. For example, if the prefix was `MENU.` and the key was `Background` the final key will be `MENU.Background` and
     * this is what you would use when creating a Bitmap Text object.
     *
     * The URL can be relative or absolute. If the URL is relative the `Loader.baseURL` and `Loader.path` values will be prepended to it.
     *
     * If the URL isn't specified the Loader will take the key and create a filename from that. For example if the key is "alien"
     * and no URL is given then the Loader will set the URL to be "alien.png". It will always add `.png` as the extension, although
     * this can be overridden if using an object instead of method arguments. If you do not desire this action then provide a URL.
     *
     * Phaser also supports the automatic loading of associated normal maps. If you have a normal map to go with this image,
     * then you can specify it by providing an array as the `url` where the second element is the normal map:
     *
     * ```javascript
     * this.load.bitmapFont('goldenFont', [ 'images/GoldFont.png', 'images/GoldFont-n.png' ], 'images/GoldFont.xml');
     * ```
     *
     * Or, if you are using a config object use the `normalMap` property:
     *
     * ```javascript
     * this.load.bitmapFont({
     *     key: 'goldenFont',
     *     textureURL: 'images/GoldFont.png',
     *     normalMap: 'images/GoldFont-n.png',
     *     fontDataURL: 'images/GoldFont.xml'
     * });
     * ```
     *
     * The normal map file is subject to the same conditions as the image file with regard to the path, baseURL, CORs and XHR Settings.
     * Normal maps are a WebGL only feature.
     *
     * Note: The ability to load this type of file will only be available if the Bitmap Font File type has been built into Phaser.
     * It is available in the default build but can be excluded from custom builds.
     * @param key The key to use for this file, or a file configuration object, or array of them.
     * @param textureURL The absolute or relative URL to load the font image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
     * string | string[]
     * @param fontDataURL The absolute or relative URL to load the font xml data file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
     * @param textureXhrSettings An XHR Settings configuration object for the font image file. Used in replacement of the Loaders default XHR Settings.
     * @param fontDataXhrSettings An XHR Settings configuration object for the font data xml file. Used in replacement of the Loaders default XHR Settings.
     */
    open fun bitmapFont(
        key: String,
        textureURL: dynamic = definedExternally,
        fontDataURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        fontDataXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun bitmapFont(
        key: BitmapFontFileConfig,
        textureURL: dynamic = definedExternally,
        fontDataURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        fontDataXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun bitmapFont(
        key: Array<BitmapFontFileConfig>,
        textureURL: dynamic = definedExternally,
        fontDataURL: String? = definedExternally,
        textureXhrSettings: XHRSettingsObject? = definedExternally,
        fontDataXhrSettings: XHRSettingsObject? = definedExternally
    ): LoaderPlugin /* this */

    open fun texture(
        key: String,
        url: CompressedTextureFileConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun texture(key: String): LoaderPlugin /* this */
    open fun texture(key: String, url: CompressedTextureFileConfig = definedExternally): LoaderPlugin /* this */
    open fun texture(
        key: CompressedTextureFileConfig,
        url: CompressedTextureFileConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun texture(key: CompressedTextureFileConfig): LoaderPlugin /* this */
    open fun texture(
        key: CompressedTextureFileConfig,
        url: CompressedTextureFileConfig = definedExternally
    ): LoaderPlugin /* this */

    open fun texture(
        key: Array<CompressedTextureFileConfig>,
        url: CompressedTextureFileConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun texture(key: Array<CompressedTextureFileConfig>): LoaderPlugin /* this */
    open fun texture(
        key: Array<CompressedTextureFileConfig>,
        url: CompressedTextureFileConfig = definedExternally
    ): LoaderPlugin /* this */

    open fun css(
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun css(key: String): LoaderPlugin /* this */
    open fun css(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun css(
        key: CSSFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun css(key: CSSFileConfig): LoaderPlugin /* this */
    open fun css(key: CSSFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun css(
        key: Array<CSSFileConfig>,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun css(key: Array<CSSFileConfig>): LoaderPlugin /* this */
    open fun css(key: Array<CSSFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun glsl(
        key: String,
        url: String = definedExternally,
        shaderType: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun glsl(key: String): LoaderPlugin /* this */
    open fun glsl(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun glsl(
        key: String,
        url: String = definedExternally,
        shaderType: String = definedExternally
    ): LoaderPlugin /* this */

    open fun glsl(
        key: GLSLFileConfig,
        url: String = definedExternally,
        shaderType: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun glsl(key: GLSLFileConfig): LoaderPlugin /* this */
    open fun glsl(key: GLSLFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun glsl(
        key: GLSLFileConfig,
        url: String = definedExternally,
        shaderType: String = definedExternally
    ): LoaderPlugin /* this */

    open fun glsl(
        key: Array<GLSLFileConfig>,
        url: String = definedExternally,
        shaderType: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun glsl(key: Array<GLSLFileConfig>): LoaderPlugin /* this */
    open fun glsl(key: Array<GLSLFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun glsl(
        key: Array<GLSLFileConfig>,
        url: String = definedExternally,
        shaderType: String = definedExternally
    ): LoaderPlugin /* this */

    open fun html(
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun html(key: String): LoaderPlugin /* this */
    open fun html(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun html(
        key: HTMLFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun html(key: HTMLFileConfig): LoaderPlugin /* this */
    open fun html(key: HTMLFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun html(
        key: Array<HTMLFileConfig>,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun html(key: Array<HTMLFileConfig>): LoaderPlugin /* this */
    open fun html(key: Array<HTMLFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun htmlTexture(
        key: String,
        url: String = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun htmlTexture(key: String): LoaderPlugin /* this */
    open fun htmlTexture(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun htmlTexture(
        key: String,
        url: String = definedExternally,
        width: Number = definedExternally
    ): LoaderPlugin /* this */

    open fun htmlTexture(
        key: String,
        url: String = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): LoaderPlugin /* this */

    open fun htmlTexture(
        key: HTMLTextureFileConfig,
        url: String = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun htmlTexture(key: HTMLTextureFileConfig): LoaderPlugin /* this */
    open fun htmlTexture(key: HTMLTextureFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun htmlTexture(
        key: HTMLTextureFileConfig,
        url: String = definedExternally,
        width: Number = definedExternally
    ): LoaderPlugin /* this */

    open fun htmlTexture(
        key: HTMLTextureFileConfig,
        url: String = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): LoaderPlugin /* this */

    open fun htmlTexture(
        key: Array<HTMLTextureFileConfig>,
        url: String = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun htmlTexture(key: Array<HTMLTextureFileConfig>): LoaderPlugin /* this */
    open fun htmlTexture(key: Array<HTMLTextureFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun htmlTexture(
        key: Array<HTMLTextureFileConfig>,
        url: String = definedExternally,
        width: Number = definedExternally
    ): LoaderPlugin /* this */

    open fun htmlTexture(
        key: Array<HTMLTextureFileConfig>,
        url: String = definedExternally,
        width: Number = definedExternally,
        height: Number = definedExternally
    ): LoaderPlugin /* this */

    open fun image(
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun image(key: String): LoaderPlugin /* this */
    open fun image(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun image(
        key: String,
        url: Array<String> = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun image(key: String, url: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun image(
        key: ImageFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun image(key: ImageFileConfig): LoaderPlugin /* this */
    open fun image(key: ImageFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun image(
        key: ImageFileConfig,
        url: Array<String> = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun image(key: ImageFileConfig, url: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun image(
        key: Array<ImageFileConfig>,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun image(key: Array<ImageFileConfig>): LoaderPlugin /* this */
    open fun image(key: Array<ImageFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun image(
        key: Array<ImageFileConfig>,
        url: Array<String> = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun image(key: Array<ImageFileConfig>, url: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun json(
        key: String,
        url: Any? = definedExternally,
        dataKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun json(key: String): LoaderPlugin /* this */
    open fun json(key: String, url: Any? = definedExternally): LoaderPlugin /* this */
    open fun json(
        key: String,
        url: Any? = definedExternally,
        dataKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun json(
        key: String,
        url: String? = definedExternally,
        dataKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun json(key: String, url: String? = definedExternally): LoaderPlugin /* this */
    open fun json(
        key: String,
        url: String? = definedExternally,
        dataKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun json(
        key: JSONFileConfig,
        url: Any? = definedExternally,
        dataKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun json(key: JSONFileConfig): LoaderPlugin /* this */
    open fun json(key: JSONFileConfig, url: Any? = definedExternally): LoaderPlugin /* this */
    open fun json(
        key: JSONFileConfig,
        url: Any? = definedExternally,
        dataKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun json(
        key: JSONFileConfig,
        url: String? = definedExternally,
        dataKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun json(key: JSONFileConfig, url: String? = definedExternally): LoaderPlugin /* this */
    open fun json(
        key: JSONFileConfig,
        url: String? = definedExternally,
        dataKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun json(
        key: Array<JSONFileConfig>,
        url: Any? = definedExternally,
        dataKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun json(key: Array<JSONFileConfig>): LoaderPlugin /* this */
    open fun json(key: Array<JSONFileConfig>, url: Any? = definedExternally): LoaderPlugin /* this */
    open fun json(
        key: Array<JSONFileConfig>,
        url: Any? = definedExternally,
        dataKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun json(
        key: Array<JSONFileConfig>,
        url: String? = definedExternally,
        dataKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun json(key: Array<JSONFileConfig>, url: String? = definedExternally): LoaderPlugin /* this */
    open fun json(
        key: Array<JSONFileConfig>,
        url: String? = definedExternally,
        dataKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun multiatlas(
        key: String,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun multiatlas(key: String): LoaderPlugin /* this */
    open fun multiatlas(key: String, atlasURL: String = definedExternally): LoaderPlugin /* this */
    open fun multiatlas(
        key: String,
        atlasURL: String = definedExternally,
        path: String = definedExternally
    ): LoaderPlugin /* this */

    open fun multiatlas(
        key: String,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun multiatlas(
        key: MultiAtlasFileConfig,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun multiatlas(key: MultiAtlasFileConfig): LoaderPlugin /* this */
    open fun multiatlas(key: MultiAtlasFileConfig, atlasURL: String = definedExternally): LoaderPlugin /* this */
    open fun multiatlas(
        key: MultiAtlasFileConfig,
        atlasURL: String = definedExternally,
        path: String = definedExternally
    ): LoaderPlugin /* this */

    open fun multiatlas(
        key: MultiAtlasFileConfig,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun multiatlas(
        key: Array<MultiAtlasFileConfig>,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun multiatlas(key: Array<MultiAtlasFileConfig>): LoaderPlugin /* this */
    open fun multiatlas(key: Array<MultiAtlasFileConfig>, atlasURL: String = definedExternally): LoaderPlugin /* this */
    open fun multiatlas(
        key: Array<MultiAtlasFileConfig>,
        atlasURL: String = definedExternally,
        path: String = definedExternally
    ): LoaderPlugin /* this */

    open fun multiatlas(
        key: Array<MultiAtlasFileConfig>,
        atlasURL: String = definedExternally,
        path: String = definedExternally,
        baseURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scripts(
        key: String,
        url: Array<String> = definedExternally,
        extension: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun scripts(key: String): LoaderPlugin /* this */
    open fun scripts(key: String, url: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun scripts(
        key: String,
        url: Array<String> = definedExternally,
        extension: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scripts(
        key: MultiScriptFileConfig,
        url: Array<String> = definedExternally,
        extension: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun scripts(key: MultiScriptFileConfig): LoaderPlugin /* this */
    open fun scripts(key: MultiScriptFileConfig, url: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun scripts(
        key: MultiScriptFileConfig,
        url: Array<String> = definedExternally,
        extension: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scripts(
        key: Array<MultiScriptFileConfig>,
        url: Array<String> = definedExternally,
        extension: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun scripts(key: Array<MultiScriptFileConfig>): LoaderPlugin /* this */
    open fun scripts(key: Array<MultiScriptFileConfig>, url: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun scripts(
        key: Array<MultiScriptFileConfig>,
        url: Array<String> = definedExternally,
        extension: String = definedExternally
    ): LoaderPlugin /* this */

    open fun obj(
        key: String,
        objURL: String = definedExternally,
        matURL: String = definedExternally,
        flipUV: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun obj(key: String): LoaderPlugin /* this */
    open fun obj(key: String, objURL: String = definedExternally): LoaderPlugin /* this */
    open fun obj(
        key: String,
        objURL: String = definedExternally,
        matURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun obj(
        key: String,
        objURL: String = definedExternally,
        matURL: String = definedExternally,
        flipUV: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun obj(
        key: OBJFileConfig,
        objURL: String = definedExternally,
        matURL: String = definedExternally,
        flipUV: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun obj(key: OBJFileConfig): LoaderPlugin /* this */
    open fun obj(key: OBJFileConfig, objURL: String = definedExternally): LoaderPlugin /* this */
    open fun obj(
        key: OBJFileConfig,
        objURL: String = definedExternally,
        matURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun obj(
        key: OBJFileConfig,
        objURL: String = definedExternally,
        matURL: String = definedExternally,
        flipUV: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun obj(
        key: Array<OBJFileConfig>,
        objURL: String = definedExternally,
        matURL: String = definedExternally,
        flipUV: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun obj(key: Array<OBJFileConfig>): LoaderPlugin /* this */
    open fun obj(key: Array<OBJFileConfig>, objURL: String = definedExternally): LoaderPlugin /* this */
    open fun obj(
        key: Array<OBJFileConfig>,
        objURL: String = definedExternally,
        matURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun obj(
        key: Array<OBJFileConfig>,
        objURL: String = definedExternally,
        matURL: String = definedExternally,
        flipUV: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun pack(
        key: String,
        url: String = definedExternally,
        dataKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun pack(key: String): LoaderPlugin /* this */
    open fun pack(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun pack(
        key: String,
        url: String = definedExternally,
        dataKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun pack(
        key: PackFileConfig,
        url: String = definedExternally,
        dataKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun pack(key: PackFileConfig): LoaderPlugin /* this */
    open fun pack(key: PackFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun pack(
        key: PackFileConfig,
        url: String = definedExternally,
        dataKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun pack(
        key: Array<PackFileConfig>,
        url: String = definedExternally,
        dataKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun pack(key: Array<PackFileConfig>): LoaderPlugin /* this */
    open fun pack(key: Array<PackFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun pack(
        key: Array<PackFileConfig>,
        url: String = definedExternally,
        dataKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: String,
        url: String = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(key: String): LoaderPlugin /* this */
    open fun plugin(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun plugin(
        key: String,
        url: String = definedExternally,
        start: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: String,
        url: String = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: String,
        url: Function<*> = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(key: String, url: Function<*> = definedExternally): LoaderPlugin /* this */
    open fun plugin(
        key: String,
        url: Function<*> = definedExternally,
        start: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: String,
        url: Function<*> = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: PluginFileConfig,
        url: String = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(key: PluginFileConfig): LoaderPlugin /* this */
    open fun plugin(key: PluginFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun plugin(
        key: PluginFileConfig,
        url: String = definedExternally,
        start: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: PluginFileConfig,
        url: String = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: PluginFileConfig,
        url: Function<*> = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(key: PluginFileConfig, url: Function<*> = definedExternally): LoaderPlugin /* this */
    open fun plugin(
        key: PluginFileConfig,
        url: Function<*> = definedExternally,
        start: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: PluginFileConfig,
        url: Function<*> = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: Array<PluginFileConfig>,
        url: String = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(key: Array<PluginFileConfig>): LoaderPlugin /* this */
    open fun plugin(key: Array<PluginFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun plugin(
        key: Array<PluginFileConfig>,
        url: String = definedExternally,
        start: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: Array<PluginFileConfig>,
        url: String = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: Array<PluginFileConfig>,
        url: Function<*> = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(key: Array<PluginFileConfig>, url: Function<*> = definedExternally): LoaderPlugin /* this */
    open fun plugin(
        key: Array<PluginFileConfig>,
        url: Function<*> = definedExternally,
        start: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun plugin(
        key: Array<PluginFileConfig>,
        url: Function<*> = definedExternally,
        start: Boolean = definedExternally,
        mapping: String = definedExternally
    ): LoaderPlugin /* this */

    open fun sceneFile(
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun sceneFile(key: String): LoaderPlugin /* this */
    open fun sceneFile(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun sceneFile(
        key: SceneFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun sceneFile(key: SceneFileConfig): LoaderPlugin /* this */
    open fun sceneFile(key: SceneFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun sceneFile(
        key: Array<SceneFileConfig>,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun sceneFile(key: Array<SceneFileConfig>): LoaderPlugin /* this */
    open fun sceneFile(key: Array<SceneFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(
        key: String,
        url: String = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(key: String): LoaderPlugin /* this */
    open fun scenePlugin(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(
        key: String,
        url: String = definedExternally,
        systemKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: String,
        url: String = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: String,
        url: Function<*> = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(key: String, url: Function<*> = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(
        key: String,
        url: Function<*> = definedExternally,
        systemKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: String,
        url: Function<*> = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: ScenePluginFileConfig,
        url: String = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(key: ScenePluginFileConfig): LoaderPlugin /* this */
    open fun scenePlugin(key: ScenePluginFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(
        key: ScenePluginFileConfig,
        url: String = definedExternally,
        systemKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: ScenePluginFileConfig,
        url: String = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: ScenePluginFileConfig,
        url: Function<*> = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(key: ScenePluginFileConfig, url: Function<*> = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(
        key: ScenePluginFileConfig,
        url: Function<*> = definedExternally,
        systemKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: ScenePluginFileConfig,
        url: Function<*> = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: Array<ScenePluginFileConfig>,
        url: String = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(key: Array<ScenePluginFileConfig>): LoaderPlugin /* this */
    open fun scenePlugin(key: Array<ScenePluginFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun scenePlugin(
        key: Array<ScenePluginFileConfig>,
        url: String = definedExternally,
        systemKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: Array<ScenePluginFileConfig>,
        url: String = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: Array<ScenePluginFileConfig>,
        url: Function<*> = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: Array<ScenePluginFileConfig>,
        url: Function<*> = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: Array<ScenePluginFileConfig>,
        url: Function<*> = definedExternally,
        systemKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun scenePlugin(
        key: Array<ScenePluginFileConfig>,
        url: Function<*> = definedExternally,
        systemKey: String = definedExternally,
        sceneKey: String = definedExternally
    ): LoaderPlugin /* this */

    open fun script(
        key: String,
        url: String = definedExternally,
        type: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun script(key: String): LoaderPlugin /* this */
    open fun script(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun script(
        key: String,
        url: String = definedExternally,
        type: String = definedExternally
    ): LoaderPlugin /* this */

    open fun script(
        key: ScriptFileConfig,
        url: String = definedExternally,
        type: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun script(key: ScriptFileConfig): LoaderPlugin /* this */
    open fun script(key: ScriptFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun script(
        key: ScriptFileConfig,
        url: String = definedExternally,
        type: String = definedExternally
    ): LoaderPlugin /* this */

    open fun script(
        key: Array<ScriptFileConfig>,
        url: String = definedExternally,
        type: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun script(key: Array<ScriptFileConfig>): LoaderPlugin /* this */
    open fun script(key: Array<ScriptFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun script(
        key: Array<ScriptFileConfig>,
        url: String = definedExternally,
        type: String = definedExternally
    ): LoaderPlugin /* this */

    open fun spritesheet(
        key: String,
        url: String = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun spritesheet(key: String): LoaderPlugin /* this */
    open fun spritesheet(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun spritesheet(
        key: String,
        url: String = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    ): LoaderPlugin /* this */

    open fun spritesheet(
        key: SpriteSheetFileConfig,
        url: String = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun spritesheet(key: SpriteSheetFileConfig): LoaderPlugin /* this */
    open fun spritesheet(key: SpriteSheetFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun spritesheet(
        key: SpriteSheetFileConfig,
        url: String = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    ): LoaderPlugin /* this */

    open fun spritesheet(
        key: Array<SpriteSheetFileConfig>,
        url: String = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun spritesheet(key: Array<SpriteSheetFileConfig>): LoaderPlugin /* this */
    open fun spritesheet(key: Array<SpriteSheetFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun spritesheet(
        key: Array<SpriteSheetFileConfig>,
        url: String = definedExternally,
        frameConfig: ImageFrameConfig = definedExternally
    ): LoaderPlugin /* this */

    open fun svg(
        key: String,
        url: String = definedExternally,
        svgConfig: SVGSizeConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun svg(key: String): LoaderPlugin /* this */
    open fun svg(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun svg(
        key: String,
        url: String = definedExternally,
        svgConfig: SVGSizeConfig = definedExternally
    ): LoaderPlugin /* this */

    open fun svg(
        key: SVGFileConfig,
        url: String = definedExternally,
        svgConfig: SVGSizeConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun svg(key: SVGFileConfig): LoaderPlugin /* this */
    open fun svg(key: SVGFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun svg(
        key: SVGFileConfig,
        url: String = definedExternally,
        svgConfig: SVGSizeConfig = definedExternally
    ): LoaderPlugin /* this */

    open fun svg(
        key: Array<SVGFileConfig>,
        url: String = definedExternally,
        svgConfig: SVGSizeConfig = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun svg(key: Array<SVGFileConfig>): LoaderPlugin /* this */
    open fun svg(key: Array<SVGFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun svg(
        key: Array<SVGFileConfig>,
        url: String = definedExternally,
        svgConfig: SVGSizeConfig = definedExternally
    ): LoaderPlugin /* this */

    open fun text(
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun text(key: String): LoaderPlugin /* this */
    open fun text(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun text(
        key: TextFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun text(key: TextFileConfig): LoaderPlugin /* this */
    open fun text(key: TextFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun text(
        key: Array<TextFileConfig>,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun text(key: Array<TextFileConfig>): LoaderPlugin /* this */
    open fun text(key: Array<TextFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun tilemapCSV(
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapCSV(key: String): LoaderPlugin /* this */
    open fun tilemapCSV(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun tilemapCSV(
        key: TilemapCSVFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapCSV(key: TilemapCSVFileConfig): LoaderPlugin /* this */
    open fun tilemapCSV(key: TilemapCSVFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun tilemapCSV(
        key: Array<TilemapCSVFileConfig>,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapCSV(key: Array<TilemapCSVFileConfig>): LoaderPlugin /* this */
    open fun tilemapCSV(key: Array<TilemapCSVFileConfig>, url: String = definedExternally): LoaderPlugin /* this */
    open fun tilemapImpact(
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapImpact(key: String): LoaderPlugin /* this */
    open fun tilemapImpact(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun tilemapImpact(
        key: TilemapImpactFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapImpact(key: TilemapImpactFileConfig): LoaderPlugin /* this */
    open fun tilemapImpact(key: TilemapImpactFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun tilemapImpact(
        key: Array<TilemapImpactFileConfig>,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapImpact(key: Array<TilemapImpactFileConfig>): LoaderPlugin /* this */
    open fun tilemapImpact(
        key: Array<TilemapImpactFileConfig>,
        url: String = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapTiledJSON(
        key: String,
        url: Any? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapTiledJSON(key: String): LoaderPlugin /* this */
    open fun tilemapTiledJSON(key: String, url: Any? = definedExternally): LoaderPlugin /* this */
    open fun tilemapTiledJSON(
        key: String,
        url: String? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapTiledJSON(key: String, url: String? = definedExternally): LoaderPlugin /* this */
    open fun tilemapTiledJSON(
        key: TilemapJSONFileConfig,
        url: Any? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapTiledJSON(key: TilemapJSONFileConfig): LoaderPlugin /* this */
    open fun tilemapTiledJSON(key: TilemapJSONFileConfig, url: Any? = definedExternally): LoaderPlugin /* this */
    open fun tilemapTiledJSON(
        key: TilemapJSONFileConfig,
        url: String? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapTiledJSON(key: TilemapJSONFileConfig, url: String? = definedExternally): LoaderPlugin /* this */
    open fun tilemapTiledJSON(
        key: Array<TilemapJSONFileConfig>,
        url: Any? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapTiledJSON(key: Array<TilemapJSONFileConfig>): LoaderPlugin /* this */
    open fun tilemapTiledJSON(key: Array<TilemapJSONFileConfig>, url: Any? = definedExternally): LoaderPlugin /* this */
    open fun tilemapTiledJSON(
        key: Array<TilemapJSONFileConfig>,
        url: String? = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun tilemapTiledJSON(
        key: Array<TilemapJSONFileConfig>,
        url: String? = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(key: String): LoaderPlugin /* this */
    open fun unityAtlas(key: String, textureURL: String = definedExternally): LoaderPlugin /* this */
    open fun unityAtlas(
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: String,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(key: String, textureURL: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun unityAtlas(
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: String,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: UnityAtlasFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(key: UnityAtlasFileConfig): LoaderPlugin /* this */
    open fun unityAtlas(key: UnityAtlasFileConfig, textureURL: String = definedExternally): LoaderPlugin /* this */
    open fun unityAtlas(
        key: UnityAtlasFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: UnityAtlasFileConfig,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: UnityAtlasFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: UnityAtlasFileConfig,
        textureURL: Array<String> = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: UnityAtlasFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: UnityAtlasFileConfig,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: Array<UnityAtlasFileConfig>,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(key: Array<UnityAtlasFileConfig>): LoaderPlugin /* this */
    open fun unityAtlas(
        key: Array<UnityAtlasFileConfig>,
        textureURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: Array<UnityAtlasFileConfig>,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: Array<UnityAtlasFileConfig>,
        textureURL: String = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: Array<UnityAtlasFileConfig>,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally,
        atlasXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: Array<UnityAtlasFileConfig>,
        textureURL: Array<String> = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: Array<UnityAtlasFileConfig>,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally
    ): LoaderPlugin /* this */

    open fun unityAtlas(
        key: Array<UnityAtlasFileConfig>,
        textureURL: Array<String> = definedExternally,
        atlasURL: String = definedExternally,
        textureXhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: String,
        urls: String = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun video(key: String): LoaderPlugin /* this */
    open fun video(key: String, urls: String = definedExternally): LoaderPlugin /* this */
    open fun video(
        key: String,
        urls: String = definedExternally,
        loadEvent: String = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: String,
        urls: String = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: String,
        urls: String = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: String,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun video(key: String, urls: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun video(
        key: String,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: String,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: String,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: VideoFileConfig,
        urls: String = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun video(key: VideoFileConfig): LoaderPlugin /* this */
    open fun video(key: VideoFileConfig, urls: String = definedExternally): LoaderPlugin /* this */
    open fun video(
        key: VideoFileConfig,
        urls: String = definedExternally,
        loadEvent: String = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: VideoFileConfig,
        urls: String = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: VideoFileConfig,
        urls: String = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: VideoFileConfig,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun video(key: VideoFileConfig, urls: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun video(
        key: VideoFileConfig,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: VideoFileConfig,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: VideoFileConfig,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: Array<VideoFileConfig>,
        urls: String = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun video(key: Array<VideoFileConfig>): LoaderPlugin /* this */
    open fun video(key: Array<VideoFileConfig>, urls: String = definedExternally): LoaderPlugin /* this */
    open fun video(
        key: Array<VideoFileConfig>,
        urls: String = definedExternally,
        loadEvent: String = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: Array<VideoFileConfig>,
        urls: String = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: Array<VideoFileConfig>,
        urls: String = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: Array<VideoFileConfig>,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun video(key: Array<VideoFileConfig>, urls: Array<String> = definedExternally): LoaderPlugin /* this */
    open fun video(
        key: Array<VideoFileConfig>,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: Array<VideoFileConfig>,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun video(
        key: Array<VideoFileConfig>,
        urls: Array<String> = definedExternally,
        loadEvent: String = definedExternally,
        asBlob: Boolean = definedExternally,
        noAudio: Boolean = definedExternally
    ): LoaderPlugin /* this */

    open fun xml(
        key: String,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun xml(key: String): LoaderPlugin /* this */
    open fun xml(key: String, url: String = definedExternally): LoaderPlugin /* this */
    open fun xml(
        key: XMLFileConfig,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun xml(key: XMLFileConfig): LoaderPlugin /* this */
    open fun xml(key: XMLFileConfig, url: String = definedExternally): LoaderPlugin /* this */
    open fun xml(
        key: Array<XMLFileConfig>,
        url: String = definedExternally,
        xhrSettings: XHRSettingsObject = definedExternally
    ): LoaderPlugin /* this */

    open fun xml(key: Array<XMLFileConfig>): LoaderPlugin /* this */
    open fun xml(key: Array<XMLFileConfig>, url: String = definedExternally): LoaderPlugin /* this */

    open var scene: Scene
    open var systems: Systems
    open var cacheManager: CacheManager
    open var textureManager: TextureManager
    open var sceneManager: SceneManager
    open var prefix: String
    open var path: String
    open var baseURL: String
    open var maxParallelDownloads: Number
    open var xhr: XHRSettingsObject
    open var crossOrigin: String
    open var imageLoadType: String
    open var localSchemes: Array<String>
    open var totalToLoad: Number
    open var progress: Number
    open var list: Set<File>
    open var inflight: Set<File>
    open var queue: Set<File>
    open var totalFailed: Number
    open var totalComplete: Number
    open val state: Number

    /**
     * If you want to append a URL before the path of any asset you can set this here.
     *
     * Useful if allowing the asset base url to be configured outside the game code.
     *
     * Once a base URL is set it will affect every file loaded by the Loader from that point on. It does _not_ change any
     * file _already_ being loaded. To reset it, call this method with no arguments.
     * @param url The URL to use. Leave empty to reset.
     */
    open fun setBaseURL(url: String = definedExternally): LoaderPlugin /* this */

    /**
     * The value of `path`, if set, is placed before any _relative_ file path given. For example:
     *
     * ```javascript
     * this.load.setPath("images/sprites/");
     * this.load.image("ball", "ball.png");
     * this.load.image("tree", "level1/oaktree.png");
     * this.load.image("boom", "http://server.com/explode.png");
     * ```
     *
     * Would load the `ball` file from `images/sprites/ball.png` and the tree from
     * `images/sprites/level1/oaktree.png` but the file `boom` would load from the URL
     * given as it's an absolute URL.
     *
     * Please note that the path is added before the filename but *after* the baseURL (if set.)
     *
     * Once a path is set it will then affect every file added to the Loader from that point on. It does _not_ change any
     * file _already_ in the load queue. To reset it, call this method with no arguments.
     * @param path The path to use. Leave empty to reset.
     */
    open fun setPath(path: String = definedExternally): LoaderPlugin /* this */

    /**
     * An optional prefix that is automatically prepended to the start of every file key.
     *
     * If prefix was `MENU.` and you load an image with the key 'Background' the resulting key would be `MENU.Background`.
     *
     * Once a prefix is set it will then affect every file added to the Loader from that point on. It does _not_ change any
     * file _already_ in the load queue. To reset it, call this method with no arguments.
     * @param prefix The prefix to use. Leave empty to reset.
     */
    open fun setPrefix(prefix: String = definedExternally): LoaderPlugin /* this */

    /**
     * Sets the Cross Origin Resource Sharing value used when loading files.
     *
     * Files can override this value on a per-file basis by specifying an alternative `crossOrigin` value in their file config.
     *
     * Once CORs is set it will then affect every file loaded by the Loader from that point on, as long as they don't have
     * their own CORs setting. To reset it, call this method with no arguments.
     *
     * For more details about CORs see https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS
     * @param crossOrigin The value to use for the `crossOrigin` property in the load request.
     */
    open fun setCORS(crossOrigin: String = definedExternally): LoaderPlugin /* this */

    /**
     * Adds a file, or array of files, into the load queue.
     *
     * The file must be an instance of `Phaser.Loader.File`, or a class that extends it. The Loader will check that the key
     * used by the file won't conflict with any other key either in the loader, the inflight queue or the target cache.
     * If allowed it will then add the file into the pending list, read for the load to start. Or, if the load has already
     * started, ready for the next batch of files to be pulled from the list to the inflight queue.
     *
     * You should not normally call this method directly, but rather use one of the Loader methods like `image` or `atlas`,
     * however you can call this as long as the file given to it is well formed.
     * @param file The file, or array of files, to be added to the load queue.
     */
    open fun addFile(file: File)
    open fun addFile(file: Array<File>)

    /**
     * Checks the key and type of the given file to see if it will conflict with anything already
     * in a Cache, the Texture Manager, or the list or inflight queues.
     * @param file The file to check the key of.
     */
    open fun keyExists(file: File): Boolean

    /**
     * Takes a well formed, fully parsed pack file object and adds its entries into the load queue. Usually you do not call
     * this method directly, but instead use `Loader.pack` and supply a path to a JSON file that holds the
     * pack data. However, if you've got the data prepared you can pass it to this method.
     *
     * You can also provide an optional key. If you do then it will only add the entries from that part of the pack into
     * to the load queue. If not specified it will add all entries it finds. For more details about the pack file format
     * see the `LoaderPlugin.pack` method.
     * @param pack The Pack File data to be parsed and each entry of it to added to the load queue.
     * @param packKey An optional key to use from the pack file data.
     */
    open fun addPack(pack: Any, packKey: String = definedExternally): Boolean

    /**
     * Is the Loader actively loading, or processing loaded files?
     */
    open fun isLoading(): Boolean

    /**
     * Is the Loader ready to start a new load?
     */
    open fun isReady(): Boolean

    /**
     * Starts the Loader running. This will reset the progress and totals and then emit a `start` event.
     * If there is nothing in the queue the Loader will immediately complete, otherwise it will start
     * loading the first batch of files.
     *
     * The Loader is started automatically if the queue is populated within your Scenes `preload` method.
     *
     * However, outside of this, you need to call this method to start it.
     *
     * If the Loader is already running this method will simply return.
     */
    open fun start()

    /**
     * Called automatically during the load process.
     * It updates the `progress` value and then emits a progress event, which you can use to
     * display a loading bar in your game.
     */
    open fun updateProgress()

    /**
     * Called automatically during the load process.
     */
    open fun update()

    /**
     * An internal method called automatically by the XHRLoader belong to a File.
     *
     * This method will remove the given file from the inflight Set and update the load progress.
     * If the file was successful its `onProcess` method is called, otherwise it is added to the delete queue.
     * @param file The File that just finished loading, or errored during load.
     * @param success `true` if the file loaded successfully, otherwise `false`.
     */
    open fun nextFile(file: File, success: Boolean)

    /**
     * An internal method that is called automatically by the File when it has finished processing.
     *
     * If the process was successful, and the File isn't part of a MultiFile, its `addToCache` method is called.
     *
     * It this then removed from the queue. If there are no more files to load `loadComplete` is called.
     * @param file The file that has finished processing.
     */
    open fun fileProcessComplete(file: File)

    /**
     * Called at the end when the load queue is exhausted and all files have either loaded or errored.
     * By this point every loaded file will now be in its associated cache and ready for use.
     *
     * Also clears down the Sets, puts progress to 1 and clears the deletion queue.
     */
    open fun loadComplete()

    /**
     * Adds a File into the pending-deletion queue.
     * @param file The File to be queued for deletion when the Loader completes.
     */
    open fun flagForRemoval(file: File)

    /**
     * Converts the given JSON data into a file that the browser then prompts you to download so you can save it locally.
     *
     * The data must be well formed JSON and ready-parsed, not a JavaScript object.
     * @param data The JSON data, ready parsed.
     * @param filename The name to save the JSON file as. Default file.json.
     */
    open fun saveJSON(data: Any, filename: String = definedExternally): LoaderPlugin /* this */

    /**
     * Causes the browser to save the given data as a file to its default Downloads folder.
     *
     * Creates a DOM level anchor link, assigns it as being a `download` anchor, sets the href
     * to be an ObjectURL based on the given data, and then invokes a click event.
     * @param data The data to be saved. Will be passed through URL.createObjectURL.
     * @param filename The filename to save the file as. Default file.json.
     * @param filetype The file type to use when saving the file. Defaults to JSON. Default application/json.
     */
    open fun save(
        data: Any,
        filename: String? = definedExternally,
        filetype: String? = definedExternally
    ): LoaderPlugin /* this */

    /**
     * Resets the Loader.
     *
     * This will clear all lists and reset the base URL, path and prefix.
     *
     * Warning: If the Loader is currently downloading files, or has files in its queue, they will be aborted.
     */
    open fun reset()
}

external fun MergeXHRSettings(global: XHRSettingsObject, local: XHRSettingsObject): XHRSettingsObject

open external class MultiFile(loader: LoaderPlugin, type: String, key: String, files: Array<File>) {
    open var loader: LoaderPlugin
    open var type: String
    open var key: String
    open var files: Array<File>
    open var state: Number
    open var complete: Boolean
    open var pending: Number
    open var failed: Number
    open var config: Any
    open var baseURL: String
    open var path: String
    open var prefix: String
    open fun isReadyToProcess(): Boolean
    open fun addToMultiFile(files: File): MultiFile
    open fun onFileComplete(file: File)
    open fun onFileFailed(file: File)
    open fun pendingDestroy()
    open fun destroy()
}

external fun XHRLoader(file: File, globalXHRSettings: XHRSettingsObject): XMLHttpRequest

external fun XHRSettings(
    responseType: String /* "" | "arraybuffer" | "blob" | "document" | "json" | "text" */ = definedExternally,
    async: Boolean = definedExternally,
    user: String = definedExternally,
    password: String = definedExternally,
    timeout: Number = definedExternally,
    withCredentials: Boolean = definedExternally
): XHRSettingsObject
