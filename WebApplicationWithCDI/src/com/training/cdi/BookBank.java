package com.training.cdi;

import javax.enterprise.context.ApplicationScoped;

@QualifiedBank(type=BankType.BookBank)
@ApplicationScoped
public class BookBank implements Bank {
    @Override
    public String[] topDonors() {
        return new String[]{"Ramesh","Swapnil","Sushil"};
    }
}
