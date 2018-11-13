package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        int minimum = 0;

        int [] mas = new int[20];

        ArrayList<Integer> list =  new ArrayList<>();

        for (int i= 0; i< 20; i++){
            mas[i]= Integer.parseInt(reader.readLine());
        }

        for (int i=0; i<20;i++){
            if (i==0){
                maximum = mas[i];
                minimum = mas[i];
            }
            if (minimum> mas[i]){
                minimum = mas[i];
            }
            if (maximum< mas[i]){
                maximum = mas[i];
            }
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
