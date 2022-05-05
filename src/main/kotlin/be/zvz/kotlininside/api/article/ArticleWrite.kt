package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.Article
import be.zvz.kotlininside.api.type.content.*
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl
import java.net.URLEncoder

class ArticleWrite internal constructor(
    private val gallId: String,
    private val article: Article,
    private val session: Session,
    private val mode: String,
    private val fcmToken: String = KotlinInside.getInstance().auth.fcmToken
) {
    @JvmOverloads
    constructor(
        gallId: String,
        article: Article,
        session: Session,
        fcmToken: String = KotlinInside.getInstance().auth.fcmToken
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

    private data class MovieInsertResult(
        val result: Boolean,
        val movieId: Int? = null,
        val movieThumbnailUrl: String? = null,
        val movieToken: String? = null
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
        var movieCount = 0
        var dcConCount = 0
        article.content.forEachIndexed { index, content ->
            when (content) {
                is MovieContent -> {
                    if (!content.uploaded) {
                        throw IllegalStateException(
                            "MovieContent must be uploaded with MovieUpload before writing the article"
                        )
                    }
                    val insertResponse = JsonBrowser.parse(
                        KotlinInside.getInstance().httpInterface.upload(
                            ApiUrl.Article.INSERT_MOVIE_INFO,
                            Request.getDefaultOption().apply {
                                addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
                                if (session.user !is Anonymous) {
                                    addMultipartParameter("confirm_id", session.detail!!.userId)
                                }
                                addMultipartParameter("id", gallId)
                                addMultipartParameter("mv_allow_down", if (!content.info.allowDownload) "0" else "1")
                                addMultipartParameter("mv_thumb", content.info.thumbnailUrl)
                                addMultipartParameter("mv_width", content.info.width.toString())
                                addMultipartParameter("mv_height", content.info.height.toString())
                                addMultipartParameter("mv_desc", content.info.description)
                                addMultipartParameter("mv_tag", content.info.tag.joinToString("|"))
                            }
                        )
                    )
                    val insertResult = MovieInsertResult(
                        result = insertResponse.get("result").asBoolean(),
                        movieId = insertResponse.get("mv_no").asInteger(),
                        movieThumbnailUrl = insertResponse.get("mv_thumb").text(),
                        movieToken = insertResponse.get("mv_token").text()
                    )

                    if (insertResult.result) {
                        option.addMultipartParameter("memo_block[$index]", "Dc_App_Movie_$movieCount")
                        option.addMultipartParameter(
                            "movie_data[$movieCount]",
                            "${insertResult.movieId}|${insertResult.movieToken}|${content.fileId}"
                        )
                        movieCount++
                    }
                }
                is DCConContent -> {
                    if (content.dcConInsertResult.imageTag != null) {
                        option.addMultipartParameter("memo_block[$index]", content.dcConInsertResult.imageTag)
                        option.addMultipartParameter("detail_idx[$dcConCount]", content.dcCon.detailIndex.toString())
                        dcConCount++
                    }
                }
                is ImageContent -> {
                    option.addMultipartParameter("memo_block[$index]", "Dc_App_Img_$imageCount")
                    option.addMultipartFile(
                        "upload[$imageCount]",
                        HttpInterface.Option.FileInfo(
                            content.stream,
                            content.mimeType
                        )
                    )
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
        option.addMultipartParameter("fix", "")
        option.addMultipartParameter("secret_use", "0")

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.Article.WRITE,
                option
            )
        ).index(0)

        return WriteResult(
            result = json.get("result").asBoolean(),
            articleId = json.get("cause").asNullableInteger(),
            id = json.get("id").text(),
            cause = json.get("cause").text()
        )
    }
}
