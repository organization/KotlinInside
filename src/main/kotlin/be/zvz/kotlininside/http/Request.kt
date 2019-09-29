package be.zvz.kotlininside.http

import be.zvz.kotlininside.value.ApiUrl
import com.migcomponents.migbase64.Base64

class Request {
    companion object {
        @JvmStatic
        fun redirectUrl(url: String): String {
            return ApiUrl.REDIRECT + "?hash=" + Base64.encodeToString(url.toByteArray(), false)
        }

        @JvmStatic
        fun getDefaultOption(): HttpInterface.Option {
            return HttpInterface.Option()
                .addHeader("Referer", "http://www.dcinside.com")
        }
    }
}