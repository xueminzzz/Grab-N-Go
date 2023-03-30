package com.example.grabngo.test;
import android.util.Log;
public class SteamedChickenRice extends ChickenRice {

    public SteamedChickenRice(SteamedChickenRiceBuilder steamedChickenRiceBuilder) {
        super(steamedChickenRiceBuilder);
        //TODO I can't update the name to be steamed chicken rice:(
        this.setFoodName("Steamed Chicken Rice");
        this.setFoodId(1);
    }


    static class SteamedChickenRiceBuilder extends ChickenRiceBuilder{
        public SteamedChickenRice build(){
            return new SteamedChickenRice(this);
        }
    }
}



