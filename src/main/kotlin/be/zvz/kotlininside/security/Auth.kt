package be.zvz.kotlininside.security

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.SessionDetail
import be.zvz.kotlininside.session.user.User
import be.zvz.kotlininside.session.user.UserType
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import org.apache.commons.codec.digest.DigestUtils
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Suppress("NOTHING_TO_INLINE")
class Auth(private val kotlinInside: KotlinInside) {
    inline fun generateHashedAppKey(): String =
        DigestUtils.sha256Hex(SimpleDateFormat("dcArdchk_yyyyMMddHH", Locale.getDefault()).format(Date()))
    
    fun getAppId(): String = when (val hashedAppKey = generateHashedAppKey()) {
        kotlinInside.app.token -> kotlinInside.app.id
        else -> {
            kotlinInside.app = App(hashedAppKey, fetchAppId(hashedAppKey))
            kotlinInside.app.id
        }
    }

    fun fetchAppId(hashedAppKey: String): String {
        val appId = try {
            val option = HttpInterface.Option()
                .addQueryParameter("value_token", hashedAppKey)
                .addQueryParameter("signature", Const.DC_APP_SIGNATURE)
                .addQueryParameter("pkg", Const.DC_APP_PACKAGE)
                .addQueryParameter("vCode", Const.DC_APP_VERSION_CODE)
                .addQueryParameter("vName", Const.DC_APP_VERSION_NAME)

            kotlinInside.httpInterface.post(ApiUrl.Auth.APP_ID, option)
        } catch (e: HttpException) {
            return ""
        }

        return appId!!.index(0).get("app_id").text()
    }

    @Throws(HttpException::class)
    fun login(user: User): Session {
        if (user.userType !== UserType.ANONYMOUS) {
            val option = HttpInterface.Option()
                .addBodyParameter("user_id", user.id)
                .addBodyParameter("user_pw", user.password)

            val json = kotlinInside.httpInterface.post(ApiUrl.Auth.LOGIN, option)!!.index(0)

            val detail = SessionDetail(
                json.get("user_id").text(),
                json.get("user_no").text(),
                json.get("name").text(),
                json.get("stype").text()
            )

            return Session(user, detail)
        } else {
            return Session(user, null)
        }
    }
}