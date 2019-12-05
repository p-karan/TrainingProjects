package com.training.config;


import com.training.beans.Hospital;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    //Spring beans are singleton by default
    //can make it prototype by adding @Scope Annotation
    //@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //Spring beans are created eagerly by default and we can make it lazy by adding @Lazy
    //Using setter dependency injection
    @Lazy
    public Hospital leelavati(){
        Hospital leela=new Hospital();
        leela.setHospitalCode(1020);
        leela.setHospitalName("Leelavati Hospital");
        leela.setMobileNumber(9122543210l);

        return leela;
    }

    //Using constructor dependency injection
    @Bean
    public Hospital apollo(){
        return new Hospital(10404,"Apollo Hospital",9873451267l);
    }

}
