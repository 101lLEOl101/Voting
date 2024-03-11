package com.example.kotlinspringhomework.model.response

import java.time.LocalDate

class UserResponse(
    override val id: Long,
    override val createdAt: LocalDate,
    val name: String,
    val email: String
) : EntityResponse {
}