package be.zvz.kotlininside.api.generic

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.content.MovieContent
import be.zvz.kotlininside.http.HttpInterface
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.value.ApiUrl
import java.io.IOException

/**
 * [be.zvz.kotlininside.api.type.content.MovieContent] 업로드를 위한 API 클래스
 */
class MovieUpload @JvmOverloads constructor(
    val gallId: String,
    val content: MovieContent,
    val checkRestriction: Boolean = true
) {
    class UploadException(
        val checkResult: CheckResult
    ) : IOException(checkResult.cause)

    data class UploadResult(
        val msg: String?,
        val fileId: Int?,
        val thumbnailUrls: List<String>?,
        val width: Int?,
        val height: Int?,
    )

    data class CheckResult(
        val result: Boolean,
        val cause: String? = null
    )

    @Throws(UploadException::class)
    fun upload(): UploadResult {
        if (checkRestriction && KotlinInside.getInstance().session.user is Anonymous) {
            val json = JsonBrowser.parse(
                KotlinInside.getInstance().httpInterface.get(
                    ApiUrl.Upload.CHECK_UPLOAD_RESTRICTION +
                        "?app_id=${KotlinInside.getInstance().auth.getAppId()}" +
                        "&id=$gallId" +
                        "&mode=movie",
                    Request.getDefaultOption()
                )
            )
            val checkResult = CheckResult(
                result = json.get("result").asBoolean(),
                cause = json.get("cause").text()
            )

            if (!checkResult.result) {
                throw UploadException(checkResult)
            }
        }

        val result = JsonBrowser.parse(
            KotlinInside.getInstance().httpInterface.upload(
                ApiUrl.Upload.MOVIE,
                Request.getDefaultOption().apply {
                    addMultipartParameter("id", gallId)
                    addMultipartFile(
                        "avatar",
                        HttpInterface.Option.FileInfo(
                            content.stream,
                            content.mimeType
                        )
                    )
                },
            )
        )
        return UploadResult(
            msg = result.get("msg").text(),
            fileId = result.get("file_no").asNullableInteger()?.apply {
                content.uploaded = true
                content.fileId = this
            },
            thumbnailUrls = result.get("thum_url_arr").run {
                if (!isNull) {
                    mutableListOf<String>().apply {
                        values().forEach {
                            add(it.safeText())
                        }
                    }
                } else {
                    null
                }
            },
            width = result.get("width").asNullableInteger()?.apply {
                content.info.width = this
            },
            height = result.get("height").asNullableInteger()?.apply {
                content.info.height = this
            },
        )
    }
}
