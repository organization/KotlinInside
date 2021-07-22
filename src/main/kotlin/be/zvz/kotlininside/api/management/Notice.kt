package be.zvz.kotlininside.api.management

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl
import java.io.IOException

class Notice(
    private val gallId: String,
    private val articleId: Int,
    private val session: Session
) {
    data class NoticeResult(
        val result: Boolean,
        val cause: String,
        val state: String
    )

    /**
     * 공지를 설정하거나, 해제합니다.
     */
    fun request(): NoticeResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("no", articleId.toString())
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("mode", "notify")

        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 공지 지정을 사용할 수 없습니다.")
        } else {
            option.addMultipartParameter("user_id", session.detail!!.userId)
        }

        lateinit var json: JsonBrowser

        try {
            json = JsonBrowser.parse(
                KotlinInside.getInstance().httpInterface.upload(
                    ApiUrl.Gallery.MINOR_MANAGER_REQUEST,
                    option
                )
            ).index(0)
        } catch (e: HttpException) {
            if (e.cause is IOException) {
                return NoticeResult(
                    result = false,
                    cause = "권한이 없습니다.",
                    state = ""
                )
            }
        }

        return NoticeResult(
            result = json.get("result").asBoolean(),
            cause = json.get("cause").safeText(),
            state = json.get("state").safeText()
        )
    }
}
