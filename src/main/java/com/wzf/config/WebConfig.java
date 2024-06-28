package com.wzf.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@SpringBootConfiguration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

//        WebMvcConfigurer.super.addCorsMappings(registry);
        //设置所有请求方法都允许跨域
        registry.addMapping("/**").allowCredentials(true)
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("POST","GET","PUT","DELETE")
                .allowedHeaders("*")
                .maxAge(1800);
    }
}
