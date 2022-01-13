package com.DesignPatternExample.StructuralDP.Decorator;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(DecoratorShape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(DecoratorShape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
