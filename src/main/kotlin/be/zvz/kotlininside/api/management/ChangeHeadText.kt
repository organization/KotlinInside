package be.zvz.kotlininside.api.management

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl
import java.io.IOException

class ChangeHeadText(
    private val gallId: String,
    private val articleId: Int,
    private val headTextId: Int,
    private val session: Session
) {
    data class ChangeResult(
        val result: Boolean,
        val cause: String,
        val state: String
    )

    /**
     * 말머리 변경 요청을 전송합니다.
     */
    fun request(): ChangeResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("no", articleId.toString())
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("mode", "headtext")
            .addMultipartParameter("headtxt_no", headTextId.toString())

        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 말머리 강제 변경을 사용할 수 없습니다.")
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
        } catch (e: IOException) {
            return ChangeResult(
                result = false,
                cause = "권한이 없습니다.",
                state = ""
            )
        }

        return ChangeResult(
            result = json.get("result").asBoolean(),
            cause = json.get("cause").safeText(),
            state = json.get("state").safeText()
        )
    }
}
