/**
* タスク管理アプリAPI
* タスク管理アプリ用のAPI定義 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * タスク完了フラグ切り替えリクエストモデル
 * @param isDone タスク完了フラグ
 */
@Parcelize
@JsonClass(generateAdapter = true)
data class TaskDonePutParameter (
    /* タスク完了フラグ */
    @Json(name = "isDone")
    val isDone: kotlin.Boolean
) : Parcelable
