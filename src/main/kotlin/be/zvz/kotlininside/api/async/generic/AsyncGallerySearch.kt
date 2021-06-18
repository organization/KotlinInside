package be.zvz.kotlininside.api.async.generic

import be.zvz.kotlininside.api.generic.GallerySearch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncGallerySearch(
    keyword: String
) {
    private val gallerySearch = GallerySearch(keyword)

    suspend fun searchAsync() = coroutineScope {
        async(Dispatchers.IO) {
            gallerySearch.search()
        }
    }
}
