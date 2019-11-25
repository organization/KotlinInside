package be.zvz.kotlininside.api.management

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl
import be.zvz.kotlininside.value.Const
import java.io.IOException

class UserBlock @JvmOverloads constructor(
        private val gallId: String,
        private val articleId: Int,
        private val session: Session,
        private val option: BlockOption = BlockOption()
) {
    enum class BlockCategory(val code: Int) {
        OBSCENE(1),
        ADVERTISEMENT(2),
        CUSS_WORDS(3),
        SPAMMING(4),
        PIRACY(5),
        DEFAMATION(6),
        CUSTOM(7)
    }

    class BlockOption {
        var commentId = 0
        var blockHour = 1
        var blockCategory = BlockCategory.CUSTOM
        var blockReason: String = "사유 없음"
    }

    data class BlockResult(
            val result: Boolean,
            val cause: String
    )

    fun block(): BlockResult {
        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 갤러리 유저 차단을 사용할 수 없습니다.")
        }

        val requestOption = Request.getDefaultOption()
                .addBodyParameter("_token", "")
                .addBodyParameter("avoid_hour", option.blockHour.toString())
                .addBodyParameter("avoid_category", option.blockCategory.code.toString())

        if (option.blockCategory === BlockCategory.CUSTOM) {
            requestOption.addBodyParameter("avoid_memo", option.blockReason)
        }

        requestOption
                .addBodyParameter("id", gallId)
                .addBodyParameter("no", articleId.toString())

        if (option.commentId > 0) {
            requestOption.addBodyParameter("comment_no", option.commentId.toString())
        }

        requestOption
                .addBodyParameter("app_id", KotlinInside.getInstance().auth.getAppId())
                .addBodyParameter("confirm_id", session.detail!!.userId)

        lateinit var json: JsonBrowser

        try {
            json = KotlinInside.getInstance().httpInterface.post(
                    ApiUrl.Gallery.MINOR_BLOCK_ADD,
                    requestOption
            )!!
        } catch (e: HttpException) {
            if (e.cause is IOException) {
                return BlockResult(
                        result = false,
                        cause = "권한이 없습니다."
                )
            }
        }

        return BlockResult(
                result = json.get("result").`as`(Boolean::class.java),
                cause = json.get("cause").text()
        )
    }

    /**
     * 갤러리 유저 차단 링크를 반환합니다.
     *
     * @throws RuntimeException 유저 세션이 [Anonymous]일 경우, 예외를 반환합니다.
     * @return 갤러리 유저 차단 URL을 반환합니다.
     */
    fun getLink(): String {
        val url = "${ApiUrl.Gallery.MINOR_BLOCK_WEB}?id=$gallId&no=$articleId&app_id=${KotlinInside.getInstance().auth.getAppId()}"

        if (option.commentId > 0) {
            url.plus("&comment_no=${option.commentId}")
        }

        if (session.user is Anonymous) {
            throw RuntimeException("Anonymous는 갤러리 유저 차단을 사용할 수 없습니다.")
        } else {
            url.plus("&confirm_id=${session.detail!!.userId}")
        }

        return url
    }

    /**
     * User-Agent를 반환합니다.
     *
     * @return 갤러리 유저 차단에 접근할 때 필요한 User-Agent를 반환합니다.
     */
    fun getUserAgent(): String {
        return Const.USER_AGENT
    }
}
