/* Details about concrete class Orders
 * Function: store user's order using addOrder method and retrieve information about the order such as
 *           orderId, userId, timeSlot, totalPrice and foodOrdered using getter methods
 * Arguments needed: int orderId, int UserId, double timeSlot
 * timeSlot: 12.0 == 12.00pm, 12.5 == 12.30pm, 13.0 == 1.00pm, 14.0 == 2.00pm
 * Attributes: int orderId, int userId, double timeSlot, double totalPrice,s ArrayList foodOrdered
 * Outputs: you can retrieve the totalPrice
 *
 * Some things still absent:
 *   1. currently can only get the base price of the food (e.g. chicken rice would be $4, no add on price)
*/

package com.example.grabngo.test;

import java.util.ArrayList;

public class Order {
    private int orderId;

    private int userId;

    private double timeSlot;

    private double totalPrice;

    private ArrayList<FoodV2> foodOrdered = new ArrayList<FoodV2>();

    public Order() {
        this.orderId = 0;
        this.userId = 0;
        this.timeSlot = 0.0;
    }

    public Order(int orderId, int userId, double timeSlot) {
        this.orderId = orderId;
        this.userId = userId;
        this.timeSlot = timeSlot;
    }

    public void addOrder(FoodV2 order) {
        foodOrdered.add(order);
        totalPrice = totalPrice + order.getBasePrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public double getTimeSlot() {
        return timeSlot;
    }

    public ArrayList<FoodV2> getFoodOrdered() {
        return foodOrdered;
    }

}
