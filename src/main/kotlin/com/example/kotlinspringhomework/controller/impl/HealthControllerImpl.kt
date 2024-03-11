package com.example.kotlinspringhomework.controller.impl

import com.example.kotlinspringhomework.controller.HealthController
import com.example.kotlinspringhomework.model.message.HealthMessage
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthControllerImpl : HealthController {
    @GetMapping("/health")
    override fun health(): HealthMessage = HealthMessage()
}