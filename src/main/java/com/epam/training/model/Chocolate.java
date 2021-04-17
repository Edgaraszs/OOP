package com.epam.training.model;

import java.util.Objects;

public class Chocolate extends AbstractGift {

    private double length;
    private ChocolateType chocolateType;

    public Chocolate(double length, ChocolateType chocolateType, String name, double price, double weight) {
        super(name, price, weight);
        this.length = length;
        this.chocolateType = chocolateType;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public ChocolateType getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Chocolate chocolate = (Chocolate) o;
        return Double.compare(chocolate.length, length) == 0 && chocolateType == chocolate.chocolateType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, chocolateType);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "length=" + length +
                ", chocolateType=" + chocolateType +
                "} " + super.toString();
    }
}
