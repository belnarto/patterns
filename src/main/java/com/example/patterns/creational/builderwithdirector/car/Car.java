package com.example.patterns.creational.builderwithdirector.car;

import com.example.patterns.creational.builderwithdirector.carcomponent.Engine;
import com.example.patterns.creational.builderwithdirector.carcomponent.GpsNavigator;
import com.example.patterns.creational.builderwithdirector.carcomponent.Transmission;
import com.example.patterns.creational.builderwithdirector.carcomponent.TripComputer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GpsNavigator gpsNavigator;

    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
        GpsNavigator gpsNavigator) {

        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

}
