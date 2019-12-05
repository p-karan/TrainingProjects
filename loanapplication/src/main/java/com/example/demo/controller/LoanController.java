package com.example.demo.controller;

import com.example.demo.entity.Loan;
import com.example.demo.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
public class LoanController {
    @Autowired
    private LoanService service;


    @GetMapping(value="/loan/status/{status}")
    public List<Loan> findLoanByStatus(@PathVariable("status") String status){
        return this.service.findLoanByStatus(status);
    }

    @GetMapping(value="/loan/type/{type}")
    public List<Loan> findLoanByType(@PathVariable("type") String type){
        return this.service.findLoanByType(type);
    }

    @GetMapping(value="/loan/{id}")
    public Loan findLoanById(@PathVariable("id") int id){
        return this.service.findLoanById(id);
    }

}
