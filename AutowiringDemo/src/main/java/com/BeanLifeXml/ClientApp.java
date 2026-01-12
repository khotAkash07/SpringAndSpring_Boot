package com.BeanLifeXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("abc.xml");
		
		Employee emp = (Employee) context.getBean("e");
		emp.utilityMethod();
		
		context.close();
	}
}
