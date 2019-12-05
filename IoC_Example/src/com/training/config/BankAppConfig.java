package com.training.config;


import com.training.beans.Bank;
import com.training.beans.BankAccount;
import com.training.beans.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class BankAppConfig {

        @Bean
        public Customer karan(){
            return new Customer(101,"Karan");
        }

        @Bean
        public List<BankAccount> karan_accounts() {
            BankAccount b1 = new BankAccount(10001, "Savings");
            BankAccount b2 = new BankAccount(10002, "Current");
            //List<BankAccount> karanAccounts = (List<BankAccount>) new BankAccount();
            List<BankAccount> karanAccounts1 = new ArrayList<BankAccount>();
            karanAccounts1.add(b1);
            karanAccounts1.add(b2);

            return karanAccounts1;
        }

    @Bean
    public Customer komal(){
        return new Customer(102,"Komal");
    }

    @Bean
    public List<BankAccount> komal_accounts() {
        BankAccount b1 = new BankAccount(20001, "Savings");
        BankAccount b2 = new BankAccount(20002, "Current");
       // List<BankAccount> komalAccounts = (List<BankAccount>) new BankAccount();
        List<BankAccount> komalAccounts1 = new ArrayList<BankAccount>();
        komalAccounts1.add(b1);
        komalAccounts1.add(b2);

        return komalAccounts1;
    }

        @Bean
        public Bank hdfc(){
            Bank hdfc=new Bank();
            hdfc.setMap(komal(),komal_accounts());
            return hdfc;
        }

    }
