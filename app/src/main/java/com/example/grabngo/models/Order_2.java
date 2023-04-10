package com.example.grabngo.models;

import java.util.ArrayList;
import java.util.Date;

public class Order_2 {
    private String foodname;
    private double base_price;

    public Order_2(){}

    public Order_2(String foodname, double base_price) {
        this.foodname = foodname;
        this.base_price = base_price;

    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public double getBase_price() {
        return base_price;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
    }
}
