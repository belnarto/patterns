package com.example.patterns.creational.abstractfactory.factory;

import com.example.patterns.creational.abstractfactory.chair.Chair;
import com.example.patterns.creational.abstractfactory.table.Table;

public interface FurnitureFactory {

    Chair createChair();

    Table createTable();

}
