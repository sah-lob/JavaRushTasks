package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int j = arr.length-1; j >= 0; j--) {
            System.out.println(arr[j]);
        }
    }
}

