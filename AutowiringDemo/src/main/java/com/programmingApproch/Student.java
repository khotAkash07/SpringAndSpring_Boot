package com.programmingApproch;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Student implements InitializingBean, DisposableBean{
	
	
	public void utilityMethod() {
		System.out.println("This is Utility From Student");		
	}
	
	public Student() {
		System.out.println("This is Constructor From Student...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is Pre Destroyed From Student...");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is After Constructor From Student...");
		
	}
}
