---
title: HttpRequest - 
---

[be.zvz.kotlininside.http](../index.html) / [HttpRequest](./index.html)

# HttpRequest

`open class HttpRequest`

A fluid interface for making HTTP requests using an underlying ``[`HttpURLConnection`](#) (or sub-class).

 Each instance supports making a single request and cannot be reused for further requests.

### Types

| [Base64](-base64/index.html) |  Encodes and decodes to and from Base64 notation. `open class Base64` |
| [CloseOperation](-close-operation/index.html) | Class that ensures a ``[`Closeable`](#) gets closed with proper exception handling.`abstract class CloseOperation<V : Any!> : Operation<V>` |
| [ConnectionFactory](-connection-factory/index.html) | Creates ``[`HTTP connections`](#) for ``[`urls`](#).`interface ConnectionFactory` |
| [FlushOperation](-flush-operation/index.html) | Class that and ensures a ``[`Flushable`](#) gets flushed with proper exception handling.`abstract class FlushOperation<V : Any!> : Operation<V>` |
| [Operation](-operation/index.html) | Operation that handles executing a callback once complete and handling nested exceptions`abstract class Operation<V : Any!> : Callable<V>` |
| [RequestOutputStream](-request-output-stream/index.html) | Request output stream`open class RequestOutputStream : BufferedOutputStream` |
| [UploadProgress](-upload-progress/index.html) | Callback interface for reporting upload progress for a request.`interface UploadProgress` |

### Exceptions

| [HttpRequestException](-http-request-exception/index.html) | HTTP request exception whose cause is always an ``[`IOException`](#)`open class HttpRequestException : RuntimeException` |

### Constructors

| [&lt;init&gt;](-init-.html) | Create HTTP connection wrapper`HttpRequest(url: CharSequence!, method: String!)`<br>`HttpRequest(url: URL!, method: String!)` |

### Properties

| [CHARSET_UTF8](-c-h-a-r-s-e-t_-u-t-f8.html) | 'UTF-8' charset name`static val CHARSET_UTF8: String` |
| [CONTENT_TYPE_FORM](-c-o-n-t-e-n-t_-t-y-p-e_-f-o-r-m.html) | 'application/x-www-form-urlencoded' content type header value`static val CONTENT_TYPE_FORM: String` |
| [CONTENT_TYPE_JSON](-c-o-n-t-e-n-t_-t-y-p-e_-j-s-o-n.html) | 'application/json' content type header value`static val CONTENT_TYPE_JSON: String` |
| [ENCODING_GZIP](-e-n-c-o-d-i-n-g_-g-z-i-p.html) | 'gzip' encoding header value`static val ENCODING_GZIP: String` |
| [HEADER_ACCEPT](-h-e-a-d-e-r_-a-c-c-e-p-t.html) | 'Accept' header name`static val HEADER_ACCEPT: String` |
| [HEADER_ACCEPT_CHARSET](-h-e-a-d-e-r_-a-c-c-e-p-t_-c-h-a-r-s-e-t.html) | 'Accept-Charset' header name`static val HEADER_ACCEPT_CHARSET: String` |
| [HEADER_ACCEPT_ENCODING](-h-e-a-d-e-r_-a-c-c-e-p-t_-e-n-c-o-d-i-n-g.html) | 'Accept-Encoding' header name`static val HEADER_ACCEPT_ENCODING: String` |
| [HEADER_AUTHORIZATION](-h-e-a-d-e-r_-a-u-t-h-o-r-i-z-a-t-i-o-n.html) | 'Authorization' header name`static val HEADER_AUTHORIZATION: String` |
| [HEADER_CACHE_CONTROL](-h-e-a-d-e-r_-c-a-c-h-e_-c-o-n-t-r-o-l.html) | 'Cache-Control' header name`static val HEADER_CACHE_CONTROL: String` |
| [HEADER_CONTENT_ENCODING](-h-e-a-d-e-r_-c-o-n-t-e-n-t_-e-n-c-o-d-i-n-g.html) | 'Content-Encoding' header name`static val HEADER_CONTENT_ENCODING: String` |
| [HEADER_CONTENT_LENGTH](-h-e-a-d-e-r_-c-o-n-t-e-n-t_-l-e-n-g-t-h.html) | 'Content-Length' header name`static val HEADER_CONTENT_LENGTH: String` |
| [HEADER_CONTENT_TYPE](-h-e-a-d-e-r_-c-o-n-t-e-n-t_-t-y-p-e.html) | 'Content-Type' header name`static val HEADER_CONTENT_TYPE: String` |
| [HEADER_DATE](-h-e-a-d-e-r_-d-a-t-e.html) | 'Date' header name`static val HEADER_DATE: String` |
| [HEADER_ETAG](-h-e-a-d-e-r_-e-t-a-g.html) | 'ETag' header name`static val HEADER_ETAG: String` |
| [HEADER_EXPIRES](-h-e-a-d-e-r_-e-x-p-i-r-e-s.html) | 'Expires' header name`static val HEADER_EXPIRES: String` |
| [HEADER_IF_NONE_MATCH](-h-e-a-d-e-r_-i-f_-n-o-n-e_-m-a-t-c-h.html) | 'If-None-Match' header name`static val HEADER_IF_NONE_MATCH: String` |
| [HEADER_LAST_MODIFIED](-h-e-a-d-e-r_-l-a-s-t_-m-o-d-i-f-i-e-d.html) | 'Last-Modified' header name`static val HEADER_LAST_MODIFIED: String` |
| [HEADER_LOCATION](-h-e-a-d-e-r_-l-o-c-a-t-i-o-n.html) | 'Location' header name`static val HEADER_LOCATION: String` |
| [HEADER_PROXY_AUTHORIZATION](-h-e-a-d-e-r_-p-r-o-x-y_-a-u-t-h-o-r-i-z-a-t-i-o-n.html) | 'Proxy-Authorization' header name`static val HEADER_PROXY_AUTHORIZATION: String` |
| [HEADER_REFERER](-h-e-a-d-e-r_-r-e-f-e-r-e-r.html) | 'Referer' header name`static val HEADER_REFERER: String` |
| [HEADER_SERVER](-h-e-a-d-e-r_-s-e-r-v-e-r.html) | 'Server' header name`static val HEADER_SERVER: String` |
| [HEADER_USER_AGENT](-h-e-a-d-e-r_-u-s-e-r_-a-g-e-n-t.html) | 'User-Agent' header name`static val HEADER_USER_AGENT: String` |
| [METHOD_DELETE](-m-e-t-h-o-d_-d-e-l-e-t-e.html) | 'DELETE' request method`static val METHOD_DELETE: String` |
| [METHOD_GET](-m-e-t-h-o-d_-g-e-t.html) | 'GET' request method`static val METHOD_GET: String` |
| [METHOD_HEAD](-m-e-t-h-o-d_-h-e-a-d.html) | 'HEAD' request method`static val METHOD_HEAD: String` |
| [METHOD_OPTIONS](-m-e-t-h-o-d_-o-p-t-i-o-n-s.html) | 'OPTIONS' options method`static val METHOD_OPTIONS: String` |
| [METHOD_POST](-m-e-t-h-o-d_-p-o-s-t.html) | 'POST' request method`static val METHOD_POST: String` |
| [METHOD_PUT](-m-e-t-h-o-d_-p-u-t.html) | 'PUT' request method`static val METHOD_PUT: String` |
| [METHOD_TRACE](-m-e-t-h-o-d_-t-r-a-c-e.html) | 'TRACE' request method`static val METHOD_TRACE: String` |
| [PARAM_CHARSET](-p-a-r-a-m_-c-h-a-r-s-e-t.html) | 'charset' header value parameter`static val PARAM_CHARSET: String` |

### Functions

| [accept](accept.html) | Set the 'Accept' header to given value`open fun accept(accept: String!): `[`HttpRequest`](./index.html)`!` |
| [acceptCharset](accept-charset.html) | Set the 'Accept-Charset' header to given value`open fun acceptCharset(acceptCharset: String!): `[`HttpRequest`](./index.html)`!` |
| [acceptEncoding](accept-encoding.html) | Set the 'Accept-Encoding' header to given value`open fun acceptEncoding(acceptEncoding: String!): `[`HttpRequest`](./index.html)`!` |
| [acceptGzipEncoding](accept-gzip-encoding.html) | Set the 'Accept-Encoding' header to 'gzip'`open fun acceptGzipEncoding(): `[`HttpRequest`](./index.html)`!` |
| [acceptJson](accept-json.html) | Set the 'Accept' header to 'application/json'`open fun acceptJson(): `[`HttpRequest`](./index.html)`!` |
| [append](append.html) | Append given map as query parameters to the base URL `open static fun append(url: CharSequence!, params: MutableMap<*, *>!): String!`<br>Append given name/value pairs as query parameters to the base URL `open static fun append(url: CharSequence!, vararg params: Any!): String!` |
| [authorization](authorization.html) | Set the 'Authorization' header to given value`open fun authorization(authorization: String!): `[`HttpRequest`](./index.html)`!` |
| [badRequest](bad-request.html) | Is the response code a 400 Bad Request?`open fun badRequest(): Boolean` |
| [basic](basic.html) | Set the 'Authorization' header to given values in Basic authentication format`open fun basic(name: String!, password: String!): `[`HttpRequest`](./index.html)`!` |
| [body](body.html) | Get response as ``[`String`](#) in given character set `open fun body(charset: String!): String!`<br>Get response as ``[`String`](#) using character set returned from ``[`#charset()`](charset.html)`open fun body(): String!`<br>Get the response body as a ``[`String`](#) and set it as the value of the given reference.`open fun body(output: AtomicReference<String!>!): `[`HttpRequest`](./index.html)`!`<br>`open fun body(output: AtomicReference<String!>!, charset: String!): `[`HttpRequest`](./index.html)`!` |
| [buffer](buffer.html) | Get response in a buffered stream`open fun buffer(): BufferedInputStream!` |
| [bufferedReader](buffered-reader.html) | Get buffered reader to response body using the given character set r and the configured buffer size`open fun bufferedReader(charset: String!): BufferedReader!`<br>Get buffered reader to response body using the character set returned from ``[`#charset()`](charset.html) and the configured buffer size`open fun bufferedReader(): BufferedReader!` |
| [bufferSize](buffer-size.html) | Set the size used when buffering and copying between streams `open fun bufferSize(size: Int): `[`HttpRequest`](./index.html)`!`<br>Get the configured buffer size `open fun bufferSize(): Int` |
| [bytes](bytes.html) | Get response as byte array`open fun bytes(): ByteArray!` |
| [byteStream](byte-stream.html) | Create byte array output stream`open fun byteStream(): ByteArrayOutputStream!` |
| [cacheControl](cache-control.html) | Get the 'Cache-Control' header from the response`open fun cacheControl(): String!` |
| [charset](charset.html) | Get 'charset' parameter from 'Content-Type' response header`open fun charset(): String!` |
| [chunk](chunk.html) | Set chunked streaming mode to the given size`open fun chunk(size: Int): `[`HttpRequest`](./index.html)`!` |
| [closeOutput](close-output.html) | Close output stream`open fun closeOutput(): `[`HttpRequest`](./index.html)`!` |
| [closeOutputQuietly](close-output-quietly.html) | Call ``[`#closeOutput()`](close-output.html) and re-throw a caught ``[`IOException`](#)s as an ``[`HttpRequestException`](-http-request-exception/index.html)`open fun closeOutputQuietly(): `[`HttpRequest`](./index.html)`!` |
| [code](code.html) | Get the status code of the response`open fun code(): Int`<br>Set the value of the given ``[`AtomicInteger`](#) to the status code of the response`open fun code(output: AtomicInteger!): `[`HttpRequest`](./index.html)`!` |
| [connectTimeout](connect-timeout.html) | Set connect timeout on connection to given value`open fun connectTimeout(timeout: Int): `[`HttpRequest`](./index.html)`!` |
| [contentEncoding](content-encoding.html) | Get the 'Content-Encoding' header from the response`open fun contentEncoding(): String!` |
| [contentLength](content-length.html) | Get the 'Content-Length' header from the response`open fun contentLength(): Int`<br>Set the 'Content-Length' request header to the given value`open fun contentLength(contentLength: String!): `[`HttpRequest`](./index.html)`!`<br>`open fun contentLength(contentLength: Int): `[`HttpRequest`](./index.html)`!` |
| [contentType](content-type.html) | Set the 'Content-Type' request header to the given value`open fun contentType(contentType: String!): `[`HttpRequest`](./index.html)`!`<br>Set the 'Content-Type' request header to the given value and charset`open fun contentType(contentType: String!, charset: String!): `[`HttpRequest`](./index.html)`!`<br>Get the 'Content-Type' header from the response`open fun contentType(): String!` |
| [copy](copy.html) | Copy from input stream to output stream`open fun copy(input: InputStream!, output: OutputStream!): `[`HttpRequest`](./index.html)`!`<br>Copy from reader to writer`open fun copy(input: Reader!, output: Writer!): `[`HttpRequest`](./index.html)`!` |
| [created](created.html) | Is the response code a 201 Created?`open fun created(): Boolean` |
| [date](date.html) | Get the 'Date' header from the response`open fun date(): Long` |
| [dateHeader](date-header.html) | Get a date header from the response falling back to returning -1 if the header is missing or parsing fails`open fun dateHeader(name: String!): Long`<br>Get a date header from the response falling back to returning the given default value if the header is missing or parsing fails`open fun dateHeader(name: String!, defaultValue: Long): Long` |
| [delete](delete.html) | Start a 'DELETE' request to the given URL`open static fun delete(url: CharSequence!): `[`HttpRequest`](./index.html)`!`<br>`open static fun delete(url: URL!): `[`HttpRequest`](./index.html)`!`<br>Start a 'DELETE' request to the given URL along with the query params`open static fun delete(baseUrl: CharSequence!, params: MutableMap<*, *>!, encode: Boolean): `[`HttpRequest`](./index.html)`!`<br>`open static fun delete(baseUrl: CharSequence!, encode: Boolean, vararg params: Any!): `[`HttpRequest`](./index.html)`!` |
| [disconnect](disconnect.html) | Disconnect the connection`open fun disconnect(): `[`HttpRequest`](./index.html)`!` |
| [encode](encode.html) | Encode the given URL as an ASCII ``[`String`](#) `open static fun encode(url: CharSequence!): String!` |
| [eTag](e-tag.html) | Get the 'ETag' header from the response`open fun eTag(): String!` |
| [expires](expires.html) | Get the 'Expires' header from the response`open fun expires(): Long` |
| [followRedirects](follow-redirects.html) | Set whether or not the underlying connection should follow redirects in the response.`open fun followRedirects(followRedirects: Boolean): `[`HttpRequest`](./index.html)`!` |
| [form](form.html) | Write the values in the map as form data to the request body `open fun form(values: MutableMap<*, *>!): `[`HttpRequest`](./index.html)`!`<br>Write the key and value in the entry as form data to the request body `open fun form(entry: MutableEntry<*, *>!): `[`HttpRequest`](./index.html)`!`<br>`open fun form(entry: MutableEntry<*, *>!, charset: String!): `[`HttpRequest`](./index.html)`!`<br>Write the name/value pair as form data to the request body `open fun form(name: Any!, value: Any!): `[`HttpRequest`](./index.html)`!`<br>`open fun form(name: Any!, value: Any!, charset: String!): `[`HttpRequest`](./index.html)`!`<br>Write the values in the map as encoded form data to the request body`open fun form(values: MutableMap<*, *>!, charset: String!): `[`HttpRequest`](./index.html)`!` |
| [get](get.html) | Start a 'GET' request to the given URL`open static fun get(url: CharSequence!): `[`HttpRequest`](./index.html)`!`<br>`open static fun get(url: URL!): `[`HttpRequest`](./index.html)`!`<br>Start a 'GET' request to the given URL along with the query params`open static fun get(baseUrl: CharSequence!, params: MutableMap<*, *>!, encode: Boolean): `[`HttpRequest`](./index.html)`!`<br>`open static fun get(baseUrl: CharSequence!, encode: Boolean, vararg params: Any!): `[`HttpRequest`](./index.html)`!` |
| [getConnection](get-connection.html) | Get underlying connection`open fun getConnection(): HttpURLConnection!` |
| [getParam](get-param.html) | Get parameter value from header value`open fun getParam(value: String!, paramName: String!): String!` |
| [getParams](get-params.html) | Get parameter values from header value`open fun getParams(header: String!): MutableMap<String!, String!>!` |
| [head](head.html) | Start a 'HEAD' request to the given URL`open static fun head(url: CharSequence!): `[`HttpRequest`](./index.html)`!`<br>`open static fun head(url: URL!): `[`HttpRequest`](./index.html)`!`<br>Start a 'HEAD' request to the given URL along with the query params`open static fun head(baseUrl: CharSequence!, params: MutableMap<*, *>!, encode: Boolean): `[`HttpRequest`](./index.html)`!`<br>Start a 'GET' request to the given URL along with the query params`open static fun head(baseUrl: CharSequence!, encode: Boolean, vararg params: Any!): `[`HttpRequest`](./index.html)`!` |
| [header](header.html) | Set header name to given value`open fun header(name: String!, value: String!): `[`HttpRequest`](./index.html)`!`<br>`open fun header(name: String!, value: Number!): `[`HttpRequest`](./index.html)`!`<br>Set header to have given entry's key as the name and value as the value`open fun header(header: MutableEntry<String!, String!>!): `[`HttpRequest`](./index.html)`!`<br>Get a response header`open fun header(name: String!): String!` |
| [headers](headers.html) | Set all headers found in given map where the keys are the header names and the values are the header values`open fun headers(headers: MutableMap<String!, String!>!): `[`HttpRequest`](./index.html)`!`<br>Get all the response headers`open fun headers(): MutableMap<String!, MutableList<String!>!>!`<br>Get all values of the given header from the response`open fun headers(name: String!): Array<String!>!` |
| [ifModifiedSince](if-modified-since.html) | Set the 'If-Modified-Since' request header to the given value`open fun ifModifiedSince(ifModifiedSince: Long): `[`HttpRequest`](./index.html)`!` |
| [ifNoneMatch](if-none-match.html) | Set the 'If-None-Match' request header to the given value`open fun ifNoneMatch(ifNoneMatch: String!): `[`HttpRequest`](./index.html)`!` |
| [ignoreCloseExceptions](ignore-close-exceptions.html) | Set whether or not to ignore exceptions that occur from calling ``[`Closeable#close()`](#) `open fun ignoreCloseExceptions(ignore: Boolean): `[`HttpRequest`](./index.html)`!`<br>Get whether or not exceptions thrown by ``[`Closeable#close()`](#) are ignored`open fun ignoreCloseExceptions(): Boolean` |
| [intHeader](int-header.html) | Get an integer header from the response falling back to returning -1 if the header is missing or parsing fails`open fun intHeader(name: String!): Int`<br>Get an integer header value from the response falling back to the given default value if the header is missing or if parsing fails`open fun intHeader(name: String!, defaultValue: Int): Int` |
| [isBodyEmpty](is-body-empty.html) | Is the response body empty?`open fun isBodyEmpty(): Boolean` |
| [keepAlive](keep-alive.html) | Set the 'http.keepAlive' property to the given value. `open static fun keepAlive(keepAlive: Boolean): Unit` |
| [lastModified](last-modified.html) | Get the 'Last-Modified' header from the response`open fun lastModified(): Long` |
| [location](location.html) | Get the 'Location' header from the response`open fun location(): String!` |
| [maxConnections](max-connections.html) | Set the 'http.maxConnections' property to the given value. `open static fun maxConnections(maxConnections: Int): Unit` |
| [message](message.html) | Get status message of the response`open fun message(): String!` |
| [method](method.html) | Get the HTTP method of this request`open fun method(): String!` |
| [noContent](no-content.html) | Is the response code a 204 No Content?`open fun noContent(): Boolean` |
| [nonProxyHosts](non-proxy-hosts.html) | Set the 'http.nonProxyHosts' property to the given host values. `open static fun nonProxyHosts(vararg hosts: String!): Unit` |
| [notFound](not-found.html) | Is the response code a 404 Not Found?`open fun notFound(): Boolean` |
| [notModified](not-modified.html) | Is the response code a 304 Not Modified?`open fun notModified(): Boolean` |
| [ok](ok.html) | Is the response code a 200 OK?`open fun ok(): Boolean` |
| [openOutput](open-output.html) | Open output stream`open fun openOutput(): `[`HttpRequest`](./index.html)`!` |
| [options](options.html) | Start an 'OPTIONS' request to the given URL`open static fun options(url: CharSequence!): `[`HttpRequest`](./index.html)`!`<br>`open static fun options(url: URL!): `[`HttpRequest`](./index.html)`!` |
| [parameter](parameter.html) | Get parameter with given name from header value in response`open fun parameter(headerName: String!, paramName: String!): String!` |
| [parameters](parameters.html) | Get all parameters from header value in response `open fun parameters(headerName: String!): MutableMap<String!, String!>!` |
| [part](part.html) | Write part of a multipart request to the request body`open fun part(name: String!, part: String!): `[`HttpRequest`](./index.html)`!`<br>`open fun part(name: String!, filename: String!, part: String!): `[`HttpRequest`](./index.html)`!`<br>`open fun part(name: String!, filename: String!, contentType: String!, part: String!): `[`HttpRequest`](./index.html)`!`<br>`open fun part(name: String!, part: Number!): `[`HttpRequest`](./index.html)`!`<br>`open fun part(name: String!, filename: String!, part: Number!): `[`HttpRequest`](./index.html)`!`<br>`open fun part(name: String!, part: File!): `[`HttpRequest`](./index.html)`!`<br>`open fun part(name: String!, filename: String!, part: File!): `[`HttpRequest`](./index.html)`!`<br>`open fun part(name: String!, filename: String!, contentType: String!, part: File!): `[`HttpRequest`](./index.html)`!`<br>`open fun part(name: String!, part: InputStream!): `[`HttpRequest`](./index.html)`!`<br>`open fun part(name: String!, filename: String!, contentType: String!, part: InputStream!): `[`HttpRequest`](./index.html)`!` |
| [partHeader](part-header.html) | Write a multipart header to the response body`open fun partHeader(name: String!, value: String!): `[`HttpRequest`](./index.html)`!` |
| [post](post.html) | Start a 'POST' request to the given URL`open static fun post(url: CharSequence!): `[`HttpRequest`](./index.html)`!`<br>`open static fun post(url: URL!): `[`HttpRequest`](./index.html)`!`<br>Start a 'POST' request to the given URL along with the query params`open static fun post(baseUrl: CharSequence!, params: MutableMap<*, *>!, encode: Boolean): `[`HttpRequest`](./index.html)`!`<br>`open static fun post(baseUrl: CharSequence!, encode: Boolean, vararg params: Any!): `[`HttpRequest`](./index.html)`!` |
| [progress](progress.html) | Set the UploadProgress callback for this request`open fun progress(callback: UploadProgress!): `[`HttpRequest`](./index.html)`!` |
| [proxyAuthorization](proxy-authorization.html) | Set the 'Proxy-Authorization' header to given value`open fun proxyAuthorization(proxyAuthorization: String!): `[`HttpRequest`](./index.html)`!` |
| [proxyBasic](proxy-basic.html) | Set the 'Proxy-Authorization' header to given values in Basic authentication format`open fun proxyBasic(name: String!, password: String!): `[`HttpRequest`](./index.html)`!` |
| [proxyHost](proxy-host.html) | Set the 'http.proxyHost' and 'https.proxyHost' properties to the given host value. `open static fun proxyHost(host: String!): Unit` |
| [proxyPort](proxy-port.html) | Set the 'http.proxyPort' and 'https.proxyPort' properties to the given port number. `open static fun proxyPort(port: Int): Unit` |
| [put](put.html) | Start a 'PUT' request to the given URL`open static fun put(url: CharSequence!): `[`HttpRequest`](./index.html)`!`<br>`open static fun put(url: URL!): `[`HttpRequest`](./index.html)`!`<br>Start a 'PUT' request to the given URL along with the query params`open static fun put(baseUrl: CharSequence!, params: MutableMap<*, *>!, encode: Boolean): `[`HttpRequest`](./index.html)`!`<br>`open static fun put(baseUrl: CharSequence!, encode: Boolean, vararg params: Any!): `[`HttpRequest`](./index.html)`!` |
| [reader](reader.html) | Get reader to response body using given character set. `open fun reader(charset: String!): InputStreamReader!`<br>Get reader to response body using the character set returned from ``[`#charset()`](charset.html)`open fun reader(): InputStreamReader!` |
| [readTimeout](read-timeout.html) | Set read timeout on connection to given value`open fun readTimeout(timeout: Int): `[`HttpRequest`](./index.html)`!` |
| [receive](receive.html) | Stream response body to file`open fun receive(file: File!): `[`HttpRequest`](./index.html)`!`<br>Stream response to given output stream`open fun receive(output: OutputStream!): `[`HttpRequest`](./index.html)`!`<br>Stream response to given print stream`open fun receive(output: PrintStream!): `[`HttpRequest`](./index.html)`!`<br>Receive response into the given appendable`open fun receive(appendable: Appendable!): `[`HttpRequest`](./index.html)`!`<br>Receive response into the given writer`open fun receive(writer: Writer!): `[`HttpRequest`](./index.html)`!` |
| [referer](referer.html) | Set the 'Referer' header to given value`open fun referer(referer: String!): `[`HttpRequest`](./index.html)`!` |
| [send](send.html) | Write contents of file to request body`open fun send(input: File!): `[`HttpRequest`](./index.html)`!`<br>Write byte array to request body`open fun send(input: ByteArray!): `[`HttpRequest`](./index.html)`!`<br>Write stream to request body `open fun send(input: InputStream!): `[`HttpRequest`](./index.html)`!`<br>Write reader to request body `open fun send(input: Reader!): `[`HttpRequest`](./index.html)`!`<br>Write char sequence to request body `open fun send(value: CharSequence!): `[`HttpRequest`](./index.html)`!` |
| [server](server.html) | Get the 'Server' header from the response`open fun server(): String!` |
| [serverError](server-error.html) | Is the response code a 500 Internal Server Error?`open fun serverError(): Boolean` |
| [setConnectionFactory](set-connection-factory.html) | Specify the ``[`ConnectionFactory`](-connection-factory/index.html) used to create new requests.`open static fun setConnectionFactory(connectionFactory: ConnectionFactory!): Unit` |
| [startPart](start-part.html) | Start part of a multipart`open fun startPart(): `[`HttpRequest`](./index.html)`!` |
| [stream](stream.html) | Get stream to response body`open fun stream(): InputStream!` |
| [toString](to-string.html) | `open fun toString(): String` |
| [trace](trace.html) | Start a 'TRACE' request to the given URL`open static fun trace(url: CharSequence!): `[`HttpRequest`](./index.html)`!`<br>`open static fun trace(url: URL!): `[`HttpRequest`](./index.html)`!` |
| [trustAllCerts](trust-all-certs.html) | Configure HTTPS connection to trust all certificates `open fun trustAllCerts(): `[`HttpRequest`](./index.html)`!` |
| [trustAllHosts](trust-all-hosts.html) | Configure HTTPS connection to trust all hosts using a custom ``[`HostnameVerifier`](#) that always returns `true` for each host verified `open fun trustAllHosts(): `[`HttpRequest`](./index.html)`!` |
| [uncompress](uncompress.html) | Set whether or not the response body should be automatically uncompressed when read from. `open fun uncompress(uncompress: Boolean): `[`HttpRequest`](./index.html)`!` |
| [url](url.html) | Get the ``[`URL`](#) of this request's connection`open fun url(): URL!` |
| [useCaches](use-caches.html) | Set value of ``[`HttpURLConnection#setUseCaches(boolean)`](#)`open fun useCaches(useCaches: Boolean): `[`HttpRequest`](./index.html)`!` |
| [useProxy](use-proxy.html) | Configure an HTTP proxy on this connection. Use {``[`#proxyBasic(String, String)`](proxy-basic.html) if this proxy requires basic authentication.`open fun useProxy(proxyHost: String!, proxyPort: Int): `[`HttpRequest`](./index.html)`!` |
| [userAgent](user-agent.html) | Set the 'User-Agent' header to given value`open fun userAgent(userAgent: String!): `[`HttpRequest`](./index.html)`!` |
| [writePartHeader](write-part-header.html) | Write part header`open fun writePartHeader(name: String!, filename: String!): `[`HttpRequest`](./index.html)`!`<br>`open fun writePartHeader(name: String!, filename: String!, contentType: String!): `[`HttpRequest`](./index.html)`!` |
| [writer](writer.html) | Create writer to request output stream`open fun writer(): OutputStreamWriter!` |

