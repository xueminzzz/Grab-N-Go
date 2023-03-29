package com.example.grabngo.test;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.grabngo.models.Order;

import java.util.HashMap;

public class FirebaseDB {
    private static DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

    static void addOrder(Order order) {
        HashMap<String, Object> remaining_data = new HashMap<>();
        remaining_data.put("timeslot", order.getOrder_timeslot());
        remaining_data.put("user_id", order.getUser_id());
        remaining_data.put("total_price", order.getTotal_price());

        mDatabase.child("Order").child("order"+order.getOrder_id()).setValue(remaining_data);

        for (int i = 0; i < order.getFood_list().size(); i++) {
            Object food_item = order.getFood_list().get(i);

            mDatabase.child("Order").child("order"+order.getOrder_id()).child("food"+i).setValue(food_item);
        }
    }
}
