package com.DesignPatternExample;

import com.DesignPatternExample.AbstracFactoryExamples.Factory.AbstractFactory;
import com.DesignPatternExample.AbstracFactoryExamples.Factory.FactoryProvider;
import com.DesignPatternExample.BuilderExample.Meal.Meal;
import com.DesignPatternExample.BuilderExample.Meal.MealBuilder;
/*import com.DesignPatternExample.AbstracFactoryExamples.Shapes.Shape;*/
import com.DesignPatternExample.PrototypeExamples.Shape;
import com.DesignPatternExample.PrototypeExamples.ShapeCache;
import com.DesignPatternExample.Singleton.SingletonClassExample;


public class Main {

    public static void main(String[] args) {
/*        System.out.println("working fine");
        AbstractFactory shapeFactory= FactoryProvider.getFactory(true);
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
        System.out.println("Testing.......");

*//*
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
*/
/*
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        System.out.println("Shape : " + clonedShape.getId());
        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        System.out.println("Shape : " + clonedShape2.getId());
        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        System.out.println("Shape : " + clonedShape3.getId());*/

        SingletonClassExample singletonClassExample= SingletonClassExample.getInstance();
        singletonClassExample.getX();

    }
}
