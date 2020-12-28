package be.zvz.kotlininside.api.async.generic

import be.zvz.kotlininside.api.generic.GalleryRanking
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncGalleryRanking {
    private val galleryRanking = GalleryRanking()

    suspend fun getAsync() = coroutineScope {
        async(Dispatchers.IO) {
            galleryRanking.request()
        }
    }
}