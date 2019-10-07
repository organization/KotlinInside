package be.zvz.kotlininside.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.article.type.Article
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl
import java.net.URLEncoder

class ArticleWrite(val gallId: String, val session: Session, val article: Article, val fcmToken: String = "N") {
    data class WriteResult(
        val result: Boolean,
        val cause: Int,
        val id: String
    )

    /**
     * 이 메소드를 사용하여 글을 작성합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글을 작성하지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun write(): WriteResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("mode", "write")
            .addMultipartParameter("client_token", fcmToken)
            .addMultipartParameter("subject", URLEncoder.encode(article.subject, "UTF-8"))

        article.headText?.let {
            option
                .addMultipartParameter("head_name", it.name)
                .addMultipartParameter("head_no", it.identifier.toString())
        }

        if (session.user is Anonymous) {
            option
                .addMultipartParameter("name", session.user.id)
                .addMultipartParameter("password", session.user.password)
        } else {
            option
                .addMultipartParameter("user_id", session.detail!!.userId)
        }

        var imageCount = 0
        article.content.withIndex().forEach { (index, content) ->
            if (content.isImage) {
                option.addMultipartParameter("memo_block[$index]", "Dc_App_Img_$imageCount")
                option.addMultipartFile("upload[$imageCount]", content.image!!)
                imageCount++
            } else {
                option.addMultipartParameter("memo_block[$index]", URLEncoder.encode(StringUtil.toHtml(content.content), "UTF-8"))
            }
        }

        val json = KotlinInside.getInstance().httpInterface.upload(ApiUrl.Article.WRITE, option)!!.index(0)

        return WriteResult(
            result = json.get("result").`as`(Boolean::class.java),
            cause = json.get("cause").`as`(Int::class.java),
            id = json.get("id").text()
        )
    }
}