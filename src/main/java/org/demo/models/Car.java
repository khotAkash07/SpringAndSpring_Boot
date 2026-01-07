package org.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public void showModel(){
        String model = "2025";
        System.out.println("Model: "+ model);
        String color = "red";
        System.out.println("Color: "+ color);
        String type = "4Wheeler";
        System.out.println("Type: "+ type);
    }
}
