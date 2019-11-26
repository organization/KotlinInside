package be.zvz.kotlininside.security

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.SessionDetail
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.session.user.User
import be.zvz.kotlininside.session.user.UserType
import be.zvz.kotlininside.session.user.named.DuplicateNamed
import be.zvz.kotlininside.session.user.named.Named
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import org.apache.commons.codec.digest.DigestUtils
import org.apache.commons.lang3.time.FastDateFormat
import java.util.*

class Auth {
    private val seoulTimeZone = TimeZone.getTimeZone("Asia/Seoul")
    private val date1001 = Date(1569855600L * 1000)
    private val date1028 = Date(1572188400L * 1000)
    private val dayOfWeekFormat = FastDateFormat.getInstance("u", seoulTimeZone, Locale.US)
    private val refreshDateFormat = FastDateFormat.getInstance("yyyyMMddHH", seoulTimeZone)
    private lateinit var time: String
    private lateinit var formattedTime: String

    data class AppCheck(
            val result: Boolean,
            val version: String? = null,
            val notice: Boolean? = null,
            val noticeUpdate: Boolean? = null,
            val date: String? = null
    )

    /**
     * app_check에서 정보를 얻어오는 메소드입니다.
     * @return [AppCheck] AppCheck 또는 null을 반환합니다.
     * @exception [HttpException] app_check에 접근 할 수 없는 경우, HttpException이 발생합니다.
     */
    fun getAppCheck(): AppCheck {
        val appCheck = KotlinInside.getInstance().httpInterface.get(ApiUrl.Auth.APP_CHECK, Request.getDefaultOption())

        when {
            appCheck !== null -> {
                if (!appCheck.safeGet("result").isNull)
                    return AppCheck(
                            result = appCheck.get("result").`as`(Boolean::class.java)
                    )

                val json = appCheck.index(0)

                return AppCheck(
                        result = json.get("result").`as`(Boolean::class.java),
                        version = json.get("ver").text(),
                        notice = json.get("notice").`as`(Boolean::class.java),
                        noticeUpdate = json.get("notice_update").`as`(Boolean::class.java),
                        date = json.get("date").text()
                )
            }
            else -> return AppCheck(
                    result = false
            )
        }
    }

    private fun dayOfWeekZero(date: String): String {
        return when (date) {
            "7" -> "0"
            else -> date
        }
    }

    //TODO: 성능 문제 - 수정 필요
    //TODO: E 다음의 숫자 (30, 31, 32) 분석 필요
    /**
     *
     * @return [java.lang.String] Tue329262248112611 형식의 날짜 문자열을 반환합니다.
     */
    private fun dateToString(date: Date): String {
        val dayOfWeek = dayOfWeekFormat.format(date)
        return FastDateFormat.getInstance("E32${(date.time - date1028.time) / DAY}d$dayOfWeek${dayOfWeekZero(dayOfWeek)}4${((date.time - date1001.time + DAY) / DAY) / 7}MMddMM", seoulTimeZone, Locale.US).format(date)
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
                        return DigestUtils.sha256Hex("dcArdchk_$time")
                    }
                }
            } catch (e: Exception) {
            }
        } else {
            return DigestUtils.sha256Hex("dcArdchk_$time")
        }

        // 디시인사이드 2019/10/31 변경점 - Thu303314444103110 형식으로 변경됨
        // 예외가 발생했거나, 값이 null이어서 time을 제대로 설정하지 못한 경우
        formattedTime = tempFormattedTime
        time = dateToString(now)
        return DigestUtils.sha256Hex("dcArdchk_$time")
    }

    /**
     * 캐시된 app_id를 얻어오는 메소드입니다.
     * @return [java.lang.String] app_id를 반환합니다.
     */
    fun getAppId(): String {
        return when (val hashedAppKey = generateHashedAppKey()) {
            KotlinInside.getInstance().app.token -> KotlinInside.getInstance().app.id
            else -> {
                KotlinInside.getInstance().app = App(hashedAppKey, fetchAppId(hashedAppKey))
                KotlinInside.getInstance().app.id
            }
        }
    }

    /**
     * app_id를 서버로부터 얻어오는 메소드입니다.
     * @exception [java.lang.NullPointerException] app_id를 얻어올 수 없는 경우, NPE를 반환합니다.
     * @param hashedAppKey SHA256 단방향 암호화된 value_token 값입니다.
     * @return [java.lang.String] app_id를 반환합니다.
     */
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

    companion object {
        private const val DAY = 24 * 60 * 60 * 1000
    }
}
