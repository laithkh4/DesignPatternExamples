package com.DesignPatternExample.BehavioralDP.Command;

public class LightOffCommand implements Command{
    Light light;

    // The constructor is passed the light it
    // is going to control.
    public LightOffCommand(Light light)
    {
        this.light = light;
    }
    public void execute()
    {
        light.off();
    }
}
