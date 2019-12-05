package com.training.apps;

import com.training.beans.Doctor;
import com.training.beans.Patient;
import com.training.config.DoctorAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class DoctorApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(DoctorAppConfig.class);
        Doctor ramesh=ctx.getBean(Doctor.class);

        System.out.println(ramesh.getDoctorName());
        System.out.println(ramesh.getPatient());

        List<Patient> patientList=ramesh.getPatient();
        patientList.forEach(System.out::println);

    }
}
