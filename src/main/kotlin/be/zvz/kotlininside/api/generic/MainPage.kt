package be.zvz.kotlininside.api.generic

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
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

    /**
     * 클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요.
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun request() {
        json = KotlinInside.getInstance().httpInterface.get(Request.redirectUrl(ApiUrl.MainInfo.APP_MAIN), Request.getDefaultOption())!!

        TODO("메인 페이지 JSON 파싱 구현")
    }


}
