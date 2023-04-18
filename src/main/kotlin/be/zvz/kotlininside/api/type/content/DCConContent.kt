package be.zvz.kotlininside.api.type.content

import be.zvz.kotlininside.api.dccon.DCConInsert
import be.zvz.kotlininside.api.type.DCCon

data class DCConContent(
    val dcCon: DCCon,
    val dcConInsertResult: DCConInsert.InsertResult
) : Content
