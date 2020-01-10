package com.example.kotlinintroproject1


fun main(args: Array<String>) {
    val user = User("Max", "Mustermann", 55)
    println(user.age)
    user.age = 56
}