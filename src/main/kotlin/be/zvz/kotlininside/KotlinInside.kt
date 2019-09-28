package be.zvz.kotlininside

import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.security.App
import be.zvz.kotlininside.security.Auth
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.User

class KotlinInside(val user: User, val httpInterface: HttpInterface) {
    val auth = Auth(this)
    var hashedAppKey = auth.generateHashedAppKey()
    var app = App(hashedAppKey, auth.fetchAppId(hashedAppKey))
    var session = auth.login(user)

}
