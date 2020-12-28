package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.Article
import be.zvz.kotlininside.api.type.content.HtmlContent
import be.zvz.kotlininside.api.type.content.ImageContent
import be.zvz.kotlininside.api.type.content.MarkdownContent
import be.zvz.kotlininside.api.type.content.StringContent
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import java.net.URLEncoder

class ArticleWrite internal constructor(
    private val gallId: String,
    private val article: Article,
    private val session: Session,
    private val mode: String,
    private val fcmToken: String = Const.DEFAULT_FCM_TOKEN
) {
    @JvmOverloads
    constructor(
        gallId: String,
        article: Article,
        session: Session,
        fcmToken: String = Const.DEFAULT_FCM_TOKEN
    ) : this(
        gallId = gallId,
        article = article,
        session = session,
        mode = "write",
        fcmToken = fcmToken
    )

    data class WriteResult(
        val result: Boolean,
        val articleId: Int? = null,
        val cause: String? = null,
        val id: String? = null
    )

    /**
     * 글을 작성합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글을 작성하지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun write(): WriteResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("mode", mode)
            .addMultipartParameter("client_token", fcmToken)
            .addMultipartParameter("subject", URLEncoder.encode(article.subject, "UTF-8"))

        article.headText?.let {
            option
                .addMultipartParameter("head_name", it.name)
                .addMultipartParameter("head_no", it.identifier.toString())
        }

        if (session.user is Anonymous) {
            option
                .addMultipartParameter("name", URLEncoder.encode(session.user.id, "UTF-8"))
                .addMultipartParameter("password", URLEncoder.encode(session.user.password, "UTF-8"))
        } else {
            option
                .addMultipartParameter("user_id", session.detail!!.userId)
        }

        var imageCount = 0
        article.content.forEachIndexed { index, content ->
            when (content) {
                is ImageContent -> {
                    option.addMultipartParameter("memo_block[$index]", "Dc_App_Img_$imageCount")
                    option.addMultipartFile("upload[$imageCount]", content.stream)
                    imageCount++
                }
                is StringContent -> option.addMultipartParameter(
                    "memo_block[$index]",
                    URLEncoder.encode("<div>" + StringUtil.toHtml(content.string) + "</div>", "UTF-8")
                )
                is HtmlContent -> option.addMultipartParameter(
                    "memo_block[$index]",
                    URLEncoder.encode(content.htmlString, "UTF-8")
                )
                is MarkdownContent -> option.addMultipartParameter(
                    "memo_block[$index]",
                    URLEncoder.encode(StringUtil.mdToHtml(content.markdownString), "UTF-8")
                )
            }
        }

        val json = KotlinInside.getInstance().httpInterface.upload(
            ApiUrl.Article.WRITE,
            option
        )!!.index(0)


        return WriteResult(
            result = json.get("result").asBoolean(),
            articleId = json.get("cause").asNullableInteger(),
            id = json.get("id").text(),
            cause = json.get("cause").text()
        )
    }
}
