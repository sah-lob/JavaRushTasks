package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код

    public static void main(String[] args) {
        System.out.println(convertToSeconds(10));
        System.out.println(convertToSeconds(5));
    }
    public static int convertToSeconds(int hour){
        hour = hour * 3600;
            return hour;
    }
}

