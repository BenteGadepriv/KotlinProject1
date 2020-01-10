package com.example.kotlinintroproject1

class User(val firstName: String, val lastName: String, var _age: Int){
    val age
        get() = _age
}