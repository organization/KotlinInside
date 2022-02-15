package be.zvz.kotlininside.api.management

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl
import java.io.IOException

class NoMemberBlock(
        private val session: Session,
        private val gallId: String,
        private val proxyDate: String,
        private val mobileDate: String,
        private val imgDate: String,
        private val imgStatus: String
) {
    data class BlockResult(
            val result: String,
            val msg: String
    )
    fun request(): BlockResult {
        if (session.user is Anonymous)
            throw RuntimeException("유동닉은 갤러리 관리를 할 수 없습니다.")
        else {
            val option = Request.getDefaultOption()
                    .addBodyParameter("proxyDate", proxyDate)
                    //proxyDate format = 2022.02.03 20:48(yyyy.MM.dd HH:mm)
                    //proxyDate, mobileDate, imgDate 는 현재시간 + 48시간, 현재시간 + 1시간, 현재시간 + 48시간 을 넘길 수 없습니다.
                    //시간을 초과하게 되면 자동으로 해제됩니다.
                    .addBodyParameter("mobileDate", mobileDate)
                    .addBodyParameter("imgDate", imgDate)
                    .addBodyParameter("imgStatus", imgStatus)
                    //imgStatus format = P,M (Proxy && Mobile)
                    .addBodyParameter("app_id", KotlinInside.getInstance().auth.getAppId())
                    .addBodyParameter("confirm_id", session.detail!!.userId)
            lateinit var json: JsonBrowser
            try {
                json = JsonBrowser.parse(
                        KotlinInside.getInstance().httpInterface.post(
                                "${ApiUrl.Gallery.MINOR_NOMEMBER}/${gallId}",
                                option
                        )
                )
            } catch (e: IOException) {
                return BlockResult(
                        result = "false",
                        msg = "권한이 없습니다."
                )
            }
            return BlockResult(
                    result = json.get("result").safeText(),
                    msg = "처리 완료."
            )
        }
    }
}