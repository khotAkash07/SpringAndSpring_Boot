package org.akash;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
			Player p = (Player) context.getBean("player");
			// p.show();

			Student_01 stud = (Student_01) context.getBean("student");
			// stud.show();

			Student_01 stud2 = (Student_01) context.getBean("student1");
			// stud2.show();

			ListExmple listt = (ListExmple) context.getBean("l");
			listt.showList();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
