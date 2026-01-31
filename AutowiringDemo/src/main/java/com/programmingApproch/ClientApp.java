package com.programmingApproch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ClientApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(StudConfig.class);
		
		Student stud = (Student) context.getBean(Student.class);
		stud.utilityMethod();
		context.close();
	}
}
