package com.jongyun.configuration

import org.springframework.context.annotation.Import

@Import(MyAutoConfigImportSelector::class)
annotation class EnableMyAutoConfiguration
