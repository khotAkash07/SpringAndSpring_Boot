package org.akash;

public class Company {
	private Employee emp;
	
	public void setEmployee(Employee emp) {
		this.emp = emp;
	}
	
	public void show() {
		System.out.println("Id : "+emp.getId());
		System.out.println("Name : "+emp.getName());
		System.out.println("Salary : "+emp.getSal());
	}
}
