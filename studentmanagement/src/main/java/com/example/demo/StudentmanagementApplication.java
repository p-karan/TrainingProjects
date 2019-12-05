package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication(exclude= SecurityAutoConfiguration.class)
@EnableWebSecurity
@EnableDiscoveryClient
@EnableGlobalMethodSecurity(securedEnabled = true)
public class StudentmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentmanagementApplication.class, args);
    }

}
