package com.example.kotlinspringhomework.controller

import com.example.kotlinspringhomework.model.message.HealthMessage

interface HealthController {
    fun health(): HealthMessage
}