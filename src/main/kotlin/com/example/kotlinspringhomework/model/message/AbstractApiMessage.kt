package com.example.kotlinspringhomework.model.message

import com.example.kotlinspringhomework.model.ApiRespomse
import org.springframework.http.HttpStatus

abstract class AbstractApiMessage : ApiRespomse {
    override val status: HttpStatus = HttpStatus.OK
}