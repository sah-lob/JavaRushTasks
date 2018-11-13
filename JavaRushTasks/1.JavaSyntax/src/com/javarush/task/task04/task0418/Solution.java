package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader(System.in));

        String de = reader.readLine();
        int a = Integer.parseInt(de);
        String dw = reader.readLine();
        int b = Integer.parseInt(dw);

        if (a<= b) {
            System.out.println(a);
        }
        else {System.out.println(b);}
    }
}
   /* String sAge = reader.readLine();
    int age = Integer.parseInt(sAge);

    Минимум двух чисел
        Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
        Если два числа равны между собой, необходимо вывести любое.


        Требования:
        1. Программа должна считывать числа c клавиатуры.
        2. Программа должна выводить число на экран.
        3. Программа должна выводить на экран минимальное из двух чисел.
        4. Если два числа равны между собой, необходимо вывести любое. */