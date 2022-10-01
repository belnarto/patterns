package com.example.patterns.creational.factorymethod.logistic;

import com.example.patterns.creational.factorymethod.transport.Ship;
import com.example.patterns.creational.factorymethod.transport.Transport;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sea")
public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }

}
