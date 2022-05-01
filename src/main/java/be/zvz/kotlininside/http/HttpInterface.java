package be.zvz.kotlininside.http;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface HttpInterface {
    @Nullable String get(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable String post(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable String delete(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable String head(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable String put(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable String patch(@NotNull String url, @Nullable Option option) throws HttpException;

    @Nullable String upload(@NotNull String url, @Nullable Option option) throws HttpException;

    final class Option {
        public static final class FileInfo {
            @NotNull
            private final InputStream stream;
            @Nullable
            private final String mimeType;

            @NotNull
            public InputStream getStream() {
                return stream;
            }

            @Nullable
            public String getMimeType() {
                return mimeType;
            }

            public FileInfo(@NotNull InputStream stream) {
                this(stream, null);
            }

            public FileInfo(@NotNull InputStream stream, @Nullable String mimeType) {
                this.stream = stream;
                this.mimeType = mimeType;
            }
        }

        @NotNull
        private final Map<String, String> headers = new LinkedHashMap<>();
        @NotNull
        private final Map<String, String> bodyParameter = new LinkedHashMap<>();
        @NotNull
        private final Map<String, String> pathParameter = new LinkedHashMap<>();
        @NotNull
        private final Map<String, String> queryParameter = new LinkedHashMap<>();
        @NotNull
        private final Map<String, FileInfo> multipartFile = new LinkedHashMap<>();
        @NotNull
        private final Map<String, List<FileInfo>> multipartFileList = new LinkedHashMap<>();
        @NotNull
        private final Map<String, String> multipartParameter = new LinkedHashMap<>();
        @Nullable
        private String contentType = null;
        @Nullable
        private String rawBody = null;
        @Nullable
        private String userAgent = null;
        @Nullable
        private String multipartContentType = null;

        @Nullable
        public String getUserAgent() {
            return this.userAgent;
        }

        /**
         * @param contentType body의 content-type
         * @param body        body
         * @return this
         */
        @NotNull
        public Option setContentTypeAndBody(@NotNull String contentType, @NotNull String body) {
            this.contentType = contentType;
            this.rawBody = body;
            return this;
        }

        @Nullable
        public String getContentType() {
            return contentType;
        }

        @Nullable
        public String getBody() {
            return rawBody;
        }

        /**
         * @param userAgent 설정할 User-Agent 문자열
         * @return this
         */
        @NotNull
        public Option setUserAgent(@NotNull String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        /**
         * @param key   매개변수 Key
         * @param value 매개변수 Value
         * @return this
         */
        @NotNull
        public Option addHeader(@NotNull String key, @NotNull String value) {
            this.headers.put(key, value);
            return this;
        }

        /**
         * @return 헤더 목록을 반환합니다.
         */
        @NotNull
        public Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @param key   매개변수 Key
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
         * @param key   매개변수 Key
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
         * @param key   매개변수 Key
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

        @Nullable
        public String getMultipartContentType() {
            return this.multipartContentType;
        }

        @NotNull
        public Option setMultipartContentType(@Nullable String contentType) {
            this.multipartContentType = contentType;
            return this;
        }

        /**
         * @param key   매개변수 Key
         * @param value 매개변수 Value
         * @return this
         */
        @NotNull
        public Option addMultipartFile(@NotNull String key, @NotNull InputStream value) {
            this.multipartFile.put(key, new FileInfo(value));
            return this;
        }

        @NotNull
        public Option addMultipartFile(@NotNull String key, @NotNull FileInfo value) {
            this.multipartFile.put(key, value);
            return this;
        }

        @NotNull
        public Map<String, FileInfo> getMultipartFile() {
            return this.multipartFile;
        }

        /**
         * @param key   매개변수 Key
         * @param value 매개변수들 Value
         * @return this
         */
        @NotNull
        public Option addMultipartFileList(@NotNull String key, @NotNull List<InputStream> value) {
            ArrayList<FileInfo> fileInfos = new ArrayList<>();
            for (InputStream inputStream : value) {
                fileInfos.add(new FileInfo(inputStream));
            }
            this.multipartFileList.put(key, fileInfos);
            return this;
        }

        @NotNull
        public Map<String, List<FileInfo>> getMultipartFileList() {
            return this.multipartFileList;
        }

        /**
         * @param key   매개변수 Key
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
}