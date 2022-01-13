package com.DesignPatternExample.StructuralDP.Bridge.Shapes;

import com.DesignPatternExample.StructuralDP.Bridge.Color.DrawAPI;

public class Circle extends BridgeShapes{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
