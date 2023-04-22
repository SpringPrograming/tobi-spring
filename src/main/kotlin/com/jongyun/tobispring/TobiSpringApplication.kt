package com.jongyun.tobispring

import com.jongyun.tobispring.controller.HelloController
import com.jongyun.tobispring.service.SimpleHelloService
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.context.support.registerBean
import org.springframework.web.context.support.GenericWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet

fun main(args: Array<String>) {
    val applicationContext = object : GenericWebApplicationContext() {
        override fun onRefresh() {
            super.onRefresh()
            val serverFactory = TomcatServletWebServerFactory(8080)
            val webServer = serverFactory.getWebServer({ servletContext ->
                servletContext.addServlet("dispatcherServlet", DispatcherServlet(this))
                    .addMapping("/*")
            })

            webServer.start()
        }
    }
    applicationContext.registerBean<HelloController>()
    applicationContext.registerBean<SimpleHelloService>()

    applicationContext.refresh()


}
