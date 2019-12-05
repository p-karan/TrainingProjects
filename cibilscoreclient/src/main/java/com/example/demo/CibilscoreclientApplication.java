package com.example.demo;

import com.example.demo.client.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.sax.SAXSource;

@SpringBootApplication

public class CibilscoreclientApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext ctx=SpringApplication.run(CibilscoreclientApplication.class, args);
        Application app=ctx.getBean(Application.class);
        System.out.println(app.getScore());
    }

}
