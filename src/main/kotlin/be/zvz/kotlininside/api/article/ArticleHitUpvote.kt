package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class ArticleHitUpvote(
        private val gallId: String,
        private val articleId: Int,
        private val session: Session
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

        if (session.user !is Anonymous) {
            option
                    .addMultipartParameter("confirm_id", session.detail!!.userId)
        }

        val json = KotlinInside.getInstance().httpInterface.upload(ApiUrl.Article.HIT_UPVOTE, option)!!.index(0)

        val result = json.get("result").`as`(Boolean::class.java)

        return when {
            result -> HitUpvoteResult(
                    result = result
            )
            else -> HitUpvoteResult(
                    result = result,
                    cause = json.get("cause").text()
            )
        }
    }
}
