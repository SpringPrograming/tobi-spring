package com.jongyun.tobispring

import com.jongyun.tobispring.annotation.MySpringBootApplication
import org.springframework.boot.SpringApplication

@MySpringBootApplication
class TobiSpringApplication

fun main(args: Array<String>) {
    SpringApplication.run(TobiSpringApplication::class.java, *args)
}
