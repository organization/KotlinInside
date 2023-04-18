package be.zvz.kotlininside

import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.security.App
import be.zvz.kotlininside.security.Auth
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.LoginUser
import be.zvz.kotlininside.session.user.User
import java.util.*

class KotlinInside private constructor(
    val user: User,
    val httpInterface: HttpInterface,
    private val sessionAutoRefresh: Boolean
) {
    val auth = Auth()
    lateinit var hashedAppKey: String
    lateinit var app: App
    lateinit var session: Session

    private fun init() {
        this.hashedAppKey = auth.generateHashedAppKey()
        this.app = App(hashedAppKey, auth.fetchAppId(hashedAppKey))
        this.session = auth.login(user)

        if (sessionAutoRefresh) {
            val timer = Timer()

            timer.schedule(
                object : TimerTask() {
                    override fun run() {
                        if (user is LoginUser) {
                            synchronized(instance) {
                                instance.hashedAppKey = instance.auth.generateHashedAppKey()
                                instance.app =
                                    App(instance.hashedAppKey, instance.auth.fetchAppId(getInstance().hashedAppKey))
                                instance.session = instance.auth.login(user)
                            }
                        }
                    }
                },
                43200L * 1000,
                43200L * 1000
            )
        }
    }

    companion object {
        private lateinit var instance: KotlinInside

        /**
         * [KotlinInside] 인스턴스를 생성합니다.
         * @param user 인스턴스 생성과 동시에 로그인할 유저
         * @param httpInterface KotlinInside에서 사용할 HttpInterface
         * @param sessionAutoRefresh KotlinInside가 세션을 12시간마다 자동으로 새로고침 할지 정합니다.
         */
        @JvmStatic
        @JvmOverloads
        @Synchronized
        fun createInstance(user: User, httpInterface: HttpInterface, sessionAutoRefresh: Boolean = false) {
            if (!::instance.isInitialized) {
                instance = KotlinInside(user, httpInterface, sessionAutoRefresh)
                instance.init()
            }
        }

        /**
         *
         * @return [KotlinInside] 인스턴스를 반환합니다.
         */
        @JvmStatic
        fun getInstance(): KotlinInside = instance
    }
}
