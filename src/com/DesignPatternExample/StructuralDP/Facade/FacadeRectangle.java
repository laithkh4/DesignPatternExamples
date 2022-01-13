package com.DesignPatternExample.StructuralDP.Facade;

public class FacadeRectangle implements FacadeShape{
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
