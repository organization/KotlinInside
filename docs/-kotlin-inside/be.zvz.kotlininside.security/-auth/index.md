---
title: Auth -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.security](../index.md)/[Auth](index.md)



# Auth  
 [jvm] class [Auth](index.md)   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.security/Auth.AppCheck///PointingToDeclaration/"></a>[AppCheck](-app-check/index.md)| <a name="be.zvz.kotlininside.security/Auth.AppCheck///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [AppCheck](-app-check/index.md)(**result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **version**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **notice**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **noticeUpdate**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **date**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="be.zvz.kotlininside.security/Auth/fetchAppId/#kotlin.String/PointingToDeclaration/"></a>[fetchAppId](fetch-app-id.md)| <a name="be.zvz.kotlininside.security/Auth/fetchAppId/#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [fetchAppId](fetch-app-id.md)(hashedAppKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>app_id를 서버로부터 얻어오는 메소드입니다.  <br><br><br>
| <a name="be.zvz.kotlininside.security/Auth/generateHashedAppKey/#/PointingToDeclaration/"></a>[generateHashedAppKey](generate-hashed-app-key.md)| <a name="be.zvz.kotlininside.security/Auth/generateHashedAppKey/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [generateHashedAppKey](generate-hashed-app-key.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>SHA256 단방향 암호화된 value_token을 서버로부터 얻어오거나, 생성하는 메소드입니다.  <br><br><br>
| <a name="be.zvz.kotlininside.security/Auth/getAppCheck/#/PointingToDeclaration/"></a>[getAppCheck](get-app-check.md)| <a name="be.zvz.kotlininside.security/Auth/getAppCheck/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [getAppCheck](get-app-check.md)(): [Auth.AppCheck](-app-check/index.md)  <br>More info  <br>app_check에서 정보를 얻어오는 메소드입니다.  <br><br><br>
| <a name="be.zvz.kotlininside.security/Auth/getAppId/#/PointingToDeclaration/"></a>[getAppId](get-app-id.md)| <a name="be.zvz.kotlininside.security/Auth/getAppId/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [getAppId](get-app-id.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>캐시된 app_id를 얻어오는 메소드입니다.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="be.zvz.kotlininside.security/Auth/login/#be.zvz.kotlininside.session.user.User/PointingToDeclaration/"></a>[login](login.md)| <a name="be.zvz.kotlininside.security/Auth/login/#be.zvz.kotlininside.session.user.User/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [login](login.md)(user: [User](../../be.zvz.kotlininside.session.user/-user/index.md)): [Session](../../be.zvz.kotlininside.session/-session/index.md)  <br>More info  <br>로그인하기 위해 필요한 메소드  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../be.zvz.kotlininside.utils/-string-util/-companion/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F49489957)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="be.zvz.kotlininside.security/Auth/fcmToken/#/PointingToDeclaration/"></a>[fcmToken](fcm-token.md)| <a name="be.zvz.kotlininside.security/Auth/fcmToken/#/PointingToDeclaration/"></a> [jvm] var [fcmToken](fcm-token.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>

