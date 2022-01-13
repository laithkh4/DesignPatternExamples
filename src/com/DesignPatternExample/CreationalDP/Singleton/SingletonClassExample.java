package com.DesignPatternExample.CreationalDP.Singleton;

public class SingletonClassExample {

    private static SingletonClassExample instance =new SingletonClassExample();


    private SingletonClassExample() {}

    public static SingletonClassExample getInstance(){
        return instance;
    }


}
