package be.zvz.kotlininside.api.async.article

import be.zvz.kotlininside.api.article.ArticleReport
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncArticleReport(
    gallId: String,
    articleId: Int,
    session: Session
) {
    private val articleReport = ArticleReport(gallId, articleId, session)

    suspend fun getLinkAsync() = coroutineScope {
        async(Dispatchers.Default) {
            articleReport.getLink()
        }
    }
}