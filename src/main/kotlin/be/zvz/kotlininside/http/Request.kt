package be.zvz.kotlininside.http

import be.zvz.kotlininside.migbase64.Base64
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const

object Request {
    @JvmStatic
    fun redirectUrl(url: String): String =
        ApiUrl.REDIRECT + "?hash=" + Base64.encodeToString(url.toByteArray(), false)

    @JvmStatic
    fun getDefaultOption(): HttpInterface.Option = HttpInterface.Option()
        .setUserAgent(Const.USER_AGENT)
        .addHeader("Referer", "http://www.dcinside.com")
}
