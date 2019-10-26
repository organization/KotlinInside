package be.zvz.kotlininside.http;

import be.zvz.kotlininside.json.JsonBrowser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public class DefaultHttpClient implements HttpInterface {
    private boolean enableGzipCompression;

    public DefaultHttpClient(boolean gzip) {
        enableGzipCompression = gzip;
    }

    @NotNull
    private HttpRequest gzipEncode(@NotNull HttpRequest request) {
        if (enableGzipCompression)
            return request.acceptGzipEncoding().uncompress(true);

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

    @Nullable
    @Override
    public JsonBrowser get(@NotNull String url, @Nullable Option option) throws HttpException {
        HttpRequest request = gzipEncode(HttpRequest.get(optionToUrl(url, option)))
                .acceptJson()
                .followRedirects(true);

        if (option != null) {
            request.headers(option.getHeaders());

            if (option.getUserAgent() != null)
                request.header("User-Agent", option.getUserAgent());
        }

        try {
            // HTTP API로 변경될 경우 필요한 코드
            /*
            int requestCode = request.code();

            if (requestCode == HttpURLConnection.HTTP_MOVED_TEMP ||
                    requestCode == HttpURLConnection.HTTP_MOVED_PERM ||
                    requestCode == HttpURLConnection.HTTP_SEE_OTHER) {

                String redirectUrl = request.header("Location");

                HttpRequest temp = gzipEncode(HttpRequest.get(redirectUrl))
                        .acceptJson()
                        .followRedirects(true);

                if (option != null) {
                    temp.headers(option.getHeaders());

                    if (option.getUserAgent() != null)
                        temp.header("User-Agent", option.getUserAgent());
                }

                JsonBrowser json = JsonBrowser.parse(
                        temp.body()
                );

                return json;
            } else {
                return JsonBrowser.parse(
                        request.body()
                );
            }
            */

            return JsonBrowser.parse(
                    request.body()
            );
        } catch (HttpRequest.HttpRequestException | IOException e) {
            throw new HttpException(request.code(), e.getMessage());
        }
    }

    @Nullable
    @Override
    public JsonBrowser post(@NotNull String url, @Nullable Option option) throws HttpException {
        HttpRequest request = gzipEncode(HttpRequest.post(optionToUrl(url, option)))
                .acceptJson()
                .followRedirects(true);

        StringBuilder bodyData = new StringBuilder();

        if (option != null) {
            setPostRequestHeaders(option, request, bodyData);
        }

        try {
            return JsonBrowser.parse(
                    request
                            .send(bodyData.toString())
                            .body()
            );
        } catch (HttpRequest.HttpRequestException | IOException e) {
            throw new HttpException(request.code(), e.getMessage());
        }
    }

    @Nullable
    @Override
    public JsonBrowser delete(@NotNull String url, @Nullable Option option) throws HttpException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Nullable
    @Override
    public JsonBrowser head(@NotNull String url, @Nullable Option option) throws HttpException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Nullable
    @Override
    public JsonBrowser put(@NotNull String url, @Nullable Option option) throws HttpException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Nullable
    @Override
    public JsonBrowser patch(@NotNull String url, @Nullable Option option) throws HttpException {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Nullable
    @Override
    public JsonBrowser upload(@NotNull String url, @Nullable Option option) throws HttpException {
        HttpRequest request = gzipEncode(HttpRequest.post(optionToUrl(url, option)))
                .acceptJson()
                .followRedirects(true);

        StringBuilder bodyData = new StringBuilder();

        if (option != null) {
            setPostRequestHeaders(option, request, bodyData);

            for (Map.Entry<String, String> entry : option.getMultipartParameter().entrySet()) {
                request.part(entry.getKey(), entry.getValue());
            }

            for (Map.Entry<String, File> entry : option.getMultipartFile().entrySet()) {
                request.part(entry.getKey(), entry.getValue());
            }

            for (Map.Entry<String, List<File>> ignored : option.getMultipartFileList().entrySet()) {
                throw new UnsupportedOperationException("Not implemented yet");
            }
        }

        try {
            return JsonBrowser.parse(
                    request
                            .send(bodyData.toString())
                            .body()
            );
        } catch (HttpRequest.HttpRequestException | IOException e) {
            throw new HttpException(request.code(), e.getMessage());
        }
    }
}
