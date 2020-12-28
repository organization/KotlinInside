package be.zvz.kotlininside.api.async.generic

import be.zvz.kotlininside.api.generic.MinorGalleryInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncMinorGalleryInfo(
        gallId: String
) {
    private val minorGalleryInfo = MinorGalleryInfo(gallId)

    suspend fun getAsync() = coroutineScope {
        async(Dispatchers.IO) {
            minorGalleryInfo.request()
        }
    }
}