package com.example.kotlinspringhomework.database.dao

import com.example.kotlinspringhomework.database.entity.AbstractEntity
import org.springframework.data.repository.CrudRepository

interface CommonDao<T : AbstractEntity> : CrudRepository<T, Long>{
}