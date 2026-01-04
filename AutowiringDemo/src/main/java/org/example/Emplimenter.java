package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Emplimenter {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ContainerClass.class);
		BeanInjector v = (BeanInjector) context.getBean("bi");
		v.showEngine();
	}
}
