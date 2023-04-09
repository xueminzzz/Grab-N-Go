package com.example.grabngo.controllers;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grabngo.R;
import com.example.grabngo.models.Order;
import com.example.grabngo.models.OrderDetails;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.StorageTask;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CompleteOrderPage_1PM_Mixed extends Activity {
    private List<OrderDetails> orderDetailsList;
    private CompleteOrderPageAdapter adapter;
    private RecyclerView recyclerView;
    double price;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complete_order_page_1pm_mixed);

        Button completeOrderButton = findViewById(R.id.ProceedButton);
        String orderId = getIntent().getStringExtra("id");

        orderDetailsList = new ArrayList<>();
        Log.d("CompleteOrderPage", "orderDetailsList initialized");

        // initialize RecyclerView and its adapter
        recyclerView = findViewById(R.id.recycler_view_complete_order_page);
        adapter = new CompleteOrderPageAdapter(orderDetailsList);

        Log.d("CompleteOrderPage", "recyclerView = " + recyclerView);
        // Set up the RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ordersRef = database.getReference("Order");
        DatabaseReference orderIdRef = ordersRef.child(orderId);
        Log.d("orderid", "onDataChange: " + orderId);


        // query parameters, retrieving only timeslot 12.30 from the database
        // Query query = ordersRef.orderByChild("timeslot").equalTo("1230");
        orderIdRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d("childCount", "onDataChange: " + dataSnapshot);
                Log.d("childCount", "onDataChange: " + dataSnapshot.child("list_of_food"));

                String orderNumber = orderId.substring(5);
                Log.d("ordernumber", "onDataChange: " + orderNumber);
                TextView orderNumberTextView = findViewById(R.id.OrderNumber);
                orderNumberTextView.setText("Order # " + orderNumber);

                Log.d("childCount", "onDataChange: " + dataSnapshot.child("list_of_food").getChildrenCount());
                for (DataSnapshot foodNumberSnapshot : dataSnapshot.child("list_of_food").getChildren()) {
                    String stallName = foodNumberSnapshot.child("stall_name").getValue(String.class); // Retrieve stall_name from Firebase
                    if (stallName.equals("Chicken Rice")) {
                        String foodName = foodNumberSnapshot.child("food_name").getValue(String.class);
                        Log.d("foodname", "onDataChange: " + foodName);

                        // order1 is base_price, but order 1351 is food_price
                        Double foodPrice = foodNumberSnapshot.child("food_price").getValue(Double.class);
                        Log.d("baseprice", "onDataChange: " + foodPrice);
                        price += foodPrice;

                        // get addMeat
                        Boolean addMeat = foodNumberSnapshot.child("addMeat").getValue(Boolean.class);
                        Double addMeatPrice = 1.00;
                        if (addMeat != null) {
                            Log.d("isAddMeat", "onDataChange: " + addMeat);
                            if (addMeat == true) {
                                price += addMeatPrice;
                            } else {
                                price += 0;
                            }
                        } else {
                            Log.d("isAddMeat", "onDataChange: addMeat is null");
                        }
                        Log.d("isAddMeatPrice", "onDataChange: " + price);

                        // get addEgg
                        Boolean addEgg = foodNumberSnapshot.child("addEgg").getValue(Boolean.class);
                        Double addEggPrice = 0.80;
                        if (addEgg != null) {
                            Log.d("isAddEgg", "onDataChange: " + addEgg);
                            if (addEgg == true) {
                                price += addEggPrice;
                            } else {
                                price += 0;
                            }
                        } else {
                            Log.d("isAddEgg", "onDataChange: addEgg is null");
                        }
                        Log.d("isAddEggPrice", "onDataChange: " + price);

                        // get addTofu
                        Boolean addTofu = foodNumberSnapshot.child("addTofu").getValue(Boolean.class);
                        Double addTofuPrice = 0.40;
                        if (addTofu != null) {
                            Log.d("isAddTofu", "onDataChange: " + addTofu);
                            if (addTofu == true) {
                                price += addTofuPrice;
                            } else {
                                price += 0;
                            }
                        } else {
                            Log.d("isAddTofu", "onDataChange: addTofu is null");
                        }
                        Log.d("isAddTofuPrice", "onDataChange: " + price);

                        OrderDetails orderDetails = new OrderDetails(foodName, foodPrice, addMeat, addEgg, addTofu);
                        orderDetailsList.add(orderDetails);

                    }
                    // get totalPrice
                    // Double totalPrice = dataSnapshot.child("total_price").getValue(Double.class);
                    TextView totalPriceTextView = findViewById(R.id.TotalPrice);
                    totalPriceTextView.setText("$ " + price);
                    Log.d("totalprice", "onDataChange: " + price);

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.e("Firebase", "Error retrieving orders", error.toException());
            };


        });
        completeOrderButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //change the value of open_order to be false
                // ordersRef.child("open_order").setValue(false);

                Intent i = new Intent(CompleteOrderPage_1PM_Mixed.this, OrdersforSpecifiedTimePage1_1PM_Mixed.class);
                i.putExtra("id", orderId);
                startActivity(i);

            }
        });



    }
}
