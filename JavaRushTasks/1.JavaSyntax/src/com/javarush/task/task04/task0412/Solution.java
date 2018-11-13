package com.javarush.task.task04.task0412;

/* 2
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int n1 = Integer.parseInt(n);
        if (n1 == 0) {
            System.out.println(n1);}

        if (n1 > 0) {
            n1 = n1* 2;
            System.out.println(n1);}
        if (n1 < 0) {
            n1 = n1 + 1;
            System.out.println(n1);}
    }

}
