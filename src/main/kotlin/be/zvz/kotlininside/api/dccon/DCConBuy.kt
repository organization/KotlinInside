package be.zvz.kotlininside.api.dccon

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.DCCon
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl

class DCConBuy(
    private val dcCon: DCCon,
    private val session: Session
) {
    data class BuyResult(
        val result: Int,
        val msg: String
    )

    /**
     * 디시콘을 구매합니다.
     * @return [BuyResult] 구매 결과를 반환합니다.
     */
    fun buy(): BuyResult {
        if (session.user is Anonymous) {
            throw HttpException(
                RuntimeException("Anonymous 세션은 DCConBuy를 이용할 수 없습니다.")
            )
        }

        val option = Request.getDefaultOption()
            .addMultipartParameter("user_id", session.detail!!.userId)
            .addMultipartParameter("package_idx", dcCon.packageIndex.toString())
            .addMultipartParameter("type", "buy_dccon")
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())

        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.DCCon.DCCON,
                option
            )
        )

        return BuyResult(
            result = json.get("result").asInteger(),
            msg = json.get("msg").safeText()
        )
    }
}
