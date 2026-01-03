package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bi")
public class BeanInjector {
	
	Vehical vehical;
	
	@Autowired
	@Qualifier("b")
	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}
	
	public void showEngine() {
		vehical.engine();
	}

}
