package com.example.grabngo.test;

import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import java.util.HashMap;

// Order is the updated class. I've changed the getter methods' names in the code below only
public class FirebaseDB {
    private static DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

    public static void testOrder(Order order) {
        Log.d("Time Slot", String.valueOf(order.getTimeSlot()));
        Log.d("User ID", String.valueOf(order.getUserId()));
        Log.d("Total Price", String.valueOf(order.getTotalPrice().floatValue()));

        for (int i = 0; i < order.getFoodOrdered().size(); i++) {
            Object food_item = order.getFoodOrdered().get(i);

            Log.d("Food Name", food_item.toString() + "\n");
        }
    }

    public static void pushOrder(Order order) {
        HashMap<String, Object> remaining_data = new HashMap<>();
        remaining_data.put("timeslot", String.format("%.2f", order.getTimeSlot()));
        remaining_data.put("user_id", order.getUserId());
        remaining_data.put("total_price", order.getTotalPrice().doubleValue());

        mDatabase.child("Order").child("order"+order.getOrderId()).setValue(remaining_data);

        for (int i = 0; i < order.getFoodOrdered().size(); i++) {
            Object food_item = order.getFoodOrdered().get(i);

            if (food_item instanceof Noodle) {
                mDatabase.child("Order").child("order"+order.getOrderId()).child("list_of_food").child("food"+i).setValue(((Noodle) food_item).getData());
            } else if (food_item instanceof ChickenRice) {
                mDatabase.child("Order").child("order"+order.getOrderId()).child("list_of_food").child("food"+i).setValue(((ChickenRice) food_item).getData());
            }
        }
    }
}
