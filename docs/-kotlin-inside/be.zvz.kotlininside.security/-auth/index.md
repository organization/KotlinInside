---
title: Auth -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.security](../index.md)/[Auth](index.md)



# Auth  
 [jvm] class [Auth](index.md)   


## Types  
  
|  Name|  Summary| 
|---|---|
| [AppCheck](-app-check/index.md)| [jvm]  <br>Content  <br>data class [AppCheck](-app-check/index.md)(**result**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **version**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **notice**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **noticeUpdate**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **date**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [fetchAppId](fetch-app-id.md)| [jvm]  <br>Brief description  <br><br><br>app_id를 서버로부터 얻어오는 메소드입니다.<br><br>  <br>Content  <br>fun [fetchAppId](fetch-app-id.md)(hashedAppKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [generateHashedAppKey](generate-hashed-app-key.md)| [jvm]  <br>Brief description  <br><br><br>SHA256 단방향 암호화된 value_token을 서버로부터 얻어오거나, 생성하는 메소드입니다.<br><br>  <br>Content  <br>fun [generateHashedAppKey](generate-hashed-app-key.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [getAppCheck](get-app-check.md)| [jvm]  <br>Brief description  <br><br><br>app_check에서 정보를 얻어오는 메소드입니다.<br><br>  <br>Content  <br>fun [getAppCheck](get-app-check.md)(): [Auth.AppCheck](-app-check/index.md)  <br><br><br>
| [getAppId](get-app-id.md)| [jvm]  <br>Brief description  <br><br><br>캐시된 app_id를 얻어오는 메소드입니다.<br><br>  <br>Content  <br>fun [getAppId](get-app-id.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [login](login.md)| [jvm]  <br>Brief description  <br><br><br>로그인하기 위해 필요한 메소드<br><br>  <br>Content  <br>fun [login](login.md)(user: [User](../../be.zvz.kotlininside.session.user/-user/index.md)): [Session](../../be.zvz.kotlininside.session/-session/index.md)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [fcmToken](index.md#be.zvz.kotlininside.security/Auth/fcmToken/#/PointingToDeclaration/)|  [jvm] var [fcmToken](index.md#be.zvz.kotlininside.security/Auth/fcmToken/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>

