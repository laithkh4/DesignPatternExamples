package com.DesignPatternExample.StructuralDP.PrivateDataClass;

public class StewData {
    private final int numPotatoes;
    private final int numCarrots;
    private final int numMeat;
    private final int numPeppers;
    public StewData(int numPotatoes, int numCarrots, int numMeat, int numPeppers) {
        this.numPotatoes = numPotatoes;
        this.numCarrots = numCarrots;
        this.numMeat = numMeat;
        this.numPeppers = numPeppers;
    }
    public int getNumPotatoes() {
        return numPotatoes;
    }
    public int getNumCarrots() {
        return numCarrots;
    }
    public int getNumMeat() {
        return numMeat;
    }
    public int getNumPeppers() {
        return numPeppers;
    }
}
