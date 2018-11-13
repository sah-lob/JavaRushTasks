package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        String ssAge = reader.readLine();
        int b = Integer.parseInt(ssAge);

        for (int i = 0; i<a; i++) {
            int n;
            for ( n = 0; n<b; n++) {
                if (n<b-1) {System.out.print(8);}
                else
                {System.out.println(8);}
            }
            n=0;

        }
    }
}

/*
1. Программа должна считывать числа c клавиатуры.
        2. Программа должна выводить числа на экран.
        3. Программа должна выводить прямоугольник размером m на n из восьмёрок.
        4. В программе должен использоваться цикл for. */