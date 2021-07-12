package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.AnonymousSession
import be.zvz.kotlininside.session.LoggedSession
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.module.kotlin.convertValue

class ArticleDelete @JvmOverloads constructor(
    private val gallId: String,
    private val articleId: Int,
    private val session: Session,
    private val fcmToken: String = Const.DEFAULT_FCM_TOKEN,
    private val mapper: ObjectMapper = Const.DEFAULT_JSON_MAPPER
) {
    data class DeleteResult(
        val result: Boolean,
        val cause: String? = null,
        val message: String? = null,
        val status: Int? = null
    )

    /**
     * 글을 삭제합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글을 삭제하지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun delete(): DeleteResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("client_token", fcmToken)
            .addMultipartParameter("no", articleId.toString())
            .addMultipartParameter("mode", "board_del")
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        if (session is LoggedSession) {
            option
                .addMultipartParameter("user_id", session.detail.userId)
        } else {
            option
                .addMultipartParameter("write_pw", session.user.password)
        }

        mapper.readTree(KotlinInside.getInstance().httpInterface.upload(ApiUrl.Article.DELETE, option)).run {
            return if (this is ArrayNode) {
                mapper.convertValue(get(0))
            } else {
                mapper.convertValue(this)
            }
        }
    }
}
