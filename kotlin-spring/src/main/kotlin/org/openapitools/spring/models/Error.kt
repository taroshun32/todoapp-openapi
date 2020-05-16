package org.openapitools.spring.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.spring.models.ValidationInfo
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
 * @param code エラーコード
 * @param message エラーメッセージ
 * @param validationInfo バリデーション情報の配列
 */
data class Error @JsonCreator constructor (

    @get:NotNull 
    @JsonProperty("code") val code: kotlin.Int,

    @get:NotNull 
    @JsonProperty("message") val message: kotlin.String,

    @JsonProperty("validationInfo") val validationInfo: kotlin.collections.List<ValidationInfo>? = null
) {

}

