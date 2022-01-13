package com.DesignPatternExample.StructuralDP.Bridge.Shapes;

import com.DesignPatternExample.StructuralDP.Bridge.Color.DrawAPI;

public abstract class BridgeShapes {
    protected DrawAPI drawAPI;

    protected BridgeShapes(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
