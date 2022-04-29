---
title: Auth
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.security](../index.html)/[Auth](index.html)



# Auth



[jvm]\
class [Auth](index.html)



## Constructors


| | |
|---|---|
| [Auth](-auth.html) | [jvm]<br>fun [Auth](-auth.html)() |


## Types


| Name | Summary |
|---|---|
| [AppCheck](-app-check/index.html) | [jvm]<br>data class [AppCheck](-app-check/index.html)(val result: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val version: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val notice: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)? = null, val noticeUpdate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)? = null, val date: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [fetchAndroidCheckin](fetch-android-checkin.html) | [jvm]<br>fun [fetchAndroidCheckin](fetch-android-checkin.html)(): &lt;ERROR CLASS&gt; |
| [fetchAppId](fetch-app-id.html) | [jvm]<br>fun [fetchAppId](fetch-app-id.html)(hashedAppKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>app_id를 서버로부터 얻어오는 메소드입니다. |
| [fetchFcmToken](fetch-fcm-token.html) | [jvm]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [fetchFcmToken](fetch-fcm-token.html)(argFid: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, argRefreshToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [generateAidLoginFromCheckin](generate-aid-login-from-checkin.html) | [jvm]<br>fun [generateAidLoginFromCheckin](generate-aid-login-from-checkin.html)(checkinRes: &lt;ERROR CLASS&gt;): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [generateHashedAppKey](generate-hashed-app-key.html) | [jvm]<br>fun [generateHashedAppKey](generate-hashed-app-key.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>SHA256 단방향 암호화된 value_token을 서버로부터 얻어오거나, 생성하는 메소드입니다. |
| [getAppCheck](get-app-check.html) | [jvm]<br>fun [getAppCheck](get-app-check.html)(): [Auth.AppCheck](-app-check/index.html)<br>app_check에서 정보를 얻어오는 메소드입니다. |
| [getAppId](get-app-id.html) | [jvm]<br>fun [getAppId](get-app-id.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>캐시된 app_id를 얻어오는 메소드입니다. |
| [login](login.html) | [jvm]<br>fun [login](login.html)(user: [User](../../be.zvz.kotlininside.session.user/-user/index.html)): [Session](../../be.zvz.kotlininside.session/-session/index.html)<br>로그인하기 위해 필요한 메소드 |


## Properties


| Name | Summary |
|---|---|
| [fcmToken](fcm-token.html) | [jvm]<br>val [fcmToken](fcm-token.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [fid](fid.html) | [jvm]<br>var [fid](fid.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [refreshToken](refresh-token.html) | [jvm]<br>var [refreshToken](refresh-token.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |

