package com.DesignPatternExample.BuilderExample.Items;

import com.DesignPatternExample.BuilderExample.Packings.Packing;
import com.DesignPatternExample.BuilderExample.Packings.Wrapper;

public abstract class Burger implements Items {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}