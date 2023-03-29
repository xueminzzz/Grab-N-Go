package com.example.grabngo.models;

import java.util.ArrayList;

public class Order {
    private int order_id;
    private int user_id;
    private double total_price;
    private String order_timeslot;
    private ArrayList list_of_food;

    public Order() {
    }

    public Order(int order_id, int user_id, String order_timeslot, ArrayList food_list) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.order_timeslot = order_timeslot;
        this.list_of_food = food_list;
        this.total_price = 0;

        for (int i = 0; i < food_list.size(); i++) {
            Object food_item = food_list.get(i);

            this.total_price += ((Food) food_item).getFood_price();
        }
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getUser_id() { return this.user_id; }

    public double getTotal_price() { return this.total_price; }

    public String getOrder_timeslot() {
        return this.order_timeslot;
    }

    public ArrayList getFood_list() {
        return this.list_of_food;
    }

}
