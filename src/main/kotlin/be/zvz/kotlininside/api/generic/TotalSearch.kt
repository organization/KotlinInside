package be.zvz.kotlininside.api.generic

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.Gallery
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.value.ApiUrl

class TotalSearch(
    private val keyword: String
) {
    data class Wiki(
        val title: String,
        val gallName: String,
        val url: String
    )

    data class SearchedArticle(
        val title: String,
        val content: String,
        val gallId: String,
        val gallName: String,
        val articleId: Int,
        val regDate: String
    )

    data class RealTime(
        val rank: Int,
        val title: String,
        val url: String
    )

    data class TotalSearchResult(
        val mainGallery: List<Gallery>,
        val minorGallery: List<Gallery>,
        val wiki: List<Wiki>,
        val board: List<SearchedArticle>,
        val todayIssue: List<SearchedArticle>,
        val realTime: List<RealTime>
    )

    /**
     * 통합 검색을 실행하고, 검색 결과를 받아옵니다.
     *
     * @return 통합 검색 결과를 반환합니다.
     */
    fun search(): TotalSearchResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("keyword", keyword)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("search_type", "search_main")

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.Search.SEARCH,
                option
            )
        )

        return TotalSearchResult(
            mainGallery = mutableListOf<Gallery>().apply {
                json.get("main_gall").values().forEach {
                    add(
                        Gallery(
                            title = it.get("title").safeText(),
                            id = it.get("id").safeText()
                        )
                    )
                }
            },
            minorGallery = mutableListOf<Gallery>().apply {
                json.get("minor_gall").values().forEach {
                    add(
                        Gallery(
                            title = it.get("title").safeText(),
                            id = it.get("id").safeText()
                        )
                    )
                }
            },
            wiki = mutableListOf<Wiki>().apply {
                json.get("wiki").values().forEach {
                    add(
                        Wiki(
                            title = it.get("title").safeText(),
                            gallName = it.get("gall_name").safeText(),
                            url = it.get("url").safeText()
                        )
                    )
                }
            },
            board = mutableListOf<SearchedArticle>().apply {
                json.get("board").values().forEach {
                    add(
                        SearchedArticle(
                            title = it.get("title").safeText(),
                            content = it.get("content").safeText(),
                            gallId = it.get("id").safeText(),
                            gallName = it.get("gall_name").safeText(),
                            articleId = it.get("no").asInteger(),
                            regDate = it.get("regdate").safeText()
                        )
                    )
                }
            },
            todayIssue = mutableListOf<SearchedArticle>().apply {
                json.get("today").values().forEach {
                    add(
                        SearchedArticle(
                            title = it.get("title").safeText(),
                            content = it.get("content").safeText(),
                            gallId = it.get("id").safeText(),
                            gallName = it.get("gall_name").safeText(),
                            articleId = it.get("no").asInteger(),
                            regDate = it.get("regdate").safeText()
                        )
                    )
                }
            },
            realTime = mutableListOf<RealTime>().apply {
                json.get("realtime").values().forEach {
                    add(
                        RealTime(
                            rank = it.get("rank").asInteger(),
                            title = it.get("title").safeText(),
                            url = it.get("url").safeText()
                        )
                    )
                }
            }
        )
    }
}
