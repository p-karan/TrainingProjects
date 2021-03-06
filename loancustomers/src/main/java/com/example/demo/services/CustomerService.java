package com.example.demo.services;


import com.example.demo.entity.LoanCustomer;
import com.example.demo.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repo;

    public Iterable<LoanCustomer> sortBy(String propName){
        Sort sort=Sort.by(propName);
        return this.repo.findAll(sort);
    }

    public Iterable<LoanCustomer> findAll(){
        return this.repo.findAll();
    }


    public LoanCustomer addCustomer(LoanCustomer customer){
        return this.repo.save(customer);
    }

    public Page<LoanCustomer> paginate(int pageNo,int size,String prop){
        Pageable pageRequest= PageRequest.of(pageNo,size,Sort.by(prop));
        Page<LoanCustomer> page=repo.findAll(pageRequest);
        List<LoanCustomer> custList=new ArrayList<>();
/*            if(page.hasContent()){
                custList=page.getContent();
            }
            return custList;*/

            return page;
    }

    public Optional<LoanCustomer> findById(long loanId){
        return this.repo.findById(loanId);
    }

    public LoanCustomer updateCustomer(LoanCustomer loanCustomer){
        return this.repo.save(loanCustomer);
    }

    /*public boolean deleteCustomer(LoanCustomer loanCustomer){
        boolean isPresent = true;
        this.repo.delete(loanCustomer);
        boolean isDeleted = this.repo.existsById(loanCustomer.getLoanId());
        if(!isDeleted){
            isPresent = false;
        }
        return isPresent;
    }*/

    public boolean deleteCustomerById(long loanId){
        boolean isPresent = true;
        this.repo.deleteById(loanId);
        boolean isDeleted = this.repo.existsById(loanId);
        if(!isDeleted){
            isPresent = false;
        }
        return isPresent;
    }
}
