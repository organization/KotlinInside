package be.zvz.kotlininside.security

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.SessionDetail
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.session.user.named.DuplicateNamed
import be.zvz.kotlininside.session.user.named.Named
import be.zvz.kotlininside.session.user.User
import be.zvz.kotlininside.session.user.UserType
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import org.apache.commons.codec.digest.DigestUtils
import java.text.SimpleDateFormat
import java.util.TimeZone
import java.util.Date
import java.util.Locale

class Auth {
    private val simpleDateFormat = SimpleDateFormat("yyyyMMddHH", Locale.getDefault())

    init {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"))
    }

    fun generateHashedAppKey(): String =
        DigestUtils.sha256Hex("dcArdchk_" + simpleDateFormat.format(Date()))
    
    fun getAppId(): String = when (val hashedAppKey = generateHashedAppKey()) {
        KotlinInside.getInstance().app.token -> KotlinInside.getInstance().app.id
        else -> {
            KotlinInside.getInstance().app = App(hashedAppKey, fetchAppId(hashedAppKey))
            KotlinInside.getInstance().app.id
        }
    }

    fun fetchAppId(hashedAppKey: String): String {
        val appId = try {
            val option = Request.getDefaultOption()
                .addMultipartParameter("value_token", hashedAppKey)
                .addMultipartParameter("signature", Const.DC_APP_SIGNATURE)
                .addMultipartParameter("pkg", Const.DC_APP_PACKAGE)
                .addMultipartParameter("vCode", Const.DC_APP_VERSION_CODE)
                .addMultipartParameter("vName", Const.DC_APP_VERSION_NAME)

            KotlinInside.getInstance().httpInterface.upload(ApiUrl.Auth.APP_ID, option)
        } catch (e: HttpException) {
            return ""
        }

        return appId!!.index(0).get("app_id").text()
    }

    /**
     * 로그인하기 위해 필요한 메소드
     *
     * @exception HttpException 계정에 로그인 할 수 없는 경우 HttpException 발생
     * @param user [be.zvz.kotlininside.session.user.Anonymous]와 [be.zvz.kotlininside.session.user.LoginUser] 클래스를 매개변수로 받음
     * @return [be.zvz.kotlininside.session.Session] 로그인에 성공했거나, 유동닉([be.zvz.kotlininside.session.user.Anonymous]) 객체를 담고있는 세션을 반환함
     */
    @Throws(HttpException::class)
    fun login(user: User): Session {
        if (user !is Anonymous) {
            val option = HttpInterface.Option()
                .addBodyParameter("user_id", user.id)
                .addBodyParameter("user_pw", user.password)

            val json = KotlinInside.getInstance().httpInterface.post(ApiUrl.Auth.LOGIN, option)!!.index(0)

            val detail = SessionDetail(
                json.get("user_id").text(),
                json.get("user_no").text(),
                json.get("name").text(),
                json.get("stype").text()
            )

            val loginUser = when (detail.stype) {
                UserType.NAMED.stype -> {
                    Named(user.id, user.password)
                }
                UserType.DUPLICATE_NAMED.stype -> {
                    DuplicateNamed(user.id, user.password)
                }
                else -> {
                    throw HttpException(401, "계정에 로그인 할 수 없습니다") // 계정에 로그인 할 수 없는 경우 post 부분에서 HttpException 이 발생하여 이 코드는 작동하지 않음.
                }
            }

            return Session(loginUser, detail)
        } else {
            return Session(user, null)
        }
    }
}
