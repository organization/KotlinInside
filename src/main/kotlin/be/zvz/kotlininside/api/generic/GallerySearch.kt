package be.zvz.kotlininside.api.generic

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.Gallery
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.value.ApiUrl

class GallerySearch(
    private val keyword: String
) {
    data class GallerySearchResult(
        val mainGallery: List<Gallery>,
        val minorGallery: List<Gallery>,
        val mainRecommendGallery: List<Gallery>,
        val minorRecommendGallery: List<Gallery>
    )

    /**
     * 갤러리 목록을 검색하고, 검색 결과를 받아옵니다.
     *
     * @return 갤러리 목록 검색 결과를 반환합니다.
     */
    fun search(): GallerySearchResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("keyword", keyword)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.Search.SEARCH,
                option
            )
        )

        return GallerySearchResult(
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
            mainRecommendGallery = mutableListOf<Gallery>().apply {
                json.get("main_recomm_gall").values().forEach {
                    add(
                        Gallery(
                            title = it.get("title").safeText(),
                            id = it.get("id").safeText()
                        )
                    )
                }
            },
            minorRecommendGallery = mutableListOf<Gallery>().apply {
                json.get("minor_recomm_gall").values().forEach {
                    add(
                        Gallery(
                            title = it.get("title").safeText(),
                            id = it.get("id").safeText()
                        )
                    )
                }
            }
        )
    }
}
