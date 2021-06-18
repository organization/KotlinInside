package be.zvz.kotlininside.api.async.generic.userinfo

import be.zvz.kotlininside.api.generic.userinfo.CheckManagedGallery
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncCheckManagedGallery(
    session: Session,
) {
    private val checkManagedGallery = CheckManagedGallery(session)

    suspend fun requestAsync() = coroutineScope {
        async(Dispatchers.IO) {
            checkManagedGallery.request()
        }
    }
}
