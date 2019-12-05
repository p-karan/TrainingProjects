package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name="JPSTUDENT")
public class Student {
    @Id
    private int studentId;
    private String studentName;
    private String dept;
}
