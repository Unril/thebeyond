@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.Plugins

external interface CorePluginContainer {
    var key: String
    var plugin: Function<*>
    var mapping: String?
        get() = definedExternally
        set(value) = definedExternally
    var custom: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomPluginContainer {
    var key: String
    var plugin: Function<*>
}

external interface GlobalPlugin {
    var key: String
    var plugin: Function<*>
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mapping: String?
        get() = definedExternally
        set(value) = definedExternally
}
