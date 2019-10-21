package be.zvz.kotlininside.api.comment

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class CommentRead(
    val gallId: String,
    val articleId: Int
) {
    data class ReadResult(
        val totalComment: Int,
        val totalPage: Int,
        val rePage: Int,
        val commentList: List<CommentData>
    )

    data class CommentData(
        val memberIcon: Int,
        val ipData: String,
        val gallerCon: String?,
        val name: String,
        val userId: String,
        val content: String,
        val identifier: Int,
        val dateTime: String
    )

    /**
     * 댓글 데이터를 읽어옵니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 댓글을 읽어오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun get(): ReadResult {
        val json = KotlinInside.getInstance().httpInterface.get(Request.redirectUrl(ApiUrl.Comment.READ), Request.getDefaultOption())!!.index(0)

        TODO("댓글 읽어오기 구현")
    }
}
