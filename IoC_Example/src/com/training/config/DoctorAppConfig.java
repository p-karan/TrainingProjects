package com.training.config;


import com.training.beans.Address;
import com.training.beans.Doctor;
import com.training.beans.Patient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.print.Doc;

@Configuration
public class DoctorAppConfig {

    @Bean
    public Address address(){
        return new Address("Liberty Garden","Malad","Mumbai",400064);
    }

    @Bean
    public Doctor ramesh(){
        Doctor ramesh=new Doctor();
        ramesh.setDoctorId(104040);
        ramesh.setDoctorName("Ramesh");

        //Using Bean references
        ramesh.setAddress(address());
        ramesh.setSpecialization("ENT");

        return ramesh;
    }
    @Bean
    public Patient suresh(){
        return new Patient(1010,"Suresh");
    }

    @Bean
    public Patient sumesh(){
        return new Patient(2010,"Sumesh");
    }
    @Bean
    public Patient sugesh(){
        return new Patient(3010,"Sugesh");
    }

}
