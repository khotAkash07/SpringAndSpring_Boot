package org.demo;

import org.demo.repository.CarRepo;
import org.demo.service.BikeService;
import org.demo.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarRepo.class);
        CarService carS = context.getBean(CarService.class);
        carS.getCar();

        BikeService bikeS = context.getBean(BikeService.class);
        bikeS.getBike();
    }
}