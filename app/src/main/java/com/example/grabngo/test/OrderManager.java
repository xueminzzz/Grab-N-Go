package com.example.grabngo.test;

import com.example.grabngo.models.Food;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private static OrderManager instance = null;
    private List<FoodV2> foods;
    private Order order;

    private OrderManager(){
        foods = new ArrayList<>();
        order = new Order();
    }

    public static OrderManager getInstance(){
        if (instance == null){
            instance = new OrderManager();
        }
        return instance;
    }

    public void addFood(FoodV2 food){
        foods.add(food);
        order.addOrder(food);
    }

    public Order getOrder(){
        return order;
    }

    public List<FoodV2> getFoods(){
        return foods;
    }
}
