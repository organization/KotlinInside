package be.zvz.kotlininside.api.comment

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.comment.Comment
import be.zvz.kotlininside.api.type.comment.DCConComment
import be.zvz.kotlininside.api.type.comment.StringComment
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const

class CommentWrite @JvmOverloads constructor(
        private val gallId: String,
        private val articleId: Int,
        private val comment: Comment,
        private val session: Session,
        private val fcmToken: String = Const.DEFAULT_FCM_TOKEN
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

        addCommentMemo(comment, option)

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

        addCommentMemo(comment, option)

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

    private fun addCommentMemo(comment: Comment, option: HttpInterface.Option) {
        when (comment) {
            is StringComment -> option.addMultipartParameter("comment_memo", comment.memo)
            is DCConComment -> {
                val dcConRequestOption = Request.getDefaultOption()

                if (session.user !is Anonymous) {
                    dcConRequestOption
                            .addMultipartParameter("user_id", session.detail!!.userId)
                }

                dcConRequestOption.addMultipartParameter("package_idx", comment.dcCon.packageIndex.toString())
                        .addMultipartParameter("detail_idx", comment.dcCon.detailIndex.toString())
                        .addMultipartParameter("type", "insert")
                        .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

                val dcConJson = KotlinInside.getInstance().httpInterface.upload(ApiUrl.DCCon.DCCON, dcConRequestOption)!!

                when (dcConJson.get("result").`as`(Boolean::class.java)) {
                    true -> {
                        option.addMultipartParameter("comment_memo", dcConJson.get("img_tag").text())
                                .addMultipartParameter("detail_idx", comment.dcCon.detailIndex.toString())
                    }
                    else -> {
                        when {
                            comment.dcCon.imgLink.isEmpty() -> throw HttpException(
                                    RuntimeException("디시콘을 찾을 수 없습니다.")
                            )
                            else -> {
                                val imgTag = "<img src='${comment.dcCon.imgLink}' class='written_dccon' alt='0' conalt='0' title='${comment.dcCon.memo}'"

                                option.addMultipartParameter("comment_memo", imgTag)
                                        .addMultipartParameter("detail_idx", "0")
                            }
                        }
                    }
                }
            }
        }
    }
}
