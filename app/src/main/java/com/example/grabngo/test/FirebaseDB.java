package com.example.grabngo.test;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import java.util.HashMap;

// Order is the updated class. I've changed the getter methods' names in the code below only
public class FirebaseDB {
    /**
    private static DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

    public static void addOrder(Order order) {
        HashMap<String, Object> remaining_data = new HashMap<>();
        remaining_data.put("timeslot", order.getTimeSlot());
        remaining_data.put("user_id", order.getUserId());
        remaining_data.put("total_price", order.getTotalPrice().floatValue());

        mDatabase.child("Order").child("order"+order.getOrderId()).setValue(remaining_data);

        for (int i = 0; i < order.getFoodOrdered().size(); i++) {
            Object food_item = order.getFoodOrdered().get(i);

            mDatabase.child("Order").child("order"+order.getOrderId()).child("food"+i).setValue(food_item);
        }
    }

     */
}
