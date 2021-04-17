package com.epam.training.model;

import java.util.Objects;

public class Gummies extends Candies {

    private String color;

    public Gummies(String color, boolean specialCandy, int sweetness, String name, double price, double weight) {
        super(specialCandy, sweetness, name, price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        Gummies gummies = (Gummies) o;
        return Objects.equals(color, gummies.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Gummies{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
