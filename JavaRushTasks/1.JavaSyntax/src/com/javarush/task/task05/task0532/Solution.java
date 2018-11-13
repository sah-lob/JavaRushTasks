package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int i;
        int maximum = -1000;
        for (i=0; i<n; i++) {
            int n1 = Integer.parseInt(reader.readLine());
            if (i==0){maximum = n1;}
            if (n1 > maximum) {
                maximum = n1;
            }
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
