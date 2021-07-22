package be.zvz.kotlininside.api.generic.minigallery

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class JoinMiniGallery(
    private val gallId: String,
    private val session: Session
) {
    data class MemberJoinResult(
        val result: Boolean,
        val joinQuestion: String
    )

    data class MemberJoinOkResult(
        val result: Boolean,
        val cause: String,
        val status: String,
    )

    fun join(): Pair<MemberJoinResult, MemberJoinOkResult> {
        val memberJoinResult = requestMemberJoin()
        val memberJoinOkResult = requestMemberJoinOk()

        return Pair(memberJoinResult, memberJoinOkResult)
    }

    fun requestMemberJoin(): MemberJoinResult {
        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 requestMemberJoin을 사용할 수 없습니다.")
        }

        val option = Request.getDefaultOption()
            .addMultipartParameter("user_id", session.detail!!.userId)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("id", gallId)

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.MiniGallery.JOIN,
                option
            )
        ).index(0)

        return MemberJoinResult(
            result = json.get("result").asBoolean(),
            joinQuestion = json.get("join_question").safeText()
        )
    }

    fun requestMemberJoinOk(): MemberJoinOkResult {
        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 requestMemberJoinOk을 사용할 수 없습니다.")
        }

        val option = Request.getDefaultOption()
            .addMultipartParameter("user_id", session.detail!!.userId)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("id", gallId)

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.MiniGallery.JOIN_OK,
                option
            )
        ).index(0)

        return MemberJoinOkResult(
            result = json.get("result").asBoolean(),
            cause = json.get("cause").safeText(),
            status = json.get("status").safeText()
        )
    }
}
