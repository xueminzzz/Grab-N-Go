package com.example.grabngo.models;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int order_id;
    private Date order_time;
    private int order_amount;
    private int order_timeslot;
    private boolean activate_lunchbox;
    private ArrayList food_list;

    public Order() {
    }

    public Order(int order_id, Date order_time, int order_amount, int order_timeslot, boolean activate_lunchbox, ArrayList food_list) {
        this.order_id = order_id;
        this.order_time = order_time;
        this.order_amount = order_amount;
        this.order_timeslot = order_timeslot;
        this.activate_lunchbox = activate_lunchbox;
        this.food_list = food_list;

    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public int getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(int order_amount) {
        this.order_amount = order_amount;
    }

    public int getOrder_timeslot() {
        return order_timeslot;
    }

    public void setOrder_timeslot(int order_timeslot) {
        this.order_timeslot = order_timeslot;
    }

    public boolean isActivate_lunchbox() {
        return activate_lunchbox;
    }

    public void setActivate_lunchbox(boolean activate_lunchbox) {
        this.activate_lunchbox = activate_lunchbox;
    }

    public ArrayList getFood_list() {
        return food_list;
    }

    public void setFood_list(ArrayList food_list) {
        this.food_list = food_list;
    }
}
