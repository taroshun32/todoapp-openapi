package org.openapitools.spring.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.spring.models.Task
import com.fasterxml.jackson.annotation.JsonCreator
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * タスク情報一覧
 * @param value 
 */
data class Tasks @JsonCreator constructor (

    @get:NotNull 
    @JsonProperty("value") val value: kotlin.collections.List<Task>
) {

}

