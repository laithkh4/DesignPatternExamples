package com.DesignPatternExample.AbstracFactoryExamples.Factory;

public class FactoryProvider {
    public static AbstractFactory getFactory(boolean rounded){// defined static so
        if (rounded) {
            System.out.println("inside ");
            return new RoundedShapeFactory();
        }
        else
            return new ShapeFactory();
    }
}
