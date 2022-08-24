package common

import kotlinx.js.jso
import mui.material.ButtonProps
import mui.material.GridProps
import mui.material.LinkProps
import org.w3c.dom.Element
import org.w3c.dom.HTMLFormElement
import org.w3c.xhr.FormData
import react.dom.events.FormEvent
import react.router.NavigateFunction

inline var LinkProps.to: String
    get() = throw NotImplementedError()
    set(value) {
        asDynamic().to = value
    }

inline var GridProps.xs: Int
    get() = throw NotImplementedError()
    set(value) {
        asDynamic().xs = value
    }

inline var GridProps.sm: Int
    get() = throw NotImplementedError()
    set(value) {
        asDynamic().sm = value
    }

inline var ButtonProps.component: react.ElementType<*>?
    get() = throw NotImplementedError()
    set(value) {
        asDynamic().component = value
    }

inline var ButtonProps.to: String
    get() = throw NotImplementedError()
    set(value) {
        asDynamic().to = value
    }

fun NavigateFunction.replace(to: String) {
    invoke(to, jso { replace = true })
}

class StrFormData(private val data: FormData) {
    operator fun get(name: String) = data.get(name) as String
}

fun <T : Element> FormEvent<T>.formData(): StrFormData {
    preventDefault()
    return StrFormData(FormData(target.unsafeCast<HTMLFormElement>()))
}
