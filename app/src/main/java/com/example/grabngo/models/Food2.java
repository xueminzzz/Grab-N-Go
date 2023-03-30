package com.example.grabngo.models;

// Uses a Builder design pattern
public class Food2 {

    // required parameters
    private String food_name;

    private int food_id;
    private double base_price;

    private String stall_name;

    private int stall_id;

    // optional parameters
    private boolean isAddMeat;
    private boolean isAddEgg;
    private boolean isAddTofu;

    public String getFood_name() {
        return food_name;
    }

    public int getFood_id() { return food_id; }

    public double getFood_price() {
        return base_price;
    }

    public String getStall_name() { return stall_name; }

    public int getStall_id() { return stall_id; }

    public boolean isAddMeat() {
        return isAddMeat;
    }

    public boolean isAddEgg() {
        return isAddEgg;
    }

    public boolean isAddTofu() {
        return isAddTofu;
    }

    private Food2(Food2Builder builder) {
        this.food_name = builder.food_name;
        this.base_price = builder.base_price;
        this.food_id = builder.food_id;
        this.stall_name = builder.stall_name;
        this.stall_id = builder.stall_id;
        this.isAddMeat = builder.isAddMeat;
        this.isAddEgg = builder.isAddEgg;
        this.isAddTofu = builder.isAddTofu;
    }

    // Builder design pattern
    public static class Food2Builder {
        private String food_name;

        private int food_id;
        private double base_price;

        private String stall_name;

        private int stall_id;

        // optional parameters
        private boolean isAddMeat;
        private boolean isAddEgg;
        private boolean isAddTofu;

        public Food2Builder(String name, int id, double price, String stall, int stall_id) {
            this.food_name = name;
            this.food_id = id;
            this.base_price = price;
            this.stall_name = stall;
            this.stall_id = stall_id;
        }

        public Food2Builder setAddMeat(boolean isAddMeat) {
            this.isAddMeat = isAddMeat;
            return this;
        }

        public Food2Builder setAddEgg(boolean isAddEgg) {
            this.isAddEgg = isAddEgg;
            return this;
        }

        public Food2Builder setAddTofu(boolean isAddTofu) {
            this.isAddTofu = isAddTofu;
            return this;
        }

        public Food2 build() {
            return new Food2(this);
        }
    }
}