package be.zvz.kotlininside.api.comment

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.DCCon
import be.zvz.kotlininside.api.type.comment.Comment
import be.zvz.kotlininside.api.type.comment.DCConComment
import be.zvz.kotlininside.api.type.comment.StringComment
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.value.ApiUrl

class CommentRead(
    private val gallId: String,
    private val articleId: Int,
    private val rePage: Int
) {
    data class ReadResult(
        val totalComment: Int,
        val totalPage: Int,
        val rePage: Int,
        val commentList: List<CommentData>
    )

    data class CommentData(
        val memberIcon: Int,
        val ipData: String?,
        val gallerCon: String?,
        val name: String,
        val userId: String,
        val content: Comment,
        val identifier: Int,
        val dateTime: String,
        val isReply: Boolean,
        val isDeleteFlag: String?
    )

    /**
     * 댓글 데이터를 읽어옵니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 댓글을 읽어오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun request(): ReadResult {
        val url =
            "${ApiUrl.Comment.READ}?id=$gallId&no=$articleId&re_page=$rePage&app_id=${KotlinInside.getInstance().auth.getAppId()}"

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.get(
                Request.redirectUrl(url),
                Request.getDefaultOption()
            )
        )
            .index(0)

        return ReadResult(
            totalComment = json.get("total_comment").asInteger(),
            totalPage = json.get("total_page").asInteger(),
            rePage = json.get("re_page").asInteger(),
            commentList = mutableListOf<CommentData>().apply {
                json.get("comment_list").values().forEach {
                    add(
                        CommentData(
                            memberIcon = it.get("member_icon").asInteger(),
                            ipData = it.get("ipData").text(),
                            gallerCon = it.get("gallercon").text(),
                            name = it.get("name").safeText(),
                            userId = it.get("user_id").safeText(),
                            content = it.get("dccon").run {
                                when {
                                    isNull -> {
                                        StringComment(
                                            memo = it.get("comment_memo").safeText()
                                        )
                                    }
                                    else -> {
                                        DCConComment(
                                            dcCon = DCCon(
                                                imgLink = safeText(),
                                                memo = it.get("comment_memo").safeText(),
                                                detailIndex = it.get("dccon_detail_idx").asInteger()
                                            )
                                        )
                                    }
                                }
                            },
                            identifier = it.get("comment_no").asInteger(),
                            dateTime = it.get("date_time").safeText(),
                            isReply = it.get("under_step").asBoolean(),
                            isDeleteFlag = it.get("is_delete_flag").text()
                        )
                    )
                }
            }
        )
    }
}
