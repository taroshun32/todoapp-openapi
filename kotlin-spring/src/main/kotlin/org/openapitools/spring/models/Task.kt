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
 * タスク情報
 * @param id タスクID
 * @param name タスク名
 * @param isDone 完了したかどうか 
 * @param expiresIn 有効期限 ISO 8601形式 
 */
data class Task @JsonCreator constructor (

    @get:NotNull 
    @JsonProperty("id") val id: kotlin.String,

    @get:NotNull 
    @JsonProperty("name") val name: kotlin.String,

    @get:NotNull 
    @JsonProperty("isDone") val isDone: kotlin.Boolean,

    @get:NotNull 
    @JsonProperty("expiresIn") val expiresIn: java.time.OffsetDateTime
) {

}

