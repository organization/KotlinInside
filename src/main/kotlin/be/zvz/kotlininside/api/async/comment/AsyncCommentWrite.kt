package be.zvz.kotlininside.api.async.comment

import be.zvz.kotlininside.api.comment.CommentWrite
import be.zvz.kotlininside.api.type.comment.Comment
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.value.Const
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncCommentWrite @JvmOverloads constructor(
    private val gallId: String,
    private val articleId: Int,
    private val comment: Comment,
    private val session: Session,
    private val fcmToken: String = Const.DEFAULT_FCM_TOKEN
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