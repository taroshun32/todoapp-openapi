package org.openapitools.spring.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonCreator
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * タスク登録リクエストモデル
 * @param name タスク名
 * @param expiresIn 有効期限(yyyyMMdd)
 */
data class TaskPostAndPutParameter @JsonCreator constructor (

    @get:NotNull 
    @JsonProperty("name") val name: kotlin.String,

    @get:NotNull 
    @JsonProperty("expiresIn") val expiresIn: kotlin.String
) {

}

