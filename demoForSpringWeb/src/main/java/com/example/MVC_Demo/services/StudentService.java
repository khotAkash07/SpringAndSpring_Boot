package com.example.MVC_Demo.services;

import com.example.MVC_Demo.Model.Student;
import com.example.MVC_Demo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    @Autowired
    StudentRepo studRepo;

//    List<Student> stud = Arrays.asList(
//            new Student(101,"Akash",89),
//            new Student(102,"Akash2",84),
//            new Student(103,"Akash3",85),
//            new Student(104,"Akash4",86)
//
//    );

    public List<Student> getStudents(){
        return studRepo.findAll();
    }

    public void addStudent(Student student){
        studRepo.save(student);
    }

    public Student getStudentById(int id) {
        return studRepo.findById(id).orElse(new Student());
    }

    public void updateStudent(Student student){
        studRepo.save(student);
    }


    public void deleteStudent(int id) {
        studRepo.deleteById(id);
    }
}
