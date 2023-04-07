package com.example.grabngo.test;

public class FoodFactory {

    public static FoodV2 createFood(String foodName){
        switch(foodName){
            case "SteamedChickenRice":
                return new SteamedChickenRice.SteamedChickenRiceBuilder().build();

            case "RoastedChickenRice":
                return new RoastedChickenRice.RoastedChickenRiceBuilder().build();

            default:
                throw new IllegalArgumentException("Invalid food name: " + foodName);
    }
    }

    public static FoodV2 createFoodWithAddOns(String foodName, boolean isAddMeat, boolean isAddEgg, boolean isAddTofu){
        switch(foodName){
            case "SteamedChickenRice":
                return new SteamedChickenRice.SteamedChickenRiceBuilder().setAddMeat(isAddMeat).setAddEgg(isAddEgg).setAddTofu(isAddTofu).build();

            case "RoastedChickenRice":
                return new RoastedChickenRice.RoastedChickenRiceBuilder().setAddMeat(isAddMeat).setAddEgg(isAddEgg).setAddTofu(isAddTofu).build();

            default:
                throw new IllegalArgumentException("Invalid food name: " + foodName);
        }
    }
}
