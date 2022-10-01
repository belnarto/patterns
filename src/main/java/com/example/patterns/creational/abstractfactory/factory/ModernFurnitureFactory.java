package com.example.patterns.creational.abstractfactory.factory;

import com.example.patterns.creational.abstractfactory.chair.Chair;
import com.example.patterns.creational.abstractfactory.chair.ModernChair;
import com.example.patterns.creational.abstractfactory.table.ModernTable;
import com.example.patterns.creational.abstractfactory.table.Table;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("modern")
public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

}
