package com.example.grabngo.test;

public class Laksa extends Noodle {
    public Laksa(LaksaBuilder laksaBuilder) {
        super(laksaBuilder);
        this.setFoodName("Laksa");
        this.setFoodId(5);
    }

    static class LaksaBuilder extends Noodle.NoodleBuilder {
        public Laksa build(){
            return new Laksa(this);
        }
    }
    @Override
    public void setFoodName(String foodName) {
        super.setFoodName(foodName);
    }


}
