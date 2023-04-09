package com.example.grabngo.models;

public class OrderDetails {

    private String orderNumber;
    private String foodName;
    private Double foodPrice;
    private Boolean addMeat;
    private Boolean addEgg;
    private Boolean addTofu;

    private Double totalPrice;

    public OrderDetails(String foodName, Double foodPrice, Boolean addMeat, Boolean addEgg, Boolean addTofu) {
        // this.orderNumber = orderNumber;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.addMeat = addMeat;
        this.addEgg = addEgg;
        this.addTofu = addTofu;
        // this.totalPrice = totalPrice;
    }

    /*** public String getOrderNumber() {
     return orderNumber;
     }

     public Double getTotalPrice() {
     return totalPrice;
     } */

    public String getfoodName() {
        return foodName;
    }

    public Double getfoodPrice() {
        return foodPrice;
    }

    public Boolean getaddMeat() {
        return addMeat;
    }

    public Boolean getaddEgg() {
        return addEgg;
    }

    public Boolean getaddTofu() {
        return addTofu;
    }


}


