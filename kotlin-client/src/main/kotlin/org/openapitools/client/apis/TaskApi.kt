package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import org.openapitools.client.models.Error
import org.openapitools.client.models.Task
import org.openapitools.client.models.TaskDonePutParameter
import org.openapitools.client.models.TaskPostAndPutParameter
import org.openapitools.client.models.Tasks

interface TaskApi {
    @GET("/api/v1/tasks")
    fun apiV1TasksGet(@Header("Authorization") authorization: kotlin.String, @Header("X-OS-TYPE") xminusOSMinusTYPE: kotlin.String, @Header("X-APP-VERSION") xminusAPPMinusVERSION: kotlin.String): Call<Tasks>

    @POST("/api/v1/tasks")
    fun apiV1TasksPost(@Header("Authorization") authorization: kotlin.String, @Header("X-OS-TYPE") xminusOSMinusTYPE: kotlin.String, @Header("X-APP-VERSION") xminusAPPMinusVERSION: kotlin.String, @Body taskPostAndPutParameter: TaskPostAndPutParameter): Call<Task>

    @DELETE("/api/v1/tasks/{taskId}")
    fun apiV1TasksTaskIdDelete(@Header("Authorization") authorization: kotlin.String, @Header("X-OS-TYPE") xminusOSMinusTYPE: kotlin.String, @Header("X-APP-VERSION") xminusAPPMinusVERSION: kotlin.String, @Path("taskId") taskId: kotlin.String): Call<Unit>

    @PUT("/api/v1/tasks/{taskId}/done")
    fun apiV1TasksTaskIdDonePut(@Header("Authorization") authorization: kotlin.String, @Header("X-OS-TYPE") xminusOSMinusTYPE: kotlin.String, @Header("X-APP-VERSION") xminusAPPMinusVERSION: kotlin.String, @Path("taskId") taskId: kotlin.String, @Body taskDonePutParameter: TaskDonePutParameter): Call<Unit>

    @PUT("/api/v1/tasks/{taskId}")
    fun apiV1TasksTaskIdPut(@Header("Authorization") authorization: kotlin.String, @Header("X-OS-TYPE") xminusOSMinusTYPE: kotlin.String, @Header("X-APP-VERSION") xminusAPPMinusVERSION: kotlin.String, @Path("taskId") taskId: kotlin.String, @Body taskPostAndPutParameter: TaskPostAndPutParameter): Call<Task>

}
