package org.akash.entity;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("e")
public class Employee {
	
	public Employee() {
		System.out.println("This is Employee Class");
	}
	
	public void showMsg() {
		System.out.println("utility Method");
	}
	
	@PostConstruct
	public void printMsg() {
		System.out.println("After Constructor-Bean Initializer");
	}
	
	@PreDestroy
	public void printMsg2() {
		System.out.println("Before Destroy Bean");
	}
	
}
