package be.zvz.kotlininside.security

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.SessionDetail
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.session.user.User
import be.zvz.kotlininside.session.user.UserType
import be.zvz.kotlininside.session.user.named.DuplicateNamed
import be.zvz.kotlininside.session.user.named.Named
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import org.apache.commons.codec.binary.Hex
import org.apache.commons.codec.digest.DigestUtils
import org.apache.commons.lang3.time.FastDateFormat
import java.util.*

class Auth {
    private val seoulTimeZone = TimeZone.getTimeZone("Asia/Seoul")
    private val refreshDateFormat = FastDateFormat.getInstance("yyyyMMddHH", seoulTimeZone)
    private lateinit var time: String
    private lateinit var formattedTime: String

    lateinit var fcmToken: String
    lateinit var fid: String
    lateinit var refreshToken: String

    data class AppCheck(
        val result: Boolean,
        val version: String? = null,
        val notice: Boolean? = null,
        val noticeUpdate: Boolean? = null,
        val date: String? = null
    )

    @JvmOverloads
    fun fetchFcmToken(argFid: String? = null, argRefreshToken: String? = null): String {
        val firebaseInstallations = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.post(
                ApiUrl.Firebase.INSTALLATIONS,
                HttpInterface.Option()
                    .addHeader("X-Android-Package", Const.Installations.X_ANDROID_PACKAGE)
                    .addHeader("X-Android-Cert", Const.Installations.X_ANDROID_CERT)
                    .addHeader("x-goog-api-key", Const.Installations.X_GOOG_API_KEY)
                    .setContentTypeAndBody(
                        "application/json",
                        JsonBrowser.getMapper().writeValueAsString(
                            JsonBrowser.getMapper().createObjectNode().apply {
                                argFid?.let {
                                    put("fid", it)
                                }
                                argRefreshToken?.let {
                                    put("refreshToken", it)
                                }
                                put("appId", Const.Firebase.APP_ID)
                                put("authVersion", Const.Firebase.AUTH_VERSION)
                                put("sdkVersion", Const.Firebase.SDK_VERSION)
                            }
                        )
                    )
            )
        )

        fid = firebaseInstallations.get("fid").safeText()
        refreshToken = firebaseInstallations.get("refreshToken").safeText()
        val token = firebaseInstallations.get("authToken").get("token").safeText()
        val register3 = KotlinInside.getInstance().httpInterface.post(
            ApiUrl.PlayService.REGISTER3,
            HttpInterface.Option()
                .addHeader("Authorization", Const.Register3.AUTHORIZATION)
                .setUserAgent(Const.Register3.USER_AGENT)
                .addBodyParameter("sender", Const.Register3.SENDER)
                .addBodyParameter("X-appid", fid)
                .addBodyParameter("X-scope", Const.Register3.X_SCOPE)
                .addBodyParameter("X-Goog-Firebase-Installations-Auth", token)
                .addBodyParameter("X-gmp_app_id", Const.Firebase.APP_ID)
                .addBodyParameter("X-firebase-app-name-hash", Const.Register3.X_FIREBASE_APP_NAME_HASH)
                .addBodyParameter("app", Const.Register3.APP)
                .addBodyParameter("device", Const.Register3.DEVICE)
                .addBodyParameter("app_ver", Const.DC_APP_VERSION_CODE)
                .addBodyParameter("cert", Const.Register3.CERT)
        )!!
        return register3.split("=")[1]
    }

    /**
     * app_check에서 정보를 얻어오는 메소드입니다.
     * @return [AppCheck] AppCheck 또는 null을 반환합니다.
     * @exception [HttpException] app_check에 접근 할 수 없는 경우, HttpException이 발생합니다.
     */
    fun getAppCheck(): AppCheck {
        val appCheck = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.get(
                ApiUrl.Auth.APP_CHECK,
                Request.getDefaultOption()
            )
        )

        if (!appCheck.get("result").isNull)
            return AppCheck(
                result = appCheck.get("result").asBoolean()
            )

        val json = appCheck.index(0)

        return AppCheck(
            result = json.get("result").asBoolean(),
            version = json.get("ver").text(),
            notice = json.get("notice").asBoolean(),
            noticeUpdate = json.get("notice_update").asBoolean(),
            date = json.get("date").text()
        )
    }

    private fun getDayOfWeekMonday(day: Int): Int {
        return when (day) {
            Calendar.MONDAY -> 1
            Calendar.TUESDAY -> 2
            Calendar.WEDNESDAY -> 3
            Calendar.THURSDAY -> 4
            Calendar.FRIDAY -> 5
            Calendar.SATURDAY -> 6
            Calendar.SUNDAY -> 7
            else -> 1
        }
    }

    /**
     *
     * @return [java.lang.String] Fri332295548112911 형식의 날짜 문자열을 반환합니다.
     */
    private fun dateToString(date: Date): String {
        val calendar = Calendar.getInstance(seoulTimeZone, Locale.US)
        calendar.minimalDaysInFirstWeek = 4
        calendar.time = date

        val dayOfYear = calendar[Calendar.DAY_OF_YEAR]
        val dayOfWeek = calendar[Calendar.DAY_OF_WEEK]
        val weekOfYear = calendar[Calendar.WEEK_OF_YEAR]

        return FastDateFormat.getInstance(
            "E${dayOfYear - 1}d${getDayOfWeekMonday(dayOfWeek)}${dayOfWeek - 1}${
            String.format(
                "%02d",
                weekOfYear
            )
            }MddMM",
            seoulTimeZone, Locale.US
        ).format(date)
    }

    /**
     * SHA256 단방향 암호화된 value_token을 서버로부터 얻어오거나, 생성하는 메소드입니다.
     * @return [java.lang.String] value_token을 반환합니다.
     */
    fun generateHashedAppKey(): String {
        val now = Date()
        val tempFormattedTime = refreshDateFormat.format(now)

        if (!::time.isInitialized || !::formattedTime.isInitialized || formattedTime != tempFormattedTime) {
            try {
                getAppCheck().run {
                    date?.let {
                        formattedTime = tempFormattedTime
                        time = it
                        return String(Hex.encodeHex(DigestUtils.sha256("dcArdchk_$time")))
                    }
                }
            } catch (e: Exception) {
            }
        } else {
            return String(Hex.encodeHex(DigestUtils.sha256("dcArdchk_$time")))
        }

        // 디시인사이드 2019/10/31 변경점 - Fri332295548112911 형식으로 변경됨
        // 예외가 발생했거나, 값이 null이어서 time을 제대로 설정하지 못한 경우
        formattedTime = tempFormattedTime
        time = dateToString(now)
        return String(Hex.encodeHex(DigestUtils.sha256("dcArdchk_$time")))
    }

    /**
     * 캐시된 app_id를 얻어오는 메소드입니다.
     * @return [java.lang.String] app_id를 반환합니다.
     */
    fun getAppId(): String = when (val hashedAppKey = generateHashedAppKey()) {
        KotlinInside.getInstance().app.token -> KotlinInside.getInstance().app.id
        else -> {
            KotlinInside.getInstance().app = App(
                token = hashedAppKey,
                id = fetchAppId(hashedAppKey)
            )
            KotlinInside.getInstance().app.id
        }
    }

    /**
     * app_id를 서버로부터 얻어오는 메소드입니다.
     * @exception [java.lang.NullPointerException] app_id를 얻어올 수 없는 경우, NullPointerException이 발생합니다.
     * @param hashedAppKey SHA256 단방향 암호화된 value_token 값입니다.
     * @return [java.lang.String] app_id를 반환합니다.
     */
    fun fetchAppId(hashedAppKey: String): String {
        if (!::fcmToken.isInitialized) {
            fcmToken = fetchFcmToken()
        }

        val appId = try {
            val option = Request.getDefaultOption()
                .addMultipartParameter("value_token", hashedAppKey)
                .addMultipartParameter("signature", Const.DC_APP_SIGNATURE)
                .addMultipartParameter("pkg", Const.DC_APP_PACKAGE)
                .addMultipartParameter("vCode", Const.DC_APP_VERSION_CODE)
                .addMultipartParameter("vName", Const.DC_APP_VERSION_NAME)
                .addMultipartParameter("client_token", fcmToken)

            JsonBrowser.parse(KotlinInside.getInstance().httpInterface.upload(ApiUrl.Auth.APP_ID, option))
        } catch (e: HttpException) {
            return ""
        }

        return appId.index(0).get("app_id").text()!!
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
                .addBodyParameter("mode", "login_normal")
                .addBodyParameter("client_token", fcmToken)

            val json =
                JsonBrowser.parse(KotlinInside.getInstance().httpInterface.post(ApiUrl.Auth.LOGIN, option)).index(0)

            val detail = SessionDetail(
                result = json.get("result").asBoolean(),
                userId = json.get("user_id").safeText(),
                userNo = json.get("user_no").safeText(),
                name = json.get("name").safeText(),
                stype = json.get("stype").safeText(),
                isAdult = json.get("is_adult").asInteger(),
                isDormancy = json.get("is_dormancy").asInteger(),
                isOtp = json.get("is_otp").asInteger(),
                pwCampaign = json.get("pw_campaign").asInteger(),
                mailSend = json.get("mail_send").safeText(),
                cause = json.get("cause").text(),
            )

            if (!detail.result) {
                throw HttpException(401, detail.cause)
            }

            val loginUser = when (detail.stype) {
                UserType.NAMED.stype -> {
                    Named(user.id, user.password)
                }
                UserType.DUPLICATE_NAMED.stype -> {
                    DuplicateNamed(user.id, user.password)
                }
                else -> {
                    throw HttpException(401, "계정의 타입을 알 수 없습니다.")
                }
            }

            return Session(loginUser, detail)
        } else {
            return Session(user, null)
        }
    }
}
