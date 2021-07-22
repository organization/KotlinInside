package be.zvz.kotlininside.api.async.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.article.ArticleWrite
import be.zvz.kotlininside.api.type.Article
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncArticleWrite @JvmOverloads constructor(
    gallId: String,
    article: Article,
    session: Session,
    fcmToken: String = KotlinInside.getInstance().auth.fcmToken
) {
    private val articleWrite = ArticleWrite(gallId, article, session, fcmToken)

    suspend fun writeAsync() = coroutineScope {
        async(Dispatchers.IO) {
            articleWrite.write()
        }
    }
}
