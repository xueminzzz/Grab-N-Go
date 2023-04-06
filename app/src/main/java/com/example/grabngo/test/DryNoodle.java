package com.example.grabngo.test;

public class DryNoodle extends Noodle {
    public DryNoodle(DryNoodleBuilder dryNoodleBuilder) {
        super(dryNoodleBuilder);
        this.setFoodName("Dry Noodle");
        this.setFoodId(3);
    }


    static class DryNoodleBuilder extends Noodle.NoodleBuilder {
        public DryNoodle build(){
            return new DryNoodle(this);
        }
    }
    @Override
    public void setFoodName(String foodName) {
        super.setFoodName(foodName);
    }


}
