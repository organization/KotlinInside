---
title: trustAllHosts -
---
//[KotlinInside](../../index.md)/[be.zvz.kotlininside.http](../index.md)/[HttpRequest](index.md)/[trustAllHosts](trust-all-hosts.md)



# trustAllHosts  
[jvm]  
Brief description  




Configure HTTPS connection to trust all hosts using a custom [HostnameVerifier](https://docs.oracle.com/javase/7/docs/api/javax/net/ssl/HostnameVerifier.html) that always returns true for each host verified 



 This method does nothing if the current request is not a HTTPS request





#### Return  


this request

  
Content  
open fun [trustAllHosts](trust-all-hosts.md)(): [HttpRequest](index.md)  



