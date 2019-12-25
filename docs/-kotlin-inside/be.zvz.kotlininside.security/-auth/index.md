---
title: Auth - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.security](../index.html) / [Auth](./index.html)

# Auth

(JVM) `class Auth`

### Types

| (JVM) [AppCheck](-app-check/index.html) | `data class AppCheck` |

### Constructors

| (JVM) [&lt;init&gt;](-init-.html) | `Auth()` |

### Properties

| (JVM) [fcmToken](fcm-token.html) | `var fcmToken: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| (JVM) [fetchAppId](fetch-app-id.html) | app_id를 서버로부터 얻어오는 메소드입니다.`fun fetchAppId(hashedAppKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| (JVM) [generateHashedAppKey](generate-hashed-app-key.html) | SHA256 단방향 암호화된 value_token을 서버로부터 얻어오거나, 생성하는 메소드입니다.`fun generateHashedAppKey(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| (JVM) [getAppCheck](get-app-check.html) | app_check에서 정보를 얻어오는 메소드입니다.`fun getAppCheck(): AppCheck` |
| (JVM) [getAppId](get-app-id.html) | 캐시된 app_id를 얻어오는 메소드입니다.`fun getAppId(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| (JVM) [login](login.html) | 로그인하기 위해 필요한 메소드`fun login(user: `[`User`](../../be.zvz.kotlininside.session.user/-user/index.html)`): `[`Session`](../../be.zvz.kotlininside.session/-session/index.html) |

