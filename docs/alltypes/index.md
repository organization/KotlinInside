---
title: alltypes - 
---

### All Types

|

##### [be.zvz.kotlininside.session.user.Anonymous](../be.zvz.kotlininside.session.user/-anonymous/index.html)


|

##### [be.zvz.kotlininside.value.ApiUrl](../be.zvz.kotlininside.value/-api-url/index.html)


|

##### [be.zvz.kotlininside.security.App](../be.zvz.kotlininside.security/-app/index.html)


|

##### [be.zvz.kotlininside.api.type.Article](../be.zvz.kotlininside.api.type/-article/index.html)


|

##### [be.zvz.kotlininside.api.article.ArticleDelete](../be.zvz.kotlininside.api.article/-article-delete/index.html)


|

##### [be.zvz.kotlininside.api.article.ArticleHitUpvote](../be.zvz.kotlininside.api.article/-article-hit-upvote/index.html)


|

##### [be.zvz.kotlininside.api.article.ArticleList](../be.zvz.kotlininside.api.article/-article-list/index.html)


|

##### [be.zvz.kotlininside.api.article.ArticleRead](../be.zvz.kotlininside.api.article/-article-read/index.html)


|

##### [be.zvz.kotlininside.api.article.ArticleReport](../be.zvz.kotlininside.api.article/-article-report/index.html)


|

##### [be.zvz.kotlininside.api.article.ArticleVote](../be.zvz.kotlininside.api.article/-article-vote/index.html)


|

##### [be.zvz.kotlininside.api.article.ArticleWrite](../be.zvz.kotlininside.api.article/-article-write/index.html)


|

##### [be.zvz.kotlininside.security.Auth](../be.zvz.kotlininside.security/-auth/index.html)


|

##### [com.migcomponents.migbase64.Base64](../com.migcomponents.migbase64/-base64/index.html)

A very fast and memory efficient class to encode and decode to and from BASE64 in full accordance with RFC 2045. On Windows XP sp1 with 1.4.2_04 and later ;), this encoder and decoder is about 10 times faster on small arrays (10 - 1000 bytes) and 2-3 times as fast on larger arrays (10000 - 1000000 bytes) compared to `sun.misc.Encoder()/Decoder()`. On byte arrays the encoder is about 20% faster than Jakarta Commons Base64 Codec for encode and about 50% faster for decoding large arrays. This implementation is about twice as fast on very small arrays (&lt; 30 bytes). If source/destination is a `String` this version is about three times as fast due to the fact that the Commons Codec result has to be recoded to a `String` from `byte[]`, which is very expensive. This encode/decode algorithm doesn't create any temporary arrays as many other codecs do, it only allocates the resulting array. This produces less garbage and it is possible to handle arrays twice as large as algorithms that create a temporary array. (E.g. Jakarta Commons Codec). It is unknown whether Sun's `sun.misc.Encoder()/Decoder()` produce temporary arrays but since performance is quite low it probably does. The encoder produces the same output as the Sun one except that the Sun's encoder appends a trailing line separator if the last character isn't a pad. Unclear why but it only adds to the length and is probably a side effect. Both are in conformance with RFC 2045 though. Commons codec seem to always att a trailing line separator. **Note!** The encode/decode method pairs (types) come in three versions with the **exact** same algorithm and thus a lot of code redundancy. This is to not create any temporary arrays for transcoding to/from different format types. The methods not used can simply be commented out. There is also a "fast" version of all decode methods that works the same way as the normal ones, but har a few demands on the decoded input. Normally though, these fast verions should be used if the source if the input is known and it hasn't bee tampered with. If you find the code useful or you find a bug, please send me a note at base64 @ miginfocom . com. Licence (BSD): ============== Copyright (c) 2004, Mikael Grev, MiG InfoCom AB. (base64 @ miginfocom . com) All rights reserved. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. Neither the name of the MiG InfoCom AB nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.


|

##### [com.migcomponents.migbase64.Base64IO](../com.migcomponents.migbase64/-base64-i-o/index.html)

Base64 for InputStream Licence = BSD


|

##### [be.zvz.kotlininside.api.type.Comment](../be.zvz.kotlininside.api.type/-comment/index.html)


|

##### [be.zvz.kotlininside.api.comment.CommentDelete](../be.zvz.kotlininside.api.comment/-comment-delete/index.html)


|

##### [be.zvz.kotlininside.api.comment.CommentRead](../be.zvz.kotlininside.api.comment/-comment-read/index.html)


|

##### [be.zvz.kotlininside.api.comment.CommentWrite](../be.zvz.kotlininside.api.comment/-comment-write/index.html)


|

##### [be.zvz.kotlininside.value.Const](../be.zvz.kotlininside.value/-const/index.html)


|

##### [be.zvz.kotlininside.api.type.Content](../be.zvz.kotlininside.api.type/-content.html)


|

##### [be.zvz.kotlininside.session.user.named.DuplicateNamed](../be.zvz.kotlininside.session.user.named/-duplicate-named/index.html)


|

##### [be.zvz.kotlininside.api.type.HeadText](../be.zvz.kotlininside.api.type/-head-text/index.html)


|

##### [be.zvz.kotlininside.http.HttpException](../be.zvz.kotlininside.http/-http-exception/index.html)


|

##### [be.zvz.kotlininside.http.HttpInterface](../be.zvz.kotlininside.http/-http-interface/index.html)


|

##### [be.zvz.kotlininside.api.type.Image](../be.zvz.kotlininside.api.type/-image/index.html)


|

##### [be.zvz.kotlininside.json.JsonBrowser](../be.zvz.kotlininside.json/-json-browser/index.html)

Allows to easily navigate in decoded JSON data


|

##### [be.zvz.kotlininside.KotlinInside](../be.zvz.kotlininside/-kotlin-inside/index.html)


|

##### [be.zvz.kotlininside.session.user.LoginUser](../be.zvz.kotlininside.session.user/-login-user/index.html)


|

##### [be.zvz.kotlininside.api.generic.MainPage](../be.zvz.kotlininside.api.generic/-main-page/index.html)


|

##### [be.zvz.kotlininside.session.user.named.Named](../be.zvz.kotlininside.session.user.named/-named/index.html)


|

##### [be.zvz.kotlininside.http.Request](../be.zvz.kotlininside.http/-request/index.html)


|

##### [be.zvz.kotlininside.session.Session](../be.zvz.kotlininside.session/-session/index.html)


|

##### [be.zvz.kotlininside.session.SessionDetail](../be.zvz.kotlininside.session/-session-detail/index.html)


|

##### [be.zvz.kotlininside.api.type.StringContent](../be.zvz.kotlininside.api.type/-string-content/index.html)


|

##### [be.zvz.kotlininside.utils.StringUtil](../be.zvz.kotlininside.utils/-string-util/index.html)


|

##### [be.zvz.kotlininside.session.user.User](../be.zvz.kotlininside.session.user/-user/index.html)


|

##### [be.zvz.kotlininside.session.user.UserType](../be.zvz.kotlininside.session.user/-user-type/index.html)


