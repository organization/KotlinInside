---
title: Auth.fetchAppId - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.security](../index.html) / [Auth](index.html) / [fetchAppId](./fetch-app-id.html)

# fetchAppId

(JVM) `fun fetchAppId(hashedAppKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

app_id를 서버로부터 얻어오는 메소드입니다.

### Exceptions

`java.lang.NullPointerException` - app_id를 얻어올 수 없는 경우, NullPointerException이 발생합니다.

### Parameters

`hashedAppKey` - SHA256 단방향 암호화된 value_token 값입니다.

**Return**
[java.lang.String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) app_id를 반환합니다.

