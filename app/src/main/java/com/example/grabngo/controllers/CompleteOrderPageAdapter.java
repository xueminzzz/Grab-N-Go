package com.example.grabngo.controllers;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grabngo.R;
import com.example.grabngo.models.OrderDetails;

import java.util.List;

public class CompleteOrderPageAdapter extends RecyclerView.Adapter<CompleteOrderPageAdapter.CompletePageOrderViewHolder>{
    private List<OrderDetails> orderDetailsList;

    public CompleteOrderPageAdapter(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
        Log.d("RecyclerView", "orderDetailsList size: " + orderDetailsList.size());
    }

    @NonNull
    @Override
    public CompletePageOrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.complete_order_page_item, parent, false);
        return new CompletePageOrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CompleteOrderPageAdapter.CompletePageOrderViewHolder holder, int position) {
        OrderDetails orderDetails = orderDetailsList.get(position);
        holder.foodNameTextView.setText(orderDetails.getfoodName());
        Log.d("RecyclerView", "onCreateViewHolder" + orderDetails.getfoodName());
        holder.foodPriceTextView.setText("$" + orderDetails.getfoodPrice());
        Log.d("RecyclerView", "onCreateViewHolder" + orderDetails.getfoodName());

        if (orderDetails.getaddMeat() != null){
            if (orderDetails.getaddMeat()) {
                holder.addMeatTextView.setText("Add Meat");
                holder.addMeatTextView.setVisibility(View.VISIBLE);
                holder.addMeatPriceTextView.setText("$1.00");
            } else {
                holder.addMeatTextView.setVisibility(View.GONE);
                holder.addMeatPriceTextView.setVisibility(View.GONE);
            }
        }

        if (orderDetails.getaddEgg() != null){
            if (orderDetails.getaddEgg()) {
                holder.addEggTextView.setText("Add Egg");
                holder.addEggTextView.setVisibility(View.VISIBLE);
                holder.addEggPriceTextView.setText("$0.80");
            } else {
                holder.addEggTextView.setVisibility(View.GONE);
                holder.addEggPriceTextView.setVisibility(View.GONE);

            }
        }

        if (orderDetails.getaddTofu() != null){
            if (orderDetails.getaddTofu()) {
                holder.addTofuTextView.setText("Add Tofu");
                holder.addTofuTextView.setVisibility(View.VISIBLE);
                holder.addTofuPriceTextView.setText("$0.40");
            } else {
                holder.addTofuTextView.setVisibility(View.GONE);
                holder.addTofuPriceTextView.setVisibility(View.GONE);

            }
        }

        // holder.totalPriceTextView.setText("$ " + orderDetails.getTotalPrice());
    }

    @Override
    public int getItemCount() {
        return orderDetailsList.size();
    }

    public class CompletePageOrderViewHolder extends RecyclerView.ViewHolder {

        // TextView orderNumberTextView;
        TextView foodNameTextView;
        TextView foodPriceTextView;
        TextView addMeatTextView;
        TextView addMeatPriceTextView;
        TextView addEggTextView;
        TextView addEggPriceTextView;
        TextView addTofuTextView;
        TextView addTofuPriceTextView;
        // TextView totalPriceTextView;


        public CompletePageOrderViewHolder(View itemView) {
            super(itemView);

            // orderNumberTextView = itemView.findViewById(R.id.OrderNumber);
            foodNameTextView = itemView.findViewById(R.id.FoodName1);
            foodPriceTextView = itemView.findViewById(R.id.FoodPrice1);
            addMeatTextView = itemView.findViewById(R.id.AddOn1);
            addMeatPriceTextView = itemView.findViewById(R.id.AddOnPrice1);
            addEggTextView = itemView.findViewById(R.id.AddOn2);
            addEggPriceTextView = itemView.findViewById(R.id.AddOnPrice2);
            addTofuTextView = itemView.findViewById(R.id.AddOn3);
            addTofuPriceTextView = itemView.findViewById(R.id.AddOnPrice3);
            // totalPriceTextView = itemView.findViewById(R.id.TotalPrice);
        }
    }
}
