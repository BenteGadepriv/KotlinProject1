package com.example.kotlinintroproject1

const val GLOBAL_TAG = "global tag"

class User(val firstName: String, val lastName: String, val age: Int){
    private val USER_TAG = "user tag"

    fun printTag() = println(USER_TAG)
}