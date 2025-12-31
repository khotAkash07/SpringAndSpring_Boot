package org.akash;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("abc.xml")) {
			Student stud = (Student) context.getBean("s");
			stud.show();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
