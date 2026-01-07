package org.annotationsdemo;

import org.springframework.stereotype.Component;

@Component("emp1")
//@Primary
public class Employee  implements Company {

	@Override
	public void empDetails() {
		System.out.println("Hii I am Employee from Emp1 Class");
	}

}
