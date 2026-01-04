package org.example;

import org.springframework.stereotype.Component;

@Component("b")
public class Bike implements Vehical{
	
	public void engine() {
		System.out.println("160 cc");
	}

}
