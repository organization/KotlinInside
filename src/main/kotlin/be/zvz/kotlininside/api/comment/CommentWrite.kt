package be.zvz.kotlininside.api.comment

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.Comment
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class CommentWrite @JvmOverloads constructor(
    private val gallId: String,
    private val articleId: Int,
    private val comment: Comment,
    private val session: Session,
    private val fcmToken: String = "N"
) {
    data class WriteResult(
        val result: Boolean,
        val data: Int? = null,
        val cause: String? = null,
        val word: String? = null
    )

    private fun getWord(writeResultJson: JsonBrowser): String? {
        val word = writeResultJson.safeGet("word")

        return when {
            !word.isNull -> word.text()
            else -> null
        }
    }

    /**
     * 댓글을 작성합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 댓글을 작성하지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun write(): WriteResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("no", articleId.toString())
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("mode", "com_write")
            .addMultipartParameter("client_token", fcmToken)
            .addMultipartParameter("comment_memo", comment.content)

        if (session.user is Anonymous) {
            option
                .addMultipartParameter("comment_nick", session.user.id)
                .addMultipartParameter("comment_pw", session.user.password)
        } else {
            option
                .addMultipartParameter("board_id", session.user.id)
                .addMultipartParameter("user_id", session.detail!!.userId)
        }

        val json = KotlinInside.getInstance().httpInterface.upload(ApiUrl.Comment.OK, option)!!.index(0)

        val result = json.get("result").`as`(Boolean::class.java)

        return when {
            result -> WriteResult(
                result = result,
                data = json.get("data").`as`(Int::class.java)
            )
            else -> WriteResult(
                result = result,
                cause = json.get("cause").text(),
                word = getWord(json)
            )
        }
    }

    /**
     * 대댓글을 작성합니다.
     * @param commentId 대댓글을 작성할 코멘트 ID입니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 대댓글을 작성하지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun reply(commentId: Int): WriteResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("no", articleId.toString())
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("mode", "com_reple")
            .addMultipartParameter("client_token", fcmToken)
            .addMultipartParameter("reple_id", "")
            .addMultipartParameter("comment_no", commentId.toString())
            .addMultipartParameter("comment_memo", comment.content)

        if (session.user is Anonymous) {
            option
                .addMultipartParameter("comment_nick", session.user.id)
                .addMultipartParameter("comment_pw", session.user.password)
        } else {
            option
                .addMultipartParameter("board_id", session.user.id)
                .addMultipartParameter("user_id", session.detail!!.userId)
        }

        val json = KotlinInside.getInstance().httpInterface.upload(ApiUrl.Comment.OK, option)!!.index(0)

        val result = json.get("result").`as`(Boolean::class.java)

        return when {
            result -> WriteResult(
                result = result,
                data = json.get("data").`as`(Int::class.java)
            )
            else -> WriteResult(
                result = result,
                cause = json.get("cause").text(),
                word = getWord(json)
            )
        }
    }
}
