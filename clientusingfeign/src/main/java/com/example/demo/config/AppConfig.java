package com.example.demo.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.cloud.openfeign.encoding.BaseRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;


@Configuration
public class AppConfig {

    @Bean
    public RequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("india","india");
    }
}
