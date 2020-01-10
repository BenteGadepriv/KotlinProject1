package com.example.kotlinintroproject1

class User(val firstName: String, val lastName: String){
    var fullName = "$firstName $lastName"
        set(value) {
            field = value
        }
}