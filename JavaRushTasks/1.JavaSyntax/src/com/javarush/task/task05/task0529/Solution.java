package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        String x="0";
        while (!x.equals("сумма")){
            x = reader.readLine();
            if (!x.equals("сумма")){
                int a = Integer.parseInt(x);
                sum=sum+a;
            }

        }
        System.out.println(sum);
    }
}
/*
ublic class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        String x="0";
        while (!x.equals("сумма")){
            x = reader.readLine();
            if (!x.equals("сумма")){
            int a = Integer.parseInt(x);
            sum=sum+a;
        }

    }
        System.out.println(sum);
}
}

Консоль-копилка
        Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово «сумма».
        Вывести на экран полученную сумму.


        Требования:
        1. Программа должна считывать данные с клавиатуры.
        2. Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
        3. Программа должна корректно работать, если пользователь ввел два числа число и слово «сумма».
        4. Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
        5. Программа должна выводить текст на экран.
        6. Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово «сумма» и нажмет Enter.
*/