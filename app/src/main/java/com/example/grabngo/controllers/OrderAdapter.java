package com.example.grabngo.controllers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grabngo.R;
import com.example.grabngo.models.Food;
import com.example.grabngo.models.Order;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class OrderAdapter extends FirebaseRecyclerAdapter<
        Order, OrderAdapter.ordersViewholder> {

    public OrderAdapter(
            @NonNull FirebaseRecyclerOptions<Order> options)
    {
        super(options);
    }

    // Function to bind the view in Card view(here
    // "person.xml") iwth data in
    // model class(here "person.class")
    @Override
    protected void
    onBindViewHolder(@NonNull ordersViewholder holder,
                     int position, @NonNull Order model)
    {

        // Add firstname from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.foodname.setText(model.getFoodname());


        // Add lastname from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.base_price.setText(String.valueOf(model.getBase_price()));


    }

    // Function to tell the class about the Card view (here
    // "person.xml")in
    // which the data will be shown
    @NonNull
    @Override
    public ordersViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order, parent, false);
        return new OrderAdapter.ordersViewholder(view);
    }

    // Sub Class to create references of the views in Crad
    // view (here "person.xml")
    class ordersViewholder extends RecyclerView.ViewHolder {
        TextView foodname, base_price;
        public ordersViewholder(@NonNull View itemView)
        {
            super(itemView);

            foodname = itemView.findViewById(R.id.foodname);
            base_price = itemView.findViewById(R.id.foodprice);
        }
    }
}