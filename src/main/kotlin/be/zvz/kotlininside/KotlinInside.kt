package be.zvz.kotlininside

import be.zvz.kotlininside.httpinterface.HttpInterface
import be.zvz.kotlininside.security.Auth

class KotlinInside(val httpInterface: HttpInterface) {
    val auth = Auth(this)
}
