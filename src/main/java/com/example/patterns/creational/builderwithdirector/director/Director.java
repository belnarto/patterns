package com.example.patterns.creational.builderwithdirector.director;

import com.example.patterns.creational.builderwithdirector.builder.CarRelatedBuilder;
import com.example.patterns.creational.builderwithdirector.car.CarType;
import com.example.patterns.creational.builderwithdirector.carcomponent.Engine;
import com.example.patterns.creational.builderwithdirector.carcomponent.GpsNavigator;
import com.example.patterns.creational.builderwithdirector.carcomponent.Transmission;
import com.example.patterns.creational.builderwithdirector.carcomponent.TripComputer;

@SuppressWarnings("unused")
public class Director {

    public void constructSportsCar(CarRelatedBuilder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GpsNavigator());
    }

    public void constructCityCar(CarRelatedBuilder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GpsNavigator());
    }

    public void constructSuv(CarRelatedBuilder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(new GpsNavigator());
    }

}
