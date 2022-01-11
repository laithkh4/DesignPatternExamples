package com.DesignPatternExample.BuilderExample.Items;

import com.DesignPatternExample.BuilderExample.Packings.Bottle;
import com.DesignPatternExample.BuilderExample.Packings.Packing;

public abstract class ColdDrink implements Items {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
