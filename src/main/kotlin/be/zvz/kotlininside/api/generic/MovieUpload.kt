package be.zvz.kotlininside.api.generic

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.api.type.content.MovieContent
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.json.JsonBrowser
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
    )

    data class CheckResult(
        val result: Boolean,
        val cause: String? = null
    )

    @Throws(UploadException::class)
    fun upload(): UploadResult {
        if (checkRestriction) {
            val json = JsonBrowser.parse(
                KotlinInside.getInstance().httpInterface.get(
                    ApiUrl.Upload.CHECK_UPLOAD_RESTRICTION +
                        "?app_id=${KotlinInside.getInstance().auth.getAppId()}" +
                        "&id=gallId" +
                        "&type=movie",
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
                    addMultipartFile("avatar", content.stream)
                },
            )
        )
        return UploadResult(
            msg = result.get("msg").text(),
            fileId = result.get("file_no").asNullableInteger()?.apply {
                content.uploaded = true
                content.fileId = this
            },
            thumbnailUrls = result.get("thumbnail_urls").run {
                if (!isNull) {
                    mutableListOf<String>().apply {
                        values().forEach {
                            add(it.safeText())
                        }
                    }
                } else {
                    null
                }
            }
        )
    }
}
