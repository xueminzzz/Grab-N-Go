package com.example.grabngo.test;

public class FishballNoodle extends Noodle {
    public FishballNoodle(FishballNoodleBuilder fishballNoodleBuilder) {
        super(fishballNoodleBuilder);
        this.setFoodName("Fishball Noodle");
        this.setFoodId(6);
    }


    static class FishballNoodleBuilder extends Noodle.NoodleBuilder {
        public FishballNoodle build(){
            return new FishballNoodle(this);
        }
    }
    @Override
    public void setFoodName(String foodName) {
        super.setFoodName(foodName);
    }


}
