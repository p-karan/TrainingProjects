package com.example.demo.repo;

import com.example.demo.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MyRepository extends JpaRepository<Loan,Integer> {
    public List<Loan> findLoanByLoanType(String loanType);
    public List<Loan> findLoanByStatus(String status);
}
