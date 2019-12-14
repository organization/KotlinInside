package be.zvz.kotlininside.api.dccon

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.DCCon
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl

class DCConDetail(
        val dcCon: DCCon
) {
    data class DetailResult(
            val info: List<DCConInfo> = listOf(),
            val detail: List<DCCon> = listOf()
    )

    data class DCConInfo(
            val packageIndex: Int,
            val mainImg: String,
            val title: String,
            val description: String,
            val mandu: Int,
            val getState: Boolean
    )

    /**
     * 디시콘 정보를 받아오는 메소드입니다.
     * @return [DetailResult] 디시콘 정보를 반환합니다.
     */
    fun get(): DetailResult {
        val option = Request.getDefaultOption()
                .addMultipartParameter("package_idx", dcCon.packageIndex.toString())
                .addMultipartParameter("type", "package_detail")
                .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        val json = KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.DCCon.DCCON,
                option
        )!!

        return when {
            json.isList -> {
                DetailResult()
            }
            else -> DetailResult(
                    info = mutableListOf<DCConInfo>().apply {
                        json.get("info").values().forEach {
                            add(
                                    DCConInfo(
                                            packageIndex = it.get("package_idx").`as`(Int::class.java),
                                            mainImg = it.get("main_img").text(),
                                            title = it.get("title").text(),
                                            description = it.get("description").text(),
                                            mandu = it.get("mandu").`as`(Int::class.java),
                                            getState = StringUtil.ynToBoolean(it.get("get_state").text())
                                    )
                            )
                        }
                    },
                    detail = mutableListOf<DCCon>().apply {
                        json.get("detail").values().forEach {
                            add(
                                    DCCon(
                                            imgLink = it.get("img").text()
                                    )
                            )
                        }
                    }
            )
        }

    }
}