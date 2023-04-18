package be.zvz.kotlininside.api.generic.userinfo

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class CheckJoinedMiniGallery(
    private val session: Session
) {
    data class Gallery(
        val title: String,
        val id: String,
        val hide: Int
    )

    data class CheckResult(
        val myJoinMiniIn: List<Gallery>,
        val myJoinMiniHold: List<Gallery>,
        val myJoinMiniOut: List<Gallery>
    )

    /**
     * 내 갤러리 정보를 받아옵니다.
     *
     * @return 내 갤러리 정보를 반환합니다.
     */
    fun request(): CheckResult {
        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 CheckJoinedMiniGallery을 사용할 수 없습니다.")
        }

        val option = Request.getDefaultOption()
            .addMultipartParameter("user_id", session.detail!!.userId)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.User.MY_MINI_JOIN_CHECK,
                option
            )
        ).index(0)

        return CheckResult(
            myJoinMiniIn = mutableListOf<Gallery>().apply {
                json.get("myjoinmini_in").values().forEach {
                    add(
                        Gallery(
                            title = it.get("gall_koname").safeText(),
                            id = it.get("gall_id").safeText(),
                            hide = it.get("gall_hide").asInteger()
                        )
                    )
                }
            },
            myJoinMiniHold = mutableListOf<Gallery>().apply {
                json.get("myjoinmini_hold").values().forEach {
                    add(
                        Gallery(
                            title = it.get("gall_koname").safeText(),
                            id = it.get("gall_id").safeText(),
                            hide = it.get("gall_hide").asInteger()
                        )
                    )
                }
            },
            myJoinMiniOut = mutableListOf<Gallery>().apply {
                json.get("myjoinmini_out").values().forEach {
                    add(
                        Gallery(
                            title = it.get("gall_koname").safeText(),
                            id = it.get("gall_id").safeText(),
                            hide = it.get("gall_hide").asInteger()
                        )
                    )
                }
            }
        )
    }
}
