package com.epam.training.view;

import com.epam.training.logic.CollectLogic;
import com.epam.training.model.AbstractGift;
import com.epam.training.model.Collect;

import java.util.List;

public class CollectPrinter {

    public void print(Collect collect) {
        CollectLogic logic = new CollectLogic();
        List<AbstractGift> giftList = collect.getGifts();
        for(AbstractGift abstractGift: giftList){
            System.out.println(abstractGift);
        }
        System.out.println("Total price: " + logic.calculateTotalPrice(collect));
        System.out.println("Total weight: " + logic.calculateTotalWeight(collect));
    }
}
