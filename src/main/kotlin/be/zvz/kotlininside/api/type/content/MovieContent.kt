package be.zvz.kotlininside.api.type.content

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream

/**
 * [MovieContent]를 사용한 글을 작성해야 할 경우,
 * 글 작성 전에 [be.zvz.kotlininside.api.generic.MovieUpload]를 사용하여
 * [MovieContent]를 업로드 해놓아야 합니다.
 */
data class MovieContent(
    val info: MovieInfo,
    val stream: InputStream
) : Content, AutoCloseable {
    data class MovieInfo @JvmOverloads constructor(
        val allowDownload: Boolean,
        val width: Int,
        val height: Int,
        val description: String,
        val tag: List<String> = emptyList()
    ) {
        /**
         * [be.zvz.kotlininside.api.generic.MovieUpload]에서 얻은 섬네일 URL 중 하나를 입력해주시면 됩니다.
         */
        var thumbnailUrl: String = ""
    }

    internal var uploaded = false
    internal var fileId: Int = 0
    constructor(
        info: MovieInfo,
        file: File
    ) : this(
        info,
        stream = BufferedInputStream(FileInputStream(file))
    )

    override fun close() {
        stream.close()
    }
}
