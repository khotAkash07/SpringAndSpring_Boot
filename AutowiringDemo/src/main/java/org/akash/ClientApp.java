package org.akash;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("abc.xml");
		Company comp = (Company) context.getBean("c");
		comp.show();
	}

}
