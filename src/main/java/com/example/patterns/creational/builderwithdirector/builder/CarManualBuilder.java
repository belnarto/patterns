package com.example.patterns.creational.builderwithdirector.builder;

import com.example.patterns.creational.builderwithdirector.car.CarType;
import com.example.patterns.creational.builderwithdirector.car.Manual;
import com.example.patterns.creational.builderwithdirector.carcomponent.Engine;
import com.example.patterns.creational.builderwithdirector.carcomponent.GpsNavigator;
import com.example.patterns.creational.builderwithdirector.carcomponent.Transmission;
import com.example.patterns.creational.builderwithdirector.carcomponent.TripComputer;
import lombok.Setter;

@Setter
public class CarManualBuilder implements CarRelatedBuilder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;

    public Manual getResult() {
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }

}
