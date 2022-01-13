package com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Factory;

import com.DesignPatternExample.CreationalDP.AbstracFactoryExamples.Shapes.AdapterShape;

public abstract class AbstractFactory {// or we can use an interface instead!!
    public abstract AdapterShape getShape(String shapeType);
}
