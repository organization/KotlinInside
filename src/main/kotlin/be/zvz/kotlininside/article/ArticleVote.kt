package be.zvz.kotlininside.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.value.ApiUrl

class ArticleVote(val gallId: String, val articleId: Int) {
    data class Vote(
        val result: Boolean,
        val cause: String,
        val member: Int?
    )

    /**
     * 글을 추천합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 추천이 실패할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun upvote(): Vote {
        val json = KotlinInside.getInstance().httpInterface.upload(
            ApiUrl.Article.UPVOTE,
            Request.getDefaultOption()
                .addMultipartParameter("id", gallId)
                .addMultipartParameter("no", articleId.toString())
                .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
        )!!.index(0)

        return Vote(
            result = json.get("result").`as`(Boolean::class.java),
            cause = json.get("cause").text(),
            member = json.get("member").`as`(Int::class.java)
        )
    }

    /**
     * 글을 비추천합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 비추천이 실패할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun downvote(): Vote {
        val json = KotlinInside.getInstance().httpInterface.upload(
            ApiUrl.Article.DOWNVOTE,
            Request.getDefaultOption()
                .addMultipartParameter("id", gallId)
                .addMultipartParameter("no", articleId.toString())
                .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
        )!!.index(0)

        return Vote(
            result = json.get("result").`as`(Boolean::class.java),
            cause = json.get("cause").text(),
            member = null
        )
    }
}