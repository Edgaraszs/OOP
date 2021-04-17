package com.epam.training.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Collect {

    private final List<AbstractGift> gifts = new ArrayList<>();

    public Collect() {
    }

    public void add(AbstractGift gift) {
        gifts.add(gift);
    }

    public List<AbstractGift> getGifts() {
        return gifts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Collect collect = (Collect) o;
        return Objects.equals(gifts, collect.gifts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gifts);
    }
}
