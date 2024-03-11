package com.example.kotlinspringhomework.database.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class User(
    @Column(nullable = false, length = 256)
    var name:String,

    @Column(nullable = false, length = 256)
    var email: String

) : AbstractEntity() {

}