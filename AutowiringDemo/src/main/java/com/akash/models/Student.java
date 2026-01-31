package com.akash.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	public Student() {
		System.out.println("This is Student Constructor");
	}
}
