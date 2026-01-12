package org.akash.service;

import java.util.Scanner;

import org.akash.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("es")
public class EmpService {
	
	Employee emp;
	Scanner sc = new Scanner(System.in);
	@Autowired
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public void showMsg2() {
		emp.showMsg();
	}
}
