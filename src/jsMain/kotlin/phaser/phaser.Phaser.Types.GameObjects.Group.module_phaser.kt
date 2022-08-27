@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "unused"
)

package Phaser.Types.GameObjects.Group

import Phaser.GameObjects.GameObject
import Phaser.Scene
import Phaser.Types.Input.HitAreaCallback

typealias GroupCallback = (item: GameObject) -> Unit

typealias GroupClassTypeConstructor = (scene: Scene, x: Number, y: Number, texture: dynamic /* String | Phaser.Textures.Texture */, frame: dynamic /* String | Number */) -> Unit

external interface GroupConfig {
    var classType: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var defaultKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var defaultFrame: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var runChildUpdate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var createCallback: GroupCallback?
        get() = definedExternally
        set(value) = definedExternally
    var removeCallback: GroupCallback?
        get() = definedExternally
        set(value) = definedExternally
    var createMultipleCallback: GroupMultipleCreateCallback?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GroupCreateConfig {

    var key: dynamic /* String | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
    var classType: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var frame: dynamic /* String? | Array<String>? | Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var quantity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var repeat: Number?
        get() = definedExternally
        set(value) = definedExternally
    var randomKey: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var randomFrame: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var yoyo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var frameQuantity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var setXY: Any?
        get() = definedExternally
        set(value) = definedExternally
    var setRotation: Any?
        get() = definedExternally
        set(value) = definedExternally
    var setScale: Any?
        get() = definedExternally
        set(value) = definedExternally
    var setOrigin: Any?
        get() = definedExternally
        set(value) = definedExternally
    var setAlpha: Any?
        get() = definedExternally
        set(value) = definedExternally
    var setDepth: Any?
        get() = definedExternally
        set(value) = definedExternally
    var setScrollFactor: Any?
        get() = definedExternally
        set(value) = definedExternally
    var hitArea: Any?
        get() = definedExternally
        set(value) = definedExternally
    var hitAreaCallback: HitAreaCallback?
        get() = definedExternally
        set(value) = definedExternally
    var gridAlign: dynamic /* Boolean? | Phaser.Types.Actions.GridAlignConfig? */
        get() = definedExternally
        set(value) = definedExternally
}


inline operator fun GroupCreateConfig.get(key: String): Number? = asDynamic()[key]


inline operator fun GroupCreateConfig.set(key: String, value: Number?) {
    asDynamic()[key] = value
}

typealias GroupMultipleCreateCallback = (items: Array<GameObject>) -> Unit
