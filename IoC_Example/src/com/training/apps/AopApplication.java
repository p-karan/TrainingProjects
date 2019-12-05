package com.training.apps;

import com.training.config.AopConfig;
import com.training.ifaces.Payment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AopConfig.class);
        Payment mypayment = ctx.getBean(Payment.class);
        System.out.println(mypayment.getClass());
        System.out.println(mypayment.cardPayment("amex",2033.56));
    }
}
