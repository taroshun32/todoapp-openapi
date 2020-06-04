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
/** 実装クラスに持っていく
@RestController
@Validated
@RequestMapping("\${api.base-path:}")
*/
abstract class TaskApiBaseController() {
    /** 実装クラスに持っていく

    @RequestMapping(
        value = ["/api/v1/tasks"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    @ResponseStatus(HttpStatus.OK)
    */
    abstract fun apiV1TasksGet( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
): Tasks
    /** 実装クラスに持っていく

    @RequestMapping(
        value = ["/api/v1/tasks"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    @ResponseStatus(HttpStatus.OK)
    */
    abstract fun apiV1TasksPost( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @Valid @RequestBody taskPostAndPutParameter: TaskPostAndPutParameter?
): Task
    /** 実装クラスに持っていく

    @RequestMapping(
        value = ["/api/v1/tasks/{taskId}"],
        produces = ["application/json"], 
        method = [RequestMethod.DELETE])
    @ResponseStatus(HttpStatus.OK)
    */
    abstract fun apiV1TasksTaskIdDelete( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @PathVariable("taskId") taskId: kotlin.String
): HttpStatus
    /** 実装クラスに持っていく

    @RequestMapping(
        value = ["/api/v1/tasks/{taskId}/done"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.PUT])
    @ResponseStatus(HttpStatus.OK)
    */
    abstract fun apiV1TasksTaskIdDonePut( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @PathVariable("taskId") taskId: kotlin.String
, @Valid @RequestBody taskDonePutParameter: TaskDonePutParameter?
): HttpStatus
    /** 実装クラスに持っていく

    @RequestMapping(
        value = ["/api/v1/tasks/{taskId}"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.PUT])
    @ResponseStatus(HttpStatus.OK)
    */
    abstract fun apiV1TasksTaskIdPut( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @PathVariable("taskId") taskId: kotlin.String
, @Valid @RequestBody taskPostAndPutParameter: TaskPostAndPutParameter?
): Task
}
