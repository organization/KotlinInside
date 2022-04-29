package be.zvz.kotlininside.api.dccon

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.DCCon
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl

class DCConInsert(
    val dcCon: DCCon,
    val session: Session
) {
    data class InsertResult(
        val result: Boolean,
        val newList: String?,
        val imageSource: String?,
        val alternativeText: String?,
        val imageTag: String?
    )

    fun request(): InsertResult {
        val json = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.DCCon.DCCON,
                Request.getDefaultOption().apply {
                    if (session.user !is Anonymous) {
                        addMultipartParameter("user_id", session.detail!!.userId)
                    }
                }
                    .addMultipartParameter("package_idx", dcCon.packageIndex.toString())
                    .addMultipartParameter("detail_idx", dcCon.detailIndex.toString())
                    .addMultipartParameter("type", "insert")
                    .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            )
        )
        return InsertResult(
            result = StringUtil.okToBoolean(json.get("result").safeText()),
            newList = json.get("new_list").text(),
            imageSource = json.get("img_src").text(),
            alternativeText = json.get("alt").text(),
            imageTag = json.get("img_tag").text()
        )
    }
}
