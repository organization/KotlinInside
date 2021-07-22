package be.zvz.kotlininside.api.async.comment

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.comment.CommentWrite
import be.zvz.kotlininside.api.type.comment.Comment
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncCommentWrite @JvmOverloads constructor(
    gallId: String,
    articleId: Int,
    comment: Comment,
    session: Session,
    fcmToken: String = KotlinInside.getInstance().auth.fcmToken
) {
    private val commentWrite = CommentWrite(gallId, articleId, comment, session, fcmToken)

    suspend fun writeAsync() = coroutineScope {
        async(Dispatchers.IO) {
            commentWrite.write()
        }
    }

    suspend fun replyAsync(commentId: Int) = coroutineScope {
        async(Dispatchers.IO) {
            commentWrite.reply(commentId)
        }
    }
}
