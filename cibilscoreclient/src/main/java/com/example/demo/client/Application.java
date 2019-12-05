package com.example.demo.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class Application {


    @Autowired
    private RestTemplate template;

    @Autowired
    private HttpEntity<String> entity;

    public String getScore(){
        String response=
                template.exchange("http://localhost:3030/cibilScore/ANNPP6755F", HttpMethod.GET,entity,String.class).getBody();
        log.info(response);
        return response;
    }


}
