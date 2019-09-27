package be.zvz.kotlininside.httpinterface;

import be.zvz.kotlininside.json.JsonBrowser;

import java.util.Map;

public interface HttpInterface {
    public JsonBrowser get(String url, Map<String, String> data) throws HttpException;

    public JsonBrowser post(String url, Map<String, String> data) throws HttpException;

    public JsonBrowser delete(String url, Map<String, String> data) throws HttpException;

    public JsonBrowser head(String url, Map<String, String> data) throws HttpException;

    public JsonBrowser put(String url, Map<String, String> data) throws HttpException;

    public JsonBrowser patch(String url, Map<String, String> data) throws HttpException;

    public HttpInterface setUserAgent(String userAgent);

    public HttpInterface setHeader(String key, String value);

    public HttpInterface setHeaders(Map<String, String> data);

    public String getHeader(String key);

    public Map<String, String> getHeaders();

    public HttpInterface addBodyParameter(String key, String value);

    public HttpInterface addPathParameter(String key, String value);

    public HttpInterface addQueryParameter(String key, String value);
}