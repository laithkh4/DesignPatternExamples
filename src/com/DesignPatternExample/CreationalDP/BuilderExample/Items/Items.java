package com.DesignPatternExample.CreationalDP.BuilderExample.Items;

import com.DesignPatternExample.CreationalDP.BuilderExample.Packings.Packing;

public interface Items {
    public String name();
    public Packing packing();
    public float price();
}
