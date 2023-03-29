package com.example.grabngo.test;


import com.example.grabngo.models.Food;

/** Details about FoodV2
 * No inputs or outputs
 * Attributes: foodName, foodId, basePrice, stallName
 * The relationship with other classes is as follows FoodV2 <-- ChickenRice <-- SteamedChickenRice/RoastedChickenRice
 * Notation: superclass <-- subclass
 * Concepts used: OOP abstract class
 */
public abstract class FoodV2 {

    // required parameters
    private String foodName;
    private int foodId;
    private double basePrice;
    private String stallName;

    public FoodV2(){}

    public FoodV2(String foodName, int foodId, double basePrice, String stallName) {
        this.foodName = foodName;
        this.foodId = foodId;
        this.basePrice = basePrice;
        this.stallName = stallName;
    }


    public String getFoodName() {return foodName;}

    public void setFoodName(String foodName) {this.foodName = foodName;}

    public int getFoodId() {return foodId;}

    public void setFoodId(int foodId) {this.foodId = foodId;}

    public double getBasePrice() {return basePrice;}

    public void setBasePrice(double basePrice) {this.basePrice = basePrice;}

    public String getStallName() {return stallName;}

    public void setStallName(String stallName) {this.stallName = stallName;}
}
