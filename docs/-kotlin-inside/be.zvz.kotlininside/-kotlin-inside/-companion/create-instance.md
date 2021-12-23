---
title: createInstance
---
//[KotlinInside](../../../../index.html)/[be.zvz.kotlininside](../../index.html)/[KotlinInside](../index.html)
/[Companion](index.html)/[createInstance](create-instance.html)

# createInstance

[jvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)

@[Synchronized](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-synchronized/index.html)

fun [createInstance](create-instance.html)(user: [User](../../../be.zvz.kotlininside.session.user/-user/index.html),
httpInterface: [HttpInterface](../../../be.zvz.kotlininside.http/-http-interface/index.html),
sessionAutoRefresh: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false)

[KotlinInside](../index.html) 인스턴스를 생성합니다.

## Parameters

jvm

| | |
|---|---|
| user | 인스턴스 생성과 동시에 로그인할 유저 |
| httpInterface | KotlinInside에서 사용할 HttpInterface |
| sessionAutoRefresh | KotlinInside가 세션을 12시간마다 자동으로 새로고침 할지 정합니다. |




