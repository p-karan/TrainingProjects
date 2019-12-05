package com.training.myapp.model;

import javax.persistence.*;

@Entity
@Table(name = "Courses")
public class Course {

    @Id
    @Column(name = "course_Id")
    private int courseId;

    @Column(name = "course_Name")
    private String courseName;
    @Column(name = "course_Fees")
    private int courseFees;

    /*MantToOne - Its use when we have by directional relationship. Both class exists without each other
    * In this case 2 tables get created. 1 - Course, 2-Student. Student info wrt to course is maintained in
    * course table as student_id.
    * In one to Many association default fetch type is LAZY, we can make it EAGER by fetch = FetchType.LAZY.
     */
    @ManyToOne
    @JoinColumn(name = "student_Id")
    private Student student;

    public Course() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(int courseFees) {
        this.courseFees = courseFees;
    }
}
