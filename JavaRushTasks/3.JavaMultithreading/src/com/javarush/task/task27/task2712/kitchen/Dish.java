package com.javarush.task.task27.task2712.kitchen;

import java.util.ArrayList;
import java.util.Arrays;

public enum Dish {

    Fish(25), Steak(30), Soup(15), Juice(5), Water(3);

    public int getDuration() {
        return duration;
    }

    private int duration;

    Dish(int duration) {
        this.duration = duration;
    }

    public static String allDishesToString(){
        StringBuilder sb = new StringBuilder(Arrays.toString(values()));
        sb.delete(0,1);
        sb.deleteCharAt(sb.length()-1);
        String string = String.valueOf(sb);
        return string;
    }
}
