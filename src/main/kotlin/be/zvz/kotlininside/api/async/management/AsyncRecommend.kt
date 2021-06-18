package be.zvz.kotlininside.api.async.management

import be.zvz.kotlininside.api.management.Recommend
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncRecommend(
    gallId: String,
    articleId: Int,
    session: Session
) {
    private val recommend = Recommend(gallId, articleId, session)

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            recommend.request()
        }
    }
}
