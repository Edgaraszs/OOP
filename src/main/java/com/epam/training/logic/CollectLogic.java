package com.epam.training.logic;

import com.epam.training.model.AbstractGift;
import com.epam.training.model.Collect;

import java.util.List;

public class CollectLogic {
    
    public double calculateTotalPrice(Collect collect){
        List<AbstractGift> giftList = collect.getGifts();
        double totalPrice = 0;
        for(AbstractGift abstractGift: giftList){
            double price = abstractGift.getPrice();
            totalPrice += price;
        }
        return totalPrice;
    }

    public double calculateTotalWeight(Collect collect){
        List<AbstractGift> giftList = collect.getGifts();
        double totalWeight = 0;
        for(AbstractGift abstractGift: giftList){
            double weight = abstractGift.getWeight();
            totalWeight += weight;
        }
        return totalWeight;
    }
}
