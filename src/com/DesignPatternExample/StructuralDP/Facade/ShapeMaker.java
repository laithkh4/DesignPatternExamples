package com.DesignPatternExample.StructuralDP.Facade;

public class ShapeMaker {
    private FacadeShape circle;
    private FacadeShape rectangle;
    private FacadeShape square;

    public ShapeMaker() {
        circle = new FaceadeCircle();
        rectangle = new FacadeRectangle();
        square = new FacadeSquare();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
