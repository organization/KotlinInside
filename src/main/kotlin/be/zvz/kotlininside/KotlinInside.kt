package be.zvz.kotlininside

import be.zvz.kotlininside.httpinterface.HttpInterface

class KotlinInside(val httpInterface: HttpInterface) {
    init {
        httpInterface
                .setUserAgent("dcinside.app")
                .setHeader("Referer", "http://www.dcinside.com")
    }
}
