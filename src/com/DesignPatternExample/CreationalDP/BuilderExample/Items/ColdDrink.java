package com.DesignPatternExample.CreationalDP.BuilderExample.Items;

import com.DesignPatternExample.CreationalDP.BuilderExample.Packings.Bottle;
import com.DesignPatternExample.CreationalDP.BuilderExample.Packings.Packing;

public abstract class ColdDrink implements Items {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
