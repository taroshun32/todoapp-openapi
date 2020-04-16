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
 * ユーザー認証リクエストモデル
 * @param password パスワード
 * @param userId ユーザ名
 */
data class AuthPostParameter(

    @get:NotNull 
    @JsonProperty("password") val password: kotlin.String,

    @JsonProperty("userId") val userId: kotlin.String? = null
) {

}

