package be.zvz.kotlininside.api.async.generic.userinfo

import be.zvz.kotlininside.api.generic.userinfo.CheckJoinedMiniGallery
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncCheckJoinedMiniGallery(
    session: Session,
) {
    private val checkJoinMiniGallery = CheckJoinedMiniGallery(session)

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            checkJoinMiniGallery.request()
        }
    }
}