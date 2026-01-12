package org.annotationsdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("emp2")
@Primary
public class Emp2 implements Company {

	public void empDetails() {
		System.out.println("Hii I am Employee from Emp2 Class");
	}

}
