package be.zvz.kotlininside.api.async.management

import be.zvz.kotlininside.api.management.ChangeHeadText
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncChangeHeadText(
    gallId: String,
    articleId: Int,
    headTextId: Int,
    session: Session
) {
    private val changeHeadText = ChangeHeadText(gallId, articleId, headTextId, session)

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            changeHeadText.request()
        }
    }
}
