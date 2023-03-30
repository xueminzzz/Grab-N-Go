package com.example.grabngo.models;

public class Stall {
    private String stall_name;
    private boolean order_open;
    private int max_order;

    public Stall() {
    }

    public Stall(String name, boolean order_open, int max_order) {
        this.stall_name = name;
        this.order_open = order_open;
        this.max_order = max_order;
    }

    public String getStall_Name() {
        return stall_name;
    }

    public void setStall_Name(String name) {
        this.stall_name = name;
    }

    public String isOrder_open() {
        if (this.order_open) {
            return "Open";
        }
        else {
            return "Closed";
        }
    }

    public void setOrder_open(boolean order_open) {
        this.order_open = order_open;
    }

    public int getMax_order() {
        return max_order;
    }

    public void setMax_order(int max_order) {
        this.max_order = max_order;
    }
}
