package com.DesignPatternExample.CreationalDP.PrototypeExamples;

public class Circle extends PrototypeShape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}