---
title: HttpInterface.Option - 
---

[be.zvz.kotlininside.http](../../index.html) / [HttpInterface](../index.html) / [Option](./index.html)

# Option

`class Option`

### Constructors

| [&lt;init&gt;](-init-.html) | `Option()` |

### Functions

| [addBodyParameter](add-body-parameter.html) | `fun addBodyParameter(key: String!, value: String!): Option!` |
| [addHeader](add-header.html) | `fun addHeader(key: String!, value: String!): Option!` |
| [addMultipartFile](add-multipart-file.html) | `fun addMultipartFile(key: String!, value: InputStream!): Option!` |
| [addMultipartFileList](add-multipart-file-list.html) | `fun addMultipartFileList(key: String!, value: MutableList<InputStream!>!): Option!` |
| [addMultipartParameter](add-multipart-parameter.html) | `fun addMultipartParameter(key: String!, value: String!): Option!` |
| [addPathParameter](add-path-parameter.html) | `fun addPathParameter(key: String!, value: String!): Option!` |
| [addQueryParameter](add-query-parameter.html) | `fun addQueryParameter(key: String!, value: String!): Option!` |
| [getBodyParameter](get-body-parameter.html) | `fun getBodyParameter(): MutableMap<String!, String!>!` |
| [getHeaders](get-headers.html) | `fun getHeaders(): MutableMap<String!, String!>!` |
| [getMultipartContentType](get-multipart-content-type.html) | `fun getMultipartContentType(): String!` |
| [getMultipartFile](get-multipart-file.html) | `fun getMultipartFile(): MutableMap<String!, InputStream!>!` |
| [getMultipartFileList](get-multipart-file-list.html) | `fun getMultipartFileList(): MutableMap<String!, MutableList<InputStream!>!>!` |
| [getMultipartParameter](get-multipart-parameter.html) | `fun getMultipartParameter(): MutableMap<String!, String!>!` |
| [getPathParameter](get-path-parameter.html) | `fun getPathParameter(): MutableMap<String!, String!>!` |
| [getQueryParameter](get-query-parameter.html) | `fun getQueryParameter(): MutableMap<String!, String!>!` |
| [getUserAgent](get-user-agent.html) | `fun getUserAgent(): String!` |
| [setMultipartContentType](set-multipart-content-type.html) | `fun setMultipartContentType(contentType: String!): Option!` |
| [setUserAgent](set-user-agent.html) | `fun setUserAgent(userAgent: String!): Option!` |

