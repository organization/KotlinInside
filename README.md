# *KotlinInside* [![Build Status](https://github.com/organization/KotlinInside/workflows/Java%20CI/badge.svg)](https://github.com/organization/KotlinInside/actions) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/be.zvz/KotlinInside/badge.svg)](https://maven-badges.herokuapp.com/maven-central/be.zvz/KotlinInside)


**Kotlin**으로 작성한 **디시인사이드 비공식 API**입니다.

[**API 문서**](https://organization.github.io/KotlinInside/)

### Gradle

```gradle
compile 'be.zvz:KotlinInside:1.9.2'
```

### Maven

```xml
<dependency>
  <groupId>be.zvz</groupId>
  <artifactId>KotlinInside</artifactId>
  <version>1.9.2</version>
</dependency>
```

### 라이브러리 최소 요구사항

- **Java 1.7 (Java 7)** 이상 필요
- **Kotlin 1.5+** 권장
- **Android에서 사용 가능**
- **Java에서도 사용 가능 (타 JVM 계열 언어에서도 사용 가능)**

### 라이브러리 컴파일 최소 요구사항

- **Java 1.8 (Java 8)** 이상 필요

## 예제

### Init

유동 닉네임

```kotlin
KotlinInside.createInstance(
        Anonymous("이름", "비밀번호"),
        DefaultHttpClient(true, true)
)
```

고정 닉네임

```kotlin
KotlinInside.createInstance(
        LoginUser("아이디", "비밀번호"),
        DefaultHttpClient(true, true)
)
```

### 글 목록 받아오기

```kotlin
val articleList = ArticleList("hit", 1)
articleList.request()

val gallList = articleList.getGallList() // 글 목록
val gallInfo = articleList.getGallInfo() // 갤러리 정보

println(gallInfo)
gallList.forEach {
    println(it)
}
```

### 글 읽기

```kotlin
val articleRead = ArticleRead("hit", 1)
articleRead.request()

println(articleRead.getViewInfo())
println(articleRead.getViewMain())
```

### 더 자세한 예제는 [**테스트 코드**](https://github.com/organization/KotlinInside/blob/master/src/test/kotlin/be/zvz/kotlininside/KotlinInsideTest.kt) 참고

## 이 라이브러리를 사용 중인 프로젝트

- [***OpenDC***](https://github.com/organization/OpenDC)

## 도움이 된 라이브러리

- [***goinside***](https://github.com/geeksbaek/goinside)
- [***pyinside***](https://github.com/Jeongsj/pyinside)

## 라이선스

[**GPLv3**](https://github.com/organization/KotlinInside/blob/master/LICENSE)

## 본 라이브러리에 포함되어 있는 라이브러리

- [***lavaplayer*** - JsonBrowser](https://github.com/sedmelluq/lavaplayer/blob/master/main/src/main/java/com/sedmelluq/discord/lavaplayer/tools/JsonBrowser.java)
```
Copyright 2019 sedmelluq. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
 - [***MigBase64*** - fork (Miha-x64)](https://github.com/Miha-x64/migbase64/tree/smaller-static)
```
 Licence (BSD):
 ==============

 Copyright (c) 2004, Mikael Grev, MiG InfoCom AB. (base64 @ miginfocom . com)
 All rights reserved.

 Redistribution and use in source and binary forms, with or without modification,
 are permitted provided that the following conditions are met:
 Redistributions of source code must retain the above copyright notice, this list
 of conditions and the following disclaimer.
 Redistributions in binary form must reproduce the above copyright notice, this
 list of conditions and the following disclaimer in the documentation and/or other
 materials provided with the distribution.
 Neither the name of the MiG InfoCom AB nor the names of its contributors may be
 used to endorse or promote products derived from this software without specific
 prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
 OF SUCH DAMAGE.
```
 - [***http-request***](https://github.com/kevinsawicki/http-request)
```
Copyright (c) 2014 Kevin Sawicki <kevinsawicki@gmail.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to
deal in the Software without restriction, including without limitation the
rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
sell copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
IN THE SOFTWARE.
```
