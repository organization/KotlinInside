package be.zvz.kotlininside.http

import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.internal.EMPTY_REQUEST
import org.apache.tika.Tika
import org.apache.tika.mime.MimeTypes
import java.io.IOException
import java.io.InputStream
import java.io.UnsupportedEncodingException
import java.net.InetSocketAddress
import java.net.URLEncoder

/**
 * @param okHttpClient [OkHttpClient]의 instance
 */
class DefaultHttpClient(
    private val okHttpClient: OkHttpClient = OkHttpClient()
) : HttpInterface {
    /**
     * DefaultHttpClient의 constructor입니다.
     *
     * @deprecated Use DefaultHttpClient([OkHttpClient]) instead of this
     *
     * @param enableGzipCompression     GZIP 압축 사용 유무
     * @param enableCache 캐시 사용 유무
     * @param proxy    Proxy 설정
     */
    @JvmOverloads
    @Deprecated("Use DefaultHttpClient()", ReplaceWith("DefaultHttpClient()"))
    constructor(
        enableGzipCompression: Boolean = true,
        enableCache: Boolean = true,
        proxy: Proxy? = null
    ) : this(
        OkHttpClient.Builder().apply {
            if (proxy !== null) {
                proxy(java.net.Proxy(java.net.Proxy.Type.HTTP, InetSocketAddress(proxy.ip, proxy.port)))
            }
        }.build()
    )

    private val tika = Tika()

    private fun urlEncode(str: String): String {
        return try {
            URLEncoder.encode(str, "UTF-8")
        } catch (e: UnsupportedEncodingException) {
            str
        }
    }

    private inline fun <T1 : Any, T2 : Any, R : Any> safeLet(p1: T1?, p2: T2?, block: (T1, T2) -> R?): R? {
        return if (p1 != null && p2 != null) block(p1, p2) else null
    }

    private fun optionToUrl(url: String, option: HttpInterface.Option?): String {
        if (option == null) return url
        var replacedUrl = url
        option.pathParameter.forEach { (key, value) ->
            replacedUrl = replacedUrl.replace("{$key}", URLEncoder.encode(value, "UTF-8"))
        }
        var firstKey = false

        return StringBuilder(replacedUrl).apply {
            option.queryParameter.forEach { (key, value) ->
                if (!firstKey) {
                    firstKey = true
                    append("?")
                } else {
                    append("&")
                }
                    .append(URLEncoder.encode(key, "UTF-8"))
                    .append("=")
                    .append(URLEncoder.encode(value, "UTF-8"))
            }
        }.toString()
    }

    private fun getRequestFormBody(
        option: HttpInterface.Option
    ): RequestBody = safeLet(option.body, option.contentType) { body, contentType ->
        body.toRequestBody(contentType.toMediaType())
    } ?: FormBody.Builder().apply { option.bodyParameter.forEach(::add) }.build()

    private fun getRequestMultipartBody(
        option: HttpInterface.Option
    ): RequestBody = safeLet(option.body, option.contentType) { body, contentType ->
        body.toRequestBody(contentType.toMediaType())
    } ?: run {
        MultipartBody.Builder()
            .setType(MultipartBody.FORM).apply {
                option.multipartParameter.forEach(::addFormDataPart)
                var index = 0
                option.multipartFile.forEach { (key, value) ->
                    addToPart(this, key, value, index++)
                }
                option.multipartFileList.forEach { (key, value) ->
                    value.forEach {
                        addToPart(this, key, it, index++)
                    }
                }
            }.build()
    }

    private fun addToPart(
        multipartBodyBuilder: MultipartBody.Builder,
        key: String,
        fileInfo: HttpInterface.Option.FileInfo,
        infix: Int
    ) {
        fileInfo.mimeType?.let { mimeType ->
            multipartBodyBuilder.addFormDataPart(
                key,
                "image$infix${fromMimeTypeToExtension(mimeType)}",
                fileInfo.stream.readBytes().toRequestBody(mimeType.toMediaType())
            )
        } ?: run {
            val (contentType, fileName) = getFileInfoFromStream(fileInfo.stream, infix)
            multipartBodyBuilder.addFormDataPart(
                key,
                fileName,
                fileInfo.stream.readBytes().toRequestBody(contentType.toMediaType())
            )
        }
    }

    override fun get(url: String, option: HttpInterface.Option?): String {
        val request = Request.Builder()
            .url(optionToUrl(url, option))
            .header("Connection", "Keep-Alive")
            .apply {
                option?.let {
                    it.headers.forEach(::header)
                    it.userAgent?.let { userAgent ->
                        header("User-Agent", userAgent)
                    }
                }
            }
            .get()
            .build()
        return okHttpClient.newCall(request).execute().use {
            if (it.isSuccessful) {
                it.body.string()
            } else {
                throw HttpException(it.code, it.message)
            }
        }
    }

    override fun post(url: String, option: HttpInterface.Option?): String {
        val request = Request.Builder()
            .url(optionToUrl(url, option))
            .header("Connection", "Keep-Alive")
            .apply {
                option?.let {
                    it.headers.forEach(::header)
                    it.userAgent?.let { userAgent ->
                        header("User-Agent", userAgent)
                    }
                    post(getRequestFormBody(it))
                } ?: post(EMPTY_REQUEST)
            }
            .build()
        return okHttpClient.newCall(request).execute().use {
            if (it.isSuccessful) {
                it.body.string()
            } else {
                throw HttpException(it.code, it.message)
            }
        }
    }

    override fun delete(url: String, option: HttpInterface.Option?): String? {
        TODO("Not yet implemented")
    }

    override fun head(url: String, option: HttpInterface.Option?): String? {
        TODO("Not yet implemented")
    }

    override fun put(url: String, option: HttpInterface.Option?): String? {
        TODO("Not yet implemented")
    }

    override fun patch(url: String, option: HttpInterface.Option?): String? {
        TODO("Not yet implemented")
    }

    override fun upload(url: String, option: HttpInterface.Option?): String {
        val request = Request.Builder()
            .url(optionToUrl(url, option))
            .header("Connection", "Keep-Alive")
            .apply {
                option?.let {
                    it.headers.forEach(::header)
                    it.userAgent?.let { userAgent ->
                        header("User-Agent", userAgent)
                    }
                    post(getRequestMultipartBody(it))
                } ?: post(EMPTY_REQUEST)
            }
            .build()
        return okHttpClient.newCall(request).execute().use {
            if (it.isSuccessful) {
                it.body.string()
            } else {
                throw HttpException(it.code, it.message)
            }
        }
    }

    private data class FileInfo(
        val contentType: String,
        val fileName: String
    )

    private fun fromMimeTypeToExtension(contentType: String?): String =
        MimeTypes.getDefaultMimeTypes().forName(contentType ?: DEFAULT_MIME_TYPE).extension

    private fun getFileInfoFromStream(inputStream: InputStream, infix: Int): FileInfo {
        val contentType = try {
            tika.detect(inputStream)
        } catch (_: IOException) {
            DEFAULT_MIME_TYPE
        }
        return FileInfo(
            contentType,
            "image$infix${fromMimeTypeToExtension(contentType)}"
        )
    }

    companion object {
        const val DEFAULT_MIME_TYPE = "video/mp4"
    }

    @Deprecated("Use OkHttpClient's proxy settings directly")
    class Proxy internal constructor(var ip: String, var port: Int)
}
