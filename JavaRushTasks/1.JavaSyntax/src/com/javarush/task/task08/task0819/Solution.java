package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(new Cat());
        printCats(cats);
    }
    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet<Cat>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {

        Iterator iterator = cats.iterator();
        while (iterator.hasNext())
        {
            Object cat = iterator.next();
            System.out.println(cat);
        }
    }

    public static class Cat{
    }
}