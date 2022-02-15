package be.zvz.kotlininside.api.async.management

import be.zvz.kotlininside.api.management.NoMemberBlock
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import java.util.*

class AsyncNoMemberBlock @JvmOverloads constructor(
    private val session: Session,
    private val gallId: String,
    private val imgStatus: NoMemberBlock.ImageStatus,
    private val proxyDate: Date? = null,
    private val mobileDate: Date? = null,
    private val imgDate: Date? = null
) {
    private val noMemberBlock = NoMemberBlock(
        session,
        gallId,
        imgStatus,
        proxyDate,
        mobileDate,
        imgDate
    )

    suspend fun blockAsync() = coroutineScope {
        async(Dispatchers.IO) {
            noMemberBlock.block()
        }
    }
}
