package be.zvz.kotlininside.api.generic

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.value.ApiUrl

class MinorGalleryInfo(
        private val gallId: String
) {
    data class MiniGalleryInfo(
        val hide: Int,
        val totalMember: Int,
        val memberLimit: Int,
        val isMember: Boolean
    )

    data class InfoResult(
        val id: String,
        val koName: String,
        val image: String? = null,
        val description: String? = null,
        val manager: Manager,
        val subManager: List<Manager>,
        val createDate: String,
        val new: Boolean,
        val hotState: String,
        val totalCount: String,
        val categoryName: String,
        val mini: MiniGalleryInfo? = null
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

        val miniGalleryInfo = json.get("mini")
        return InfoResult(
                id = json.get("id").safeText(),
                koName = json.get("ko_name").safeText(),
                image = json.get("img").text(),
                description = json.get("mgallery_desc").text(),
                manager = Manager(
                        isMaster = true,
                        id = json.get("master_id").safeText(),
                        name = json.get("master_name").safeText()
                ),
                subManager = mutableListOf<Manager>().apply {
                    json.get("submanager").values().forEach {
                        add(
                            Manager(
                                isMaster = false,
                                id = it.get("id").safeText(),
                                name = it.get("name").safeText()
                            )
                        )
                    }
                },
            createDate = json.get("create_dt").safeText(),
            new = json.get("new").asBoolean(),
            hotState = json.get("hot_state").safeText(),
            totalCount = json.get("total_count").safeText(),
            categoryName = json.get("cate_name").safeText(),
            mini = if (!miniGalleryInfo.isNull) {
                MiniGalleryInfo(
                    hide = miniGalleryInfo.get("gall_hide").asInteger(),
                    totalMember = miniGalleryInfo.get("total_member").asInteger(),
                    memberLimit = miniGalleryInfo.get("member_limit").asInteger(),
                    isMember = miniGalleryInfo.get("member_ok").asBoolean()
                )
            } else {
                null
            }
        )
    }
}