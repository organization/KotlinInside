package be.zvz.kotlininside.api.management

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.exception.InsufficientPermissionException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class NoMemberBlock @JvmOverloads constructor(
    private val session: Session,
    private val gallId: String,
    private val imgStatus: ImageStatus,
    private val proxyDate: Date? = null,
    private val mobileDate: Date? = null,
    private val imgDate: Date? = null
) {
    private val dateFormat = SimpleDateFormat("yyyy.MM.dd HH:mm")

    enum class ImageStatus(val status: String) {
        NONE(""),
        PROXY("P"),
        MOBILE("M"),
        BOTH("P,M")
    }

    data class BlockResult(
        val result: Boolean,
        val cause: String
    )

    @Throws(InsufficientPermissionException::class)
    fun block(): BlockResult {
        if (session.user is Anonymous)
            throw InsufficientPermissionException(NoMemberBlock::class)
        else {
            val option = Request.getDefaultOption()
                .addBodyParameter("app_id", KotlinInside.getInstance().auth.getAppId())
                .addBodyParameter("confirm_id", session.detail!!.userId)
                .apply {
                    // proxyDate format = 2022.02.03 20:48(yyyy.MM.dd HH:mm)
                    // proxyDate, mobileDate, imgDate 는 현재시간 + 48시간, 현재시간 + 1시간, 현재시간 + 48시간 을 넘길 수 없습니다.
                    // 시간을 초과하게 되면 자동으로 해제됩니다.
                    if (proxyDate !== null) {
                        addBodyParameter("proxyDate", dateFormat.format(proxyDate))
                    }
                    if (mobileDate !== null) {
                        addBodyParameter("mobileDate", dateFormat.format(mobileDate))
                    }
                    if (imgDate !== null) {
                        addBodyParameter("imgDate", dateFormat.format(imgDate))
                    }
                    if (imgStatus != ImageStatus.NONE) {
                        addBodyParameter("imgStatus", imgStatus.status)
                    }
                }
            val json = try {
                JsonBrowser.parse(
                    KotlinInside.getInstance().httpInterface.post(
                        "${ApiUrl.Gallery.MINOR_NOMEMBER}/$gallId",
                        option
                    )
                )
            } catch (e: IOException) {
                return BlockResult(
                    result = false,
                    cause = "권한이 없습니다."
                )
            }
            return BlockResult(
                result = json.get("result").asBoolean(),
                cause = json.get("cause").safeText()
            )
        }
    }
}
