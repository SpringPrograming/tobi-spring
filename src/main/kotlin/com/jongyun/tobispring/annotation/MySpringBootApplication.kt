package com.jongyun.tobispring.annotation

import com.jongyun.configuration.EnableMyAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@ComponentScan
@Configuration
@EnableMyAutoConfiguration
annotation class MySpringBootApplication
