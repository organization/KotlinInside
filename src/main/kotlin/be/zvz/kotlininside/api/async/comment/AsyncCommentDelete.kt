package be.zvz.kotlininside.api.async.comment

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.comment.CommentDelete
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncCommentDelete @JvmOverloads constructor(
    gallId: String,
    articleId: Int,
    commentId: Int,
    session: Session,
    fcmToken: String = KotlinInside.getInstance().auth.fcmToken
) {
    private val commentDelete = CommentDelete(gallId, articleId, commentId, session, fcmToken)

    suspend fun deleteAsync() = coroutineScope {
        async(Dispatchers.IO) {
            commentDelete.delete()
        }
    }
}
