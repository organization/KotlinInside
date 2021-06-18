package be.zvz.kotlininside.api.async.article

import be.zvz.kotlininside.api.article.ArticleModify
import be.zvz.kotlininside.api.type.Article
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncArticleModify(
    gallId: String,
    articleId: Int,
    session: Session
) {
    private val articleModify = ArticleModify(gallId, articleId, session)

    suspend fun modifyInfoAsync() = coroutineScope {
        async(Dispatchers.IO) {
            articleModify.modifyInfo()
        }
    }

    suspend fun modifyAsync(article: Article, fcmToken: String = "N") = coroutineScope {
        async(Dispatchers.IO) {
            articleModify.modify(article, fcmToken)
        }
    }
}
