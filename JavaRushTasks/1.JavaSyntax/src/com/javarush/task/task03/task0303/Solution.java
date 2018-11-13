package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {

    System.out.println(convertEurToUsd(21,3808.433423));
    System.out.println(convertEurToUsd(21,308.433423));//напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) { double w;
     w = eur * course;
     return w;
    }
}


/* Требования:
1. Метод convertEurToUsd должен умножать евро на курс и возвращать полученный результат.
2. Метод main должен 2 раза вызвать метод convertEurToUsd с любыми параметрами.
3. Метод main должен выводить результаты вызовов на экран, каждый раз с новой строки.
4. Метод convertEurToUsd не должен ничего выводить на экран. */

/*
Обмен валют
*/

