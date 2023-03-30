package com.example.grabngo.test;

/** Details about TestFoodV2
 * This test files utilizes the following classes: FoodV2, ChickenRice, SteamedChickenRice, RoastedChickenRice
 * Purpose: To test being able to create the objects of SteamedChickenRice and RoastedChickenRice
 * Java concepts: Programming to a supertype of "ChickenRice" instead of "SteamedChickenRice" etc
 * What we expect to see: Objects that is customised based on our add on ingredients
 *
 */
public class TestFoodV2 {
    public static void main(String[] args) {
        ChickenRice steamed1 = new SteamedChickenRice.SteamedChickenRiceBuilder().setAddEgg(false).setAddTofu(true).setAddMeat(false).build();
        ChickenRice roasted1 = new RoastedChickenRice.RoastedChickenRiceBuilder().setAddEgg(true).setAddTofu(false).setAddMeat(false).build();
        System.out.println(steamed1.getFoodName() + " " +steamed1.getFoodId() + " " + steamed1.getBasePrice()+" Add Egg?: " + steamed1.isAddEgg()+" Add Tofu? " +steamed1.isAddTofu() + " Add Meat? " + steamed1.isAddMeat());
        System.out.println(roasted1.getFoodName() + " " +roasted1.getFoodId() + " " + roasted1.getBasePrice()+" Add Egg?: " + roasted1.isAddEgg()+" Add Tofu? " +roasted1.isAddTofu() + " Add Meat? " + roasted1.isAddMeat());
    }
}
