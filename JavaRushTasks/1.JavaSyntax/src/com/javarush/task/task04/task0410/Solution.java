package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a) {
        if (a > 50 & a < 100) {
            System.out.println("Число " + a + " содержится в интервале.");
        } else {
            System.out.println("Число " + a + " не содержится в интервале.");
        }
    }
}





/* Требования:
        1. Программа должна выводить текст на экран.
        2. Метод main не должен вызывать System.out.println() или System.out.print().
        3. Метод main должен вызывать метод checkInterval только два раза.
        4. Метод checkInterval должен быть static void.
        5. Метод checkInterval должен выводить текст на экран согласно заданию.  */