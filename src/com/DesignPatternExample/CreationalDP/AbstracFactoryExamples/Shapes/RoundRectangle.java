package com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Shapes;

public class RoundRectangle implements AdapterShape {
    @Override
    public void draw() {
        System.out.println("Drawing Round Rectangle Shape....");
    }
}
