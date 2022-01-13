package com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Factory;

import com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Shapes.AdapterShape;
import com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Shapes.Rectangle;

import com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Shapes.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    public AdapterShape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
}
