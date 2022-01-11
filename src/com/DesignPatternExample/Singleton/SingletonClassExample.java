package com.DesignPatternExample.Singleton;

public class SingletonClassExample {
    int x;
    private static SingletonClassExample instance =new SingletonClassExample(5);


    private SingletonClassExample(int x) {this.x=x;}

    public static SingletonClassExample getInstance(){
        return instance;
    }

    public int getX() {
        return x;
    }
}
