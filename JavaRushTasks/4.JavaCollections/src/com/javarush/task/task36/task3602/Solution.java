package com.javarush.task.task36.task3602;

import java.util.ArrayList;
import java.util.Collections;

/* 
Найти класс по описанию
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        Class result = null;
        Class[] classes = Collections.class.getDeclaredClasses();
        for (Class clazz : classes) {
            if (clazz.getSimpleName().equals("EmptyList")) return clazz;
        }
        return result;
    }
}