package com.example.patterns.creational.builderwithdirector.carcomponent;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GpsNavigator {

    private String route;

    public GpsNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

}
