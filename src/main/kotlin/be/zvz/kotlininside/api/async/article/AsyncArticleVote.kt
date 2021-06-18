package be.zvz.kotlininside.api.async.article

import be.zvz.kotlininside.api.article.ArticleVote
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncArticleVote(
    gallId: String,
    articleId: Int,
    session: Session
) {
    private val articleVote = ArticleVote(gallId, articleId, session)

    suspend fun upvoteAsync() = coroutineScope {
        async(Dispatchers.IO) {
            articleVote.upvote()
        }
    }

    suspend fun downvoteAsync() = coroutineScope {
        async(Dispatchers.IO) {
            articleVote.downvote()
        }
    }
}
