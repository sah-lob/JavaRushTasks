package com.javarush.task.task01.task0134;

/* 
Набираем воду в бассейн
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
       long we;
       we = a*b*c*1000;
       return we;//напишите тут ваш код
    }
}


/*Требования:
        1. Метод getVolume(int, int, int) должен быть публичным и статическим.
        2. Метод getVolume(int, int, int) должен возвращать значение типа long.
        3. Метод getVolume(int, int, int) не должен ничего выводить на экран.
        4. Метод getVolume(int, int, int) должен правильно возвращать количество воды, которое необходимо для наполнения бассейна в литрах.*/