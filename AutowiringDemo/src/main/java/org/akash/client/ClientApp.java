package org.akash.client;

import org.akash.repository.ConfigurationClass;
import org.akash.service.EmpService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ClientApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		EmpService es =(EmpService) context.getBean("es");
		es.showMsg2();
		context.close();
	}

}
