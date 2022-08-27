@file:JsQualifier("Phaser.Loader.FileTypesManager")
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Loader.FileTypesManager

import Phaser.Loader.LoaderPlugin

external fun install(loader: LoaderPlugin)

external fun register(key: String, factoryFunction: Function<*>)

external fun destroy()
