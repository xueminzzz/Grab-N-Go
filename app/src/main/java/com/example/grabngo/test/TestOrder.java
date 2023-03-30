package com.example.grabngo.test;

public class TestOrder {
    public static void main(String[] args) {
        ChickenRice steamed1 = new SteamedChickenRice.SteamedChickenRiceBuilder().setAddEgg(false).setAddTofu(true).setAddMeat(false).build();
        ChickenRice roasted1 = new RoastedChickenRice.RoastedChickenRiceBuilder().setAddEgg(true).setAddTofu(false).setAddMeat(false).build();

        Order order1 = new Order(1,1,12.0);
        order1.addOrder(steamed1);
        System.out.println("steamed1 price" + order1.getTotalPrice());
        for (FoodV2 item : order1.getFoodOrdered()) {
            System.out.println(item.getFoodName() + "     " + item.getBasePrice());
        }

        order1.addOrder(roasted1);
        System.out.println("steamed1 + roasted1 price" + order1.getTotalPrice());
        for (FoodV2 item : order1.getFoodOrdered()) {
            System.out.println(item.getFoodName() + "     " + item.getBasePrice());
        }
    }
}
