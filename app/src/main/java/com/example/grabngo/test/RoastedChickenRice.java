package com.example.grabngo.test;

/** Details about RoastedChickenRice
 * It is a concrete class
 * Current bug: Not being able to update the attributes such as the name to be "Roasted Chicken Rice"
 * The relationship with other classes is as follows FoodV2 <-- ChickenRice <-- SteamedChickenRice/RoastedChickenRice
 *  Notation: superclass <-- subclass
 */
public class RoastedChickenRice extends ChickenRice{
    public RoastedChickenRice(RoastedChickenRiceBuilder roastedChickenRiceBuilder) {
        super(roastedChickenRiceBuilder);
        //TODO I can't update the name to be roasted chicken rice:(
        this.setFoodName("Roasted Chicken Rice");
        this.setFoodId(2);
    }


    static class RoastedChickenRiceBuilder extends ChickenRice.ChickenRiceBuilder {}
}

