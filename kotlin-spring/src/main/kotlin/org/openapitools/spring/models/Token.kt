package org.openapitools.spring.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * アクセストークン
 * @param tokenType トークンタイプ
 * @param accessToken アクセストークン
 * @param refreshToken リフレッシュトークン
 * @param expiresIn 有効秒数
 */
data class Token(

    @get:NotNull 
    @JsonProperty("tokenType") val tokenType: kotlin.String,

    @get:NotNull 
    @JsonProperty("accessToken") val accessToken: kotlin.String,

    @get:NotNull 
    @JsonProperty("refreshToken") val refreshToken: kotlin.String,

    @get:NotNull 
    @JsonProperty("expiresIn") val expiresIn: kotlin.Long
) {

}

