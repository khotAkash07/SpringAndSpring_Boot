package com.BeanLifeXml;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	
	public void befordestroy() {
		System.out.println("This is Before Destroy Method");
	}
	
	public Employee() {
		System.out.println("This is Constructor");
	}
	
	public void utilityMethod() {
		System.out.println("This is Utility");		
	}
	
	public void afterConstructor() {
		System.out.println("This is After Constructor");		
	}
}
