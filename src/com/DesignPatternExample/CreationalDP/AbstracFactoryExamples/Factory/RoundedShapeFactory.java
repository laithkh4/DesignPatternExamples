package com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Factory;

import com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Shapes.RoundRectangle;
import com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Shapes.RoundedSquare;
import com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Shapes.AdapterShape;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public AdapterShape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new RoundRectangle();
        else if(shapeType.equalsIgnoreCase("SQUARE"))
            return new RoundedSquare();
        return null;
    }
}
