package com.example.demo.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="JPEMPLOYEE")
public class Employee {

    @Id
    private int empId;
    private String empName;

}
