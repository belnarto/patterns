package com.example.patterns.creational.abstractfactory.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("victorian")
class VictorianFurnitureFactoryTest {

    @Autowired
    FurnitureFactory furnitureFactory;

    @Test
    void createChair() {
        assertEquals("Victorian chair", furnitureFactory.createChair().getFullName());
    }

    @Test
    void createTable() {
        assertEquals("Victorian table", furnitureFactory.createTable().getFullName());
    }
    
}