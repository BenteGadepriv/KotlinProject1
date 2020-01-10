package com.example.kotlinintroproject1

class User internal constructor(name: String, names: MutableList<String>) {

    init {
        names.add(name)
    }

    val lengthOfnames = names.size

    init {
        println("Length of names $lengthOfnames")
    }
}



