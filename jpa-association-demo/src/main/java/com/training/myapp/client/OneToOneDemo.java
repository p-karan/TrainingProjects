package com.training.myapp.client;

import com.training.myapp.model.Person;
import com.training.myapp.model.Vehicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneDemo {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();

        /*Vehicle vehicle = new Vehicle(4,"Honda_Activa_I");
        Person person = new Person(102,"Jane Doe",vehicle);
        tx.begin();
        entityManager.persist(person);
        tx.commit();
*/
        Person person1 = entityManager.find(Person.class,101);
        System.out.println(person1.getPersonId());
        System.out.println(person1.getPersonName());
        System.out.println(person1.getVehicle());

/*
        tx.begin();
        Person person2 = entityManager.find(Person.class,102);
        entityManager.remove(person2);
        tx.commit();
*/


        entityManager.close();
        factory.close();

    }
}
