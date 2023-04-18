package be.zvz.kotlininside.api.generic.userinfo

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class ModifyMyGall(
    private val gallName: String,
    private val gallId: String,
    private val session: Session
) {
    data class ModifyMyGallResult(
        val result: Boolean,
        val cause: String
    )

    fun request(): ModifyMyGallResult {
        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 ModifyMyGall을 사용할 수 없습니다.")
        }

        val option = Request.getDefaultOption()
            .addMultipartParameter("user_id", session.detail!!.userId)
            .addMultipartParameter("gall_nm", gallName)
            .addMultipartParameter("gall_id", gallId)
            .addMultipartParameter("mode", "favori_gall")
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.User.MY_GALL_MODIFY,
                option
            )
        ).index(0)

        return ModifyMyGallResult(
            result = json.get("result").asBoolean(),
            cause = json.get("cause").safeText()
        )
    }
}
