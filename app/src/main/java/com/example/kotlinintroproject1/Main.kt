package com.example.kotlinintroproject1


fun main(args: Array<String>) {
    val user = User("Max", "Mustermann", 55)
    user.address = "Musterstraße 1"
    println("${user.firstName} ${user.lastName}, ${user.age}, ${user.address}")
}