package be.zvz.kotlininside.api.async.article

import be.zvz.kotlininside.api.article.ArticleRead
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncArticleRead @JvmOverloads constructor(
    private val gallId: String,
    private val articleId: Int,
    private val session: Session? = null
) {
    private val articleRead = ArticleRead(gallId, articleId, session)

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            articleRead.request()
        }
    }

    suspend fun getViewInfoAsync() = coroutineScope {
        async(Dispatchers.Default) {
            articleRead.getViewInfo()
        }
    }

    suspend fun getViewMainAsync() = coroutineScope {
        async(Dispatchers.Default) {
            articleRead.getViewMain()
        }
    }
}