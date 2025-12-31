package com.example.MVC_Demo.controllers;


import com.example.MVC_Demo.Model.Student;
import com.example.MVC_Demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService stud;

    @GetMapping("/getStudents")
    public List<Student> studName(){
        return stud.getStudents();
    }

    @PostMapping("/addStud")
    public void addStudent(@RequestBody Student student){
        stud.addStudent(student);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable int id){
        return  stud.getStudentById(id);
    }



    @PutMapping("/updateStudent")
    public void studUpdate(@RequestBody Student student){
        stud.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void delStudent(@PathVariable int id){
        stud.deleteStudent(id);
    }

}
