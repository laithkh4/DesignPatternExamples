package com.DesignPatternExample.CreationalDP.BuilderExample.Items;

import com.DesignPatternExample.CreationalDP.BuilderExample.Packings.Packing;
import com.DesignPatternExample.CreationalDP.BuilderExample.Packings.Wrapper;

public abstract class Burger implements Items {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}