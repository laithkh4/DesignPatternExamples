package com.DesignPatternExample.CreationalDP.BuilderExample.Meal;

import com.DesignPatternExample.CreationalDP.BuilderExample.Items.ChickenBurger;
import com.DesignPatternExample.CreationalDP.BuilderExample.Items.Coke;
import com.DesignPatternExample.CreationalDP.BuilderExample.Items.Pepsi;
import com.DesignPatternExample.CreationalDP.BuilderExample.Items.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}