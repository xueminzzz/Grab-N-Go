package com.example.grabngo.test;

import java.math.BigDecimal;

public class Noodle extends Food {
    // builder attributes
    private boolean isAddNoodle;
    private boolean isAddEgg;
    private boolean isAddCheeseTofu;

    private final double noodlePrice = 0.8;
    private final double eggPrice = 0.8;
    private final double cheeseTofuPrice = 0.8;

    private double netPrice;

    public Noodle(NoodleBuilder noodleBuilder) {
        super("Noodle", 1, 4.20, "Noodles");
        this.isAddNoodle = isAddNoodle;
        this.isAddEgg = isAddEgg;
        this.isAddCheeseTofu = isAddCheeseTofu;
    }

    public BigDecimal getNetPrice() {
        netPrice = super.getBasePrice();
        if (this.isAddEgg()) {
            netPrice = netPrice + this.getEggPrice();
        }

        if (this.isAddCheeseTofu()) {
            netPrice = netPrice + this.getCheeseTofuPrice();
        }

        if (this.isAddNoodle()) {
            netPrice = netPrice + this.getNoodlePrice();
        }
        BigDecimal netPriceBD = new BigDecimal(netPrice);
        return netPriceBD.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    abstract static class NoodleBuilder {
        public NoodleBuilder() {
        }

        private boolean isAddNoodle;
        private boolean isAddEgg;
        private boolean isAddCheeseTofu;

        public NoodleBuilder setAddNoodle(boolean addNoodle) {
            isAddNoodle = addNoodle;
            return this;
        }

        public NoodleBuilder setAddEgg(boolean addEgg) {
            isAddEgg = addEgg;
            return this;
        }

        public NoodleBuilder setAddCheeseTofu(boolean addCheeseTofu) {
            isAddCheeseTofu = addCheeseTofu;
            return this;
        }

        public Noodle build() {
            return new Noodle(this);
        }
    }


    public boolean isAddNoodle() {
        return isAddNoodle;
    }

    public boolean isAddEgg() {
        return isAddEgg;
    }

    public boolean isAddCheeseTofu() {
        return isAddCheeseTofu;
    }

    public double getNoodlePrice() {
        return noodlePrice;
    }

    public double getEggPrice() {
        return eggPrice;
    }

    public double getCheeseTofuPrice() {
        return cheeseTofuPrice;
    }



}
