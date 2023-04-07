package com.example.grabngo.test;

/**What the FoodFactory class do
 * It creates Food objects based on the input of foodName
 * foodName will be obtained via intents when we press the button of the different food items
 * "AddOnPage" is the only page where we create the Food Objects using FoodFactory
 * Go to "AddOnPage" to see how we used the FoodFactor
 */
public class FoodFactory {

    public static Food createFood(String foodName){
        switch(foodName){
            case "SteamedChickenRice":
                return new SteamedChickenRice.SteamedChickenRiceBuilder().build();

            case "RoastedChickenRice":
                return new RoastedChickenRice.RoastedChickenRiceBuilder().build();

            default:
                throw new IllegalArgumentException("Invalid food name: " + foodName);
    }
    }

    public static Food createFoodWithAddOns(String foodName, boolean isAddMeat, boolean isAddEgg, boolean isAddTofu){
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
