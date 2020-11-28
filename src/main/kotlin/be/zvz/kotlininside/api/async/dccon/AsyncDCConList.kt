package be.zvz.kotlininside.api.async.dccon

import be.zvz.kotlininside.api.dccon.DCConList
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncDCConList(
        session: Session
) {
    private val dcConList = DCConList(session)

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            dcConList.request()
        }
    }
}