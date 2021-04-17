package com.epam.training;

import com.epam.training.model.Collect;
import com.epam.training.view.CollectPrinter;

public class Main {
    public static void main(String[] args) {
        CollectCreator creator = new CollectCreator();
        Collect collect = creator.create();

        CollectPrinter printer = new CollectPrinter();
        printer.print(collect);
    }
}
