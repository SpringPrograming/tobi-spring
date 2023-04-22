package com.jongyun.tobispring.service

interface HelloService {
    fun hello(name: String): String
}

class SimpleHelloService : HelloService {

    override fun hello(name: String): String {
        return "Hello, ${name}!"
    }
}