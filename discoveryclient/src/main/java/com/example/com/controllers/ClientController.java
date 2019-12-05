package com.example.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate template;

    @Autowired
    private HttpEntity<String> entity;

    @GetMapping("/score/{pan}")
    public String getCibilScore(@PathVariable("pan") String pan){
        String url="http://CHECK-LOAN-ELIGIBILITY/cibilScore/"+pan;
        String resp=template.exchange(url, HttpMethod.GET,entity,String.class).getBody();
        return resp;
    }
    @GetMapping("status/{status}")
    public String getLoanByStatus(@PathVariable("status") String status){
        String url="http://CHECK-LOAN-AVAILABILITY/loan/status/"+status;
        String resp=template.exchange(url, HttpMethod.GET,entity,String.class).getBody();
        return resp;
    }

    @GetMapping("type/{type}")
    public String getLoanByType(@PathVariable("type") String type){
        String url="http://CHECK-LOAN-AVAILABILITY/loan/type/"+type;
        String resp=template.exchange(url, HttpMethod.GET,entity,String.class).getBody();
        return resp;
    }

    @GetMapping("/{id}")
    public String getLoanById(@PathVariable("id") int id){
        String url="http://CHECK-LOAN-AVAILABILITY/loan/"+id;
        String resp=template.exchange(url, HttpMethod.GET,entity,String.class).getBody();
        return resp;
    }



}
