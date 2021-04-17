package com.epam.training;

import com.epam.training.logic.CollectLogic;
import com.epam.training.model.*;
import org.junit.Assert;
import org.junit.Test;

public class CollectLogicTests {

    private Collect create() {
        Collect collect = new Collect();
        Chocolate chocolate = new Chocolate(5, ChocolateType.MILK, "MILKY", 2.10, 50);
        Candies candies = new Candies(true, 5, "NaumNum", 1.10, 10);
        Gummies gummies = new Gummies("blue", false, 2, "GumGum", 1.20, 20);

        collect.add(chocolate);
        collect.add(candies);
        collect.add(gummies);

        return collect;
    }

    @Test
    public void testTotalGiftsPrice(){
        //given
        CollectLogic collectLogic = new CollectLogic();
        Collect collect = create();
        //when
        double totalPrice = collectLogic.calculateTotalPrice(collect);
        //then
        Assert.assertEquals(4.40, totalPrice, 0.0f);
    }

    @Test
    public void testTotalGiftsWeight(){
        //given
        CollectLogic collectLogic = new CollectLogic();
        Collect collect = create();
        //when
        double totalWeight = collectLogic.calculateTotalWeight(collect);
        //then
        Assert.assertEquals(80, totalWeight, 0.0f);
    }
}
