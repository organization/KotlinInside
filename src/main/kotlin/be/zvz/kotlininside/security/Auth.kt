package be.zvz.kotlininside.security

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.httpinterface.HttpException
import be.zvz.kotlininside.httpinterface.HttpInterface
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import org.apache.commons.codec.digest.DigestUtils
import java.text.SimpleDateFormat
import java.util.*

class Auth(private val kotlinInside: KotlinInside) {
    fun getAppId(): String {
        val hashedAppKey = DigestUtils.sha256Hex(SimpleDateFormat("dcArdchk_yyyyMMddHH", Locale.getDefault()).format(Date()))

        val appId = try {
            val option = HttpInterface.Option()
                .addQueryParameter("value_token", hashedAppKey)
                .addQueryParameter("signature", Const.DC_APP_SIGNATURE)
                .addQueryParameter("pkg", Const.DC_APP_PACKAGE)
                .addQueryParameter("vCode", Const.DC_APP_VERSION_CODE)
                .addQueryParameter("vName", Const.DC_APP_VERSION_NAME)

            kotlinInside.httpInterface.post(ApiUrl.Auth.APP_ID, option)
        } catch (e: HttpException) {
            return ""
        }

        return appId!!.index(0).get("app_id").text()
    }
}