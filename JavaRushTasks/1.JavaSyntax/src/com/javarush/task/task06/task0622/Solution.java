package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i,j;
        int [] mas = new int[5];
        int a=0;

        for (i=0; i<5; i++){
            mas[i] = Integer.parseInt(reader.readLine());
        }
        for (i=0; i<5;i++)
            for (j=0;j<4;j++) {

                if(mas[j+1] <= mas[j]){
                    a  = mas[j+1];
                    mas[j+1] = mas[j];
                    mas[j] = a;
                }
            }

        for (i=0; i<5;i++){
            System.out.println(mas[i]);
        }
    }
}
