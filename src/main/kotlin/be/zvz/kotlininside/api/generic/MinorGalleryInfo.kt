package be.zvz.kotlininside.api.generic

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.value.ApiUrl

class MinorGalleryInfo(
        val gallId: String
) {
    data class InfoResult(
            val id: String,
            val koName: String,
            val image: String? = null,
            val description: String? = null,
            val manager: Manager,
            val subManager: List<Manager>,
            val createDate: String,
            val new: Boolean,
            val hotState: String
    )

    data class Manager(
            val isMaster: Boolean,
            val id: String,
            val name: String
    )

    /**
     * 갤러리 정보를 받아옵니다.
     *
     * @return 갤러리 정보를 반환합니다.
     */
    fun get(): InfoResult {
        val option = Request.getDefaultOption()
                .addMultipartParameter("id", gallId)
                .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        val json = KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.Gallery.MINOR_INFO,
                option
        )!!.index(0)

        return InfoResult(
                id = json.get("id").text(),
                koName = json.get("ko_name").text(),
                image = json.safeGet("img").run {
                    when {
                        isNull -> null
                        else -> text()
                    }
                },
                description = json.safeGet("mgallery_desc").run {
                    when {
                        isNull -> null
                        else -> text()
                    }
                },
                manager = Manager(
                        isMaster = true,
                        id = json.get("master_id").text(),
                        name = json.get("master_name").text()
                ),
                subManager = mutableListOf<Manager>().apply {
                    json.get("submanager").values().forEach {
                        add(
                                Manager(
                                        isMaster = false,
                                        id = it.get("id").text(),
                                        name = it.get("name").text()
                                )
                        )
                    }
                },
                createDate = json.get("create_dt").text(),
                new = json.get("new").`as`(Boolean::class.java),
                hotState = json.get("hot_state").text()
        )
    }
}