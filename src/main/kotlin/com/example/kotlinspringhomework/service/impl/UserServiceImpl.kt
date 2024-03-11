package com.example.kotlinspringhomework.service.impl

import com.example.kotlinspringhomework.database.dao.UserDao
import com.example.kotlinspringhomework.model.request.UserRequest
import com.example.kotlinspringhomework.model.response.UserResponse
import com.example.kotlinspringhomework.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userDao: UserDao
) : UserService {
    override fun list(): List<UserResponse> {
        val users = userDao.findAll()
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): UserResponse {
        TODO("Not yet implemented")
    }

    override fun create(request: UserRequest): UserResponse {
        TODO("Not yet implemented")
    }

    override fun update(id: Long, request: UserRequest): UserResponse {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }
}