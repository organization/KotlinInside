package be.zvz.kotlininside

import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.security.App
import be.zvz.kotlininside.security.Auth
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.User

class KotlinInside private constructor(val user: User, val httpInterface: HttpInterface) {
    val auth: Auth
    var hashedAppKey: String
    var app: App
    var session: Session

    init {
        this.auth = Auth()
        this.hashedAppKey = auth.generateHashedAppKey()
        this.app = App(hashedAppKey, auth.fetchAppId(hashedAppKey))
        this.session = auth.login(user)
    }

    companion object {
        private lateinit var instance: KotlinInside

        @JvmStatic
        fun createInstance(user: User, httpInterface: HttpInterface) {
            if (!::instance.isInitialized)
                instance = KotlinInside(user, httpInterface)

        }

        @JvmStatic
        fun getInstance(): KotlinInside {
            return instance
        }
    }

}
