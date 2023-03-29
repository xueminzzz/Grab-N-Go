package com.example.grabngo.test;

import com.example.grabngo.models.Food;

public class TestFoodBuilder {
    public static void main(String[] args) {
        // Use builder to get objects in line of code with different add-ons!
        Food chickenRice = new Food.FoodBuilder("Roasted Chicken Set Meal", 1, 5.80, "Chicken Rice", 1)
                .setAddMeat(true).build();

        System.out.println(chickenRice.getFood_name() + " " + chickenRice.getFood_price() +
                "\nAdd Meat? " + chickenRice.isAddMeat() + " Add Egg? " + chickenRice.isAddEgg() + " Add Tofu? " + chickenRice.isAddTofu());

    }
}
