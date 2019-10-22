package be.zvz.kotlininside.api.generic

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.value.ApiUrl

class MainPage {
    private lateinit var json: JsonBrowser

    data class Article(
        val id: String,
        val identifier: Int,
        val gallName: String,
        val title: String,
        val thumbnail: String
    )

    data class NewGallery(
        val id: String,
        val title: String
    )

    @Throws(HttpException::class)
    fun init() {
        TODO("메인 페이지 파싱 구현")
    }
}
