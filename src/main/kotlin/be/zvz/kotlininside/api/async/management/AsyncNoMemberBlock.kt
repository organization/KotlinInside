package be.zvz.kotlininside.api.async.management

import be.zvz.kotlininside.api.management.NoMemberBlock
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncNoMemberBlock(
    session: Session,
    gallId: String,
    option: NoMemberBlock.BlockOption = NoMemberBlock.BlockOption()
) {
    private val noMemberBlock = NoMemberBlock(
        session,
        gallId,
        option,
    )

    suspend fun blockAsync() = coroutineScope {
        async(Dispatchers.IO) {
            noMemberBlock.block()
        }
    }
}
