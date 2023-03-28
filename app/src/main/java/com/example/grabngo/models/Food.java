package com.example.grabngo.models;

public class Food {

    // required parameters
    private String food_name;
    private double food_price;

    // optional parameters
    private boolean isAddMeat;
    private boolean isAddEgg;
    private boolean isAddTofu;

    public String getFood_name() {
        return food_name;
    }

    public double getFood_price() {
        return food_price;
    }

    public boolean isAddMeat() {
        return isAddMeat;
    }

    public boolean isAddEgg() {
        return isAddEgg;
    }

    public boolean isAddTofu() {
        return isAddTofu;
    }

    private Food(FoodBuilder builder) {
        this.food_name = builder.food_name;
        this.food_price = builder.food_price;
        this.isAddMeat = builder.isAddMeat;
        this.isAddEgg = builder.isAddEgg;
        this.isAddTofu = builder.isAddTofu;
    }

    // Builder design pattern
    public static class FoodBuilder {
        private String food_name;
        private double food_price;

        // optional parameters
        private boolean isAddMeat;
        private boolean isAddEgg;
        private boolean isAddTofu;

        public FoodBuilder(String name, double price) {
            this.food_name = name;
            this.food_price = price;
        }

        public FoodBuilder setAddMeat(boolean isAddMeat) {
            this.isAddMeat = isAddMeat;
            return this;
        }

        public FoodBuilder setAddEgg(boolean isAddEgg) {
            this.isAddEgg = isAddEgg;
            return this;
        }

        public FoodBuilder setAddTofu(boolean isAddTofu) {
            this.isAddTofu = isAddTofu;
            return this;
        }

        public Food build() {
            return new Food(this);
        }
    }
}