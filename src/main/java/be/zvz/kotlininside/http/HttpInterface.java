package be.zvz.kotlininside.http;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import be.zvz.kotlininside.json.JsonBrowser;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface HttpInterface {
    final class Option {
        @Nullable
        private String userAgent = null;
        @NotNull
        private final Map<String, String> headers = new LinkedHashMap<>();
        @NotNull
        private final Map<String, String> bodyParameter = new LinkedHashMap<>();
        @NotNull
        private final Map<String, String> pathParameter = new LinkedHashMap<>();
        @NotNull
        private final Map<String, String> queryParameter = new LinkedHashMap<>();
        @Nullable
        private String multipartContentType = null;
        @NotNull
        private final Map<String, File> multipartFile = new LinkedHashMap<>();
        @NotNull
        private final Map<String, List<File>> multipartFileList = new LinkedHashMap<>();
        @NotNull
        private final Map<String, String> multipartParameter = new LinkedHashMap<>();


        /**
         *
         * @param userAgent 설정할 User-Agent 문자열
         * @return this
         */
        @NotNull
        public Option setUserAgent(@NotNull String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        @Nullable
        public String getUserAgent() {
            return this.userAgent;
        }

        /**
         *
         * @param key 매개변수 Key
         * @param value 매개변수 Value
         * @return this
         */
        @NotNull
        public Option addHeader(@NotNull String key, @NotNull String value) {
            this.headers.put(key, value);
            return this;
        }

        /**
         *
         * @return 헤더 목록을 반환합니다.
         */
        @NotNull
        public Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         *
         * @param key 매개변수 Key
         * @param value 매개변수 Value
         * @return this
         */
        @NotNull
        public Option addBodyParameter(@NotNull String key, @NotNull String value) {
            this.bodyParameter.put(key, value);
            return this;
        }

        @NotNull
        public Map<String, String> getBodyParameter() {
            return this.bodyParameter;
        }

        /**
         *
         * @param key 매개변수 Key
         * @param value 매개변수 Value
         * @return this
         */
        @NotNull
        public Option addPathParameter(@NotNull String key, @NotNull String value) {
            this.pathParameter.put(key, value);
            return this;
        }

        @NotNull
        public Map<String, String> getPathParameter() {
            return this.pathParameter;
        }

        /**
         *
         * @param key 매개변수 Key
         * @param value 매개변수 Value
         * @return this
         */
        @NotNull
        public Option addQueryParameter(@NotNull String key, @NotNull String value) {
            this.queryParameter.put(key, value);
            return this;
        }

        @NotNull
        public Map<String, String> getQueryParameter() {
            return this.queryParameter;
        }

        @NotNull
        public Option setMultipartContentType(@Nullable String contentType) {
            this.multipartContentType = contentType;
            return this;
        }

        @Nullable
        public String getMultipartContentType() {
            return this.multipartContentType;
        }

        /**
         *
         * @param key 매개변수 Key
         * @param value 매개변수 Value
         * @return this
         */
        @NotNull
        public Option addMultipartFile(@NotNull String key, @NotNull File value) {
            this.multipartFile.put(key, value);
            return this;
        }

        @NotNull
        public Map<String, File> getMultipartFile() {
            return this.multipartFile;
        }

        /**
         *
         * @param key 매개변수 Key
         * @param value 매개변수들 Value
         * @return this
         */
        @NotNull
        public Option addMultipartFileList(@NotNull String key, @NotNull List<File> value) {
            this.multipartFileList.put(key, value);
            return this;
        }

        @NotNull
        public Map<String, List<File>> getMultipartFileList() {
            return this.multipartFileList;
        }

        /**
         *
         * @param key 매개변수 Key
         * @param value 매개변수 Value
         * @return this
         */
        @NotNull
        public Option addMultipartParameter(@NotNull String key, @NotNull String value) {
            this.multipartParameter.put(key, value);
            return this;
        }

        @NotNull
        public Map<String, String> getMultipartParameter() {
            return this.multipartParameter;
        }
    }

    @Nullable
    JsonBrowser get(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable
    JsonBrowser post(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable
    JsonBrowser delete(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable
    JsonBrowser head(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable
    JsonBrowser put(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable
    JsonBrowser patch(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable
    JsonBrowser upload(@NotNull String url, @Nullable Option option) throws HttpException;
}