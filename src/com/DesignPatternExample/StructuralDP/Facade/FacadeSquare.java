package com.DesignPatternExample.StructuralDP.Facade;

public class FacadeSquare implements FacadeShape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
