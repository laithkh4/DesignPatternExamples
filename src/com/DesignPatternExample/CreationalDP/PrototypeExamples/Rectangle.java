package com.DesignPatternExample.CreationalDP.PrototypeExamples;

public class Rectangle extends PrototypeShape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}