package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.LoggedSession
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class ArticleHitUpvote @JvmOverloads constructor(
    private val gallId: String,
    private val articleId: Int,
    private val session: Session,
    private val mapper: ObjectMapper = Const.DEFAULT_JSON_MAPPER
) {
    data class HitUpvoteResult(
        val result: Boolean,
        val cause: String? = null
    )

    /**
     * 글을 힛갤 추천합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글을 힛갤 추천하지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun upvote(): HitUpvoteResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("no", articleId.toString())

        if (session is LoggedSession) {
            option
                .addMultipartParameter("confirm_id", session.detail.userId)
        }

        return mapper.readValue<List<HitUpvoteResult>>(
            KotlinInside.getInstance().httpInterface.upload(ApiUrl.Article.HIT_UPVOTE, option)
        )[0]
    }
}
