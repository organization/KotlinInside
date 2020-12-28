package be.zvz.kotlininside.api.async.comment

import be.zvz.kotlininside.api.comment.CommentRead
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncCommentRead(
        gallId: String,
        articleId: Int,
        rePage: Int
) {
    private val commentRead = CommentRead(gallId, articleId, rePage)

    suspend fun getAsync() = coroutineScope {
        async(Dispatchers.IO) {
            commentRead.request()
        }
    }
}