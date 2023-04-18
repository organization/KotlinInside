package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.LoginUser
import be.zvz.kotlininside.value.ApiUrl

class ArticleVote(
    private val gallId: String,
    private val articleId: Int,
    private val session: Session
) {
    data class VoteResult(
        val result: Boolean,
        val cause: String,
        val member: Int? = null
    )

    /**
     * 글을 추천합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 추천이 실패할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun upvote(): VoteResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("no", articleId.toString())
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        if (session.user is LoginUser) {
            option.addMultipartParameter("confirm_id", session.detail!!.userId)
        }

        var json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.Article.UPVOTE,
                option
            )
        )

        if (json.isList) {
            json = json.index(0)
        }

        return VoteResult(
            result = json.get("result").asBoolean(),
            cause = json.get("cause").safeText(),
            member = json.get("member").asNullableInteger()
        )
    }

    /**
     * 글을 비추천합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 비추천이 실패할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun downvote(): VoteResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("no", articleId.toString())
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        if (session.user is LoginUser) {
            option.addMultipartParameter("confirm_id", session.detail!!.userId)
        }

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.Article.DOWNVOTE,
                option
            )
        ).index(0)

        return VoteResult(
            result = json.get("result").asBoolean(),
            cause = json.get("cause").safeText(),
            member = null
        )
    }
}
