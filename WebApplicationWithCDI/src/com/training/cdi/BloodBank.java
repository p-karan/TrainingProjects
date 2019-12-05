package com.training.cdi;

import javax.enterprise.context.ApplicationScoped;

@QualifiedBank(type=BankType.BloodBank)
@ApplicationScoped
public class BloodBank implements Bank {
    @Override
    public String[] topDonors() {
        return new String[]{"Kishore","Amit","Ashish"};
    }
}
