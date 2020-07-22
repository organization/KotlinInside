package be.zvz.kotlininside.api.dccon

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.DCCon
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.LoginUser
import be.zvz.kotlininside.value.ApiUrl

class DCConList(
        val session: Session
) {
    data class ListResult(
            val tab: List<DCCon>,
            val list: List<List<DCCon>>
    )

    fun request(): ListResult {
        val option = Request.getDefaultOption()

        if (session.user is LoginUser) {
            option.addMultipartParameter("user_id", session.detail!!.userId)
        }

        val json = KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.DCCon.DCCON,
                option
        )!!

        return ListResult(
                tab = mutableListOf<DCCon>().apply {
                    json.get("tab").values().forEach {
                        add(
                                DCCon(
                                        packageIndex = it.get("package_idx").asInteger(),
                                        title = it.get("title").safeText(),
                                        imgLink = it.get("img").safeText()
                                )
                        )
                    }
                },
                list = mutableListOf<List<DCCon>>().apply {
                    json.get("list").values().forEach { list ->
                        add(
                                mutableListOf<DCCon>().apply {
                                    list.values().forEach {
                                        add(
                                                DCCon(
                                                        detailIndex = it.get("detail_idx").asInteger(),
                                                        packageIndex = it.get("package_idx").asInteger(),
                                                        title = it.get("title").safeText(),
                                                        imgLink = it.get("img").safeText()
                                                )
                                        )
                                    }
                                }
                        )
                    }
                }
        )
    }
}