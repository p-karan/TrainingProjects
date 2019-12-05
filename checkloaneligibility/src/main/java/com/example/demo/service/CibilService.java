package com.example.demo.service;

import com.example.demo.entity.CibilScore;
import com.example.demo.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CibilService {
    @Autowired
    private MyRepository repo;

    public CibilScore findScoredByPanCard(String panCardNumber){
        return this.repo.findCibilScoreByPanCardNumber(panCardNumber);
    }

    public CibilScore addCibilScore(CibilScore cibilScore){
        return this.repo.save(cibilScore);
    }


}
