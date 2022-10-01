package com.example.patterns.creational.abstractfactory.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("modern")
class ModernFurnitureFactoryTest {

    @Autowired
    FurnitureFactory furnitureFactory;

    @Test
    void createChair() {
        assertEquals("Modern chair", furnitureFactory.createChair().getFullName());
    }

    @Test
    void createTable() {
        assertEquals("Modern table", furnitureFactory.createTable().getFullName());
    }

}