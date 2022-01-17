package com.DesignPatternExample.StructuralDP.Flyweight;

import java.util.HashMap;

public class FlyweightShapeFactory {

    private static final HashMap circleMap = new HashMap();

    public static FlyweightShape getCircle(String color) {
        FlyweightCircle circle = (FlyweightCircle)circleMap.get(color);

        if(circle == null) {
            circle = new FlyweightCircle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
