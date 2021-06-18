package be.zvz.kotlininside.api.async.generic

import be.zvz.kotlininside.api.generic.TotalSearch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncTotalSearch(
    keyword: String
) {
    private val totalSearch = TotalSearch(keyword)

    suspend fun searchAsync() = coroutineScope {
        async(Dispatchers.IO) {
            totalSearch.search()
        }
    }
}
