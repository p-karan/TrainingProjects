package com.training.myapp.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "person_Id")
    private int personId;
    @Column(name = "person_Name")
    private String personName;
    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    /*Will use when we have one to one association between table. Table can exists independently where as in
    * case of embedded entity table can't exists independently. In this case 2 tables get created.
    * 1- Person, 2- Vehicle*/
    /*In one to One association default fetch type is EAGER, we can make it LAZY*/
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    public Person() {
    }

    public Person(int personId, String personName, Vehicle vehicle) {
        this.personId = personId;
        this.personName = personName;
        this.vehicle = vehicle;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
