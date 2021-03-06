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
 * タスク完了フラグ切り替えリクエストモデル
 * @param isDone タスク完了フラグ
 */
data class TaskDonePutParameter @JsonCreator constructor (

    @get:NotNull 
    @JsonProperty("isDone") val isDone: kotlin.Boolean
) {

}

