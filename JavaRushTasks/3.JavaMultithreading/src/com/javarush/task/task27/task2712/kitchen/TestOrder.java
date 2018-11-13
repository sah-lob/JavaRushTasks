package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class TestOrder extends Order {
    public TestOrder(Tablet tablet) throws IOException {
        super(tablet);
    }

    @Override
    protected void initDishes() throws IOException {
        dishes = new ArrayList<>();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int i = random.nextInt(Dish.values().length);
        int j = random.nextInt(Dish.values().length);
        int k = random.nextInt(Dish.values().length);
        dishes.add(Dish.values()[j]);
        dishes.add(Dish.values()[i]);
        dishes.add(Dish.values()[k]);
    }
}
