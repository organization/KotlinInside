package be.zvz.kotlininside.api.async.management

import be.zvz.kotlininside.api.management.Notice
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncNotice(
    gallId: String,
    articleId: Int,
    session: Session
) {
    private val notice = Notice(gallId, articleId, session)

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            notice.request()
        }
    }
}
