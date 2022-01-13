package com.DesignPatternExample.StructuralDP.Facade;

public class FaceadeCircle implements FacadeShape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
