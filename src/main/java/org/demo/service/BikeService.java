package org.demo.service;

import org.demo.models.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BikeService {

    Bike bike;

    @Autowired
    public void getBike(Bike bike) {
        this.bike = bike;
    }

    public void getBike() {
        bike.showModel();
    }
}
