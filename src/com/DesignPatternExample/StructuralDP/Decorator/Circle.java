package com.DesignPatternExample.StructuralDP.Decorator;

public class Circle implements DecoratorShape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
