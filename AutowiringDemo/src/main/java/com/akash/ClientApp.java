package com.akash;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.akash.configuration.StudentConfig;
import com.akash.models.College;

@Component
public class ClientApp {
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class)) {
			College col1 = (College) context.getBean("col");
			College col2 = (College) context.getBean("col");
			College col3 = (College) context.getBean("col");
			College col4 = (College) context.getBean("col");
			
			col1.generate();
			col2.generate();
			col3.generate();
			col4.generate();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
