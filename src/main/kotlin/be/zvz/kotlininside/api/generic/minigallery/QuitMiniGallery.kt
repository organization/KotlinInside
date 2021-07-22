package be.zvz.kotlininside.api.generic.minigallery

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class QuitMiniGallery(
    private val gallId: String,
    private val session: Session
) {
    data class MemberQuitResult(
        val result: Boolean
    )

    fun quit(): MemberQuitResult {
        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 QuitMiniGallery를 사용할 수 없습니다.")
        }

        val option = Request.getDefaultOption()
            .addMultipartParameter("user_id", session.detail!!.userId)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("id", gallId)

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.MiniGallery.QUIT,
                option
            )
        ).index(0)

        return MemberQuitResult(
            result = json.get("result").asBoolean()
        )
    }
}
