package com.DesignPatternExample.AbstracFactoryExamples.Factory;

import com.DesignPatternExample.AbstracFactoryExamples.Shapes.Shape;

public abstract class AbstractFactory {// or we can use an interface instead!!
    public abstract Shape getShape(String shapeType);
}
