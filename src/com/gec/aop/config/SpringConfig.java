package com.gec.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(
        basePackages = "com.gec.aop",
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class,ComponentScan.class, Service.class})
        }
)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
