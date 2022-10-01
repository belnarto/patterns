package com.example.patterns.creational.abstractfactory.factory;

import com.example.patterns.creational.abstractfactory.chair.Chair;
import com.example.patterns.creational.abstractfactory.chair.VictorianChair;
import com.example.patterns.creational.abstractfactory.table.Table;
import com.example.patterns.creational.abstractfactory.table.VictorianTable;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("victorian")
public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

}
