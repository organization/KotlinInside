package be.zvz.kotlininside.api.dccon

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.DCCon
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl

class DCConDetail(
    private val dcCon: DCCon
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
    fun request(): DetailResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("package_idx", dcCon.packageIndex.toString())
            .addMultipartParameter("type", "package_detail")
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.DCCon.DCCON,
                option
            )
        )

        return when {
            json.isList -> {
                DetailResult()
            }
            else -> DetailResult(
                info = mutableListOf<DCConInfo>().apply {
                    json.get("info").values().forEach {
                        add(
                            DCConInfo(
                                packageIndex = it.get("package_idx").asInteger(),
                                mainImg = it.get("main_img").safeText(),
                                title = it.get("title").safeText(),
                                description = it.get("description").safeText(),
                                mandu = it.get("mandu").asInteger(),
                                getState = StringUtil.ynToBoolean(it.get("get_state").safeText())
                            )
                        )
                    }
                },
                detail = mutableListOf<DCCon>().apply {
                    json.get("detail").values().forEach {
                        add(
                            DCCon(
                                imgLink = it.get("img").safeText()
                            )
                        )
                    }
                }
            )
        }
    }
}
