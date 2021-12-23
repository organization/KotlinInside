package be.zvz.kotlininside.http

class HttpException : RuntimeException {
    val statusCode: Int

    constructor(
        statusCode: Int,
        errorMessage: String?
    ) : super("Error Code : $statusCode, Error Message : $errorMessage") {
        this.statusCode = statusCode
    }

    constructor(cause: Throwable?) : super(cause) {
        statusCode = 520
    }
}
