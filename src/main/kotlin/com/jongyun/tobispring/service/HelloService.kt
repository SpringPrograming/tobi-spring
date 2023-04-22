package com.jongyun.tobispring.service

import org.springframework.stereotype.Service

interface HelloService {
    fun hello(name: String): String
}

@Service
class SimpleHelloService : HelloService {

    override fun hello(name: String): String {
        return "Hello, $name!"
    }
}
