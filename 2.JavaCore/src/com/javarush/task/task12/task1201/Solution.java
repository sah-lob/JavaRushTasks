package com.javarush.task.task12.task1201;

/*
Киты и коровы
 */

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            String name = "Пенис";
            return name;
        }
    }

    public static class Whale extends Cow{
            public String getName(){
                String name = "Я не пенис, я кит";
                return name;
            }
    }
}