package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);

        if (a %2 == 0 & a>0) {
            System.out.println("положительное четное число");
        }
        if (a %2 != 0 & a>0) {
            System.out.println("положительное нечетное число");
        }
        if (a %2 != 0 & a<0) {
            System.out.println("отрицательное нечетное число");
        }
        if (a %2 == 0 & a<0) {
            System.out.println("отрицательное четное число");
        }
        if (a == 0) { System.out.println("ноль");}

}}

/*
«отрицательное четное число» — если число отрицательное и четное,
        «отрицательное нечетное число» — если число отрицательное и нечетное,
        «ноль» — если число равно 0,
        «положительное четное число» — если число положительное и четное,
        «положительное нечетное число» — если число положительное и нечетное.

        */