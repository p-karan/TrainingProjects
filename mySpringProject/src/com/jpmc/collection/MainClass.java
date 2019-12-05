package com.jpmc.collection;

import com.jpmc.aggcomp.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {
    public static void main(String[] args) {
        Resource r=new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        EmployeeClass s=(EmployeeClass) factory.getBean("ec1");
        s.showJobsOpenings();
    }
}
