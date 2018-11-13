package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
       Human ded1 = new Human("Иван", true,70, new ArrayList<>());
        Human ded2 = new Human("Петя", true,71, new ArrayList<>());
        Human baba1 = new Human("Катя", false,73, new ArrayList<>());
        Human baba2 = new Human("Зоя", false,63, new ArrayList<>());
        Human papa = new Human("Саня", true,23, new ArrayList<>());
        Human mama = new Human("Аня", false,23, new ArrayList<>());
        Human c1 = new Human("Александр", true,5, new ArrayList<>());
        Human c2 = new Human("Анна", false,5, new ArrayList<>());
        Human c3 = new Human("lebron", true,5, new ArrayList<>());
        ded1.children.add(papa);
        baba1.children.add(papa);
        ded2.children.add(mama);
        baba2.children.add(mama);
        mama.children.add(c1);
        papa.children.add(c1);
        mama.children.add(c2);
        papa.children.add(c2);
        mama.children.add(c3);
        papa.children.add(c3);
        System.out.println(ded1.toString());
        System.out.println(baba1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba2.toString());
        System.out.println(mama.toString());
        System.out.println(papa.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

    }



    public static class Human {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, Boolean sex, int age, ArrayList<Human> children) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

           int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
