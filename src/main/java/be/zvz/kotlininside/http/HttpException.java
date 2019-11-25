package be.zvz.kotlininside.http;

import org.jetbrains.annotations.Nullable;

public class HttpException extends RuntimeException {
    private final int statusCode;
    private final String errorMessage;
    @Nullable
    private Throwable cause;

    public HttpException(int statusCode, String errorMessage) {
        super("Error Code : " + statusCode + ", Error Message : " + errorMessage);
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
    }

    public HttpException(Throwable cause) {
        this(520, cause.getClass().getSimpleName());
        this.cause = cause;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Nullable
    public Throwable getCause() {
        return this.cause;
    }
}
