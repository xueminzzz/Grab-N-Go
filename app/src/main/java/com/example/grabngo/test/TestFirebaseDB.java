package com.example.grabngo.test;

import com.example.grabngo.models.Food;
import com.example.grabngo.models.Order;

import java.util.ArrayList;

public class TestFirebaseDB {

    public static void main() {
        Food chickenRice = new Food.FoodBuilder("Roasted Chicken Set Meal", 1, 5.80, "Chicken Rice", 1)
                .setAddMeat(true).build();

        Food mixedRice = new Food.FoodBuilder("Fried Rice Set Meal", 2, 6.90, "Mixed Rice", 2)
                .setAddMeat(true).setAddEgg(true).setAddTofu(true).build();

        ArrayList<Object> food_list = new ArrayList<>();
        food_list.add(chickenRice);
        food_list.add(mixedRice);

        Order testOrder = new Order(1351, 1, "1230", food_list);
        FirebaseDB.addOrder(testOrder);
    }

}
