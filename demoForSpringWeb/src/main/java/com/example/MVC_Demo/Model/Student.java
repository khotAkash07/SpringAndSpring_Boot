package com.example.MVC_Demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
;


@Entity
public class Student {

    @Id
    private int id;
    private String name;
    private int marks;

   public Student(){

   }
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }


}
