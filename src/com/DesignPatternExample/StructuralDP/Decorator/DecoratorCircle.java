package com.DesignPatternExample.StructuralDP.Decorator;

public class DecoratorCircle implements DecoratorShape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
