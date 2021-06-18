package be.zvz.kotlininside.api.async.management

import be.zvz.kotlininside.api.management.GallerySetting
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncGallerySetting(
    gallId: String,
    session: Session
) {
    private val gallerySetting = GallerySetting(gallId, session)

    suspend fun getLinkAsync() = coroutineScope {
        async(Dispatchers.IO) {
            gallerySetting.getLink()
        }
    }
}
