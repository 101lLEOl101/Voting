package com.example.kotlinspringhomework.model.response

import java.time.LocalDate

interface EntityResponse{
    val id: Long
    val createdAt: LocalDate
}