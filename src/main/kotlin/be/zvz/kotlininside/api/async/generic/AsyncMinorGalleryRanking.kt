package be.zvz.kotlininside.api.async.generic

import be.zvz.kotlininside.api.generic.MinorGalleryRanking
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncMinorGalleryRanking {
    private val minorGalleryRanking = MinorGalleryRanking()

    suspend fun getAsync() = coroutineScope {
        async(Dispatchers.IO) {
            minorGalleryRanking.request()
        }
    }
}
