package com.example.grabngo.controllers;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import androidx.cardview.widget.CardView;
import com.example.grabngo.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class OrdersforSpecifiedTimePage1_2PM extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orders_for_specified_time_page_1_2pm);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ordersRef = database.getReference("Order");

        CardView order1 = (CardView) findViewById(R.id.OrderDetailsTab1);
        Query query = ordersRef.orderByChild("timeslot").equalTo("1400");
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int count = (int) dataSnapshot.getChildrenCount(); // count the number of orders
                TextView ordersCountTextView = (TextView) findViewById(R.id.NumberofOrders);
                ordersCountTextView.setText(String.valueOf("TOTAL ORDERS: "+count)); // set the value to the UI
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("Firebase", "Error retrieving orders", databaseError.toException());
            }
        });
        order1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(OrdersforSpecifiedTimePage1_2PM.this, CompleteOrderPage.class);
                startActivity(i);

            }
        });


    }
}
