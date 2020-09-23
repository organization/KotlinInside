---
title: login -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.security](../index.md)/[Auth](index.md)/[login](login.md)



# login  
[jvm]  
Brief description  


로그인하기 위해 필요한 메소드



#### Return  


[be.zvz.kotlininside.session.Session](../../be.zvz.kotlininside.session/-session/index.md) 로그인에 성공했거나, 유동닉([be.zvz.kotlininside.session.user.Anonymous](../../be.zvz.kotlininside.session.user/-anonymous/index.md)) 객체를 담고있는 세션을 반환함



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| user| <br><br>[be.zvz.kotlininside.session.user.Anonymous](../../be.zvz.kotlininside.session.user/-anonymous/index.md)와 [be.zvz.kotlininside.session.user.LoginUser](../../be.zvz.kotlininside.session.user/-login-user/index.md) 클래스를 매개변수로 받음<br><br>
  
  
Content  
fun [login](login.md)(user: [User](../../be.zvz.kotlininside.session.user/-user/index.md)): [Session](../../be.zvz.kotlininside.session/-session/index.md)  



