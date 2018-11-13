package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mas[] = new int [20];
        int mas2[] = new int [10];
        int mas3[] = new int [10];
        for (int i=0; i<20; i++){
            mas[i] = Integer.parseInt(reader.readLine());
            if (i<10) {
                mas2[i] = mas[i];
            }
            if (i>9){
                mas3[i-10] = mas[i];
            }

        }

        for (int i = 0; i<10;i++){
            System.out.println(mas3[i]);
        }
    }
}
