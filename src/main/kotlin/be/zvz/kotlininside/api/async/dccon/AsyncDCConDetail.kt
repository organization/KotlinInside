package be.zvz.kotlininside.api.async.dccon

import be.zvz.kotlininside.api.dccon.DCConDetail
import be.zvz.kotlininside.api.type.DCCon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncDCConDetail(
    dcCon: DCCon
) {
    private val dcConDetail = DCConDetail(dcCon)

    suspend fun getAsync() = coroutineScope {
        async(Dispatchers.IO) {
            dcConDetail.request()
        }
    }
}
