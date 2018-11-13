package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i;
        String ds =reader.readLine();
        int d1 = Integer.parseInt(ds);
        String des =reader.readLine();
        int d2 = Integer.parseInt(des);
        String dees =reader.readLine();
        int d3 = Integer.parseInt(dees);

        if (d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1)

            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");




    }
}