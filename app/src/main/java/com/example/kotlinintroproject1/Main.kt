package com.example.kotlinintroproject1


fun main(args: Array<String>) {
    val user = User("Max", "Mustermann", 55)
    user.printTag()
    println(GLOBAL_TAG)
}