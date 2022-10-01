package com.example.patterns.creational.builderwithdirector.builder;

import com.example.patterns.creational.builderwithdirector.car.CarType;
import com.example.patterns.creational.builderwithdirector.carcomponent.Engine;
import com.example.patterns.creational.builderwithdirector.carcomponent.GpsNavigator;
import com.example.patterns.creational.builderwithdirector.carcomponent.Transmission;
import com.example.patterns.creational.builderwithdirector.carcomponent.TripComputer;

public interface CarRelatedBuilder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGpsNavigator(GpsNavigator gpsNavigator);

}
