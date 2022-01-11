package com.DesignPatternExample.BuilderExample.Meal;

import com.DesignPatternExample.BuilderExample.Items.Items;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Items> items = new ArrayList<Items>();

    public void addItem(Items item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Items item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (Items item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
