package com.example.kotlinspringhomework.model

import org.apache.logging.log4j.message.StringFormattedMessage
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

interface ApiRespomse {
    val status: HttpStatus
    val message: String

    fun asResponse() = ResponseEntity.status(status).body(this)
}