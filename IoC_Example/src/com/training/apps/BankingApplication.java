package com.training.apps;

import com.training.beans.Bank;
import com.training.config.BankAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BankingApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BankAppConfig.class);
        Bank hdfc=ctx.getBean(Bank.class);

        System.out.println(hdfc.getMap());


/*        List<Patient> patientList=ramesh.getPatient();
        patientList.forEach(System.out::println);*/

    }

}
