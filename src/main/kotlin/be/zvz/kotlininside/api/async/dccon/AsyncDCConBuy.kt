package be.zvz.kotlininside.api.async.dccon

import be.zvz.kotlininside.api.dccon.DCConBuy
import be.zvz.kotlininside.api.type.DCCon
import be.zvz.kotlininside.session.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

class AsyncDCConBuy(
        dcCon: DCCon,
        session: Session
) {
    private val dcConBuy = DCConBuy(dcCon, session)

    suspend fun buyAsync() = coroutineScope {
        async(Dispatchers.IO) {
            dcConBuy.buy()
        }
    }
}