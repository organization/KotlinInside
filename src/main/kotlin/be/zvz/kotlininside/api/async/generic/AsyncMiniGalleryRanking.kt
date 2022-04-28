package be.zvz.kotlininside.api.async.generic

import be.zvz.kotlininside.api.generic.MiniGalleryRanking
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncMiniGalleryRanking {
    private val miniGalleryRanking = MiniGalleryRanking()

    suspend fun getAsync() = coroutineScope {
        async(Dispatchers.IO) {
            miniGalleryRanking.request()
        }
    }
}
