---
title: Auth.fetchAppId - 
---

[be.zvz.kotlininside.security](../index.html) / [Auth](index.html) / [fetchAppId](./fetch-app-id.html)

# fetchAppId

`fun fetchAppId(hashedAppKey: String): String`

app_id를 서버로부터 얻어오는 메소드입니다.

### Exceptions

`java.lang.NullPointerException` - app_id를 얻어올 수 없는 경우, NPE를 반환합니다.

### Parameters

`hashedAppKey` - SHA256 단방향 암호화된 value_token 값입니다.

**Return**
[java.lang.String](#) app_id를 반환합니다.

