package com.training.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class Bank {
/*    @Autowired
    private List<Customer> customerList;
    @Autowired
    private List<BankAccount> bankAccountList;*/
    @Autowired
    Map<Customer, List<BankAccount>> map;

    public Bank() {
    }

    public Map<Customer, List<BankAccount>> getMap() {
        return map;
    }

    public void setMap(Map<Customer, List<BankAccount>> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "map=" + map +
                '}';
    }

    public void setMap(Customer komal, List<BankAccount> komal_accounts) {
    }
}
