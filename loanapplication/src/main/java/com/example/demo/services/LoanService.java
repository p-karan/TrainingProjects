package com.example.demo.services;

import com.example.demo.entity.Loan;
import com.example.demo.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    @Autowired
    private MyRepository repo;


    public List<Loan> findLoanByType(String type){
        return this.repo.findLoanByLoanType(type);
    }

    public List<Loan> findLoanByStatus(String status){
        return this.repo.findLoanByStatus(status);
    }

    public Loan findLoanById(int id){
        Loan result1=null;
        Optional<Loan> result=repo.findById(id);
        if(result.isPresent())
        result1=result.get();
        return result1;
    }
}
