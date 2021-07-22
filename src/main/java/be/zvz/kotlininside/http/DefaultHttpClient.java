package be.zvz.kotlininside.http;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public class DefaultHttpClient implements HttpInterface {
    private final boolean enableGzipCompression;
    private final boolean enableCache;
    @Nullable
    private final Proxy proxy;

    /**
     * DefaultHttpClient의 constructor입니다.
     */
    public DefaultHttpClient() {
        this(true);
    }

    /**
     * DefaultHttpClient의 constructor입니다.
     *
     * @param gzip GZIP 압축 사용 유무
     */
    public DefaultHttpClient(boolean gzip) {
        this(gzip, true);
    }

    /**
     * DefaultHttpClient의 constructor입니다.
     *
     * @param gzip     GZIP 압축 사용 유무
     * @param useCache 캐시 사용 유무
     */
    public DefaultHttpClient(boolean gzip, boolean useCache) {
        this(gzip, useCache, null);
    }

    /**
     * DefaultHttpClient의 constructor입니다.
     *
     * @param gzip     GZIP 압축 사용 유무
     * @param useCache 캐시 사용 유무
     * @param proxy    Proxy 설정
     */
    public DefaultHttpClient(boolean gzip, boolean useCache, @Nullable Proxy proxy) {
        this.enableGzipCompression = gzip;
        this.enableCache = useCache;
        this.proxy = proxy;
    }

    @NotNull
    private HttpRequest useGzipEncoding(@NotNull HttpRequest request) {
        if (this.enableGzipCompression) {
            return request.acceptGzipEncoding().uncompress(true);
        }

        return request;
    }

    @NotNull
    private HttpRequest useProxy(@NotNull HttpRequest request) {
        if (this.proxy != null) {
            request.useProxy(this.proxy.ip, this.proxy.port);
        }

        return request;
    }

    @NotNull
    private HttpRequest useCache(@NotNull HttpRequest request) {
        if (this.enableCache) {
            request.useCaches(true);
        }

        return request;
    }

    @NotNull
    private String urlEncode(@NotNull String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    @NotNull
    private String optionToUrl(@NotNull String url, @Nullable Option option) {
        if (option == null) return url;

        for (Map.Entry<String, String> entry : option.getPathParameter().entrySet()) {
            url = url.replace("{" + entry.getKey() + "}", urlEncode(entry.getValue()));
        }

        boolean firstKey = false;
        StringBuilder urlBuilder = new StringBuilder(url);
        for (Map.Entry<String, String> entry : option.getQueryParameter().entrySet()) {
            if (!firstKey) {
                urlBuilder.append("?").append(urlEncode(entry.getKey())).append("=").append(urlEncode(entry.getValue()));
                firstKey = true;
            } else {
                urlBuilder.append("&").append(urlEncode(entry.getKey())).append("=").append(urlEncode(entry.getValue()));
            }
        }

        return urlBuilder.toString();
    }

    private void setPostRequestHeaders(@NotNull Option option, HttpRequest request, StringBuilder bodyData) {
        request.headers(option.getHeaders());

        if (option.getUserAgent() != null)
            request.header("User-Agent", option.getUserAgent());

        if (option.getBody() != null && option.getContentType() != null) {
            request.header("Content-Type", option.getContentType());
            bodyData.append(option.getBody());
        } else {
            request.header("Content-Type", "application/x-www-form-urlencoded");
            boolean firstKey = false;
            for (Map.Entry<String, String> entry : option.getBodyParameter().entrySet()) {
                if (!firstKey) {
                    bodyData.append(urlEncode(entry.getKey())).append("=").append(urlEncode(entry.getValue()));
                    firstKey = true;
                } else {
                    bodyData.append("&").append(urlEncode(entry.getKey())).append("=").append(urlEncode(entry.getValue()));
                }
            }
        }
    }

    @Nullable
    @Override
    public String get(@NotNull String url, @Nullable Option option) throws HttpException {
        HttpRequest request = useCache(
                useGzipEncoding(
                        useProxy(
                                HttpRequest.get(optionToUrl(url, option))
                        )
                )
        )
                .acceptJson()
                .followRedirects(true);

        if (option != null) {
            request.headers(option.getHeaders());

            if (option.getUserAgent() != null)
                request.header("User-Agent", option.getUserAgent());
        }

        try {
            // HTTP API로 변경될 경우 필요한 코드

            return request.body();
        } catch (HttpRequest.HttpRequestException e) {
            throw new HttpException(request.code(), e.getMessage());
        }
    }

    @Nullable
    @Override
    public String post(@NotNull String url, @Nullable Option option) throws HttpException {
        HttpRequest request = useCache(
                useGzipEncoding(
                        useProxy(
                                HttpRequest.post(optionToUrl(url, option))
                        )
                )
        )
                .acceptJson()
                .followRedirects(true);

        StringBuilder bodyData = new StringBuilder();

        if (option != null) {
            setPostRequestHeaders(option, request, bodyData);
        }

        try {
            return request
                    .send(bodyData.toString())
                    .body();
        } catch (HttpRequest.HttpRequestException e) {
            throw new HttpException(request.code(), e.getMessage());
        }
    }

    @Nullable
    @Override
    public String delete(@NotNull String url, @Nullable Option option) throws HttpException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Nullable
    @Override
    public String head(@NotNull String url, @Nullable Option option) throws HttpException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Nullable
    @Override
    public String put(@NotNull String url, @Nullable Option option) throws HttpException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Nullable
    @Override
    public String patch(@NotNull String url, @Nullable Option option) throws HttpException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Nullable
    @Override
    public String upload(@NotNull String url, @Nullable Option option) throws HttpException {
        HttpRequest request = useCache(
                useGzipEncoding(
                        useProxy(
                                HttpRequest.post(optionToUrl(url, option)).setMultipartFormDataBoundary(HttpRequest.generateBoundary())
                        )
                )
        )
                .acceptJson()
                .followRedirects(true);

        StringBuilder bodyData = new StringBuilder();

        if (option != null) {
            setPostRequestHeaders(option, request, bodyData);

            for (Map.Entry<String, String> entry : option.getMultipartParameter().entrySet()) {
                request.part(entry.getKey(), entry.getValue());
            }

            int count = 0;
            for (Map.Entry<String, InputStream> entry : option.getMultipartFile().entrySet()) {
                InputStream stream = entry.getValue();

                request.part(entry.getKey(), getFileName(stream, count), "image/jpg", stream);
                count++;
            }

            count = 0;
            for (Map.Entry<String, List<InputStream>> entry : option.getMultipartFileList().entrySet()) {
                for (InputStream stream : entry.getValue()) {
                    request.part(entry.getKey(), getFileName(stream, count), "image/jpg", stream);
                    count++;
                }
            }
        }

        try {
            return request
                    .send(bodyData.toString())
                    .body();
        } catch (HttpRequest.HttpRequestException e) {
            throw new HttpException(request.code(), e.getMessage());
        }
    }

    private String getFileName(InputStream inputStream, int infix) {
        String contentType;
        try {
            contentType = URLConnection.guessContentTypeFromStream(inputStream);
            if (contentType == null) {
                contentType = "image/jpg";
            }
        } catch (IOException e) {
            contentType = "image/jpg";
        }

        String fileName = "image" + infix + ".";

        switch (contentType) {
            case "image/png":
                fileName += "png";
                break;
            case "image/gif":
                fileName += "gif";
                break;
            default:
                fileName += "jpg";
        }

        return fileName;
    }

    public static class Proxy {
        @NotNull
        String ip;
        int port;

        Proxy(@NotNull String ip, int port) {
            this.ip = ip;
            this.port = port;
        }
    }
}
