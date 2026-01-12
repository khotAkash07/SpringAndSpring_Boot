package org.example;

import org.springframework.stereotype.Component;

@Component("c")
public class Car implements Vehical{
	public void engine() {
		System.out.println("2000 CC");
	}
}
