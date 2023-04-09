package com.example.grabngo.test;

/**What the FoodFactory class do
 * It creates Food objects based on the input of foodName
 * foodName will be obtained via intents when we press the button of the different food items
 * "ConfirmAddOnPage" is the only page where we create the Food Objects using FoodFactory
 * Go to "ConfirmAddOnPage" to see how we used the FoodFactory
 */
public class FoodFactory {

    public static Food createFood(String foodName){
        switch(foodName){
            case "SteamedChickenRice":
                return new SteamedChickenRice.SteamedChickenRiceBuilder().build();

            case "RoastedChickenRice": case "RoastedChickenRiceSetMeal" :
                return new RoastedChickenRice.RoastedChickenRiceBuilder().build();

            case "DryNoodle":
            return new DryNoodle.DryNoodleBuilder().build();

            case "FishballNoodle":
                return new FishballNoodle.FishballNoodleBuilder().build();

            case "Laksa":
                return new Laksa.LaksaBuilder().build();

            default:
                throw new IllegalArgumentException("Invalid food name: " + foodName);
    }
    }

    public static Food createFoodWithAddOns(String foodName, boolean isAdd1, boolean isAdd2, boolean isAdd3){
        switch(foodName){
            case "SteamedWhiteChickenRice":
                return new SteamedChickenRice.SteamedChickenRiceBuilder().setAddMeat(isAdd1).setAddEgg(isAdd2).setAddTofu(isAdd3).build();

            case "RoastedChickenRice": case "RoastedChickenRiceSetMeal" :
                return new RoastedChickenRice.RoastedChickenRiceBuilder().setAddMeat(isAdd1).setAddEgg(isAdd2).setAddTofu(isAdd3).build();

            case "BanmianDryNoodle":
                return new DryNoodle.DryNoodleBuilder().setAddNoodle(isAdd1).setAddEgg(isAdd2).setAddCheeseTofu(isAdd3).build();

            case "FishballNoodle":
                return new FishballNoodle.FishballNoodleBuilder().setAddNoodle(isAdd1).setAddEgg(isAdd2).setAddCheeseTofu(isAdd3).build();

            case "Laksa":
                return new Laksa.LaksaBuilder().setAddNoodle(isAdd1).setAddEgg(isAdd2).setAddCheeseTofu(isAdd3).build();

            default:
                throw new IllegalArgumentException("Invalid food name: " + foodName);
        }
    }
}
