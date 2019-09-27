package be.zvz.kotlininside.security

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.httpinterface.HttpException
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import org.apache.commons.codec.digest.DigestUtils
import java.text.SimpleDateFormat
import java.util.Date

class Auth(val kotlinInside: KotlinInside) {
    fun getAppId(): String {
        val hashedAppKey = DigestUtils.sha256Hex(SimpleDateFormat("dcArdchk_yyyyMMddHH").format(Date()))

        val appId = try {
            kotlinInside.httpInterface.post(ApiUrl.Auth.APP_ID,
                    mapOf(
                            "value_token" to hashedAppKey,
                            "signature" to Const.SIGNATURE,
                            "pkg" to Const.DC_APP_PACKAGE,
                            "vCode" to Const.DC_APP_VERSION_CODE,
                            "vName" to Const.DC_APP_VERSION_NAME
                    )
            )
        } catch (e: HttpException) {
            return ""
        }

        return appId.index(0).get("app_id").text()
    }
}