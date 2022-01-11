package com.DesignPatternExample.AbstracFactoryExamples.Factory;

import com.DesignPatternExample.AbstracFactoryExamples.Shapes.Rectangle;
import com.DesignPatternExample.AbstracFactoryExamples.Shapes.Shape;
import com.DesignPatternExample.AbstracFactoryExamples.Shapes.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
}
