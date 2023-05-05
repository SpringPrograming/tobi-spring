package com.jongyun.configuration

import com.jongyun.configuration.autoconfig.DispatcherServletConfig
import com.jongyun.configuration.autoconfig.JettyWebServerConfig
import com.jongyun.configuration.autoconfig.TomcatWebServerConfig
import org.springframework.context.annotation.DeferredImportSelector
import org.springframework.core.type.AnnotationMetadata

class MyAutoConfigImportSelector : DeferredImportSelector {
    override fun selectImports(importingClassMetadata: AnnotationMetadata): Array<String> {
        return arrayOf(
            TomcatWebServerConfig::class.java.name,
            JettyWebServerConfig::class.java.name,
            DispatcherServletConfig::class.java.name
        )
    }
}
