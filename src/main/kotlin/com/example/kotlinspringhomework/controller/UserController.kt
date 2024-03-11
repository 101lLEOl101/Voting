package com.example.kotlinspringhomework.controller

import com.example.kotlinspringhomework.model.message.DeletedMessage
import com.example.kotlinspringhomework.model.request.UserRequest
import com.example.kotlinspringhomework.model.response.UserResponse

interface UserController {
    fun list(): List<UserResponse>
    fun getById(id: Long): UserResponse
    fun create(request: UserRequest): UserResponse
    fun update(id: Long, request: UserRequest): UserResponse
    fun delete(id: Long) : DeletedMessage
}