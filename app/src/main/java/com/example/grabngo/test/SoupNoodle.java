package com.example.grabngo.test;

public class SoupNoodle extends Noodle {
    public SoupNoodle(SoupNoodleBuilder soupNoodleBuilder) {
        super(soupNoodleBuilder);
        this.setFoodName("Soup Noodle");
        this.setFoodId(4);
    }


    static class SoupNoodleBuilder extends Noodle.NoodleBuilder {
        public SoupNoodle build(){
            return new SoupNoodle(this);
        }
    }
    @Override
    public void setFoodName(String foodName) {
        super.setFoodName(foodName);
    }


}
