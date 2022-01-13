package com.DesignPatternExample.StructuralDP.Decorator;

public class Rectangle implements DecoratorShape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
