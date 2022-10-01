package com.example.patterns.creational.factorymethod.transport;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ship implements Transport {

    @Override
    public void deliver() {
        log.info("Delivered by ship");
    }

}
