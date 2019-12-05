package com.training.myapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @Column(name = "student_Id")
    private int studentId;
    @Column(name = "student_Name")
    private String studentName;

    @OneToMany(mappedBy = "student")
    private List<Course> courses;

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
