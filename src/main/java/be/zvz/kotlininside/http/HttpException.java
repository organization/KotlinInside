package be.zvz.kotlininside.http;

import org.jetbrains.annotations.Nullable;

public class HttpException extends RuntimeException {
    private final int statusCode;
    @Nullable
    private Throwable cause;

    public HttpException(int statusCode, @Nullable Throwable cause) {
        super(cause);
        this.statusCode = statusCode;
    }

    public HttpException(@Nullable Throwable cause) {
        this(520, cause);
        this.cause = cause;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Nullable
    public Throwable getCause() {
        return this.cause;
    }
}
