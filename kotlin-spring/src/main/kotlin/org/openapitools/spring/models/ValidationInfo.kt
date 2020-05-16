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
 * 
 * @param field 対象のフィールド名
 * @param rejectedValue 不正な入力値
 * @param message バリデーションメッセージ
 */
data class ValidationInfo @JsonCreator constructor (

    @get:NotNull 
    @JsonProperty("field") val field: kotlin.String,

    @get:NotNull 
    @JsonProperty("rejectedValue") val rejectedValue: kotlin.String,

    @get:NotNull 
    @JsonProperty("message") val message: kotlin.String
) {

}

