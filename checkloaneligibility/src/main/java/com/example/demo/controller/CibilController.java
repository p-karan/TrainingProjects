package com.example.demo.controller;


import com.example.demo.entity.CibilScore;
import com.example.demo.service.CibilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(value="*")
public class CibilController {
    @Autowired
    private CibilService service;
    @GetMapping(value="/cibilScore/{panNumber}")
    public CibilScore findCibilScore(@PathVariable("panNumber") String panCardNumber){
        return this.service.findScoredByPanCard(panCardNumber);
    }

    @PostMapping(value = "/cibilScore", produces="application/json",consumes="application/json")
    public CibilScore addPlayer( @RequestBody CibilScore cibilScore){
        return  this.service.addCibilScore(cibilScore);
    }
}
