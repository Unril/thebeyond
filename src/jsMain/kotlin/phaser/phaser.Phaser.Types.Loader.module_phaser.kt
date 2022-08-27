@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Loader

external interface FileConfig {
    var type: String
    var key: String
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var extension: String?
        get() = definedExternally
        set(value) = definedExternally
    var responseType: String? /* "" | "arraybuffer" | "blob" | "document" | "json" | "text" */
        get() = definedExternally
        set(value) = definedExternally
    var xhrSettings: dynamic /* Phaser.Types.Loader.XHRSettingsObject? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var config: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface XHRSettingsObject {
    var responseType: String /* "" | "arraybuffer" | "blob" | "document" | "json" | "text" */
    var async: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var user: String?
        get() = definedExternally
        set(value) = definedExternally
    var password: String?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var headers: Any?
        get() = definedExternally
        set(value) = definedExternally
    var header: String?
        get() = definedExternally
        set(value) = definedExternally
    var headerValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var requestedWith: String?
        get() = definedExternally
        set(value) = definedExternally
    var overrideMimeType: String?
        get() = definedExternally
        set(value) = definedExternally
    var withCredentials: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}
