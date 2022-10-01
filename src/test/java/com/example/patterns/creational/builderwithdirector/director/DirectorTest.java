package com.example.patterns.creational.builderwithdirector.director;

import com.example.patterns.creational.builderwithdirector.builder.CarBuilderImpl;
import com.example.patterns.creational.builderwithdirector.builder.CarManualBuilder;
import com.example.patterns.creational.builderwithdirector.car.Car;
import com.example.patterns.creational.builderwithdirector.car.Manual;
import org.junit.jupiter.api.Test;

class DirectorTest {

    @Test
    void directorTest() {
        Director director = new Director();

        CarBuilderImpl carBuilder = new CarBuilderImpl();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}