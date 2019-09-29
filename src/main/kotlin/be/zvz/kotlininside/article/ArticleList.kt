package be.zvz.kotlininside.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.value.ApiUrl
import kotlin.collections.List

class ArticleList(val id: String, val page: Int, val option: Option? = null) {
    class Option {
        var recommand = false
        var notice = false
        var headid = 0
    }

    /**
     *
     * @exception [be.zvz.kotlininside.http.HttpException] 글 목록 불러오는데 실패했을 경우, HttpException 발생
     * @return 글들의 URL을 반환합니다.
     */
    fun getArticleList(): List<String> {
        val url = ApiUrl.Article.LIST +
                "?id=" + id +
                "&page=" + page +
                "&app_id=" + KotlinInside.getInstance().auth.getAppId() +
                option?.let {
                    val s = ""
                    if (it.recommand)
                        s.plus("&recommand=").plus("1")
                    if (it.notice)
                        s.plus("&notice=").plus("1")
                    if (it.headid > 0)
                        s.plus("&headid=").plus(it.headid)
                    s
                }
        val json = KotlinInside.getInstance().httpInterface.get(Request.redirectUrl(url), Request.getDefaultOption())

        TODO("JSON 구조 확인 후 다시 구현")

    }
}