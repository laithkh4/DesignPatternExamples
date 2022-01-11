package com.DesignPatternExample.BuilderExample.Items;

import com.DesignPatternExample.BuilderExample.Packings.Packing;

public interface Items {
    public String name();
    public Packing packing();
    public float price();
}
