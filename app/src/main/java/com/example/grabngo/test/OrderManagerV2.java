package com.example.grabngo.test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class OrderManagerV2 {

    private static OrderManagerV2 instance = null;
    private ArrayList<Object> foodOrdered;
    private BigDecimal totalPrice;
    private int orderId;

    private int userId;

    private double timeSlot;

    private OrderManagerV2(){
        foodOrdered = new ArrayList<>();
        totalPrice = BigDecimal.ZERO;
        this.orderId = 0;
        this.userId = 0;
        this.timeSlot = 0.0;
    }


    public static OrderManagerV2 getInstance(){
        if (instance == null){
            instance = new OrderManagerV2();
        }
        return instance;
    }

    public void resetOrderManager(){ //this is to ensure new Order instance created for next order
        instance = null;
    }

    public void addFood(Object food){
        if (food instanceof ChickenRice) {
            ChickenRice subObj = (ChickenRice) food;
            foodOrdered.add(subObj);
            totalPrice = totalPrice.add(subObj.getNetPrice());
        }
        if (food instanceof Noodle) {
            Noodle subObj = (Noodle) food;
            foodOrdered.add(subObj);
            totalPrice = totalPrice.add(subObj.getNetPrice());
        }
    }

    public ArrayList<Object> getFoodOrdered() {return foodOrdered;}
    public void setFoodOrdered(ArrayList<Object> foodOrdered) {this.foodOrdered = foodOrdered;}
    public BigDecimal getTotalPrice() {return totalPrice.setScale(2,BigDecimal.ROUND_HALF_UP);}
    public void setTotalPrice(BigDecimal totalPrice) {this.totalPrice = totalPrice;}
    public int getOrderId() {return orderId;}
    public void setOrderId(int orderId) {this.orderId = orderId;}
    public int getUserId() {return userId;}
    public void setUserId(int userId) {this.userId = userId;}
    public double getTimeSlot() {return timeSlot;}
    public void setTimeSlot(double timeSlot) {this.timeSlot = timeSlot;}





    @Override
    public String toString(){
        String answer = "Order ID: " + getOrderId() +
                " \nUser ID: " + getUserId() +
                " \nTime Slot " + getTimeSlot() +
                " \nFood Ordered: " + getFoodOrdered().toString() +
                " \nTotal Price: " + getTotalPrice();
        return answer;
    }
}
