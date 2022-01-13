package com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Shapes;

public class Rectangle implements AdapterShape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle Shape...");
    }
}
