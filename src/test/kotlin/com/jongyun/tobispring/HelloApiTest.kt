package com.jongyun.tobispring

import org.junit.jupiter.api.Test
import org.springframework.boot.test.web.client.TestRestTemplate

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Test
annotation class UnitTest

class HelloApiTest {

    @UnitTest
    fun helloApi() {
        val rest = TestRestTemplate()
        val name = "Spring"
        val response = rest.getForEntity("http://localhost:8080/hello?name=$name", String::class.java)
        println(response)

        check(response.body == "* Hello, $name! *")
        check(response.statusCode.value() == 200)
        check(response.headers.contentType.toString().startsWith("text/plain"))
    }
}
