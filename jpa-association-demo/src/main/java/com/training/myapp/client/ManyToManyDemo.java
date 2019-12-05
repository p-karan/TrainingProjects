package com.training.myapp.client;

import com.training.myapp.model.Customer;
import com.training.myapp.model.Vendor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class ManyToManyDemo {
    public static void main(String[] args) {
        Customer c1= new Customer();
        c1.setCustomerName("JPMC");
        c1.setCustomerAddress("Mumbai");

        Customer c2= new Customer();
        c2.setCustomerName("Oracle");
        c2.setCustomerAddress("Banglore");

        Vendor v1=new Vendor();
        v1.setVendorName("Pragati");
        v1.setVendorAddress("Mumbai");

        Vendor v2=new Vendor();
        v2.setVendorName("Vinsys");
        v2.setVendorAddress("Pune");

        List<Vendor> vendors= Arrays.asList(v1,v2);
        c1.setVendors(vendors);
        c2.setVendors(vendors);

        List<Customer> customers= Arrays.asList(c1,c2);
        v1.setCustomers(customers);
        v2.setCustomers(customers);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        entityManager.persist(c1);
        entityManager.persist(c2);
        entityManager.persist(v1);
        entityManager.persist(v2);

        tx.commit();
        entityManager.close();
        factory.close();

    }
}
