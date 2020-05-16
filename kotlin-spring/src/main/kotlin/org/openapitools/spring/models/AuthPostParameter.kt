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
 * ユーザー認証リクエストモデル
 * @param userName ユーザ名
 * @param password パスワード
 */
data class AuthPostParameter @JsonCreator constructor (

    @get:NotNull 
    @JsonProperty("userName") val userName: kotlin.String,

    @get:NotNull 
    @JsonProperty("password") val password: kotlin.String
) {

}

