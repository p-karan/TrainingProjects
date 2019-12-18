package com.example.demo.controller;


import com.example.demo.entity.LoanCustomer;
import com.example.demo.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(value="*")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService service;

    @Autowired
    private Environment env;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @PostMapping(value="/customer", produces = "application/json", consumes = "application/json")
    public LoanCustomer addCustomer(@RequestBody LoanCustomer customer){
        return this.service.addCustomer(customer);
    }

    @GetMapping("/port")
    public String getPort(){
        String portNumber=env.getProperty("local.server.port");
        return portNumber+instanceId;
    }

    @GetMapping(value = "/customer/{id}")
    public Optional<LoanCustomer> findById(@PathVariable("id")long loanId){
        return this.service.findById(loanId);
    }

    @GetMapping("/customer")
    public Iterable<LoanCustomer> findAll(){
        return this.service.findAll();
    }

    @GetMapping("/customer/sort/{propName}")
    public Iterable<LoanCustomer> showSort(@PathVariable("propName") String propName){
        String portNumber=env.getProperty("local.server.port");
        log.info("Request Handled by application in" + portNumber);

        return this.service.sortBy(propName);
    }

    @GetMapping("/customer/paginate/{pageNo}/{size}/{propName}")
    public Page<LoanCustomer> paginate(@PathVariable("pageNo") int pageNo,
                                       @PathVariable("size") int size,
                                       @PathVariable("propName") String propName){
        return this.service.paginate(pageNo,size,propName);
    }

    @PutMapping(value="/customer", produces = "application/json", consumes = "application/json")
    public LoanCustomer updateCustomer(@RequestBody LoanCustomer loanCustomer){
        return this.service.updateCustomer(loanCustomer);
    }

    @DeleteMapping(value="/customer/{loanId}")
        public boolean deleteCustomerById(@PathVariable("loanId") long loanId){
        return this.service.deleteCustomerById(loanId);
    }

}
