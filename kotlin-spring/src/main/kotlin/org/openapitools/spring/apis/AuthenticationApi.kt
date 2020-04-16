package org.openapitools.spring.apis

import org.openapitools.spring.models.AuthPostParameter
import org.openapitools.spring.models.Error
import org.openapitools.spring.models.Token
import org.openapitools.spring.models.TokenRefreshPostParameter
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
class AuthenticationApiController() {


    @RequestMapping(
        value = ["/api/v1/login"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun apiV1LoginPost( @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @Valid @RequestBody authPostParameter: AuthPostParameter
): ResponseEntity<Token> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/api/v1/logout"],
        produces = ["application/json"], 
        method = [RequestMethod.POST])
    fun apiV1LogoutPost( @RequestHeader(value="Authorization", required=true) authorization: kotlin.String
, @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/api/v1/signup"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun apiV1SignupPost( @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @Valid @RequestBody authPostParameter: AuthPostParameter
): ResponseEntity<Token> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/api/v1/token/refresh"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun apiV1TokenRefreshPost( @RequestHeader(value="X-OS-TYPE", required=true) xminusOSMinusTYPE: kotlin.String
, @RequestHeader(value="X-APP-VERSION", required=true) xminusAPPMinusVERSION: kotlin.String
, @Valid @RequestBody tokenRefreshPostParameter: TokenRefreshPostParameter
): ResponseEntity<Token> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
