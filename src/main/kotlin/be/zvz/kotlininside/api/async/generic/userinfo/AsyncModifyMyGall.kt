package be.zvz.kotlininside.api.async.generic.userinfo

import be.zvz.kotlininside.api.generic.userinfo.ModifyMyGall
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncModifyMyGall(
    gallName: String,
    gallId: String,
    session: Session
) {
    private val modifyMyGall = ModifyMyGall(gallName, gallId, session)

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            modifyMyGall.request()
        }
    }
}
