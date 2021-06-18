package be.zvz.kotlininside.api.async.generic.minigallery

import be.zvz.kotlininside.api.generic.minigallery.JoinMiniGallery
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncJoinMiniGallery(
    gallId: String,
    session: Session
) {
    private val joinMiniGallery = JoinMiniGallery(gallId, session)

    suspend fun joinAsync() = coroutineScope {
        async(Dispatchers.IO) {
            joinMiniGallery.join()
        }
    }

    suspend fun requestMemberJoinAsync() = coroutineScope {
        async(Dispatchers.IO) {
            joinMiniGallery.requestMemberJoin()
        }
    }

    suspend fun requestMemberJoinOkAsync() = coroutineScope {
        async(Dispatchers.IO) {
            joinMiniGallery.requestMemberJoinOk()
        }
    }
}
