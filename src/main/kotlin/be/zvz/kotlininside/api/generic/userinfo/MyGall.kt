package be.zvz.kotlininside.api.generic.userinfo

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.Gallery
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class MyGall(
    private val session: Session,
) {
    data class MyGallResult(
        val myGall: List<Gallery>,
        val favorite: List<Gallery>
    )

    /**
     * 내 갤러리 정보를 받아옵니다.
     *
     * @return 내 갤러리 정보를 반환합니다.
     */
    fun request(): MyGallResult {
        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 MyGall을 사용할 수 없습니다.")
        }

        val option = Request.getDefaultOption()
            .addMultipartParameter("user_id", session.detail!!.userId)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        val json = KotlinInside.getInstance().httpInterface.upload(
            ApiUrl.User.MY_GALL,
            option
        )!!.index(0)

        return MyGallResult(
            myGall = mutableListOf<Gallery>().apply {
                json.get("mygall").values().forEach {
                    add(
                        Gallery(
                            title = it.get("gall_koname").safeText(),
                            id = it.get("gall_id").safeText()
                        )
                    )
                }
            },
            favorite = mutableListOf<Gallery>().apply {
                json.get("favori").values().forEach {
                    add(
                        Gallery(
                            title = it.get("gall_koname").safeText(),
                            id = it.get("gall_id").safeText()
                        )
                    )
                }
            },
        )
    }
}