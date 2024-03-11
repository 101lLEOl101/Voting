package com.example.kotlinspringhomework.service

import com.example.kotlinspringhomework.model.request.UserRequest
import com.example.kotlinspringhomework.model.response.UserResponse

interface UserService {
    fun list(): List<UserResponse>
    fun getById(id: Long): UserResponse
    fun create(request: UserRequest): UserResponse
    fun update(id: Long, request: UserRequest): UserResponse
    fun delete(id: Long)
}