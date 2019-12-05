package com.example.demo.services;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private StudentRepository repo;


    public List<Student> findAllStudents(){
        return this.repo.findAll();
    }

    @Secured("ROLE_PROF")
    public Student addStudent(Student student){
        return this.repo.save(student);
    }

    @Secured("ROLE_PROF")
    public Student updateStudent(Student student){
        return this.repo.save(student);
    }

    @Secured("ROLE_PROF")
    public String deleteStudent(int id){
        String message="";
        this.repo.deleteById(id);
        Boolean isDeleted=this.repo.existsById(id);
        if(isDeleted){
            message="Student with id "+id+" has NOT been deleted";
        }else {
            message = "Student with id " + id + " has been deleted";
        }
        return message;
    }
}
