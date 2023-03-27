package com.example.grabngo.models;

public class Food {
    private String food_name;
    private float food_price;

    public Food() {
    }

    public Food(String food_name, float food_price) {
        this.food_name = food_name;
        this.food_price = food_price;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public float getFood_price() {
        return food_price;
    }

    public void setFood_price(float food_price) {
        this.food_price = food_price;
    }
}