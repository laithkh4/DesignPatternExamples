package com.DesignPatternExample.AbstracFactoryExamples.Factory;

import com.DesignPatternExample.AbstracFactoryExamples.Shapes.RoundRectangle;
import com.DesignPatternExample.AbstracFactoryExamples.Shapes.RoundedSquare;
import com.DesignPatternExample.AbstracFactoryExamples.Shapes.Shape;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new RoundRectangle();
        else if(shapeType.equalsIgnoreCase("SQUARE"))
            return new RoundedSquare();
        return null;
    }
}
