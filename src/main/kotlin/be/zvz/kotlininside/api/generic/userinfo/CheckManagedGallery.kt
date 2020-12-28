package be.zvz.kotlininside.api.generic.userinfo

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class CheckManagedGallery(
    private val session: Session,
) {
    data class Gallery(
        val hide: Int,
        val id: String,
        val title: String,
        val type: String, // TODO: Enum class로 변경
        val managerType: String, // TODO: Enum class로 변경
    )

    data class CheckResult(
        val myManageList: List<Gallery>
    )

    /**
     * 내 갤러리 정보를 받아옵니다.
     *
     * @return 내 갤러리 정보를 반환합니다.
     */
    fun get(): CheckResult {
        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 CheckJoinedMiniGallery을 사용할 수 없습니다.")
        }

        val option = Request.getDefaultOption()
            .addMultipartParameter("user_id", session.detail!!.userId)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        val json = KotlinInside.getInstance().httpInterface.upload(
            ApiUrl.User.MY_MANAGE_GALL_CHECK,
            option
        )!!.index(0)

        return CheckResult(
            myManageList = mutableListOf<Gallery>().apply {
                json.get("mymanageList").values().forEach {
                    add(
                        Gallery(
                            hide = it.get("gall_hide").asInteger(),
                            id = it.get("gall_id").safeText(),
                            title = it.get("gall_koname").safeText(),
                            type = it.get("gall_type").safeText(),
                            managerType = it.get("manager_type").safeText()
                        )
                    )
                }
            },
        )
    }
}