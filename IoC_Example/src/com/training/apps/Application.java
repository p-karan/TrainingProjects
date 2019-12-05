package com.training.apps;


import com.training.beans.Hospital;
import com.training.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
//        BeanFactory ctx2=new AnnotationConfigApplicationContext(AppConfig.class);

        //Accessing bean by type
       // Hospital hosp=ctx.getBean(Hospital.class);

        //Get a bean of type Hospital.class with a Id leelavati
        Hospital hosp=ctx.getBean("leelavati",Hospital.class);
        System.out.println(hosp);
        //Accessing bean by id
        Hospital srleela = (Hospital) ctx.getBean("leelavati");
        System.out.println(srleela);
        //Spring beans are singleton by default
        System.out.println(ctx.isSingleton("leelavati"));
        System.out.println(ctx.isPrototype("leelavati"));

        System.out.println(hosp.hashCode());
        System.out.println(srleela.hashCode());
        ctx.close();
    }

}
