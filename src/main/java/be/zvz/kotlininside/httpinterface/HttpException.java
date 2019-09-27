package be.zvz.kotlininside.httpinterface;

public class HttpException extends RuntimeException {
    private int statusCode;

    HttpException(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
