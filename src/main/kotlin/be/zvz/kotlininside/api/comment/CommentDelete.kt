package be.zvz.kotlininside.api.comment

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const

class CommentDelete @JvmOverloads constructor(
        private val gallId: String,
        private val articleId: Int,
        private val commentId: Int,
        private val session: Session,
        private val fcmToken: String = Const.DEFAULT_FCM_TOKEN
) {
    data class DeleteResult(
            val result: Boolean,
            val cause: String? = null
    )

    /**
     * 댓글을 삭제합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 댓글을 삭제하지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun delete(): DeleteResult {
        val option = Request.getDefaultOption()
                .addMultipartParameter("id", gallId)
                .addMultipartParameter("no", articleId.toString())
                .addMultipartParameter("comment_no", commentId.toString())
                .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
                .addMultipartParameter("client_token", fcmToken)
                .addMultipartParameter("mode", "comment_del")

        if (session.user is Anonymous) {
            option
                    .addMultipartParameter("comment_pw", session.user.password)
                    .addMultipartParameter("board_id", "")
        } else {
            option
                    .addMultipartParameter("user_id", session.detail!!.userId)
                    .addMultipartParameter("board_id", session.user.id)
        }

        val json = KotlinInside.getInstance().httpInterface.upload(ApiUrl.Comment.DELETE, option)!!.index(0)

        val result = json.get("result").`as`(Boolean::class.java)

        return when {
            result -> DeleteResult(
                    result = result
            )
            else -> DeleteResult(
                    result = result,
                    cause = json.get("cause").text()
            )
        }
    }
}
