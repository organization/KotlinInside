package be.zvz.kotlininside.api.generic

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.value.ApiUrl

class MainPage {
    private lateinit var json: JsonBrowser

    data class Article(
        val gallId: String,
        val articleId: Int,
        val gallName: String? = null,
        val title: String,
        val thumbnail: String
    )

    data class NewGallery(
        val id: String,
        val title: String
    )

    /**
     * 클래스의 메소드들을 사용하기 전, 이 메소드를 호출해주세요. (권장)
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun request() {
        json = KotlinInside.getInstance().httpInterface.get(Request.redirectUrl(ApiUrl.MainInfo.APP_MAIN), Request.getDefaultOption())!!.index(0)
    }

    /**
     * 메인 화면에 표시되어 있는 Hit갤 게시물 목록을 가져옵니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun getHit(): List<Article> {
        if (!::json.isInitialized)
            request()

        return arrayListOf<Article>().apply {
            json.get("hit").values().forEach {
                add(
                    Article(
                        gallId = it.get("id").text(),
                        articleId = it.get("no").`as`(Int::class.java),
                        title = it.get("title").text(),
                        thumbnail = it.get("thumbnail").text()
                    )
                )
            }
        }
    }

    /**
     * 메인 화면에 표시되어 있는 베스트 게시물 목록을 가져옵니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun getBest(): List<Article> {
        if (!::json.isInitialized)
            request()

        return arrayListOf<Article>().apply {
            json.get("best").values().forEach {
                add(
                    Article(
                        gallId = it.get("id").text(),
                        articleId = it.get("no").`as`(Int::class.java),
                        gallName = it.get("gall_name").text(),
                        title = it.get("title").text(),
                        thumbnail = it.get("thumbnail").text()
                    )
                )
            }
        }
    }

    /**
     * 메인 화면에 표시되어 있는 이슈줌갤 게시물 목록을 가져옵니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록을 불러오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun getIssueZoom(): List<Article> {
        if (!::json.isInitialized)
            request()

        return arrayListOf<Article>().apply {
            json.get("issuezoom").values().forEach {
                add(
                    Article(
                        gallId = it.get("id").text(),
                        articleId = it.get("no").`as`(Int::class.java),
                        gallName = it.get("gall_name").text(),
                        title = it.get("title").text(),
                        thumbnail = it.get("thumbnail").text()
                    )
                )
            }
        }
    }

    /**
     * 메인 화면에 표시되어 있는 신규 갤러리 목록을 가져옵니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 신규 갤러리 목록을 불러오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun getNewGallery(): List<NewGallery> {
        if (!::json.isInitialized)
            request()

        return arrayListOf<NewGallery>().apply {
            json.get("new_gallery").values().forEach {
                add(
                    NewGallery(
                        id = it.get("id").text(),
                        title = it.get("title").text()
                    )
                )
            }
        }
    }
}
