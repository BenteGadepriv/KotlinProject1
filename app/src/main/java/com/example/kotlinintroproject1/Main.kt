package com.example.kotlinintroproject1


fun main(args: Array<String>) {
    val user = User("Max", "Mustermann", 55).apply {
        address = "Musterstraße 1"
        println("$firstName $lastName, $age, $address")
    }
}