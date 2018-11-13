package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        int min = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 19; j > -1; j--) {
                if (j > 0) {
                    if (array[j] > array[j - 1]) {
                        min = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = min;
                    }
                }
            }

        }
    }
}
