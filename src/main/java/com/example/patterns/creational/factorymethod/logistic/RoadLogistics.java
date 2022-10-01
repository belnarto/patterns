package com.example.patterns.creational.factorymethod.logistic;

import com.example.patterns.creational.factorymethod.transport.Transport;
import com.example.patterns.creational.factorymethod.transport.Truck;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("road")
public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }

}
