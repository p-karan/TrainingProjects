package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(value="*")
public class StudentController {

    private StudentServices services;


    @Autowired
    public void setServices(StudentServices services) {
        this.services = services;
    }

    @GetMapping(value="/students")
    public List<Student> getAllStudents(){
        return this.services.findAllStudents();
    }

    @PostMapping(value="/students",produces = "application/json",consumes = "application/json")
    public Student addStudent(@RequestBody Student student){
        return this.services.addStudent(student);
    }

    @PutMapping(value="/students")
    public Student updateStudent(@RequestBody Student student){
        return this.services.updateStudent(student);
    }

    @DeleteMapping(value="/students/{id}")
    public String deleteStudent(@PathVariable(name="id") int studentId){
        return this.services.deleteStudent(studentId);
    }

}
