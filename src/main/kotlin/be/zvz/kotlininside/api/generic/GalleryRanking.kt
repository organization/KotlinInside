package be.zvz.kotlininside.api.generic

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.value.ApiUrl

class GalleryRanking {
    enum class RankType {
        UP,
        DOWN,
        STOP,
        UNKNOWN
    }

    data class RankingItem(
        val gallLink: String,
        val gallId: String,
        val gallName: String,
        val rankType: RankType,
        val rank: Int,
        val rankUpdown: Int
    )

    /**
     * 정식 갤러리 랭킹을 불러옵니다.
     * @return 정식 갤러리 랭킹을 반환합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 데이터를 불러오지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun request(): List<RankingItem> {
        return mutableListOf<RankingItem>().apply {
            val json = JsonBrowser.parse(
                KotlinInside.getInstance().httpInterface.get(
                    ApiUrl.MainInfo.GALLERY_RANKING,
                    Request.getDefaultOption()
                )
            )
            json.values().forEach {
                add(
                    RankingItem(
                        gallLink = it.get("link").text()!!,
                        gallId = it.get("id").text()!!,
                        gallName = it.get("category").text()!!,
                        rankType = it.get("rank_type").text()!!.let { rankTypeString ->
                            return@let when (rankTypeString) {
                                "up" -> RankType.UP
                                "stop" -> RankType.STOP
                                "down" -> RankType.DOWN
                                else -> RankType.UNKNOWN
                            }
                        },
                        rank = it.get("num").asInteger(),
                        rankUpdown = it.get("rank").asInteger()
                    )
                )
            }
        }
    }
}
