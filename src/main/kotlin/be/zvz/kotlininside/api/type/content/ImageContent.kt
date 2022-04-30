package be.zvz.kotlininside.api.type.content

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.net.URLConnection

data class ImageContent @JvmOverloads constructor(
    val stream: InputStream,
    val mimeType: String? = null
) : Content, AutoCloseable {
    constructor(
        urlConnection: URLConnection
    ) : this(
        stream = BufferedInputStream(urlConnection.inputStream),
        mimeType = urlConnection.contentType
    )
    constructor(
        file: File
    ) : this(
        stream = BufferedInputStream(FileInputStream(file))
    )

    override fun close() {
        stream.close()
    }
}
