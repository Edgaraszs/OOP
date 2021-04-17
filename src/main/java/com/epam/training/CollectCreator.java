package com.epam.training;

import com.epam.training.model.*;


public class CollectCreator {

    public Collect create() {
        Collect collect = new Collect();
        Chocolate chocolate = new Chocolate(5, ChocolateType.MILK, "MILKY", 5.99, 50);
        Candies candies = new Candies(true, 5, "NaumNum", 2.99, 10);
        Gummies gummies = new Gummies("blue", false, 2, "GumGum", 1.20, 20);

        collect.add(chocolate);
        collect.add(candies);
        collect.add(gummies);
        return collect;
    }
}
