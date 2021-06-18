package be.zvz.kotlininside.api.async.generic.userinfo

import be.zvz.kotlininside.api.generic.userinfo.MyGall
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncMyGall(
    session: Session
) {
    private val myGall = MyGall(session)

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            myGall.request()
        }
    }
}
