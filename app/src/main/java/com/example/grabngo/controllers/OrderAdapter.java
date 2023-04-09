package com.example.grabngo.controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grabngo.R;
import com.example.grabngo.models.ChickenRice;
import com.example.grabngo.models.Food;
import com.example.grabngo.models.Noodle;
import com.example.grabngo.models.Order;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.Viewholder> {

    private ArrayList<Object> foodlist;

    public OrderAdapter(Context context, Order order) {
        foodlist = order.getFoodOrdered();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView OrderStoreName, OrderFoodName, OrderFoodPrice, OrderFoodAddOn;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            OrderStoreName = itemView.findViewById(R.id.OrderStoreName);
            OrderFoodName = itemView.findViewById(R.id.OrderFoodName);
            OrderFoodPrice = itemView.findViewById(R.id.OrderFoodPrice);
            OrderFoodAddOn = itemView.findViewById(R.id.OrderFoodAddOn);
        }
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_item, parent, false);
        return new Viewholder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        String addOns = "";

        if (foodlist.get(position) instanceof ChickenRice) {
            holder.OrderFoodName.setText(((ChickenRice) foodlist.get(position)).getFoodName());
            holder.OrderStoreName.setText(((ChickenRice) foodlist.get(position)).getStallName());
            holder.OrderFoodPrice.setText(String.valueOf(((ChickenRice) foodlist.get(position)).getNetPrice().floatValue()));

            if (((ChickenRice) foodlist.get(position)).isAddMeat()) {
                addOns += "Add Meat\n";
            }
            if (((ChickenRice) foodlist.get(position)).isAddEgg()) {
                addOns += "Add Egg\n";
            }
            if (((ChickenRice) foodlist.get(position)).isAddTofu()) {
                addOns += "Add Tofu\n";
            }

        } else if (foodlist.get(position) instanceof Noodle) {
            holder.OrderFoodName.setText(((Noodle) foodlist.get(position)).getFoodName());
            holder.OrderStoreName.setText(((Noodle) foodlist.get(position)).getStallName());
            holder.OrderFoodPrice.setText(String.valueOf(((Noodle) foodlist.get(position)).getNetPrice().floatValue()));

            if (((Noodle) foodlist.get(position)).isAddNoodle()) {
                addOns += "Add Noodle\n";
            }
            if (((Noodle) foodlist.get(position)).isAddEgg()) {
                addOns += "Add Egg\n";
            }
            if (((Noodle) foodlist.get(position)).isAddCheeseTofu()) {
                addOns += "Add Cheese Tofu\n";
            }
        }
        holder.OrderFoodAddOn.setText(addOns);
    }

    @Override
    public int getItemCount() {
        return foodlist.size();
    }
}
