package com.example.patterns.creational.builderwithdirector.builder;

import com.example.patterns.creational.builderwithdirector.car.Car;
import com.example.patterns.creational.builderwithdirector.car.CarType;
import com.example.patterns.creational.builderwithdirector.carcomponent.Engine;
import com.example.patterns.creational.builderwithdirector.carcomponent.GpsNavigator;
import com.example.patterns.creational.builderwithdirector.carcomponent.Transmission;
import com.example.patterns.creational.builderwithdirector.carcomponent.TripComputer;
import lombok.Setter;

@Setter
public class CarBuilderImpl implements CarRelatedBuilder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    public Car getResult() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }

}
