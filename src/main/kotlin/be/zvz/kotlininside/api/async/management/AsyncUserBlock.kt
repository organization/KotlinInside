package be.zvz.kotlininside.api.async.management

import be.zvz.kotlininside.api.management.UserBlock
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncUserBlock @JvmOverloads constructor(
        gallId: String,
        articleId: Int,
        session: Session,
        option: UserBlock.BlockOption = UserBlock.BlockOption()
) {
    private val userBlock = UserBlock(gallId, articleId, session, option)

    suspend fun blockAsync() = coroutineScope {
        async(Dispatchers.IO) {
            userBlock.block()
        }
    }

    suspend fun getLinkAsync() = coroutineScope {
        async(Dispatchers.IO) {
            userBlock.getLink()
        }
    }
}