package com.example.kotlinspringhomework.controller.impl

import com.example.kotlinspringhomework.controller.UserController
import com.example.kotlinspringhomework.model.message.DeletedMessage
import com.example.kotlinspringhomework.model.request.UserRequest
import com.example.kotlinspringhomework.model.response.UserResponse
import com.example.kotlinspringhomework.service.UserService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserControllerImpl(
    private val service: UserService
) : UserController {
    @GetMapping
    override fun list() = service.list()

    @GetMapping("/{id}")
    override fun getById(@PathVariable id: Long) = service.getById(id)

    @PostMapping
    override fun create(@RequestBody request: UserRequest) = service.create(request)

    @PutMapping("/{id}")
    override fun update(@PathVariable id: Long, @RequestBody request: UserRequest) = service.update(id, request)

    @DeleteMapping("/{id}")
    override fun delete(@PathVariable id: Long): DeletedMessage{
        service.delete(id)
        return DeletedMessage()
    }
}