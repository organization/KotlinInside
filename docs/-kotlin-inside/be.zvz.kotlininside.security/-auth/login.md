---
title: login
---
//[KotlinInside](../../../index.html)/[be.zvz.kotlininside.security](../index.html)/[Auth](index.html)
/[login](login.html)

# login

[jvm]\
fun [login](login.html)(
user: [User](../../be.zvz.kotlininside.session.user/-user/index.html)): [Session](../../be.zvz.kotlininside.session/-session/index.html)

로그인하기 위해 필요한 메소드

#### Return

[be.zvz.kotlininside.session.Session](../../be.zvz.kotlininside.session/-session/index.html) 로그인에 성공했거나,
유동닉([be.zvz.kotlininside.session.user.Anonymous](../../be.zvz.kotlininside.session.user/-anonymous/index.html)) 객체를 담고있는
세션을 반환함

## Parameters

jvm

| | |
|---|---|
| user | [be.zvz.kotlininside.session.user.Anonymous](../../be.zvz.kotlininside.session.user/-anonymous/index.html)와 [be.zvz.kotlininside.session.user.LoginUser](../../be.zvz.kotlininside.session.user/-login-user/index.html) 클래스를 매개변수로 받음 |

#### Throws

| | |
|---|---|
| [be.zvz.kotlininside.http.HttpException](../../be.zvz.kotlininside.http/-http-exception/index.html) | 계정에 로그인 할 수 없는 경우 HttpException 발생 |



