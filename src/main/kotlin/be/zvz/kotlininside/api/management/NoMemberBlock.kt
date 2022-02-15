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

class NoMemberBlock(
    private val session: Session,
    private val gallId: String,
    private val option: BlockOption = BlockOption()
) {
    private val dateFormat by lazy { SimpleDateFormat("yyyy.MM.dd HH:mm") }

    enum class ImageStatus(val value: String) {
        NONE(""),
        ANONYMOUS("A"),
        PROXY("P"),
        CELLULAR("M"),
        PROXY_AND_CELLULAR("P,M")
    }

    class BlockOption {
        val proxy: Date? = null
        val cellular: Date? = null
        val image: ImageRestrictionOption? = null

        class ImageRestrictionOption(
            val time: Date,
            val type: ImageStatus
        )
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
                    if (option.proxy !== null) {
                        addBodyParameter("proxyDate", dateFormat.format(option.proxy))
                    }
                    if (option.proxy !== null) {
                        addBodyParameter("mobileDate", dateFormat.format(option.cellular))
                    }
                    if (option.image !== null) {
                        addBodyParameter("imgDate", dateFormat.format(option.image.time))
                        if (option.image.type != ImageStatus.NONE) {
                            addBodyParameter("imgStatus", option.image.type.value)
                        }
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
