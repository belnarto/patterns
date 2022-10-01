package com.example.patterns.creational.builderwithdirector.carcomponent;

import com.example.patterns.creational.builderwithdirector.car.Car;
import lombok.Setter;

@SuppressWarnings("unused")
@Setter
public class TripComputer {

    private Car car;

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }

}
