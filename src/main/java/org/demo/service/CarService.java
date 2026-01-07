package org.demo.service;

import org.demo.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {

    private Car car;

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    public void getCar() {
        car.showModel();
    }
}
