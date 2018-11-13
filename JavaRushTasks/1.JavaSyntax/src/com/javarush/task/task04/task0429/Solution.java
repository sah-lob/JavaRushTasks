package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        String ssAge = reader.readLine();
        int g = Integer.parseInt(ssAge);
        String saAge = reader.readLine();
        int e = Integer.parseInt(saAge);

        int i = 0;
        int n = 0;

        if (a > 0){
            i = i + 1;
        }
        if (a < 0){
            n = n + 1;
        }
        if (g > 0){
            i = i + 1;
        }
        if (g < 0){
            n = n + 1;
        }
        if (e > 0){
            i = i + 1;
        }
        if (e < 0){
            n = n + 1;
        }

        System.out.println("количество отрицательных чисел: " + n);
        System.out.println("количество положительных чисел: " + i);


    }
}
