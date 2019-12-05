package com.training.myapp.client;

import com.training.myapp.model.Course;
import com.training.myapp.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class MantToOneDemo {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Course java = new Course();
        java.setCourseId(101);
        java.setCourseName("JAVA");
        java.setCourseFees(12000);

        Course python = new Course();
        python.setCourseId(102);
        python.setCourseName("PYTHON");
        python.setCourseFees(15000);

        Student john = new Student();
        john.setStudentId(1);
        john.setStudentName("John Doe");

        java.setStudent(john);
        python.setStudent(john);

        List<Course> courses = Arrays.asList(java,python);
        john.setCourses(courses);

        /*entityManager.persist(john);
        entityManager.persist(java);
        entityManager.persist(python);
        tx.commit();
*/
        System.out.println("=========Student Details==========");
        Student student = entityManager.find(Student.class,1);
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());

        List<Course> courses1=student.getCourses();
        for (Course course:courses1)
            System.out.println(course.getCourseId()+" - "+course.getCourseName()+" - "+course.getCourseFees());

        System.out.println("=========Course Details==========");
        Course course = entityManager.find(Course.class,101);
        System.out.println(course.getCourseId()+" - "+course.getCourseName()+" - "+course.getCourseFees());

        Student student1 =course.getStudent();
        System.out.println(student1.getStudentId()+" - "+ student1.getStudentName());

        entityManager.close();
        factory.close();
    }
}
