package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class ArticleReport(
    private val gallId: String,
    private val articleId: Int,
    private val session: Session
) {
    /**
     * 글 신고 링크를 반환합니다.
     */
    fun getLink(): String {
        val url =
            "${ApiUrl.Article.REPORT}?app_id=${KotlinInside.getInstance().auth.getAppId()}&id=$gallId&no=$articleId"

        if (session.user !is Anonymous) {
            url.plus("&confirm_id=${session.detail!!.userId}")
        }

        return Request.redirectUrl(url)
    }
}
