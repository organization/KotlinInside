package be.zvz.kotlininside.api.async.generic.minigallery

import be.zvz.kotlininside.api.generic.minigallery.QuitMiniGallery
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncQuitMiniGallery(
    gallId: String,
    session: Session
) {
    private val quitMiniGallery = QuitMiniGallery(gallId, session)

    suspend fun quitAsync() = coroutineScope {
        async(Dispatchers.IO) {
            quitMiniGallery.quit()
        }
    }
}
