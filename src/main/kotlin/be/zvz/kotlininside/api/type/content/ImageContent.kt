package be.zvz.kotlininside.api.type.content

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream

data class ImageContent(
    val stream: InputStream
) : Content, AutoCloseable {
    constructor(
        file: File
    ) : this(
        stream = BufferedInputStream(FileInputStream(file))
    )

    override fun close() {
        stream.close()
    }
}
