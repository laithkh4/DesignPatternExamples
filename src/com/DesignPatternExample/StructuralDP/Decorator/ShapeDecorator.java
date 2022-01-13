package com.DesignPatternExample.StructuralDP.Decorator;

public class ShapeDecorator implements DecoratorShape{
    protected DecoratorShape decoratedShape;

    public ShapeDecorator(DecoratorShape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
