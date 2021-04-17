package com.epam.training.model;

import java.util.Objects;

public class Candies extends AbstractGift {

    private boolean specialCandy;
    private int sweetness;

    public Candies(boolean specialCandy, int sweetness, String name, double price, double weight) {
        super(name, price, weight);
        this.specialCandy = specialCandy;
        this.sweetness = sweetness;
    }

    public boolean isSpecialCandy() {
        return specialCandy;
    }

    public void setSpecialCandy(boolean specialCandy) {
        this.specialCandy = specialCandy;
    }

    public int getSweetness() {
        return sweetness;
    }

    public void setSweetness(int sweetness) {
        this.sweetness = sweetness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Candies candies = (Candies) o;
        return specialCandy == candies.specialCandy && sweetness == candies.sweetness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialCandy, sweetness);
    }

    @Override
    public String toString() {
        return "Candies{" +
                "specialCandy=" + specialCandy +
                ", sweetness=" + sweetness +
                "} " + super.toString();
    }
}
