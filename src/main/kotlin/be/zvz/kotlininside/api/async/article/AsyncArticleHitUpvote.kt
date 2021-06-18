package be.zvz.kotlininside.api.async.article

import be.zvz.kotlininside.api.article.ArticleHitUpvote
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncArticleHitUpvote(
    gallId: String,
    articleId: Int,
    session: Session
) {
    private val articleHitUpvote = ArticleHitUpvote(gallId, articleId, session)

    suspend fun upvoteAsync() = coroutineScope {
        async(Dispatchers.IO) {
            articleHitUpvote.upvote()
        }
    }
}
