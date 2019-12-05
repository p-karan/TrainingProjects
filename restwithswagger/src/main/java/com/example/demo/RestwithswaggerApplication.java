package com.example.demo;

import com.example.demo.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude= SecurityAutoConfiguration.class)
@EnableSwagger2
@EnableWebSecurity
public class RestwithswaggerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx=SpringApplication.run(RestwithswaggerApplication.class, args);
        Book hfj=ctx.getBean(Book.class);
        //log.info(hfj.toString());

    }

    @Bean
    public Book headFirstJava(){
        return new Book(101,"Head First Java");
    }

}
