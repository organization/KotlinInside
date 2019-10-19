package be.zvz.kotlininside

import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.security.App
import be.zvz.kotlininside.security.Auth
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.User

class KotlinInside private constructor(
    val user: User,
    val httpInterface: HttpInterface
) {
    val auth: Auth = Auth()
    var hashedAppKey: String
    var app: App
    var session: Session

    init {
        this.hashedAppKey = auth.generateHashedAppKey()
        this.app = App(hashedAppKey, auth.fetchAppId(hashedAppKey))
        this.session = auth.login(user)
    }

    companion object {
        private lateinit var instance: KotlinInside

        /**
         * [KotlinInside] 인스턴스를 생성합니다.
         * @param user 인스턴스 생성과 동시에 로그인할 유저
         * @param httpInterface KotlinInside에서 사용할 HttpInterface
         */
        @JvmStatic
        fun createInstance(user: User, httpInterface: HttpInterface) {
            if (!::instance.isInitialized)
                instance = KotlinInside(user, httpInterface)

        }

        /**
         *
         * @return [KotlinInside] 인스턴스를 반환합니다.
         */
        @JvmStatic
        fun getInstance(): KotlinInside {
            return instance
        }
    }

}
