package be.zvz.kotlininside.api.async.comment

import be.zvz.kotlininside.api.comment.CommentDelete
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.value.Const
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncCommentDelete @JvmOverloads constructor(
    gallId: String,
    articleId: Int,
    commentId: Int,
    session: Session,
    fcmToken: String = Const.DEFAULT_FCM_TOKEN
) {
    private val commentDelete = CommentDelete(gallId, articleId, commentId, session, fcmToken)

    suspend fun deleteAsync() = coroutineScope {
        async(Dispatchers.IO) {
            commentDelete.delete()
        }
    }
}
