package org.openapitools.spring.apis

import org.openapitools.spring.models.Error
import org.openapitools.spring.models.Task
import org.openapitools.spring.models.TaskDonePutParameter
import org.openapitools.spring.models.TaskPostAndPutParameter
import org.openapitools.spring.models.Tasks
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class TaskApiController() {


    @RequestMapping(
        value = ["/api/v1/tasks"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun apiV1TasksGet( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
): ResponseEntity<Tasks> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/api/v1/tasks"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun apiV1TasksPost( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @Valid @RequestBody taskPostAndPutParameter: TaskPostAndPutParameter?
): ResponseEntity<Task> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/api/v1/tasks/{taskId}"],
        produces = ["application/json"], 
        method = [RequestMethod.DELETE])
    fun apiV1TasksTaskIdDelete( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @PathVariable("taskId") taskId: kotlin.String
): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/api/v1/tasks/{taskId}/done"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.PUT])
    fun apiV1TasksTaskIdDonePut( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @PathVariable("taskId") taskId: kotlin.String
, @Valid @RequestBody taskDonePutParameter: TaskDonePutParameter?
): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/api/v1/tasks/{taskId}"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.PUT])
    fun apiV1TasksTaskIdPut( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @PathVariable("taskId") taskId: kotlin.String
, @Valid @RequestBody taskPostAndPutParameter: TaskPostAndPutParameter?
): ResponseEntity<Task> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
