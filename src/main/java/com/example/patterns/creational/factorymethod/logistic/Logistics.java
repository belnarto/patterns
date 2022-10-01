package com.example.patterns.creational.factorymethod.logistic;

import com.example.patterns.creational.factorymethod.transport.Transport;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Logistics {

    public void planDelivery() {
        log.info("Started delivery planning");
        Transport transport = createTransport();
        log.info("Delivery started");
        transport.deliver();
    }

    public abstract Transport createTransport();
}
