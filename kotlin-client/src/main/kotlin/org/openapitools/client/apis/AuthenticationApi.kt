package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import org.openapitools.client.models.AuthPostParameter
import org.openapitools.client.models.Error
import org.openapitools.client.models.Token
import org.openapitools.client.models.TokenRefreshPostParameter

interface AuthenticationApi {
    @POST("/api/v1/login")
    fun apiV1LoginPost(@Header("X-OS-TYPE") xminusOSMinusTYPE: kotlin.String, @Header("X-APP-VERSION") xminusAPPMinusVERSION: kotlin.String, @Body authPostParameter: AuthPostParameter): Call<Token>

    @POST("/api/v1/logout")
    fun apiV1LogoutPost(@Header("Authorization") authorization: kotlin.String, @Header("X-OS-TYPE") xminusOSMinusTYPE: kotlin.String, @Header("X-APP-VERSION") xminusAPPMinusVERSION: kotlin.String): Call<Unit>

    @POST("/api/v1/signup")
    fun apiV1SignupPost(@Header("X-OS-TYPE") xminusOSMinusTYPE: kotlin.String, @Header("X-APP-VERSION") xminusAPPMinusVERSION: kotlin.String, @Body authPostParameter: AuthPostParameter): Call<Token>

    @POST("/api/v1/token/refresh")
    fun apiV1TokenRefreshPost(@Header("X-OS-TYPE") xminusOSMinusTYPE: kotlin.String, @Header("X-APP-VERSION") xminusAPPMinusVERSION: kotlin.String, @Body tokenRefreshPostParameter: TokenRefreshPostParameter): Call<Token>

}
