---
title: Auth
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.security](../index.html)/[Auth](index.html)

# Auth

[jvm]\
class [Auth](index.html)

## Types

| Name | Summary |
|---|---|
| [AppCheck](-app-check/index.html) | [jvm]<br>data class [AppCheck](-app-check/index.html)(**
result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **
version**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **
notice**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **
noticeUpdate**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **
date**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) |

## Functions

| Name | Summary |
|---|---|
| [fetchAppId](fetch-app-id.html) | [jvm]<br>fun [fetchAppId](fetch-app-id.html)(hashedAppKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>app_id를 서버로부터 얻어오는 메소드입니다. |
| [fetchFcmToken](fetch-fcm-token.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()<br>fun [fetchFcmToken](fetch-fcm-token.html)(argFid: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, argRefreshToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [generateHashedAppKey](generate-hashed-app-key.html) | [jvm]<br>fun [generateHashedAppKey](generate-hashed-app-key.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>SHA256 단방향 암호화된 value_token을 서버로부터 얻어오거나, 생성하는 메소드입니다. |
| [getAppCheck](get-app-check.html) | [jvm]<br>fun [getAppCheck](get-app-check.html)(): [Auth.AppCheck](-app-check/index.html)<br>app_check에서 정보를 얻어오는 메소드입니다. |
| [getAppId](get-app-id.html) | [jvm]<br>fun [getAppId](get-app-id.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>캐시된 app_id를 얻어오는 메소드입니다. |
| [login](login.html) | [jvm]<br>fun [login](login.html)(user: [User](../../be.zvz.kotlininside.session.user/-user/index.html)): [Session](../../be.zvz.kotlininside.session/-session/index.html)<br>로그인하기 위해 필요한 메소드 |

## Properties

| Name | Summary |
|---|---|
| [fcmToken](fcm-token.html) | [jvm]<br>lateinit var [fcmToken](fcm-token.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [fid](fid.html) | [jvm]<br>lateinit var [fid](fid.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [refreshToken](refresh-token.html) | [jvm]<br>lateinit var [refreshToken](refresh-token.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

