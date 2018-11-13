package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {

    public static List<Exception> exceptions = new ArrayList<Exception>();
    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions)
            System.out.println(exception);
    }
    private static void initExceptions() {
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new Lust("похоть"));
            exceptions.add(new Gluttony("чревоугодие"));
            exceptions.add(new Greed("жадность"));
            exceptions.add(new Sloth("лень"));
            exceptions.add(new Wrath("гнев"));
            exceptions.add(new Envy("зависть"));
            exceptions.add(new Pride("гордыня"));
            exceptions.add(new Acedia("уныние"));
            exceptions.add(new Vainglory("тщеславие"));
        }
    }

    private static class Greed extends Exception {
        public Greed(String жадность) {
        }
        }
    }