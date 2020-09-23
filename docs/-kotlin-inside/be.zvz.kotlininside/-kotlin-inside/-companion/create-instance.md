---
title: createInstance -
---
//[KotlinInside](../../../index.md)/[be.zvz.kotlininside](../../index.md)/[KotlinInside](../index.md)/[Companion](index.md)/[createInstance](create-instance.md)



# createInstance  
[jvm]  
Brief description  


[KotlinInside](../index.md) 인스턴스를 생성합니다.



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| httpInterface| <br><br>KotlinInside에서 사용할 HttpInterface<br><br>
| sessionAutoRefresh| <br><br>KotlinInside가 세션을 12시간마다 자동으로 새로고침 할지 정합니다.<br><br>
| user| <br><br>인스턴스 생성과 동시에 로그인할 유저<br><br>
  
  
Content  
@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)()  
@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  
@[Synchronized](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-synchronized/index.html)()  
  
fun [createInstance](create-instance.md)(user: [User](../../../be.zvz.kotlininside.session.user/-user/index.md), httpInterface: [HttpInterface](../../../be.zvz.kotlininside.http/-http-interface/index.md), sessionAutoRefresh: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))  



