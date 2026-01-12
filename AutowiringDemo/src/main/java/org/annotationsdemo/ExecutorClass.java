package org.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ec")
public class ExecutorClass {
	
	Company comp;
	
	@Autowired
	public void setComp(Company comp) {
		this.comp = comp;
	}
	
	public void getEmp() {
		comp.empDetails();
	}
}
