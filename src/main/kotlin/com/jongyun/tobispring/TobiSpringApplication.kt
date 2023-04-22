package com.jongyun.tobispring

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet

@Configuration
@ComponentScan
class TobiSpringApplication

fun main(args: Array<String>) {
    val applicationContext = AnnotationConfigWebApplicationContext()

    val serverFactory = TomcatServletWebServerFactory(8080)
    val webServer = serverFactory.getWebServer({ servletContext ->
        servletContext.addServlet("dispatcherServlet", DispatcherServlet(applicationContext))
            .addMapping("/*")
    })

    applicationContext.register(TobiSpringApplication::class.java)
    applicationContext.refresh()
    webServer.start()
}
