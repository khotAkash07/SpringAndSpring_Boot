package com.akash.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("col")
public class College {
	
	
	Student stud;
	@Autowired
	public void setStud(Student stud) {
		this.stud = stud;
	}
//	@Lookup
//	public Student getStud() {
//		return null;
//	}
	
	public void generate() {
		//Student stud = this.getStud();
		System.out.println("Hashcode of cm "+System.identityHashCode(stud));
	}
}
