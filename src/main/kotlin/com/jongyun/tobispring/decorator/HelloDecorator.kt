package com.jongyun.tobispring.decorator

import com.jongyun.tobispring.service.HelloService
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Primary
@Service
class HelloDecorator(private val helloService: HelloService) : HelloService {
    override fun hello(name: String): String {
        return "* ${helloService.hello(name)} *"
    }
}